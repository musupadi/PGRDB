package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class NierAutomataEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Cruel Oath",
                    String.valueOf(R.drawable.cruel_oath),
                    "Overclock Indicator damage +10%.",
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
                    "Physical damage +10% when POD: Shield is present.\n" +
                            "Gain 5% POD: Shield when sliding for 1s.",
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
                    "Physical damage +10% during Combat Stance.",
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
                    "Physical damage and Healing +15%. Leader effect doubled.\n" +
                            "When Overclock Indicator is successfully triggered,\n" +
                            "2B and A2's swap cooldown is reduced by 1s and also gain\n" +
                            "1 signal orb.",
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
                    "PLeader effect doubled. A2 can enter Berserk Mode with 40% POD: Shield gauge, as well\n" +
                            "as gaining 10% Attack increase. Press and hold the Basic attack button within 2s from\n" +
                            "dodging to unleash an empowered attack, dealing 370% Physical damage.\n" +
                            "Press the button again to unleash a follow-up attack, dealing 720% Physical damage.\n" +
                            "(Damage is scaled with Basic attack skill level).\n" +
                            "All Yellow orbs will be consumed to charge the lance, with each Yellow orb dealing\n" +
                            "100% Physical damage (Up to 300%), and granting 3% POD: Shield.\n" +
                            "Consuming any amount of Yellow orb for the charge grants Physical damage +10% for 15s.",
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
                    "Physical damage +15%. Leader effect doubled.\n" +
                            "Gain 160 Stance Stability points when swapping into battle and\n" +
                            "enter Combat Stance with 2 stacks of Data Correction.",
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
