package com.destiny.punishinggrayravenguide.Model.Indonesia;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class WeaponCategoryDataID {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.wolf_fang),
                    "Pistol Ganda"
            },
            {"2",
                    String.valueOf(R.drawable.sirius),
                    "Pedang Panjang"
            },
            {"3",
                    String.valueOf(R.drawable.dragon_wind),
                    "Canon Melayang"
            },
            {"4",
                    String.valueOf(R.drawable.lightning),
                    "Busur"
            },
            {"5",
                    String.valueOf(R.drawable.hydroheat),
                    "Gergaji Mesin"
            },
            {"6",
                    String.valueOf(R.drawable.darkness),
                    "Pedang Besar"
            },
            {"7",
                    String.valueOf(R.drawable.fusion_dragon),
                    "Canon"
            },
            {"8",
                    String.valueOf(R.drawable.requiescat),
                    "Pisau"
            },
            {"9",
                    String.valueOf(R.drawable.saint_elmo),
                    "Sabit"
            },
            {"10",
                    String.valueOf(R.drawable.gungir),
                    "Tombak & Perisai"
            },
            {"11",
                    String.valueOf(R.drawable.baji),
                    "Sarung Tangan"
            },
            {"13",
                    String.valueOf(R.drawable.ozma),
                    "Penguat"
            },
            {"14",
                    String.valueOf(R.drawable.auncel),
                    "Set Senapan"
            },
            {"15",
                    String.valueOf(R.drawable.apollo),
                    "Gunblade"
            },
            {"16",
                    String.valueOf(R.drawable.thanatos),
                    "Compositer - Pedang Besar"
            },
            {"17",
                    String.valueOf(R.drawable.qinghe),
                    "Compositer - Tombak Naga"
            },
            {"18",
                    String.valueOf(R.drawable.mistress_of_the_woods),
                    "Compositer - Pedang Cello"
            },
            {"19",
                    String.valueOf(R.drawable.virtuous_contract_kai),
                    "Senjata Nier:Automata"
            },
            {"20",
                    String.valueOf(R.drawable.growl),
                    "Bot kolaboratif"
            },
            {"21",
                    String.valueOf(R.drawable.phoenix),
                    "Tombak Bendera"
            },
            {"22",
                    String.valueOf(R.drawable.durandal),
                    "Compositer - Pedang Rantai"
            },
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setGambar(aData[1]);
            model.setCategoryWeapon(aData[2]);
            list.add(model);
        }

        return list;
    }
}
