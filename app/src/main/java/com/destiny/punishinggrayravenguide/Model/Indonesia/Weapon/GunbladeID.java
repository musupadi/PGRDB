package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class GunbladeID {
    public static String[][] data = new String[][]{
            {"3",
                    "Apollo",
                    String.valueOf(R.drawable.apollo),
                    "Kerusakan +15%.\n" +
                            "QTE dan 3-orb akan memicu Etching Frost. (Ice Res down)",
                    "45",
                    "53",
                    "446",
                    "23",
                    "253",
                    "6",
                    String.valueOf(R.drawable.chrome_glory),
                    "Chrome Glory",
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
