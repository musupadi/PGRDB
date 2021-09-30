package com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class WarzoneElementID {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.lucia_crimson_abyss),
                    "Fisik"
            },
            {"2",
                    String.valueOf(R.drawable.lucia_plume),
                    "Es"
            },
            {"3",
                    String.valueOf(R.drawable.bianca_veritas),
                    "Listrik"
            },
            {"4",
                    String.valueOf(R.drawable.karenina_ember),
                    "Api"
            },
            {"5",
                    String.valueOf(R.drawable.luna_laurel),
                    "Gelap"
            }
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setGambar(aData[1]);
            model.setCategoryWeapon(aData[2]);
            list.add(model);
        }

        return list;
    }
}
