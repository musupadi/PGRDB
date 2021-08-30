package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class GreatswordEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Greatsword",
                    String.valueOf(R.drawable.greatsword),
                    "No Ability",
                    "25",
                    "35",
                    "104",
                    "15",
                    "55",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Suppressor",
                    String.valueOf(R.drawable.suppressor),
                    "The first strike of a Basic attack is a guaranteed Critical hit.\n" +
                            "15s cooldown to the same target.",
                    "35",
                    "40",
                    "224",
                    "18",
                    "121",
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
                    "Star of Bethlehem",
                    String.valueOf(R.drawable.star_of_bethlehem),
                    "Create Christmas Lights during 3-orbs,\n" +
                            "Attack and movement speed +8% for 15s within the area,\n" +
                            "30s cooldown.",
                    "45",
                    "43",
                    "363",
                    "19",
                    "183",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Dynamo Greatsword",
                    String.valueOf(R.drawable.dynamo_greatsword),
                    "10% chance of unleashing a shockwave when attacking,\n" +
                            "dealing 100% Physical damage to nearby enemies.",
                    "45",
                    "45",
                    "354",
                    "20",
                    "186",
                    "5",
                    "-",
                    "-",
            },
            {"6",
                    "Big Kamui",
                    String.valueOf(R.drawable.big_kamui),
                    "Physical damage +15%.\n" +
                            "After a successful block, damage +30% for the next skill used.",
                    "45",
                    "40",
                    "436",
                    "22",
                    "230",
                    "6",
                    String.valueOf(R.drawable.kamui_bastion),
                    "Kamui Bastion",
            },
            {"7",
                    "Darkness",
                    String.valueOf(R.drawable.darkness),
                    "Physical and Dark damage +20% for 5s after 3-orb.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "51",
                    "445",
                    "22",
                    "226",
                    "6",
                    String.valueOf(R.drawable.kamui_tenebrion),
                    "Kamui Tenebrion",
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
