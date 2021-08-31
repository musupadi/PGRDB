package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CompositerGreatsword {
    public static String[][] data = new String[][]{
            {"1",
                    "Light Devour",
                    String.valueOf(R.drawable.light_devour),
                    "Basic attack damage +10%.",
                    "35",
                    "45",
                    "253",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Glimpse",
                    String.valueOf(R.drawable.glimpse),
                    "Damage +12% for 4s after 3-orbs.",
                    "45",
                    "50",
                    "400",
                    "22",
                    "201",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Thanatos",
                    String.valueOf(R.drawable.thanatos),
                    "Damage +15%.\n" +
                            "Dark damage +10% to all active allies during Berserk Mode.",
                    "45",
                    "56",
                    "493",
                    "25",
                    "249",
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
