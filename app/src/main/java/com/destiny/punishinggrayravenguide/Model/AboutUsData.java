package com.destiny.punishinggrayravenguide.Model;


import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AboutUsData {
    public static String[][] data = new String[][]{
            {"1",
                    "Zyarga",
                    "17966801 - Asia",
                    "Main Developer",
                    String.valueOf(R.drawable.zyarga),
            },
            {"1",
                    "Artaa",
                    "15639121 - Asia",
                    "Story Content Developer",
                    String.valueOf(R.drawable.artaa),
            },
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setNama(aData[1]);
            model.setUserid(aData[2]);
            model.setRole(aData[3]);
            model.setGambar(aData[4]);
            list.add(model);
        }

        return list;
    }
}
