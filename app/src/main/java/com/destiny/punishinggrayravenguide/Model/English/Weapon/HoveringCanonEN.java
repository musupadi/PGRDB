package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class HoveringCanonEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Hovering Canon",
                    String.valueOf(R.drawable.hovering_canon),
                    "No Ability",
                    "10",
                    "30",
                    "35",
                    "16",
                    "21",
                    "2",
                    "-",
                    "-",
            },
            {"2",
                    "Semi-Auto Canon",
                    String.valueOf(R.drawable.semi_auto_canon),
                    "No Ability",
                    "25",
                    "33",
                    "99",
                    "17",
                    "61",
                    "3",
                    "-",
                    "-",
            },
            {"3",
                    "Fish Mount",
                    String.valueOf(R.drawable.fish_mount),
                    "Basic attack damage +10%.",
                    "35",
                    "38",
                    "213",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"4",
                    "Guardian Mount",
                    String.valueOf(R.drawable.guardian_mount),
                    "Gain 1 random signal orb for every 30 combo,\n" +
                            "8s cooldown.",
                    "45",
                    "42",
                    "336",
                    "22",
                    "201",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Type Zero",
                    String.valueOf(R.drawable.type_zero),
                    "Eclipse's Red Orb damage +50%.\n" +
                            "Attack +15% for 5s after 3-orb.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "47",
                    "415",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.liv_eclipse),
                    "Liv Eclipse",
            },
            {"6",
                    "Benediction",
                    String.valueOf(R.drawable.benediction),
                    "After expending 12 orbs, damage +10% for 5s\n" +
                            "to all allies within 5m radius.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Damage +10% towards imprisoned targets.",
                    "45",
                    "48",
                    "423",
                    "24",
                    "245",
                    "6",
                    String.valueOf(R.drawable.liv_lux),
                    "Liv Lux",
            },
            {"7",
                    "Dragon Wind",
                    String.valueOf(R.drawable.dragon_wind),
                    "Basic attacks have 10% chance of weakning enemies,\n" +
                            "reducing Attack by 10% for 5s.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "10% chance of generating a signal orb when attacking weakened\n" +
                            "targets. 6s cooldown.",
                    "45",
                    "46",
                    "406",
                    "25",
                    "253",
                    "6",
                    String.valueOf(R.drawable.liv_luminance),
                    "Liv Luminance",
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
