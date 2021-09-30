package com.destiny.punishinggrayravenguide.Model.English;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class BClassConstructEN {
    public static String[][] data = new String[][]{
            {"1",
                    //Gambar 1
                    String.valueOf(R.drawable.lucia_lotus_real),
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
                    //Basic Attack
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
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Patton",
                    //Memo 2
                    String.valueOf(R.drawable.frederick),
                    "2 x Frederick",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Awakening Set.\n" +
                            "2 Frederick can also be substituted with 2 Darwin/Condelina.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.zuwen_yuan),
                    "4 x Zuwen Yuan",
                    //Memo 2
                    String.valueOf(R.drawable.gloria),
                    "2 x Gloria",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "NIL",
                    "-",
                    //Remarks
                    "Pre-Wanshi Ice QTE support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    "-",
                    "-",
                    //Memo 2
                    "-",
                    "-",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "-",
                    "-",
                    //Remarks
                    "-",
                    //Role
                    "-",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.memory_erwin),
                    "4 x Erwin",
                    //Memo 2
                    String.valueOf(R.drawable.memory_aife),
                    "2 x Aife",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "NIL",
                    "-",
                    //Remarks
                    "5 Star Memory",
                    //Role
                    "5 Star Memory",
                    //Signature Weapon
                    String.valueOf(R.drawable.lotus_berserker),
                    "Lotus Berserker",
                    "Basic attack damage +10%.\n" +
                            "Physical damage +5% for 2s when performing\n" +
                            "Basic attacks, up to 5 stacks.\n" +
                            "Triggering the effect again refreshes the duration."
            },
            {"2",
                    //Gambar 1
                    String.valueOf(R.drawable.nanami_storm_real),
                    //Name 2
                    "Nanami",
                    //Model 3
                    "Storm",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "100% Physical",
                    //CV 6
                    "Tanaka Minami",
                    //Serial 7
                    "MPL-00",
                    //Affilation 8
                    "-",
                    //Class 9
                    "B",
                    //Red Orb 10
                    String.valueOf(R.drawable.storm_red),
                    //11
                    "Sprint forward and attack, dealing 240%/480%/720%\n" +
                            "Physical damage to enemies in a rectangle AOE ahead.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.storm_yellow),
                    //13
                    "Spin quickly in place,\n" +
                            "dealing 200%/400%/600% Physical damage around\n" +
                            "the character.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.storm_blue),
                    //15
                    "Pull enemies towards the character, dealing\n" +
                            "100%/200%/300% Physical damage.\n" +
                            "Target's defense is reduced by 10%/20%/30% and\n" +
                            "Physical resistance of the character is increased\n" +
                            "by 20%/40%/60% for 4/4.5/5 seconds",
                    //Basic Attack
                    "Continuously attack with the chainsaw, dealing a total of 800% Physical damage.",
                    //QTE 16
                    "Perform a spinning attack upon entering the field, dealing a total of 770% Physical damage and knock down enemies.",
                    //PROFESSION 17
                    "Targets hit take 20% more damage for 5s.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Defense +15%.",
                    //CORE 20
                    "Any 3-orb combo followed by a Yellow orb will trigger an EX-Cutting Storm,\n" +
                            "striking surrounding enemies continuously 8 times, dealing 100% Physical damage per hit.",
                    //ULTIMATE 21
                    "Expend 100 energy to release a force field,\n" +
                            "blocking all attacks and protecting allies within.\n" +
                            "After 5s, an explosion occurs, dealing 1000% Physical damage.",
                    //SS 22
                    "Basic attack damage +15%, Aggro generation +20%",
                    //SSS 23
                    "When core passive is triggered, Physical resistance +30%.",
                    //SSS+ 24
                    "After activating ultimate, damage +20% for 5s.",
                    //Skill 25
                    "Triple anything + Yellow or Swap-in attack + Yellow for Core\n" +
                            "Blue to cause DEF down\n" +
                            "Ult for invuln field",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Patton",
                    //Memo 2
                    String.valueOf(R.drawable.darwin),
                    "2 x Darwin",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "if u already SSS Only",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4 x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.catherine),
                    "2 x Catherine",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 BLUE",
                    "6 CLASS",
                    //Remarks
                    "QTE support.",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.hanna),
                    "4 x Hanna",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cotie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "Anything",
                    "-",
                    //Remarks
                    "-",
                    //Role
                    "Co-op or Babel Ultimate Spam",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_erwin),
                    "4 x Erwin",
                    //Memo 2
                    String.valueOf(R.drawable.memory_aife),
                    "2 x Aife",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "Anything",
                    "-",
                    //Remarks
                    "5 Star Memory",
                    //Role
                    "5 Star Memory",
                    //Signature Weapon
                    String.valueOf(R.drawable.inverse___chimera),
                    "Inverse - Chimera",
                    "20% chance of applying Damaged condition for 3s when attacking,\n" +
                            "up to 10 stacks. Target receives 2% Physical damage every second.\n" +
                            "Effect is doubled when target is suffering from Defense reduction\n" +
                            "while Damaged.\n" +
                            "Physical damage +10% towards Damaged enemies."
            },
            {"3",
                    //Gambar 1
                    String.valueOf(R.drawable.liv_eclipse_real),
                    //Name 2
                    "Liv",
                    //Model 3
                    "Eclipse",
                    //Class Profession 4
                    "Support",
                    //Element 5
                    "100% Physical",
                    //CV 6
                    "Kayano Ai",
                    //Serial 7
                    "BPN-08",
                    //Affilation 8
                    "Gray Raven",
                    //Class 9
                    "B",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_eclipse),
                    //11
                    "Command the cannons to fire lasers once,\n" +
                            "dealing 200%/400%/600% Physical damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_eclipse),
                    //13
                    "Release a black hole at the target's position,\n" +
                            "drawing in enemies nearby.\n" +
                            "Deal 90%/150%/210% Physical damage\n" +
                            "for 1/2/3 seconds towards enemies within.\n" +
                            "The black hole will explode after, dealing\n" +
                            "80%/160%/240% Physical damage.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_eclipse),
                    //15
                    "Release a burst of energy,\n" +
                            "knocking back enemies nearby and dealing\n" +
                            "100%/200%/300% Physical damage.\n" +
                            "Nearby allies are healed for 40%/80%/120%\n" +
                            "of Liv's Attack and gain 16%/32%/48%\n" +
                            "Physical damage up for 5s.",
                    //Basic Attack
                    "Continuously bombard the target with beams for a total of 640% Physical damage.",
                    //QTE 16
                    "Release a burst of energy upon entering the field, restoring HP based on 20% of Liv's Max HP\n" +
                            "and dealing 200% Physical damage.",
                    //PROFESSION 17
                    "Healing +20%",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Max HP+10%.",
                    //CORE 20
                    "Any 3-orb combo followed by a Red orb will trigger a laser barrage,\n" +
                            "dealing a total of 800% Physical damage.",
                    //ULTIMATE 21
                    "Expend 100 energy and summon a large beam bombardment at\n" +
                            "the target's area for 2s. Each beam deals 70% Physical damage.",
                    //SS 22
                    "Gain 3 blue orbs after using ultimate.",
                    //SSS 23
                    "Current active member gains Physical damage +10% when Liv is not on the field.",
                    //SSS+ 24
                    "Damage +20% for 8s after using ultimate.",
                    //Skill 25
                    "Triple anything + Red or Swap-in attack + Red for Core\n" +
                            "Blue to heal\n" +
                            "Yellow to pull\n" +
                            "SSS rank for passive physical damage buff to others when not on field",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.darwin),
                    "4 x Darwin",
                    //Memo 2
                    String.valueOf(R.drawable.leeowanchoek),
                    "2 x Leeuwenhoek",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Damage set.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4 x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.philip_2),
                    "2 x Philip II",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "12 ATK",
                    "-",
                    //Remarks
                    "QTE support.",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    "-",
                    "-",
                    //Memo 2
                    "-",
                    "-",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "-",
                    "-",
                    //Remarks
                    "-",
                    //Role
                    "-",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_erwin),
                    "4 x Erwin",
                    //Memo 2
                    String.valueOf(R.drawable.memory_aife),
                    "2 x Aife",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "Anything",
                    "-",
                    //Remarks
                    "5 Star Memory",
                    //Role
                    "5 Star Memory",
                    String.valueOf(R.drawable.type_zero),
                    "Type Zero",
                    "Eclipse's Red Orb damage +50%.\n" +
                            "Attack +15% for 5s after 3-orb.\n" +
                            "Triggering the effect again refreshes the duration."
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
            model.setBasicAttack(aData[16]);
            model.setQTE(aData[17]);
            model.setProfession(aData[18]);
            model.setAwakening(aData[19]);
            model.setLeader(aData[20]);
            model.setCore(aData[21]);
            model.setUltimate(aData[22]);
            model.setSS(aData[23]);
            model.setSSS(aData[24]);
            model.setSSPlus(aData[25]);
            model.setHint(aData[26]);
            //Build 1
            model.setIBuild1Memo1(aData[27]);
            model.setBuild1Memo1(aData[28]);
            model.setIBuild1Memo2(aData[29]);
            model.setBuild1Memo2(aData[30]);
            model.setIBuild1Memo2(aData[29]);
            model.setBuild1Memo2(aData[30]);
            model.setIBuild1Memo3(aData[31]);
            model.setBuild1Memo3(aData[32]);
            model.setResonance1_1(aData[33]);
            model.setResonance1_2(aData[34]);
            model.setRemarks1(aData[35]);
            model.setRole1(aData[36]);
            //Build 2
            model.setIBuild2Memo1(aData[37]);
            model.setBuild2Memo1(aData[38]);
            model.setIBuild2Memo2(aData[39]);
            model.setBuild2Memo2(aData[40]);
            model.setIBuild2Memo3(aData[41]);
            model.setBuild2Memo3(aData[42]);
            model.setResonance2_1(aData[43]);
            model.setResonance2_2(aData[44]);
            model.setRemarks2(aData[45]);
            model.setRole2(aData[46]);
            //Build 3
            model.setIBuild3Memo1(aData[47]);
            model.setBuild3Memo1(aData[48]);
            model.setIBuild3Memo2(aData[49]);
            model.setBuild3Memo2(aData[50]);
            model.setIBuild3Memo3(aData[51]);
            model.setBuild3Memo3(aData[52]);
            model.setResonance3_1(aData[53]);
            model.setResonance3_2(aData[54]);
            model.setRemarks3(aData[55]);
            model.setRole3(aData[56]);
            //Build 4
            model.setIBuild4Memo1(aData[57]);
            model.setBuild4Memo1(aData[58]);
            model.setIBuild4Memo2(aData[59]);
            model.setBuild4Memo2(aData[60]);
            model.setIBuild4Memo3(aData[61]);
            model.setBuild4Memo3(aData[62]);
            model.setResonance4_1(aData[63]);
            model.setResonance4_2(aData[64]);
            model.setRemarks4(aData[65]);
            model.setRole4(aData[66]);
            model.setImageWeapon(aData[67]);
            model.setNameWeapon(aData[68]);
            model.setAbilityWeapon(aData[69]);
            list.add(model);
        }

        return list;
    }
}
