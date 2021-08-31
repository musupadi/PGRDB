package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class DaggersEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Machete",
                    String.valueOf(R.drawable.machete),
                    "No Ability",
                    "25",
                    "36",
                    "109",
                    "18",
                    "64",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Hunting Blade",
                    String.valueOf(R.drawable.hunting_blade),
                    "Movement speed +30%, Attack +10% for 3s after 3-orbs.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "35",
                    "42",
                    "235",
                    "21",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Lantern Festival",
                    String.valueOf(R.drawable.lantern_festival),
                    "20% chance of dropping a Yuanxiao, dealing 15% Physical damage.\n" +
                            "1s cooldown.",
                    "45",
                    "46",
                    "368",
                    "23",
                    "213",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Stone Heart",
                    String.valueOf(R.drawable.stone_heart),
                    "Damage +15% for 5s after consecutive 3-orbs.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "47",
                    "372",
                    "23",
                    "209",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Soul Ripper",
                    String.valueOf(R.drawable.soul_ripper),
                    "When dealing a Critical strike from the rear,\n" +
                            "apply Damaged condition for 3s, dealing 50% Physical damage\n" +
                            "every second. Triggering the effect again refreshes the duration.\n" +
                            "Physical damage +20% towards Damaged enemies.",
                    "45",
                    "52",
                    "458",
                    "26",
                    "261",
                    "6",
                    String.valueOf(R.drawable.watanabe_whiteblade),
                    "Watanabe Whiteblade",
            },
            {"6",
                    "Requiescat",
                    String.valueOf(R.drawable.requiescat),
                    "Damage +10%.\n" +
                            "Dark damage +10% during core passive.",
                    "45",
                    "53",
                    "463",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.watanabe_astral),
                    "Watanabe Astral",
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
