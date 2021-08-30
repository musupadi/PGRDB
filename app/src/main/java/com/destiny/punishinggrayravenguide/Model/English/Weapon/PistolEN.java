package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class PistolEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Standard Handgun",
                    String.valueOf(R.drawable.standard_handgun),
                    "No Ability",
                    "25",
                    "36",
                    "109",
                    "17",
                    "61",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Tokarev",
                    String.valueOf(R.drawable.tokarev),
                    "Physical damage +15% when combo is greater than 50.",
                    "35",
                    "42",
                    "235",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Gloomlight",
                    String.valueOf(R.drawable.gloomlight),
                    "Damage +15% for 5s when expending Red, Yellow and Blue orbs\n" +
                            "within 5s.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "47",
                    "372",
                    "22",
                    "220",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Wolf Fang",
                    String.valueOf(R.drawable.wolf_fang),
                    "Damage +20% towards targets\n" +
                            "within Yellow Orb field.",
                    "45",
                    "52",
                    "458",
                    "24",
                    "249",
                    "6",
                    String.valueOf(R.drawable.lee_palefire),
                    "Lee Palefire",
            },
            {"5",
                    "Sin",
                    String.valueOf(R.drawable.sin),
                    "Damage +3% for 5s when picking up energy orbs, up to 5 stacks.\n" +
                            "Gain 1 random signal orb and 10 energy when 5 energy orbs\n" +
                            "have been collected, 10s cooldown.",
                    "45",
                    "50",
                    "436",
                    "24",
                    "244",
                    "6",
                    String.valueOf(R.drawable.sofia_silverfang),
                    "Sofia Silverfang",
            },
            {"6",
                    "Zero Scale",
                    String.valueOf(R.drawable.zero_scale),
                    "Core passive damage +10%.\n" +
                            "Physical damage +15% for 5s after 3-orb combos.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "51",
                    "445",
                    "25",
                    "254",
                    "6",
                    String.valueOf(R.drawable.lee_enthrophy),
                    "Lee Enthrophy",
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
