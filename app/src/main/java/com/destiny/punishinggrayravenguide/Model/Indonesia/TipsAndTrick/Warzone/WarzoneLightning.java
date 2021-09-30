package com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class WarzoneLightning {
    public static String[][] data = new String[][]{
            {"1",
                    "Tier 1",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.liv_lux_real),
                    "Liv Lux",
                    //Attacker
                    String.valueOf(R.drawable.bianca_veritas_real),
                    "Bianca Veritas",
                    //Tank
                    String.valueOf(R.drawable.vera_flare_real),
                    "Vera Flare"
            },
            {"2",
                    "Tier 2",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.liv_lux_real),
                    "Liv Lux",
                    //Attacker
                    String.valueOf(R.drawable.bianca_veritas_real),
                    "Bianca Veritas",
                    //Tank
                    String.valueOf(R.drawable.chrome_archlight_real),
                    "Chrome Archlight"
            },
            {"3",
                    "Tier 2",
                    "GONE",
                    //Support
                    String.valueOf(R.drawable.liv_lux_real),
                    "Liv Lux",
                    //Attacker
                    String.valueOf(R.drawable.lucia_dawn_real),
                    "Lucia Dawn",
                    //Tank
                    String.valueOf(R.drawable.vera_flare_real),
                    "Vera Flare"
            },
            {"4",
                    "Tier 3",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.liv_lux_real),
                    "Liv Lux",
                    //Attacker
                    String.valueOf(R.drawable.lucia_dawn_real),
                    "Lucia Dawn",
                    //Tank
                    String.valueOf(R.drawable.chrome_archlight_real),
                    "Chrome Archlight"
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
