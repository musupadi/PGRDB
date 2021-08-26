package com.destiny.punishinggrayravenguide.Model;

import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class FutureContentData {
    public static String[][] data = new String[][]{
            {"1",
                    "Punishing Gray Raven Database Dibuka",
                    String.valueOf(R.drawable.nanami_storm),
                    "Punishing Gray Raven DB Will akan membuka fitur Weapon",
                    "26 - Agusutus - 2021"
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
