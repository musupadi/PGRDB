package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class NierAutomataID {
    public static String[][] data = new String[][]{
            {"1",
                    "Cruel Oath",
                    String.valueOf(R.drawable.cruel_oath),
                    "Kerusakan Indikator Overclock +10%.",
                    "45",
                    "45",
                    "372",
                    "22",
                    "205",
                    "5",
                    String.valueOf(R.drawable.s9),
                    "9S",
            },
            {"2",
                    "Type-4O Lance",
                    String.valueOf(R.drawable.type_40_lance),
                    "Kerusakan fisik +10% saat POD: Perisai ada.\n" +
                            "Dapatkan 5% POD: Perisai saat meluncur selama 1 detik.",
                    "45",
                    "47",
                    "372",
                    "22",
                    "201",
                    "5",
                    String.valueOf(R.drawable.a2),
                    "A2",
            },
            {"3",
                    "Virtuous Contract",
                    String.valueOf(R.drawable.virtuous_contract),
                    "Kerusakan fisik +10% selama Posisi Tempur.",
                    "45",
                    "48",
                    "379",
                    "23",
                    "211",
                    "5",
                    String.valueOf(R.drawable.b2),
                    "2B",
            },
            {"4",
                    "Cruel Oath Kai",
                    String.valueOf(R.drawable.cruel_oath_kai),
                    "Kerusakan fisik dan Penyembuhan +15%. Efek pemimpin berlipat ganda.\n" +
                            "Ketika Indikator Overclock berhasil dipicu,\n" +
                            "Swap cooldown 2B dan A2 berkurang 1 d dan juga bertambah\n" +
                            "1 bola sinyal.",
                    "45",
                    "51",
                    "445",
                    "25",
                    "254",
                    "6",
                    String.valueOf(R.drawable.s9),
                    "9S",
            },
            {"2",
                    "Type-4O Lance Kai",
                    String.valueOf(R.drawable.type_40_lance_kai),
                    "Efek pemimpin berlipat ganda. A2 dapat memasuki Mode Berserk dengan 40% POD: Pengukur perisai, juga\n" +
                            "karena mendapatkan peningkatan 10% Serangan. Tekan dan tahan tombol Serangan dasar dalam waktu 2 detik dari\n" +
                            "menghindar untuk melepaskan serangan yang diberdayakan, menimbulkan 370% Kerusakan Fisik.\n" +
                            "Tekan tombol lagi untuk melepaskan serangan lanjutan, menimbulkan 720% Kerusakan Fisik.\n" +
                            "(Kerusakan ditingkatkan dengan tingkat keterampilan serangan Dasar).\n" +
                            "Semua bola Kuning akan dikonsumsi untuk mengisi daya tombak, dengan setiap bola Kuning menangani\n" +
                            "100% Kerusakan fisik (Hingga 300%), dan memberikan 3% POD: Perisai.\n" +
                            "Mengkonsumsi bola Kuning dalam jumlah berapa pun untuk biaya tersebut memberikan kerusakan Fisik +10% selama 15 d.",
                    "45",
                    "47",
                    "458",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.a2),
                    "A2",
            },
            {"3",
                    "Virtuous Contract Kai",
                    String.valueOf(R.drawable.virtuous_contract_kai),
                    "Kerusakan fisik +15%. Efek pemimpin berlipat ganda.\n" +
                            "Dapatkan 160 poin Stabilitas Posisi saat bertukar ke pertempuran dan\n" +
                            "masukkan Combat Stance dengan 2 tumpukan Koreksi Data.",
                    "45",
                    "53",
                    "467",
                    "26",
                    "261",
                    "6",
                    String.valueOf(R.drawable.b2),
                    "2B",
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
