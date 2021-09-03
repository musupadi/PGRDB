package com.destiny.punishinggrayravenguide.Model.Indonesia;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class TipsAndTrickCategoryID {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.lee_enthrophy),
                    "Gerakan Boss"
            },
            {"2",
                    String.valueOf(R.drawable.b2),
                    "Perancanaan Nier Automata"
            },
            {"3",
                    String.valueOf(R.drawable.kamui_bastion),
                    "Perencanaan Player Gratisan"
            },
            {"4",
                    String.valueOf(R.drawable.vera_rozen),
                    "Perancanaan Player Monthly Pass"
            },
            {"5",
                    String.valueOf(R.drawable.lucia_crimson_abyss),
                    "Tim Pain Cage"
            },
            {"6",
                    String.valueOf(R.drawable.rosetta_arctic),
                    "Tim Warzone"
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
