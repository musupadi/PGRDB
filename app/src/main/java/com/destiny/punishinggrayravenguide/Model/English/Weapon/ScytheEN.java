package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ScytheEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Standard Scythe",
                    String.valueOf(R.drawable.standard_scythe),
                    "No Ability",
                    "25",
                    "34",
                    "101",
                    "17",
                    "61",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Gloom",
                    String.valueOf(R.drawable.gloom),
                    "All damage +7% towards targets with Super Armor.",
                    "35",
                    "49",
                    "218",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Fade",
                    String.valueOf(R.drawable.fade),
                    "Damage +10% for 4s during QTE or 3-orbs.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "43",
                    "345",
                    "22",
                    "201",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Lilac",
                    String.valueOf(R.drawable.lilac),
                    "Damage +2% for 5s towards enemies with Super Armor, up to 3 stacks.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Stun for 2s when Super Armor is broken,\n" +
                            "10s cooldown to the same target.\n" +
                            "Physical damage +15% for 7s after triggering core passive.\n" +
                            "Triggering the effect again refreshes the duration.",
                    "45",
                    "48",
                    "425",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.ayla_briliance),
                    "Ayla Briliance",
            },
            {"5",
                    "Saint Elmo",
                    String.valueOf(R.drawable.saint_elmo),
                    "Lightning damage +10%.\n" +
                            "During ultimate, number of Lightning strikes needed to activate\n" +
                            "core passive is reduced to 3.",
                    "45",
                    "50",
                    "436",
                    "23",
                    "236",
                    "6",
                    String.valueOf(R.drawable.chrome_archlight),
                    "Chrome Archlight",
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
