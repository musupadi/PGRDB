package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class GauntletEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Armor Break - Type 9",
                    String.valueOf(R.drawable.amor_break___type_9),
                    "Damage +5% for 8s when entering the field.",
                    "35",
                    "42",
                    "240",
                    "19",
                    "124",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Emerging Unicorn",
                    String.valueOf(R.drawable.emerging_unicorn),
                    "Damage +8% for 4s after dodging.",
                    "45",
                    "48",
                    "379",
                    "21",
                    "191",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Baji",
                    String.valueOf(R.drawable.baji),
                    "Ice damage +15%.\n" +
                            "Triggering Circulating Tide or QTE will leave behind 8s of Ice Mirror.",
                    "45",
                    "53",
                    "467",
                    "23",
                    "236",
                    "6",
                    "-",
                    "-",
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
