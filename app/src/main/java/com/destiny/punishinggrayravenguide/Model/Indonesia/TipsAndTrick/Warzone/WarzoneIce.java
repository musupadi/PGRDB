package com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class WarzoneIce {
    public static String[][] data = new String[][]{
            {"1",
                    "Tier 1",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.wanshi_fate_real),
                    "Wanshi Fate",
                    //Attacker
                    String.valueOf(R.drawable.lucia_plume_real),
                    "Lucia Plume",
                    //Tank
                    String.valueOf(R.drawable.chrome_glory_real),
                    "Chrome Glory"
            },
            {"2",
                    "Tier 2",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.wanshi_fate_real),
                    "Wanshi Fate",
                    //Attacker
                    String.valueOf(R.drawable.lucia_plume_real),
                    "Lucia Plume",
                    //Tank
                    String.valueOf(R.drawable.chanyu_kirin_real),
                    "Changyu Kirin"
            },
            {"2",
                    "Tier 3",
                    "VISIBLE",
                    //Support
                    String.valueOf(R.drawable.karenina_blast_real),
                    "Karenina Blast",
                    //Attacker
                    String.valueOf(R.drawable.lucia_plume_real),
                    "Lucia Plume",
                    //Tank
                    String.valueOf(R.drawable.liv_lux_real),
                    "Lix Lux"
            }
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
