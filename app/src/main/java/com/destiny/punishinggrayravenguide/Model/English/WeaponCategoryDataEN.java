package com.destiny.punishinggrayravenguide.Model.English;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class WeaponCategoryDataEN {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.wolf_fang),
                    "Dual Pistol"
            },
            {"2",
                    String.valueOf(R.drawable.sirius),
                    "Longsword"
            },
            {"3",
                    String.valueOf(R.drawable.dragon_wind),
                    "Hovering Canons"
            },
            {"4",
                    String.valueOf(R.drawable.lightning),
                    "Bow"
            },
            {"5",
                    String.valueOf(R.drawable.hydroheat),
                    "Chainsaw"
            },
            {"6",
                    String.valueOf(R.drawable.darkness),
                    "Greatsword"
            },
            {"7",
                    String.valueOf(R.drawable.fusion_dragon),
                    "Cannon"
            },
            {"8",
                    String.valueOf(R.drawable.requiescat),
                    "Daggers"
            },
            {"9",
                    String.valueOf(R.drawable.saint_elmo),
                    "Scythe"
            },
            {"10",
                    String.valueOf(R.drawable.gungir),
                    "Spear & Shield"
            },
            {"11",
                    String.valueOf(R.drawable.baji),
                    "Gauntlet"
            },
            {"13",
                    String.valueOf(R.drawable.ozma),
                    "Amplifier"
            },
            {"14",
                    String.valueOf(R.drawable.auncel),
                    "Rifle Set"
            },
            {"15",
                    String.valueOf(R.drawable.apollo),
                    "Gunblade"
            },
            {"16",
                    String.valueOf(R.drawable.thanatos),
                    "Compositer - Greatsword"
            },
            {"17",
                    String.valueOf(R.drawable.qinghe),
                    "Compositer - Dragon Spear"
            },
            {"18",
                    String.valueOf(R.drawable.mistress_of_the_woods),
                    "Compositer - Cello Blade"
            },
            {"19",
                    String.valueOf(R.drawable.virtuous_contract_kai),
                    "Nier:Automata Weapon"
            },
            {"20",
                    String.valueOf(R.drawable.growl),
                    "Collaborative Bot"
            },
            {"21",
                    String.valueOf(R.drawable.phoenix),
                    "Banner Spear"
            },
            {"22",
                    String.valueOf(R.drawable.durandal),
                    "Compositer - Chain Sword"
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
