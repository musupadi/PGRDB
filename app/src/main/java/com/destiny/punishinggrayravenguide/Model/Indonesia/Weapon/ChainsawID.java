package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ChainsawID {
    public static String[][] data = new String[][]{
            {"1",
                    "Practice Saw",
                    String.valueOf(R.drawable.practice_saw),
                    "Tidak Ada Kemampuan",
                    "25",
                    "34",
                    "101",
                    "15",
                    "55",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Noise",
                    String.valueOf(R.drawable.noise),
                    "Kerusakan fisik +10% selama 3 d saat mengganti target.",
                    "35",
                    "39",
                    "218",
                    "18",
                    "124",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Lightning Spark",
                    String.valueOf(R.drawable.lightning_spark),
                    "30% kemungkinan menerapkan Armor Break saat menyerang, mengurangi\n" +
                            "Pertahanan sebesar 5% selama 3 d, hingga 5 tumpukan.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "43",
                    "345",
                    "20",
                    "190",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Inverse Chimera",
                    String.valueOf(R.drawable.inverse___chimera),
                    "Kemungkinan 20% untuk menerapkan kondisi Rusak selama 3 d saat menyerang,\n" +
                            "hingga 10 tumpukan. Target menerima 2% Kerusakan fisik setiap detik.\n" +
                            "Efeknya berlipat ganda ketika target menderita pengurangan Pertahanan\n" +
                            "sementara Rusak.\n" +
                            "Kerusakan fisik +10% terhadap musuh yang Rusak.",
                    "45",
                    "40",
                    "425",
                    "48",
                    "235",
                    "6",
                    String.valueOf(R.drawable.nanami_storm),
                    "Nanami Storm",
            },
            {"5",
                    "Hydroheat",
                    String.valueOf(R.drawable.hydroheat),
                    "10% kemungkinan mengurangi resistensi Api target sebesar 5% selama 5 d\n" +
                            "saat menyerang.\n" +
                            "Cooldown 8 detik menuju target yang sama.\n" +
                            "Kerusakan api +20% setelah mengaktifkan pamungkas dan\n" +
                            "peluang mengurangi ketahanan Api menjadi dua kali lipat.",
                    "45",
                    "50",
                    "436",
                    "22",
                    "230",
                    "6",
                    String.valueOf(R.drawable.nanami_pulse),
                    "Nanami Pulse",
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
