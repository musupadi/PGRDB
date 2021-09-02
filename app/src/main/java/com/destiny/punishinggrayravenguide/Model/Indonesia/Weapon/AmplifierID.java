package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AmplifierID {
    public static String[][] data = new String[][]{
            {"1",
                    "Genesis",
                    String.valueOf(R.drawable.genesis),
                    "Kerusakan bola kuning +10%.",
                    "35",
                    "44",
                    "247",
                    "21",
                    "135",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Crown Lure",
                    String.valueOf(R.drawable.crown_lure),
                    "Semua kerusakan +15% selama 8 d setelah mengeluarkan semua 3 yang berbeda\n" +
                            "warna bola dalam waktu 6 detik.",
                    "45",
                    "49",
                    "390",
                    "23",
                    "211",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Ozma",
                    String.valueOf(R.drawable.ozma),
                    "Kerusakan gelap +15%.\n" +
                            "Spike ke-4 dari Annihilation Orb menciptakan 100% Dark damage AOE",
                    "45",
                    "55",
                    "480",
                    "26",
                    "261",
                    "6",
                    String.valueOf(R.drawable.luna_laurel),
                    "Luna Laurel",
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
