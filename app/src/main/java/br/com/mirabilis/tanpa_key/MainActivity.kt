package br.com.mirabilis.tanpa_key

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.mirabilis.tanpa_key.adapter.adapter_top
import br.com.mirabilis.tanpa_key.model.mRespon
import br.com.mirabilis.tanpa_key.model.mSub
import br.com.mirabilis.tanpa_key.model.mTop
import com.example.recynestedgroupdate.ApiInterface
import com.example.recynestedgroupdate.ApiKlien
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import org.json.JSONArray



class MainActivity : AppCompatActivity() {

    //var msub : ArrayList<String>? = null
   // var mtop : ArrayList<ArrayList<mTop>>? = ArrayList()
    val mtop: ArrayList<mTop> = ArrayList()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiInterface : ApiInterface = ApiKlien.ambilKlien().create(ApiInterface::class.java)
        ambilJSON(apiInterface)

    }



    fun ambilJSON(apiInterface: ApiInterface) {

        val call : Call<String> = apiInterface.getMenu()

        call.enqueue(object : Callback<String> {

            @SuppressLint("WrongConstant")
            override fun onResponse(call: Call<String>?, response: Response<String>?) {

                if (response?.isSuccessful!!) {
                    if (response.body() != null) {

                        val json = response.body()
                        val jsonObject = JSONObject(json.toString())

                        val menu = covertJsonObjectToJsonArray(jsonObject.get("menu"))

                        for (i in 0 until menu.length()) {
                            val obj = menu.getJSONObject(i)
                            val keys = obj.keys()

                            while (keys.hasNext()) {
                                val currentDynamicKey = keys.next() as String
                                Log.d("hasil ", currentDynamicKey)

                                val currentDynamicValue = obj.getJSONArray(currentDynamicKey)

                                val msub: ArrayList<mSub> = ArrayList()

                                for (i in 0 until currentDynamicValue.length()) {

                                    val nameObj = currentDynamicValue.getJSONObject(i)
                                    val nama_menu = nameObj.getString("nama_menu")
                                    Log.d("hasil nama_menu", nama_menu)

                                    val id_Menu = nameObj.getString("id_Menu")
                                    //Log.d("hasil id_Menu", id_Menu)

                                    msub.add(mSub(id_Menu,nama_menu));

                                }
                                val header = currentDynamicKey
                                var msubRe: ArrayList<mSub>
                                msubRe = msub

                                Log.d("hasils : ", msubRe.toString())

                                mtop!!.add(mTop(header, msubRe))
                                //msub.clear()



                            }
                        }

                        Log.d("hasils : ", mtop.toString())


                        val rv = findViewById<RecyclerView>(R.id.RvMain)
                        rv.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayout.VERTICAL, false)
                        val adapter =  adapter_top(mtop)
                        rv.adapter = adapter

                    }
                }

            }

            override fun onFailure(call: Call<String>?, t: Throwable?) {
                Log.d("hasil fail ", "hasil " + t)
            }

        })
    }

    fun covertJsonObjectToJsonArray(InsideArray: Any): JSONArray {

        val jsonArray: JSONArray

        if (InsideArray is JSONArray) {
            jsonArray = InsideArray
        } else {
            jsonArray = JSONArray()
            jsonArray.put(InsideArray as JSONObject)
        }
        return jsonArray
    }

}
