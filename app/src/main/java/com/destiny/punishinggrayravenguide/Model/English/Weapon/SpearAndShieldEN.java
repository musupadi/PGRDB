package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class SpearAndShieldEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Heretical Pioneer",
                    String.valueOf(R.drawable.heretical_pioneer),
                    "Basic attack damage +10%.",
                    "35",
                    "42",
                    "235",
                    "18",
                    "121",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "\tRL-03C Blackthorn",
                    String.valueOf(R.drawable.rl_03_blackthorn),
                    "Damage +10% for 3s after performing\n" +
                            "Small/Medium/Wide-ranged railgun attack.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "47",
                    "372",
                    "20",
                    "186",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Gungir",
                    String.valueOf(R.drawable.gungir),
                    "Target's Defense -20% for 8s when dealing damage.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Small/Medium/Wide-area railgun applies damage-over-time for 8s,\n" +
                            "dealing 25%/50%/100% Physical damage every second.",
                    "45",
                    "52",
                    "458",
                    "22",
                    "230",
                    "6",
                    String.valueOf(R.drawable.rosetta_arctic),
                    "Rpsetta Arctic",
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
