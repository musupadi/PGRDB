package com.destiny.punishinggrayravenguide.Model.English.Weapon;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ColaborativeBotEN {
    public static String[][] data = new String[][]{
            {"1",
                    "Growl",
                    String.valueOf(R.drawable.growl),
                    "Collab Bot unleashes a Positional Wave whenever No.21 performs a Shadow Prism attack, QTE\n" +
                            "or breaking out of incoming attacks. The effect can only be triggered once every 1 second.\n" +
                            "Positional Wave deals 50% Dark damage to all enemies struck. (Damage scales with the Core Passive Level)\n" +
                            "Friendly targets in the Positional Wave gain 3s of Energy Suppression.\n" +
                            "Energy Suppression: When dealing Dark damage, enemies have healing effectiveness -100% for 2s.\n" +
                            "The Collab Bot activates Fortress Mode whenever the Positional Wave detonates 4 Twilight Matrices at the same time or\n" +
                            "when No.21 enters Matrix, unleashing a high energy pulse, dealing 400% of No.21's Attack as Dark damage.\n" +
                            "The effect can only be triggered once every 12s. (Damage scales with the Core Passive level).\n" +
                            "Damage+15% for Shadow Prism attacks, Twilight Matrices and Resonance Pulses.",
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
