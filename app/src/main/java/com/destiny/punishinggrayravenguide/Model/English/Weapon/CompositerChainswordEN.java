package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CompositerChainswordEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Durandal",
                    String.valueOf(R.drawable.durandal),
                    "Fire damage +10%.\n" +
                            "Cooldown between dodges is removed.\n" +
                            "Gain 1 Follow-Up 2-Dazzling Blade orb when successfully evading attacks.\n" +
                            "Triggering it will immediately activate the attack in\n" +
                            "the direction of the motion stick and also grants Dmg+10% for 8s.\n" +
                            "During Trick Climax, the Bluff points generated is converted to 10 Trickery instead.",
                    "45",
                    "53",
                    "467",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.roland_fire),
                    "Roland Theatrical Flame",
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
