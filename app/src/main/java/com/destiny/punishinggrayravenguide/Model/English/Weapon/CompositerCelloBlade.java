package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CompositerCelloBlade {
    public static String[][] data = new String[][]{
            {"1",
                    "Overture",
                    String.valueOf(R.drawable.overture),
                    "Attack +8.\n" +
                            "Movement speed +8% for 4s after dodging.",
                    "35",
                    "43",
                    "242",
                    "21",
                    "137",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Odette",
                    String.valueOf(R.drawable.odette),
                    "Attack +3% for 5s, up to 5 stacks during 3-orbs.\n" +
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
                    "Mistress of\n" +
                            "the Woods",
                    String.valueOf(R.drawable.mistress_of_the_woods),
                    "Lightning damage +20%.\n" +
                            "Red and Blue orbs can be weaved into other skills but can not\n" +
                            "be cast in succession.\n" +
                            "When exiting ultimate, orbs are refunded based on the number of\n" +
                            "orbs in possession before entering ultimate; triple orbs are prioritized.",
                    "45",
                    "54",
                    "471",
                    "26",
                    "261",
                    "6",
                    String.valueOf(R.drawable.selena_tempest),
                    "Selena Tempest",
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
