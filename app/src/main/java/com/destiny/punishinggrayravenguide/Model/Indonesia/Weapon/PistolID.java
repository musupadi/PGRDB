package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class PistolID {
    public static String[][] data = new String[][]{
            {"1",
                    "Standard Handgun",
                    String.valueOf(R.drawable.standard_handgun),
                    "Tidak Ada Kemampuan",
                    "25",
                    "36",
                    "109",
                    "17",
                    "61",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Tokarev",
                    String.valueOf(R.drawable.tokarev),
                    "Kerusakan fisik +15% saat kombo lebih besar dari 50.",
                    "35",
                    "42",
                    "235",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Gloomlight",
                    String.valueOf(R.drawable.gloomlight),
                    "Damage +15% selama 5 d saat mengeluarkan Orb Merah, Kuning, dan Biru\n" +
                            "dalam 5 detik.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "47",
                    "372",
                    "22",
                    "220",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Wolf Fang",
                    String.valueOf(R.drawable.wolf_fang),
                    "Kerusakan +20% terhadap target\n" +
                            "dalam bidang Orb Kuning.",
                    "45",
                    "52",
                    "458",
                    "24",
                    "249",
                    "6",
                    String.valueOf(R.drawable.lee_palefire),
                    "Lee Palefire",
            },
            {"5",
                    "Sin",
                    String.valueOf(R.drawable.sin),
                    "Kerusakan +3% selama 5 d saat mengambil bola energi, hingga 5 tumpukan.\n" +
                            "Dapatkan 1 bola sinyal acak dan 10 energi saat 5 bola energi\n" +
                            "telah dikumpulkan, cooldown 10 detik.",
                    "45",
                    "50",
                    "436",
                    "24",
                    "244",
                    "6",
                    String.valueOf(R.drawable.sofia_silverfang),
                    "Sofia Silverfang",
            },
            {"6",
                    "Zero Scale",
                    String.valueOf(R.drawable.zero_scale),
                    "Kerusakan pasif inti +10%.\n" +
                            "Kerusakan fisik +15% selama 5 d setelah kombo 3 bola.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "51",
                    "445",
                    "25",
                    "254",
                    "6",
                    String.valueOf(R.drawable.lee_enthrophy),
                    "Lee Enthrophy",
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
