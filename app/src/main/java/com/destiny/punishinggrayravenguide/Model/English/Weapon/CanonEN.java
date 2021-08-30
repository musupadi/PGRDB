package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CanonEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Bazooka",
                    String.valueOf(R.drawable.bazooka),
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
                    "Spiraled Cannon",
                    String.valueOf(R.drawable.spiraled_cannon),
                    "Basic attack damage +10%.",
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
                    "New Year Firecracker",
                    String.valueOf(R.drawable.new_years_firecracker),
                    "When dealing damage during the core passives\n" +
                            "of Explosion (A Karenina) and Blaze (S Karenina),\n" +
                            "create firecrackers on target's location, dealing a total\n" +
                            "of 250% Physical damage. 10s cooldown.",
                    "45",
                    "46",
                    "365",
                    "22",
                    "205",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Magma Pillar",
                    String.valueOf(R.drawable.magma_pillar),
                    "Attack +12% for 4s after 3-orb.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "47",
                    "372",
                    "22",
                    "201",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Berserk Fusion",
                    String.valueOf(R.drawable.berserk_fushion),
                    "Physical damage +10%.\n" +
                            "Basic Attack Damage +30% for 5s after 3-orb.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "52",
                    "458",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.karenina_blast),
                    "Karenina Blast",
            },
            {"6",
                    "Fusion Dragon",
                    String.valueOf(R.drawable.fusion_dragon),
                    "Fire damage +10%.\n" +
                            "Fire damage +10% for 5s when triggering Red orbs.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "51",
                    "440",
                    "25",
                    "253",
                    "6",
                    String.valueOf(R.drawable.karenina_ember),
                    "Karenina Ember",
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
