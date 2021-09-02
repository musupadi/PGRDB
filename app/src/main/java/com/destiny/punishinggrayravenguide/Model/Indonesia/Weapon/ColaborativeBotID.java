package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ColaborativeBotID {
    public static String[][] data = new String[][]{
            {"1",
                    "Growl",
                    String.valueOf(R.drawable.growl),
                    "Bot Kolaborasi melepaskan Gelombang Posisi setiap kali No.21 melakukan serangan Shadow Prism, QTE\n" +
                            "atau keluar dari serangan yang masuk. Efeknya hanya bisa dipicu sekali setiap 1 detik.\n" +
                            "Gelombang Posisi memberikan 50% kerusakan Gelap ke semua musuh yang terkena. (Kerusakan berskala dengan Level Pasif Inti)\n" +
                            "Target yang bersahabat dalam Gelombang Posisi memperoleh 3 d Penekanan Energi.\n" +
                            "Penekanan Energi: Saat menangani kerusakan Gelap, musuh memiliki efektivitas penyembuhan -100% selama 2 d.\n" +
                            "Bot Kolaborasi mengaktifkan Mode Benteng setiap kali Gelombang Posisi meledakkan 4 Matriks Twilight secara bersamaan atau\n" +
                            "ketika No.21 memasuki Matrix, melepaskan pulsa energi tinggi, memberikan 400% Serangan No.21 sebagai kerusakan Gelap.\n" +
                            "Efeknya hanya dapat dipicu sekali setiap 12 detik. (Kerusakan berskala dengan level Pasif Inti).\n" +
                            "Damage+15% untuk serangan Shadow Prism, Twilight Matrices dan Resonance Pulses.",
                    "45",
                    "52",
                    "454",
                    "25",
                    "251",
                    "6",
                    String.valueOf(R.drawable.no_21_xxi),
                    "No.21 XXI",
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
