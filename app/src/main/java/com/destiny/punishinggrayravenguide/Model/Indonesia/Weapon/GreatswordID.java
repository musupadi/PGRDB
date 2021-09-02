package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class GreatswordID {
    public static String[][] data = new String[][]{
            {"1",
                    "Greatsword",
                    String.valueOf(R.drawable.greatsword),
                    "Tidak Ada Kemampuan",
                    "25",
                    "35",
                    "104",
                    "15",
                    "55",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Suppressor",
                    String.valueOf(R.drawable.suppressor),
                    "Serangan pertama dari serangan Dasar adalah serangan Kritis yang dijamin.\n" +
                            "Waktu cooldown 15 detik untuk target yang sama.",
                    "35",
                    "40",
                    "224",
                    "18",
                    "121",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Star of Bethlehem",
                    String.valueOf(R.drawable.star_of_bethlehem),
                    "Buat Lampu Natal selama 3-orb,\n" +
                            "Serangan dan kecepatan gerakan +8% selama 15 detik di dalam area,\n" +
                            "Waktu cooldown 30 detik.",
                    "45",
                    "43",
                    "363",
                    "19",
                    "183",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Dynamo Greatsword",
                    String.valueOf(R.drawable.dynamo_greatsword),
                    "10% kemungkinan melepaskan gelombang kejut saat menyerang,\n" +
                            "Menimbulkan 100% kerusakan fisik pada musuh di sekitar.",
                    "45",
                    "45",
                    "354",
                    "20",
                    "186",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Big Kamui",
                    String.valueOf(R.drawable.big_kamui),
                    "Kerusakan fisik +15%.\n" +
                            "Setelah blok berhasil, kerusakan +30% untuk keterampilan berikutnya yang digunakan.",
                    "45",
                    "40",
                    "436",
                    "22",
                    "230",
                    "6",
                    String.valueOf(R.drawable.kamui_bastion),
                    "Kamui Bastion",
            },
            {"6",
                    "Darkness",
                    String.valueOf(R.drawable.darkness),
                    "Kerusakan Fisik dan Gelap +20% selama 5 hari setelah 3-orb.\n" +
                            "Memicu efek menyegarkan durasi.",
                    "45",
                    "51",
                    "445",
                    "22",
                    "226",
                    "6",
                    String.valueOf(R.drawable.kamui_tenebrion),
                    "Kamui Tenebrion",
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
