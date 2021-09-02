package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class BannerSpearEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Phoenix",
                    String.valueOf(R.drawable.phoenix),
                    "Lightning damage +15%.\n" +
                            "QTE and Ultimate will also grant Electric Charge.\n" +
                            "When the QTE battle standard is on field, switching in Vera\n" +
                            "will consume all Electric Charge to perform a Thunderfall,\n" +
                            "and gain 1 Electric Charge after.",
                    "45",
                    "52",
                    "454",
                    "25",
                    "251",
                    "6",
                    String.valueOf(R.drawable.vera_flare),
                    "Vera Flare",
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
