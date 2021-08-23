package com.destiny.punishinggrayravenguide.Model;

import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AllConstruct {
    public static String[][] data = new String[][]{
            {"1",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/f/fe/Lucia_-_Lotus.png/revision/latest/scale-to-width-down/350?cb=20210718131738",
                    //Name 2
                    "Lucia",
                    //Model 3
                    "Lotus",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "80% Physical 20% Fire",
                    //CV 6
                    "Ishikawa Yui",
                    //Serial 7
                    "BPL-01",
                    //Affilation 8
                    "Gray Raven",
                    //Class 9
                    "B",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_lotus),
                    //11
                    "Thrust forward towards the target, pulling them in and\n" +
                            "dealing 266.72%/533.32%/800% Physical damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_lotus),
                    //13
                    "Launch the target swiftly in a one strike,\n" +
                            "dealing 150%/300%/450% Physical damage",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_lotus),
                    //15
                    "Ignite the weapon,\n" +
                            "dealing 100%/200%/300% Physical damage.\n" +
                            "Attacks gain additional 10%/15%/20%\n" +
                            "Fire damage for 4/4/6 seconds.",
                    "Continuously attack, dealing 540% Physical damage.",
                    //QTE 16
                    "Enter the battlefield with dual blades, dealing 1110% Physical damage.",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All Assault structures' attack +10%",
                    //CORE 20
                    "Enter burst state, utilizing dual blades as basic attacks when\n" +
                            "expending a Red orb within 4s after any 3-orb.\n" +
                            "Continuously attack the enemy for a total of 1080% Physical damage.",
                    //ULTIMATE 21
                    "Expend 100 energy to unleash a flurry of blades, dealing 140% Physical\n" +
                            "damage for every hit, and 1000% Physical damage on the final hit.",
                    //SS 22
                    "Targets launched into the air receive 20% additional Physical damage.",
                    //SSS 23
                    "Damage +15% during dual blades mode.",
                    //SSS+ 24
                    "Basic attack damage +15%.",
                    //Skill 25
                    "Triple anything + Red or Swap in attack + Red for Core\n" +
                            "Blue to buff attacks\n" +
                            "Yellow to launch",
                    //Build 1
                    "https://lh3.googleusercontent.com/vkZcJQRpsJ_1V21exrcM-bbV1Qe9onmDz114ZSkt03ol8JrJcVSOz08jwnDpf6qEt6EEstgmuyj2ki-uiu8y17CeG98uaXpg2BDjmUBi70csTXqZDd6i1Pf7tkL2VdHDf2Vu6n2G2w=w128-h119",
                    "4 x Patton",
                    "https://lh4.googleusercontent.com/5VSlXG0khdnYRVHwV60cJhgxL56d_SuCQFkYY6ukhvzvrdNNUkvN4UqErZvGzrXYMXttHxSUlKzT1kIHiy7X1zFBzeMt5F5mVXIE-6MMOA937fMHr-C7vbub0RdjD-tTQHW6H-pg2g=w128-h119",
                    "2 x Frederick",
                    "6 ATK+CRIT",
                    "6 CORE",
                    "Awakening Set",
                    //Build 2
                    "https://lh3.googleusercontent.com/VeofAiBRtnWyZjUVmGMDIgd3j2OiImfBeEtE6kmxI5SvnQHyaNUjz4XF69dqEOHXsCnf8YC9lMM3grl55zUd6hFkL0aoKxtOMj8wMQFylHnmALjPDoqcdFk_ZIsj4J-TfUE8wABWsQ=w128-h119",
                    "4 x Zuwen Yuan",
                    "https://lh6.googleusercontent.com/_wLoWpAmR9KrioKAtCEgT_KIgkTBhpNsTkTuHo1rIcJHZ6UEdBuly0pbpX4dqAUEn0y-Q_RepCuX_C_Ytitt_CuvShrVX8LTphcln81VikTEbKq10_JUe1FYgGszO8mcPGc2TSFgCA=w128-h119",
                    "2 x Gloria",
                    "NIL",
                    "-",
                    "Pre-Wanshi Ice QTE support",
                    //Build 3
                    "-",
                    "-",
                    "-",
                    "-",
                    "-",
                    "-",
                    "-"
            },
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setGambar(aData[1]);
            model.setName(aData[2]);
            model.setModel(aData[3]);
            model.setProfessionClass(aData[4]);
            model.setElement(aData[5]);
            model.setCV(aData[6]);
            model.setSerial(aData[7]);
            model.setAffilation(aData[8]);
            model.setKelas(aData[9]);
            model.setIRedOrb(aData[10]);
            model.setRedOrb(aData[11]);
            model.setIYellowOrb(aData[12]);
            model.setYellowOrb(aData[13]);
            model.setIBlueOrb(aData[14]);
            model.setBlueOrb(aData[15]);
            model.setQTE(aData[16]);
            model.setProfession(aData[17]);
            model.setAwakening(aData[18]);
            model.setLeader(aData[19]);
            model.setCore(aData[20]);
            model.setUltimate(aData[21]);
            model.setSS(aData[22]);
            model.setSSS(aData[23]);
            model.setSSPlus(aData[24]);
            model.setHint(aData[25]);
            //Build 1
            model.setIBuild1Memo1(aData[26]);
            model.setBuild1Memo1(aData[27]);
            model.setIBuild1Memo2(aData[28]);
            model.setBuild1Memo2(aData[29]);
            model.setResonance1_1(aData[30]);
            model.setResonance1_2(aData[31]);
            model.setRemarks1(aData[32]);
            //Build 2
            model.setIBuild2Memo1(aData[33]);
            model.setBuild2Memo1(aData[34]);
            model.setIBuild2Memo2(aData[35]);
            model.setBuild2Memo2(aData[36]);
            model.setResonance2_1(aData[37]);
            model.setResonance2_2(aData[38]);
            model.setRemarks2(aData[39]);
            //Build 3
            model.setIBuild3Memo1(aData[40]);
            model.setBuild3Memo1(aData[41]);
            model.setIBuild3Memo2(aData[42]);
            model.setBuild3Memo2(aData[43]);
            model.setResonance3_1(aData[44]);
            model.setResonance3_2(aData[45]);
            model.setRemarks3(aData[46]);
            list.add(model);
        }

        return list;
    }
}
