package com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class WarzoneFire {
    public static String[][] data = new String[][]{
            {"1",
                    "Tier 1",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.s9_real),
                    "9S",
                    //Attacker
                    String.valueOf(R.drawable.b2_real),
                    "2B",
                    //Tank
                    String.valueOf(R.drawable.a2_real),
                    "A2"
            },
            {"2",
                    "Tier 2",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.sofia_silverfang_real),
                    "Sofia Silverfang",
                    //Attacker
                    String.valueOf(R.drawable.karenina_ember_real),
                    "Karenina Ember",
                    //Tank
                    String.valueOf(R.drawable.nanami_pulse_real),
                    "Nanami Pulse"
            },
            {"3",
                    "Tier 3",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.sofia_silverfang_real),
                    "Sofia Silverfang",
                    //Attacker
                    String.valueOf(R.drawable.karenina_ember_real),
                    "Karenina Ember",
                    //Tank
                    String.valueOf(R.drawable.nanami_storm_real),
                    "Nanami Storm"
            },
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setTier(aData[1]);
            model.setTierVisible(aData[2]);
            model.setGambarSupport(aData[3]);
            model.setSupport(aData[4]);
            model.setGambarAttacker(aData[5]);
            model.setAttacker(aData[6]);
            model.setGambarTank(aData[7]);
            model.setTank(aData[8]);
            list.add(model);
        }

        return list;
    }
}
