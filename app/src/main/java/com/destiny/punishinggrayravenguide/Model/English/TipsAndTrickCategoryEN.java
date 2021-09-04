package com.destiny.punishinggrayravenguide.Model.English;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class TipsAndTrickCategoryEN {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.lee_enthrophy),
                    "Boss Patern"
            },
            {"2",
                    String.valueOf(R.drawable.b2),
                    "Nier Automata Plan"
            },
            {"3",
                    String.valueOf(R.drawable.kamui_bastion),
                    "Free to Play Plan"
            },
            {"4",
                    String.valueOf(R.drawable.vera_rozen),
                    "Monthly Plan"
            },
            {"5",
                    String.valueOf(R.drawable.lucia_crimson_abyss),
                    "Pain Cage Team"
            },
            {"6",
                    String.valueOf(R.drawable.rosetta_arctic),
                    "Warzone Team"
            },
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
