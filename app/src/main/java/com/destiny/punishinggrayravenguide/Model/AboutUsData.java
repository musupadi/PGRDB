package com.destiny.punishinggrayravenguide.Model;


import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AboutUsData {
    public static String[][] data = new String[][]{
            {"1",
                    "ꉣ`Zyarga",
                    "17966801 ",
                    "Leader",
                    String.valueOf(R.drawable.zyarga),
            },
            {"2",
                    "ꉣ`Pixie",
                    "13113970 ",
                    "Admin",
                    String.valueOf(R.drawable.fauzan),
            },
            {"3",
                    "ꉣ`Junpler",
                    "14251518",
                    "Admin",
                    String.valueOf(R.drawable.jimi),
            },
            {"4",
                    "ꉣ`Kaslana",
                    "13145636",
                    "Admin",
                    String.valueOf(R.drawable.lee_enthrophy),
            },
            {"5",
                    "ꉣ`Roxy",
                    "19024420",
                    "Admin",
                    String.valueOf(R.drawable.luna_laurel),
            },
            {"6",
                    "ꉣ`?",
                    "11818227",
                    "Member",
                    String.valueOf(R.drawable.lucia_lotus),
            },
            {"7",
                    "ꉣ`Kzsa",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.lucia_dawn),
            },
            {"8",
                    "ꉣ`GeogleX",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.kamui_tenebrion),
            },
            {"9",
                    "ꉣ`Panedragon",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.liv_lux),
            },
            {"10",
                    "ꉣ`Echo ",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.liv_eclipse),
            },
            {"11",
                    "ꉣ`Darx",
                    "10422515",
                    "Member",
                    String.valueOf(R.drawable.liv_luminance),
            },
            {"12",
                    "ꉣ`Raphael",
                    "16924184",
                    "Member",
                    String.valueOf(R.drawable.raphael),
            },
            {"13",
                    "ꉣ`Syehab25 ",
                    "16164355",
                    "Member",
                    String.valueOf(R.drawable.bianca_zero),
            },
            {"15",
                    "ꉣ`Artaa ",
                    "15639121",
                    "Member",
                    String.valueOf(R.drawable.lucia_plume),
            },
            {"16",
                    "ꉣ`Cmprl ",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.lee_palefire),
            },
            {"17",
                    "ꉣ`Brist",
                    "11243300",
                    "Member",
                    String.valueOf(R.drawable.b2),
            },
            {"18",
                    "ꉣ`KazeXa",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.s9),
            },
            {"19",
                    "ꉣ`popo`",
                    "18803055",
                    "Member",
                    String.valueOf(R.drawable.popo),
            },
            {"20",
                    "ꉣ`Diablo",
                    "19893636",
                    "Member",
                    String.valueOf(R.drawable.diablo),
            },
            {"21",
                    "ꉣ`NopL",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.nopl),
            },
            {"22",
                    "ꉣ' Ego",
                    "16695954",
                    "Member",
                    String.valueOf(R.drawable.lucia_crimson_abyss),
            },
            {"23",
                    "ꉣ' AwRena",
                    "13687415",
                    "Member",
                    String.valueOf(R.drawable.selena_tempest),
            },
            {"24",
                    "Pisces.X",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.qu_peafowlsplume),
            },
            {"25",
                    "ꉣ`Chin-Chin",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.camu_crocotta),
            },
            {"26",
                    "ꉣ`L u c i f e r",
                    "-",
                    "Member",
                    String.valueOf(R.drawable.karenina_ember),
            },
            {"27",
                    "ꉣ`NotRfk",
                    "19001177",
                    "Member",
                    String.valueOf(R.drawable.notrfk),
            },
            {"28",
                    "ꉣ`Proton",
                    "19001177",
                    "Member",
                    String.valueOf(R.drawable.watanabe_whiteblade),
            },
            {"29",
                    "ꉣ`Nyastaaa",
                    "15298894",
                    "Member",
                    String.valueOf(R.drawable.nanami_storm),
            },
            {"30",
                    "ꉣ'Rentarou",
                    "16910673",
                    "Member",
                    String.valueOf(R.drawable.rentarou),
            },
            {"31",
                    "ꉣ'Kizuna",
                    "17465585",
                    "Upcoming Member",
                    String.valueOf(R.drawable.wanshi_fate),
            },
            {"32",
                    "ꉣ`Sora",
                    "-",
                    "Upcoming Member",
                    String.valueOf(R.drawable.rosetta_arctic),
            },
            {"32",
                    "ꉣ`ZnVera7",
                    "18596877",
                    "Upcoming Member",
                    String.valueOf(R.drawable.znalpha),
            },
            {"33",
                    "ꉣ`TeNeT",
                    "10434629",
                    "Upcoming Member",
                    String.valueOf(R.drawable.tenet),
            },

    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setNama(aData[1]);
            model.setUserid(aData[2]);
            model.setRole(aData[3]);
            model.setGambar(aData[4]);
            list.add(model);
        }

        return list;
    }
}
