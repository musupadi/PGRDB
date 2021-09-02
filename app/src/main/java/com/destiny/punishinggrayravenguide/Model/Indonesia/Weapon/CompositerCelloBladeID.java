package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CompositerCelloBladeID {
    public static String[][] data = new String[][]{
            {"1",
                    "Overture",
                    String.valueOf(R.drawable.overture),
                    "Serang +8.\n" +
                            "Kecepatan gerakan +8% selama 4 detik setelah menghindar.",
                    "35",
                    "43",
                    "242",
                    "21",
                    "137",
                    "4",
                    "-",
                    "-",
            },
            {"2",
                    "Odette",
                    String.valueOf(R.drawable.odette),
                    "Serang +3% selama 5 d, hingga 5 tumpukan selama 3 bola.\n" +
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
                    "Mistress of\n" +
                            "the Woods",
                    String.valueOf(R.drawable.mistress_of_the_woods),
                    "Kerusakan petir +20%.\n" +
                            "Orb Merah dan Biru dapat digabungkan ke dalam keterampilan lain tetapi tidak dapat\n" +
                            "dilemparkan secara berurutan.\n" +
                            "Saat keluar dari ultimate, orb dikembalikan berdasarkan jumlah\n" +
                            "orb yang dimiliki sebelum memasuki ultimate; orb rangkap tiga diprioritaskan.",
                    "45",
                    "54",
                    "471",
                    "26",
                    "261",
                    "6",
                    String.valueOf(R.drawable.selena_tempest),
                    "Selena Tempest",
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
