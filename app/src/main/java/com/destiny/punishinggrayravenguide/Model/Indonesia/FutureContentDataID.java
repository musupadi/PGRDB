package com.destiny.punishinggrayravenguide.Model.Indonesia;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class FutureContentDataID {
    public static String[][] data = new String[][]{
            {"1",
                    "Konten yang akan datang Punishing Gray Raven Database",
                    String.valueOf(R.drawable.nanami_storm),
                    "Punishing Gray Raven DB akan membuka fitur Weapon,Story,Memory Dan Planing BC setiap Patch",
                    "28 - 8 - 2021"
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
