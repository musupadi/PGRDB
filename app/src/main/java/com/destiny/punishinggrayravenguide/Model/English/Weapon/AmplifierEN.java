package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AmplifierEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Genesis",
                    String.valueOf(R.drawable.genesis),
                    "ellow orb damage +10%.",
                    "35",
                    "44",
                    "247",
                    "21",
                    "135",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Crown Lure",
                    String.valueOf(R.drawable.crown_lure),
                    "All damage +15% for 8s after expending all 3 different\n" +
                            "colors of orbs within 6s.",
                    "45",
                    "49",
                    "390",
                    "23",
                    "211",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Ozma",
                    String.valueOf(R.drawable.ozma),
                    "Dark damage +15%.\n" +
                            "The 4th spike from Annihilation Orb creates a 100% Dark damage AOE",
                    "45",
                    "55",
                    "480",
                    "26",
                    "261",
                    "6",
                    String.valueOf(R.drawable.luna_laurel),
                    "Luna Laurel",
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
            model.setAbility(aData[3]);
            model.setMaxLevel(aData[4]);
            model.setMinAtk(aData[5]);
            model.setMaxAtk(aData[6]);
            model.setMinCrit(aData[7]);
            model.setMaxCrit(aData[8]);
            model.setStar(aData[9]);
            model.setConstructImage(aData[10]);
            model.setConstructName(aData[11]);
            list.add(model);
        }

        return list;
    }
}
