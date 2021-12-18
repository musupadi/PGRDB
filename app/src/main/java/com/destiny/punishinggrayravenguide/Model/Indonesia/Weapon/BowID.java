package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class BowID {
    public static String[][] data = new String[][]{
            {"1",
                    "Practice Bow",
                    String.valueOf(R.drawable.practice_bow),
                    "Tidak Ada Kemampuan",
                    "25",
                    "37",
                    "112",
                    "18",
                    "64",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Compound Bow",
                    String.valueOf(R.drawable.compound_bow),
                    "Kerusakan fisik +15% saat target tidak berubah selama 5 d.",
                    "35",
                    "43",
                    "242",
                    "21",
                    "135",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Falcon E3320",
                    String.valueOf(R.drawable.falcon_e3320),
                    "Tingkat Kritikal dan Kerusakan Kritis +10%\n" +
                            "ketika tidak ada musuh dalam jarak 2m.",
                    "45",
                    "48",
                    "382",
                    "23",
                    "206",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Ramiel",
                    String.valueOf(R.drawable.ramiel),
                    "Kerusakan pamungkas +15%.\n" +
                            "Resistensi fisik target berkurang 2% selama 5 d untuk setiap\n" +
                            "Ultimate hit mendarat, hingga 8 tumpukan.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "54",
                    "471",
                    "25",
                    "254",
                    "6",
                    String.valueOf(R.drawable.bianca_zero),
                    "Bianca Zero",
            },
            {"5",
                    "Tornitrus",
                    String.valueOf(R.drawable.lightning),
                    "Kerusakan petir +15%.\n" +
                            "Lepaskan petir, menimbulkan 150% Kerusakan petir saat\n" +
                            "target yang sama telah diserang 5 kali dengan keterampilan elemen Petir.\n" +
                            "2s cooldown.",
                    "45",
                    "54",
                    "476",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.bianca_veritas),
                    "Bianca Veritas",
            }
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
