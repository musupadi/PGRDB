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
            {"2",
                    "Artaa",
                    "15639121 - Asia",
                    "Story Content Developer",
                    String.valueOf(R.drawable.artaa),
            },
            {"3",
                    "Vin Firj",
                    "13002409- Asia",
                    "Story Content Developer",
                    String.valueOf(R.drawable.nanami_pulse),
            },
            {"4",
                    "Azura",
                    "19024420- Asia",
                    "Supporting Developer",
                    String.valueOf(R.drawable.lee_enthrophy),
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
