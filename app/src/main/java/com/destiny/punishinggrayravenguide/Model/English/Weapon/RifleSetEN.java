package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class RifleSetEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Bullet Ant",
                    String.valueOf(R.drawable.bullet_ant),
                    "Red orb damage +10%.",
                    "35",
                    "41",
                    "233",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "FA2D-AP",
                    String.valueOf(R.drawable.fa2d_ap),
                    "Ice damage +10%.",
                    "45",
                    "46",
                    "368",
                    "22",
                    "201",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Auncel",
                    String.valueOf(R.drawable.auncel),
                    "Ice damage +15%.\n" +
                            "Gain Condensed Frost (Ice damage +10%) for 8s\n" +
                            "after successfully dodging with Bloom Shot.",
                    "45",
                    "52",
                    "454",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.wanshi_fate),
                    "Wanshi Fate",
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
