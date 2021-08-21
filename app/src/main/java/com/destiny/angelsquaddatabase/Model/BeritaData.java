package com.destiny.angelsquaddatabase.Model;

import java.util.ArrayList;

public class BeritaData {
    public static String[][] data = new String[][]{
            {"1",
                    "Angel Squad DB Dibuka",
                    "https://media.suara.com/pictures/970x544/2021/06/09/61146-angel-squad-mobile.jpg",
                    "Aplikasi Angel Squad Database Dibuka pada tanggal 20 - Agustus - 2021 oleh grup Whatsapp https://chat.whatsapp.com/BsVJp9TqwaMAyeNs8WOUTW",
                    "20 - Agusutus - 2021"
            },
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setNama(aData[1]);
            model.setGambar(aData[2]);
            model.setDeskripsi(aData[3]);
            model.setTanggal(aData[4]);
            list.add(model);
        }

        return list;
    }
}
