package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class DaggersID {
    public static String[][] data = new String[][]{
            {"1",
                    "Machete",
                    String.valueOf(R.drawable.machete),
                    "Tidak Ada Kemampuan",
                    "25",
                    "36",
                    "109",
                    "18",
                    "64",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Hunting Blade",
                    String.valueOf(R.drawable.hunting_blade),
                    "Kecepatan gerakan +30%, Serangan +10% selama 3 d setelah 3 bola.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "35",
                    "42",
                    "235",
                    "21",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Lantern Festival",
                    String.valueOf(R.drawable.lantern_festival),
                    "Kemungkinan 20% untuk menjatuhkan Yuanxiao, menimbulkan 15% Kerusakan Fisik.\n" +
                            "1s cooldown.",
                    "45",
                    "46",
                    "368",
                    "23",
                    "213",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Stone Heart",
                    String.valueOf(R.drawable.stone_heart),
                    "Kerusakan +15% selama 5 d setelah 3 bola berturut-turut.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "47",
                    "372",
                    "23",
                    "209",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Soul Ripper",
                    String.valueOf(R.drawable.soul_ripper),
                    "Saat melakukan serangan Kritis dari belakang,\n" +
                            "terapkan kondisi Rusak selama 3 d, berikan 50% Kerusakan Fisik\n" +
                            "setiap detik. Memicu efeknya lagi menyegarkan durasi.\n" +
                            "Kerusakan fisik +20% terhadap musuh yang Rusak.",
                    "45",
                    "52",
                    "458",
                    "26",
                    "261",
                    "6",
                    String.valueOf(R.drawable.watanabe_whiteblade),
                    "Watanabe Whiteblade",
            },
            {"6",
                    "Requiescat",
                    String.valueOf(R.drawable.requiescat),
                    "Kerusakan +10%.\n" +
                            "Dark damage +10% selama inti pasif.",
                    "45",
                    "53",
                    "463",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.watanabe_astral),
                    "Watanabe Astral",
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
