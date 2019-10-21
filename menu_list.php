<?php
header('Content-Type: application/json');


echo '{
    "status": "success",
    "menu": {
        "Cakes": [
            {
                "id_Menu": 21,
                "nama_menu": "Banana Cake",
                "available_size": null,
                "available_type": null,
                "deskripsi": "",
                "gambar": "http://maxxapi.technopartner.rocks/assets/Maxx/pages/img/menu/default.png",
                "redeem_point": 0,
                "status": "Aktif",
                "created_at": "2016-05-20 14:39:49",
                "updated_at": "2016-08-08 09:03:04",
                "group": "Food",
                "id_kategori": 3,
                "kategori": "Cakes",
                "tags": null,
                "varian": {
                    "Hot": [],
                    "Iced": [],
                    "None": [
                        {
                            "price": "15000"
                        }
                    ]
                }
            },
            {
                "id_Menu": 22,
                "nama_menu": "Banana Milk",
                "available_size": null,
                "available_type": null,
                "deskripsi": "",
                "gambar": "http://maxxapi.technopartner.rocks/assets/Maxx/pages/img/menu/default.png",
                "redeem_point": 0,
                "status": "Aktif",
                "created_at": "2016-05-20 14:39:49",
                "updated_at": "2016-08-08 09:03:04",
                "group": "Food",
                "id_kategori": 3,
                "kategori": "Cakes",
                "tags": null,
                "varian": {
                    "Hot": [],
                    "Iced": [],
                    "None": [
                        {
                            "price": "25000"
                        }
                    ]
                }
            }
        ],
        "Coffee": [
            {
                "id_Menu": 35,
                "nama_menu": "Americano",
                "available_size": "S#M#R#MX",
                "available_type": "Hot#Iced",
                "deskripsi": "A European approach to an American style coffee, combining the perfect espresso with steaming hot water. Also available with ice.",
                "gambar": "http://maxxapi.technopartner.rocks/assets/Maxx/pages/img/menu/Americano.jpg",
                "redeem_point": 10,
                "status": "Aktif",
                "created_at": "2016-05-20 14:39:49",
                "updated_at": "2016-09-01 19:55:36",
                "group": "Drinks",
                "id_kategori": 5,
                "kategori": "Coffee",
                "tags": null,
                "varian": {
                    "Hot": [
                        {
                            "size": "S",
                            "price": "19000"
                        },
                        {
                            "size": "M",
                            "price": "22000"
                        },
                        {
                            "size": "R",
                            "price": "26000"
                        },
                        {
                            "size": "MX",
                            "price": "29000"
                        }
                    ],
                    "Iced": [
                        {
                            "size": "M",
                            "price": "22000"
                        },
                        {
                            "size": "R",
                            "price": "26000"
                        },
                        {
                            "size": "MX",
                            "price": "29000"
                        }
                    ],
                    "None": []
                }
            }
         ]
}}';