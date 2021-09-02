package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ScytheID {
    public static String[][] data = new String[][]{
            {"1",
                    "Standard Scythe",
                    String.valueOf(R.drawable.standard_scythe),
                    "Tidak Ada Kemampuan",
                    "25",
                    "34",
                    "101",
                    "17",
                    "61",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Gloom",
                    String.valueOf(R.drawable.gloom),
                    "Semua kerusakan +7% terhadap target dengan Super Armor.",
                    "35",
                    "49",
                    "218",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "Fade",
                    String.valueOf(R.drawable.fade),
                    "Kerusakan +10% selama 4 d selama QTE atau 3-orb.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "43",
                    "345",
                    "22",
                    "201",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Lilac",
                    String.valueOf(R.drawable.lilac),
                    "Kerusakan +2% selama 5 d ke arah musuh dengan Super Armor, hingga 3 tumpukan.\n" +
                            "Memicu efek lagi menyegarkan durasi.\n" +
                            "Stun selama 2 detik saat Super Armor rusak,\n" +
                            "cooldown 10 detik untuk target yang sama.\n" +
                            "Kerusakan fisik +15% selama 7 d setelah memicu pasif inti.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "48",
                    "425",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.ayla_briliance),
                    "Ayla Briliance",
            },
            {"5",
                    "Saint Elmo",
                    String.valueOf(R.drawable.saint_elmo),
                    "Kerusakan petir +10%.\n" +
                            "Selama pamungkas, jumlah sambaran Petir diperlukan untuk mengaktifkan\n" +
                            "inti pasif dikurangi menjadi 3.",
                    "45",
                    "50",
                    "436",
                    "23",
                    "236",
                    "6",
                    String.valueOf(R.drawable.chrome_archlight),
                    "Chrome Archlight",
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
