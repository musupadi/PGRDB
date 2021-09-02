package com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class CanonID {
    public static String[][] data = new String[][]{
            {"1",
                    "Bazooka",
                    String.valueOf(R.drawable.bazooka),
                    "Tidak Ada Kemampuan",
                    "25",
                    "36",
                    "109",
                    "17",
                    "61",
                    "3",
                    "-",
                    "-",
            },
            {"2",
                    "Spiraled Cannon",
                    String.valueOf(R.drawable.spiraled_cannon),
                    "Kerusakan serangan dasar +10%.",
                    "35",
                    "42",
                    "235",
                    "20",
                    "131",
                    "4",
                    "-",
                    "-",
            },
            {"3",
                    "New Year Firecracker",
                    String.valueOf(R.drawable.new_years_firecracker),
                    "Saat menangani kerusakan selama pasif inti\n" +
                            "dari Ledakan (A Karenina) dan Blaze (S Karenina),\n" +
                            "buat petasan di lokasi target, berikan total\n" +
                            "dari 250% kerusakan fisik. 10 detik cooldown.",
                    "45",
                    "46",
                    "365",
                    "22",
                    "205",
                    "5",
                    "-",
                    "-",
            },
            {"4",
                    "Magma Pillar",
                    String.valueOf(R.drawable.magma_pillar),
                    "Serang +12% selama 4 d setelah 3-orb.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "47",
                    "372",
                    "22",
                    "201",
                    "5",
                    "-",
                    "-",
            },
            {"5",
                    "Berserk Fusion",
                    String.valueOf(R.drawable.berserk_fushion),
                    "Kerusakan fisik +10%.\n" +
                            "Kerusakan Serangan Dasar +30% selama 5 d setelah 3-orb.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "52",
                    "458",
                    "25",
                    "249",
                    "6",
                    String.valueOf(R.drawable.karenina_blast),
                    "Karenina Blast",
            },
            {"6",
                    "Fusion Dragon",
                    String.valueOf(R.drawable.fusion_dragon),
                    "Kerusakan api +10%.\n" +
                            "Kerusakan api +10% selama 5 d saat memicu bola Merah.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    "45",
                    "51",
                    "440",
                    "25",
                    "253",
                    "6",
                    String.valueOf(R.drawable.karenina_ember),
                    "Karenina Ember",
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
