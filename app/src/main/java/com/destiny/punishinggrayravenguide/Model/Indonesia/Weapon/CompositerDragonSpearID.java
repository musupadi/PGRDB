package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CompositerDragonSpearID {
    public static String[][] data = new String[][]{
            {"1",
                    "Cold Black-iron Star Type Land",
                    String.valueOf(R.drawable.cold_black_iron_star),
                    "Kerusakan fisik +10% selama 5 d saat memasuki Matrix.",
                    "35",
                    "46",
                    "260",
                    "21",
                    "137",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Guiyun",
                    String.valueOf(R.drawable.guiyun),
                    "Kerusakan fisik +10% selama 5 d setelah mengeluarkan bola biru.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "52",
                    "411",
                    "23",
                    "211",
                    "5",
                    "-",
                    "-",
            },
            {"3",
                    "Qinghe",
                    String.valueOf(R.drawable.qinghe),
                    "Kerusakan fisik +20%.\n" +
                            "Frekuensi serangan Huiyu +50% dan mendapatkan keterampilan baru: Kutukan.\n" +
                            "Huiyu berubah menjadi jimat dan menempel pada target,\n" +
                            "menimbulkan kerusakan fisik hingga 210%. Setelah penundaan singkat, berikan\n" +
                            "240% Kerusakan fisik lagi. Kerusakan meningkat dengan level tertinggi Qu.",
                    "45",
                    "58",
                    "506",
                    "26",
                    "261",
                    "6",
                    "-",
                    "-",
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
