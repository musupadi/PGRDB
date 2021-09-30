package com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class WarzoneDark {
    public static String[][] data = new String[][]{
            {"1",
                    "Tier 1",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.vera_rozen_real),
                    "Vera Rozen",
                    //Attacker
                    String.valueOf(R.drawable.luna_laurel_real),
                    "Luna Laurel",
                    //Tank
                    String.valueOf(R.drawable.kamui_tenebrion_real),
                    "Kamui Tenebrion"
            },
            {"2",
                    "Tier 2",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.vera_rozen_real),
                    "Vera Rozen",
                    //Attacker
                    String.valueOf(R.drawable.watanabe_astral_real),
                    "Watanabe Astral",
                    //Tank
                    String.valueOf(R.drawable.kamui_tenebrion_real),
                    "Kamui Tenebrion"
            },
            {"2",
                    "Tier 2",
                    "GONE",
                    //Support
                    String.valueOf(R.drawable.vera_rozen_real),
                    "Vera Rozen",
                    //Attacker
                    String.valueOf(R.drawable.luna_laurel_real),
                    "Luna Laurel",
                    //Tank
                    String.valueOf(R.drawable.no_21_real),
                    "No.21 XXI"
            },
            {"3",
                    "Tier 3",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.vera_rozen_real),
                    "Vera Rozen",
                    //Attacker
                    String.valueOf(R.drawable.watanabe_astral_real),
                    "Watanabe Astral",
                    //Tank
                    String.valueOf(R.drawable.no_21_real),
                    "No.21 XXI"
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
