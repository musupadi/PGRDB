package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class GauntletID {
    public static String[][] data = new String[][]{
            {"1",
                    "Armor Break - Type 9",
                    String.valueOf(R.drawable.amor_break___type_9),
                    "Kerusakan +10%.\n" +
                            "Dark damage +10% selama inti pasif.",
                    "35",
                    "42",
                    "240",
                    "19",
                    "124",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Emerging Unicorn",
                    String.valueOf(R.drawable.emerging_unicorn),
                    "Damage +8% selama 4 detik setelah menghindar.",
                    "45",
                    "48",
                    "379",
                    "21",
                    "191",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Baji",
                    String.valueOf(R.drawable.baji),
                    "Kerusakan es +15%.\n" +
                            "Memicu Circulating Tide atau QTE akan meninggalkan 8 detik Ice Mirror.",
                    "45",
                    "53",
                    "467",
                    "23",
                    "236",
                    "6",
                    String.valueOf(R.drawable.changyu_kirin),
                    "Changyu Kirin",
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
