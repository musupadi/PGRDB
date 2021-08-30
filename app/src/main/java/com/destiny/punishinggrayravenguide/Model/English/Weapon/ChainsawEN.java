package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ChainsawEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Practice Saw",
                    String.valueOf(R.drawable.practice_saw),
                    "No Ability",
                    "25",
                    "34",
                    "101",
                    "15",
                    "55",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Noise",
                    String.valueOf(R.drawable.noise),
                    "Physical damage +10% for 3s when switching targets.",
                    "35",
                    "39",
                    "218",
                    "18",
                    "124",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Lightning Spark",
                    String.valueOf(R.drawable.lightning_spark),
                    "30% chance of applying Armor Break when attacking, reducing\n" +
                            "Defense by 5% for 3s, up to 5 stacks.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "43",
                    "345",
                    "20",
                    "190",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Inverse Chimera",
                    String.valueOf(R.drawable.inverse___chimera),
                    "20% chance of applying Damaged condition for 3s when attacking,\n" +
                            "up to 10 stacks. Target receives 2% Physical damage every second.\n" +
                            "Effect is doubled when target is suffering from Defense reduction\n" +
                            "while Damaged.\n" +
                            "Physical damage +10% towards Damaged enemies.",
                    "45",
                    "40",
                    "425",
                    "48",
                    "235",
                    "6",
                    String.valueOf(R.drawable.nanami_storm),
                    "Nanami Storm",
            },
            {"5",
                    "Hydroheat",
                    String.valueOf(R.drawable.hydroheat),
                    "10% chance of reducing target's Fire resistance by 5% for 5s\n" +
                            "when attacking.\n" +
                            "8s cooldown towards the same target.\n" +
                            "Fire damage +20% after activating ultimate and the\n" +
                            "chance of reducing Fire resistance is doubled.",
                    "45",
                    "50",
                    "436",
                    "22",
                    "230",
                    "6",
                    String.valueOf(R.drawable.nanami_pulse),
                    "Nanami Pulse",
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
