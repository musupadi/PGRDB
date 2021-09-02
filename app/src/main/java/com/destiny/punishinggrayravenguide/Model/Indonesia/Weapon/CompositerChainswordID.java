package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CompositerChainswordID {
    public static String[][] data = new String[][]{
            {"1",
                    "Durandal",
                    String.valueOf(R.drawable.durandal),
                    "Kerusakan api +10%.\n" +
                            "Pendinginan di antara penghindaran dihilangkan.\n" +
                            "Dapatkan 1 Orb 2-Dazzling Blade Tindak lanjut saat berhasil menghindari serangan.\n" +
                            "Memicunya akan segera mengaktifkan serangan di\n" +
                            "arah tongkat gerak dan juga memberikan Dmg+10% selama 8 d.\n" +
                            "Selama Trick Climax, poin Bluff yang dihasilkan diubah menjadi 10 Trickery sebagai gantinya.",
                    "45",
                    "53",
                    "467",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.roland_fire),
                    "Roland Theatrical Flame",
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
