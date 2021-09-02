package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class SpearAndShieldID {
    public static String[][] data = new String[][]{
            {"1",
                    "Heretical Pioneer",
                    String.valueOf(R.drawable.heretical_pioneer),
                    "Kerusakan serangan dasar +10%.",
                    "35",
                    "42",
                    "235",
                    "18",
                    "121",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "RL-03C Blackthorn",
                    String.valueOf(R.drawable.rl_03_blackthorn),
                    "Kerusakan +10% selama 3 detik setelah tampil\n" +
                            "Serangan railgun jarak kecil/menengah/lebar.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "47",
                    "372",
                    "20",
                    "186",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Gungir",
                    String.valueOf(R.drawable.gungir),
                    "Pertahanan Target -20% selama 8 d saat menangani kerusakan.\n" +
                            "Memicu efek lagi menyegarkan durasi.\n" +
                            "Small/Medium/Wide-area railgun menerapkan damage dari waktu ke waktu selama 8 d,\n" +
                            "Menangani 25%/50%/100% Kerusakan fisik setiap detik.",
                    "45",
                    "52",
                    "458",
                    "22",
                    "230",
                    "6",
                    String.valueOf(R.drawable.rosetta_arctic),
                    "Rpsetta Arctic",
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
