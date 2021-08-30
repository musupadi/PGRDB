package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class BowEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Practice Bow",
                    String.valueOf(R.drawable.practice_bow),
                    "No Ability",
                    "25",
                    "37",
                    "112",
                    "18",
                    "64",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Compound Bow",
                    String.valueOf(R.drawable.compound_bow),
                    "Physical damage +15% when target does not change for 5s.",
                    "35",
                    "43",
                    "242",
                    "21",
                    "135",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Falcon E3320",
                    String.valueOf(R.drawable.falcon_e3320),
                    "Critical Rate and Critical Damage +10%\n" +
                            "when there are no enemies within 2m.",
                    "45",
                    "48",
                    "382",
                    "23",
                    "206",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Ramiel",
                    String.valueOf(R.drawable.ramiel),
                    "Ultimate damage +15%.\n" +
                            "Target's Physical resistance is reduced by 2% for 5s for every\n" +
                            "ultimate hit landed, up to 8 stacks.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "54",
                    "471",
                    "25",
                    "254",
                    "6",
                    String.valueOf(R.drawable.bianca_zero),
                    "Bianca Zero",
            },
            {"5",
                    "Lightning",
                    String.valueOf(R.drawable.lightning),
                    "Lightning damage +15%.\n" +
                            "Unleash a thunderbolt, dealing 150% Lightning damage when\n" +
                            "the same target has been struck 5 times with Lightning elemental skills.\n" +
                            "2s cooldown.",
                    "45",
                    "54",
                    "476",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.bianca_veritas),
                    "Bianca Veritas",
            }
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
