package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CompositerDragonSpearEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Cold Black-iron Star Type Land",
                    String.valueOf(R.drawable.cold_black_iron_star),
                    "Physical damage +10% for 5s when entering Matrix.",
                    "35",
                    "46",
                    "260",
                    "21",
                    "137",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Guiyun",
                    String.valueOf(R.drawable.guiyun),
                    "Physical damage +10% for 5s after expending blue orbs.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "52",
                    "411",
                    "23",
                    "211",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Qinghe",
                    String.valueOf(R.drawable.qinghe),
                    "Physical damage +20%.\n" +
                            "Huiyu's attack frequency +50% and gains a new skill: Curse.\n" +
                            "Huiyu transforms into an amulet and attaches itself to the target,\n" +
                            "dealing up to 210% Physical damage. After a short delay, deal\n" +
                            "240% Physical damage again. Damage scales with Qu's ultimate level.",
                    "45",
                    "58",
                    "506",
                    "26",
                    "261",
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
