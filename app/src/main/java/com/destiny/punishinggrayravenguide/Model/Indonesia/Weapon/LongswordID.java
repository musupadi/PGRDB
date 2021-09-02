package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class LongswordID {
    public static String[][] data = new String[][]{
            {"1",
                    "Standard Blade",
                    String.valueOf(R.drawable.standard_blade),
                    "No Ability",
                    "10",
                    "32",
                    "37",
                    "14",
                    "19",
                    "2",
                    "-",
                    "-",
            },
            {"2",
                    "Guardian Blade",
                    String.valueOf(R.drawable.guardian_blade),
                    "No Ability",
                    "25",
                    "35",
                    "104",
                    "15",
                    "56",
                    "3",
                    "-",
                    "-",
            },
            {"3",
                    "Mumei",
                    String.valueOf(R.drawable.mumei),
                    "Red orb damage +15%.",
                    "35",
                    "40",
                    "224",
                    "18",
                    "121",
                    "4",
                    "-",
                    "-",
            },
            {"4",
                    "Kuji No Sada",
                    String.valueOf(R.drawable.kuji_no_sada),
                    "20% chance of triggering a thunderbolt when attacking,\n" +
                            "dealing 50% Physical damage.\n" +
                            "3s cooldown.",
                    "45",
                    "52",
                    "354",
                    "20",
                    "186",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Lotus Berserker",
                    String.valueOf(R.drawable.lotus_berserker),
                    "Basic attack damage +10%.\n" +
                            "Physical damage +5% for 2s when performing\n" +
                            "Basic attacks, up to 5 stacks.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "49",
                    "428",
                    "23",
                    "234",
                    "6",
                    String.valueOf(R.drawable.lucia_lotus),
                    "Lucia Lotus",
            },
            {"6",
                    "Inverse - Shadow",
                    String.valueOf(R.drawable.inverse___shadow),
                    "Lightning damage +5% for 4s, up to 4 stacks when\n" +
                            "dealing Lightning damage.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Damage +10% for 10s when activating ultimate.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "48",
                    "445",
                    "23",
                    "226",
                    "6",
                    String.valueOf(R.drawable.lucia_dawn),
                    "Lucia Dawn",
            },
            {"7",
                    "Sakura",
                    String.valueOf(R.drawable.sakura),
                    "Physical damage +2% for 5s, up to 10 stacks for every orb expended.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Gain 1 additional Sword Wave orb when entering Sword Wave mode,\n" +
                            "10s cooldown.",
                    "45",
                    "51",
                    "447",
                    "23",
                    "239",
                    "6",
                    String.valueOf(R.drawable.lucia_crimson_abyss),
                    "Lucia Crimson Abyss",
            },
            {"8",
                    "Sirius",
                    String.valueOf(R.drawable.sirius),
                    "Damage +5%.\n" +
                            "Charge energy based on number of orbs expended.\n" +
                            "Summon Sirius at 50 energy for 45s, 60s cooldown.",
                    "45",
                    "52",
                    "428",
                    "21",
                    "221",
                    "6",
                    "-",
                    "-",
            },
            {"9",
                    "Crimson Birch",
                    String.valueOf(R.drawable.crimson_birch),
                    "Ice damage +15%.\n" +
                            "Damage +10% for 5s after 3-orb.",
                    "45",
                    "53",
                    "463",
                    "23",
                    "234",
                    "6",
                    String.valueOf(R.drawable.lucia_plume),
                    "Lucia Plume",
            },
            {"10",
                    "Sariel",
                    String.valueOf(R.drawable.sariel),
                    "Dark damage +15%.\n" +
                            "15% chance of unleashing a dark wave when attacking,\n" +
                            "dealing 75% Dark damage, 0.5s cooldown.",
                    "45",
                    "50",
                    "441",
                    "24",
                    "241",
                    "6",
                    String.valueOf(R.drawable.vera_rozen),
                    "Vera Rozen",
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
