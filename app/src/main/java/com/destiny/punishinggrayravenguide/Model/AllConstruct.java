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
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/e/e9/Nanami_-_Storm.png/revision/latest?cb=20200728115423",
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
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/a/a6/Liv_-_Eclipse.png/revision/latest/scale-to-width-down/350?cb=20210718132142",
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
            {"4",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/a/aa/Lucia_-_Dawn.png/revision/latest/scale-to-width-down/350?cb=20210718130435",
                    //Name 2
                    "Lucia",
                    //Model 3
                    "Dawn",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "40% Physical 60% Lightning",
                    //CV 6
                    "Ishikawa Yui",
                    //Serial 7
                    "BPL-01",
                    //Affilation 8
                    "Gray Raven",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_dawn),
                    //11
                    "Perform a flurry of attacks, continuously hitting\n" +
                            "5/5/5 times, dealing 40%/80%/144% Physical damage.\n" +
                            "Damage converts to Lightning damage when\n" +
                            "it is a 3-orb. Gain Super Armor during the attack.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_dawn),
                    //13
                    "Release a lightning field,\n" +
                            "dealing 100%/200%/300% Physical damage.\n" +
                            "Targets are Marked.\n" +
                            "The field persists for 3/4/5 seconds, dealing\n" +
                            "20%/30%/40% Lightning damage per second.\n" +
                            "Marks stack up to 3 times and the duration\n" +
                            "is renewed when additional Marks are applied.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_dawn),
                    //15
                    "Quickly launch an attack towards the target,\n" +
                            "dealing 80%/160%/240% Lightning damage and pulling\n" +
                            "the target towards the character, dealing\n" +
                            "80%/160%/240% Physical damage.\n" +
                            "Targets are Marked.\n" +
                            "Marks stack up to 3 times and the duration\n" +
                            "is renewed when additional Marks are applied.",
                    //Basic Attack
                    "Continuously attack the enemy, dealing a total of 650% Physical damage.",
                    //QTE 16
                    "Perform a sweeping attack upon entering the battlefield, dealing 210% Physical damage\n" +
                            "and 570% Lightning damage to the target.",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All Assault structures' attack +10%",
                    //CORE 20
                    "Attacking a Marked target has a 25%/50%/75% chance of triggering a lightning strike\n" +
                            "based on the number of Mark stacks, dealing 60% Lightning damage.",
                    //ULTIMATE 21
                    "Expend 50 energy. Unleash additional Gurren blades.\n" +
                            "Basic attacks and skills gain an additional 25% Lightning damage for 15s.\n" +
                            "Duration is renewed when ultimate is triggered again within this state.",
                    //SS 22
                    "Lightning damage +20% when the character is within the lightning field.",
                    //SSS 23
                    "Marked lightning strike damage +20%",
                    //SSS+ 24
                    "Damage +15% for 10s after activating ultimate.",
                    //Skill 25
                    "Blue or Yellow to mark targets first\n" +
                            "Ultimate will be turned off upon swap",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.heisen),
                    "4 x Heisen",
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
                    "Awakening set.\n" +
                            "Gets robbed by Bianca later.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.heisen),
                    "4 x Heisen",
                    //Memo 2
                    String.valueOf(R.drawable.condelina),
                    "2 x Condelina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Awakening set.\n" +
                            "Gets robbed by Bianca later.",
                    //Role
                    "DPS",
                    //Build 3
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
                    String.valueOf(R.drawable.inverse___shadow),
                    "Inverse - Shadow",
                    "Lightning damage +5% for 4s, up to 4 stacks when\n" +
                            "dealing Lightning damage.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Damage +10% for 10s when activating ultimate.\n" +
                            "Triggering the effect again refreshes the duration."
            },
            {"5",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/f/f9/Lee_-_Palefire.png/revision/latest/scale-to-width-down/350?cb=20210718130831",
                    //Name 2
                    "Lee",
                    //Model 3
                    "Palefire",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "60% Physical 40% Fire",
                    //CV 6
                    "Yoshitsugu Matsuoka",
                    //Serial 7
                    "BPN-06",
                    //Affilation 8
                    "Gray Raven",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_palefire),
                    //11
                    "Quickly fire 15 shots at the target with dual pistols,\n" +
                            "each bullet dealing 16%/30%/48% Physical damage.\n" +
                            "Gain Super Armor during the attack.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_palefire),
                    //13
                    "Fire an incendiary round at the target, dealing\n" +
                            "100%/150%/200% Fire damage upon impact and\n" +
                            "leaves behind a burning field for 3/4/5 seconds that\n" +
                            "deals 12%/24%/36% Fire damage every 0.5s.\n" +
                            "Attacking enemies within the field grants\n" +
                            "an additional 12% Fire damage, triggering at\n" +
                            "a maximum of once every 0.1 second.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_palefire),
                    //15
                    "Fires a electric burst at the target,\n" +
                            "dealing 200%/400%/600% Physical damage.",
                    //Basic Attack
                    "Fire continuously, dealing a total of 880% Physical damage.",
                    //QTE 16
                    "Fire with dual pistols upon entering the field, dealing 330% Physical damage and inflicting Electrification.\n" +
                            "(Target takes additional 20% Physical damage for 5s when hit. Can be triggered up to 15times",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Physical damage +5%, Elemental damage +5%.",
                    //CORE 20
                    "Consuming Yellow orbs will add Blast effect to the next Red orb.\n" +
                            "(Bullets explode on impact, dealing 40% Fire damage in an area)",
                    //ULTIMATE 21
                    "Expend 100 energy and fire all around the character, dealing a total of 800% Physical damage\n" +
                            "with the final hit dealing 1200% Fire damage.",
                    //SS 22
                    "Damage +15% to enemies within the burning field.",
                    //SSS 23
                    "Damage +15% when damage is not taken, cooldown 10s.",
                    //SSS+ 24
                    "Core passive damage +20%",
                    //Skill 25
                    "Yellow and then Red",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.shakespeaere),
                    "4 x Shakespeare",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "Einsteina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Awakening set.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.shakespeaere),
                    "4 x Shakespeare",
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
                    "Secondary Set",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4 x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "Einsteina",
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
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.wolf_fang),
                    "Wolf Fang",
                    "Damage +20% towards targets\n" +
                            "within Yellow Orb field."
            },
            {"6",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/8/8d/Liv_-_Lux.png/revision/latest/scale-to-width-down/350?cb=20210718130650",
                    //Name 2
                    "Liv",
                    //Model 3
                    "Lux",
                    //Class Profession 4
                    "Support",
                    //Element 5
                    "20% Physical 80% Lightning",
                    //CV 6
                    "Kayano Ai",
                    //Serial 7
                    "BPN-08",
                    //Affilation 8
                    "Gray Raven",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_lux),
                    //11
                    "Fire the ion cannon once, dealing\n" +
                            "200%/400%/600% Physical damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_lux),
                    //13
                    "Create a cube at target's location, inflicting targets\n" +
                            "with the Matrix effect for 1/2/3 seconds,\n" +
                            "dealing 60%/90%/120% Lightning damage\n" +
                            "and mildly pulling targets in.\n" +
                            "The cube explodes for 60%/120%/180%\n" +
                            "Lightning damage when it vanishes.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_lux),
                    //15
                    "Create an ion wall at target's location, electrifying\n" +
                            "targets that pass through for 60% Lightning damage\n" +
                            "per second for 2/4/6s and reduces movement speed\n" +
                            "by 20%/40%/80%.\n" +
                            "Target is Marked for 8s.",
                    //Basic Attack
                    "Continuously fire lightning strikes at the enemy, dealing a total of 650% Physical damage.",
                    //QTE 16
                    "Summons an EX-Lightning strike upon entering the field, dealing 200% Lightning damage\n" +
                            "to targets within the area. The generated ion field heals all allies for 25% of Liv's Attack every second.",
                    //PROFESSION 17
                    "Healing +20%",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Max HP +5%, Attack +5%",
                    //CORE 20
                    "\tAttacking Marked targets has a 30% chance of summoning a Lightning strike, dealing 60% Lightning damage.\n" +
                            "Red orbs have a 30%/60%/100% chance of triggering a Lightning strike.\n" +
                            "After 4 triggers, the next Lightning strike summons an EX-Lightning strike instead,\n" +
                            "dealing 200% Lightning damage and heals allies for 40% of Liv's Attack.",
                    //ULTIMATE 21
                    "Expend 100 energy and create an electric field.\n" +
                            "Allies in the field gain 1 signal orb every second and 20% Attack increase.\n" +
                            "Enemies in the field have 50% reduced movement speed.",
                    //SS 22
                    "The field generated from EX-Lightning also increases allies' Lightning damage by 20%.",
                    //SSS 23
                    "Lightning strike damage +20%",
                    //SSS+ 24
                    "Enemies in the cube have 15% reduced Lightning resistance.",
                    //Skill 25
                    "Blue to mark targets to proc Lightning Strike on hit\n" +
                            "Red to also proc Lightning Strike\n" +
                            "5th Lightning Strikes will do more dmg and heals.\n" +
                            "Yellow for OP slow on targets\n" +
                            "Stay in ult to gain orb every second and ATK up",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.heisen),
                    "4 x Heisen",
                    //Memo 2
                    String.valueOf(R.drawable.condelina),
                    "2 x Condelina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Use this just for Meme",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4 x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.guineavere),
                    "2 x Guineavere",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 QTE",
                    //Remarks
                    "Secondary Set",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.guineavere),
                    "2 x Guineavere",
                    //Memo 2
                    String.valueOf(R.drawable.lantern_reunion),
                    "Lantern Reunion",
                    //Memo 3,
                    String.valueOf(R.drawable.gloria),
                    "Gloria",
                    //Resonance
                    "Anything",
                    "-",
                    //Remarks
                    "QTE support.",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.benediction),
                    "Benediction",
                    "After expending 12 orbs, damage +10% for 5s\n" +
                            "to all allies within 5m radius.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Damage +10% towards imprisoned targets."
            },
            {"7",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/8/80/Karenina_-_Blast.png/revision/latest/scale-to-width-down/350?cb=20210718133429",
                    //Name 2
                    "Karenina",
                    //Model 3
                    "Blast",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "80% Physical 20% Fire",
                    //CV 6
                    "Haruka Tomatsu",
                    //Serial 7
                    "BPD-72",
                    //Affilation 8
                    "Engineering",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_blast),
                    //11
                    "Fire 6 shells ahead, dealing\n" +
                            "40%/80%/120% Physical damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_blast),
                    //13
                    "Quickly launch a shell at the target,\n" +
                            "dealing 150%/300%/450% Physical damage\n" +
                            "and Marking them.\n" +
                            "Marked targets have a 75% chance of receiving\n" +
                            "10%/20%/30% Fire damage when taking damage.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_blast),
                    //15
                    "Fires a special shell ahead, drawing enemies in\n" +
                            "and dealing 100%/200%/300% Physical damage.\n" +
                            "Enemies within the area take 50% Physical damage\n" +
                            "every second for 1/2/3s",
                    //Basic Attack
                    "Continuously attack with the cannon, dealing a total of 600% Physical damage.",
                    //QTE 16
                    "Fires a whirling shell, dealing up to 500% Physical damage.",
                    //PROFESSION 17
                    "Damage +20%",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "Team members' Attack +10% when there are 3 different professions.",
                    //CORE 20
                    "Enter Burst state after triggering any 3-orb combo 3 times.\n" +
                            "Basic attack changes to long-ranged cannon salvos for 3s, dealing 80% Physical damage per hit.",
                    //ULTIMATE 21
                    "Expend 100 energy and continuously bombard the target's area\n" +
                            "with each bombardment dealing 100% Physical damage.\n" +
                            "Enter Burst state after using ultimate.",
                    //SS 22
                    "Yellow orb skill damage +50%",
                    //SSS 23
                    "Marked enemies take 15% more damage.",
                    //SSS+ 24
                    "Basic attack damage +20%",
                    //Skill 25
                    "Triple anything 3 times to activate core\n" +
                            "Ult will also immediately activate core\n" +
                            "Blue to pull\n" +
                            "QTE also pulls",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.hanna),
                    "4 x Hanna",
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
                    "Awakening set.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4 x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "2 x Einsteina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 QTE",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 3
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
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.berserk_fushion),
                    "Berserk Fusion",
                    "Physical damage +10%.\n" +
                            "Basic Attack Damage +30% for 5s after 3-orb.\n" +
                            "Triggering the effect again refreshes the duration."
            },
            {"8",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/3/3c/Bianca_-_Zero.png/revision/latest/scale-to-width-down/350?cb=20210718133858",
                    //Name 2
                    "Bianca",
                    //Model 3
                    "Zero",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Physical",
                    //CV 6
                    "Kawasumi Ayako",
                    //Serial 7
                    "BPO-87",
                    //Affilation 8
                    "Purification Force",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_zero),
                    //11
                    "Continuously fire 1/2/3 arrows at the target.\n" +
                            "Each arrow deals 200% Physical damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_zero),
                    //13
                    "Fire 5/5/7 energy arrows ahead, each arrow\n" +
                            "dealing 30%/60%/90% Physical damage upon impact.\n" +
                            "Generate 1/2/3 energy when target is struck.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_zero),
                    //15
                    "Infuse the weapon with energy for 4/6/8s.\n" +
                            "Basic attacks gain additional 1/2/3 arrows.\n" +
                            "Dealing 20%/30%/40% Physical damage per arrow.",
                    //Basic Attack
                    "Continuously fire 9 arrows at the target, dealing a total of 580% Physical damage.",
                    //QTE 16
                    "Fires 5 times continuously at the target, dealing 60% Physical damage per hit and is guaranteed critical.",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Critical Damage +10%",
                    //CORE 20
                    "1 energy arrow is stored for every 3-orb performed.\n" +
                            "Maximum of 3 arrows can be stored.\n" +
                            "All arrows are unleashed on the next ultimate performed, each arrow dealing 100% Physical damage twice.",
                    //ULTIMATE 21
                    "Expend 60 energy and fire an arrow shower at the target, each arrow dealing 200% Physical damage.",
                    //SS 22
                    "Basic attack damage +15%",
                    //SSS 23
                    "Critical damage +30%",
                    //SSS+ 24
                    "Ultimate damage +20%",
                    //Skill 25
                    "Yellow gives back ult energy.\n" +
                            "Do triple blue and spam normals for big damage.\n" +
                            "Each triple done puts 1 energy arrow on her back, up to 3. Unleash those with ult.",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Patton",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Awakening set.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Patton",
                    //Memo 2
                    String.valueOf(R.drawable.condelina),
                    "2 x Condelina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Physical Bianca",
                    //Role
                    "DPS",
                    //Build 3
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
                    "6 ATK",
                    "6 QTE",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.ramiel),
                    "Ramiel",
                    "Ultimate damage +15%.\n" +
                            "Target's Physical resistance is reduced by 2% for 5s for every\n" +
                            "ultimate hit landed, up to 8 stacks.\n" +
                            "Triggering the effect again refreshes the duration."
            },
            {"9",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/4/4f/Watanabe_-_Nightblade.png/revision/latest/scale-to-width-down/350?cb=20210718132928",
                    //Name 2
                    "Watanabe",
                    //Model 3
                    "Nightblade",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Physical",
                    //CV 6
                    "Hosoya Yoshimasa",
                    //Serial 7
                    "BPO-29",
                    //Affilation 8
                    "Oblivion",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_nightblade),
                    //11
                    "Continuously attack the target 4 times,\n" +
                            "dealing 160%/320%/480% Physical damage.\n" +
                            "Perform an additional attack for 160%\n" +
                            "Physical damage for 3-orb combos.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_nightblade),
                    //13
                    "Rush forward and pierce through the enemy,\n" +
                            "dealing 160%/320%/480% Physical damage\n" +
                            "along the way.\n" +
                            "Perform an additional attack for 120%\n" +
                            "Physical damage for 3-orb combos.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_nightblade),
                    //15
                    "Thrust the knife into the target and then pulling it out.\n" +
                            "Dealing 80%/160%/240% Physical damage for the thrust,\n" +
                            "and 70%/140%/210% for the pull.\n" +
                            "Damage is guaranteed critical when attacking\n" +
                            "from the target's rear.",
                    //Basic Attack
                    "Continuously attack with dual blades for 740% Physical damage.",
                    //QTE 16
                    "Stab downwards from mid-air, dealing 600% Physical damage.",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "Team members' Critical rate +10% when there are 3 different professions.",
                    //CORE 20
                    "Mark the target once at the end of every 3-orb combo.\n" +
                            "Generate an energy clone for 5s when there are 2 stacks of Marks.\n" +
                            "The energy clone attacks once for 90% Physical damage whenever\n" +
                            "Basic attack is performed.",
                    //ULTIMATE 21
                    "Expend 100 energy and unleash a blade flurry, dealing a total of 3000% Physical damage.",
                    //SS 22
                    "Damage +15% when attacking from the target's rear.",
                    //SSS 23
                    "Damage +15% when an energy clone is present.",
                    //SSS+ 24
                    "Enemies damaged by ultimate has 15% reduced Physical resistance for 10s.",
                    //Skill 25
                    "Spam triples and always go for their rear",
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
                    "Awakening set.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Patton",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Co Op",
                    //Role
                    "DPS",
                    //Build 3
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
                    "6 ATK",
                    "6 QTE",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.soul_ripper),
                    "Soul Ripper",
                    "When dealing a Critical strike from the rear,\n" +
                            "apply Damaged condition for 3s, dealing 50% Physical damage\n" +
                            "every second. Triggering the effect again refreshes the duration.\n" +
                            "Physical damage +20% towards Damaged enemies.."
            },
            {"10",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/b/b3/Kamui_-_Bastion.png/revision/latest?cb=20200728115341",
                    //Name 2
                    "Kamui",
                    //Model 3
                    "Bastion",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "100% Physical",
                    //CV 6
                    "Fukuyama Jun",
                    //Serial 7
                    "BPE-72",
                    //Affilation 8
                    "Strike Hawk",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_bastion),
                    //11
                    "Perform a downward cut,\n" +
                            "dealing 200%/400%/400% Physical damage.\n" +
                            "Perform an additional strike\n" +
                            "for 400% Physical damage when a 3-orb\n" +
                            "combo is done.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_bastion),
                    //13
                    "Go into a block stance for 2s,\n" +
                            "reduce damage taken by 75%.\n" +
                            "Perform an area-wide counterattack for\n" +
                            "200%/400%/600% Physical damage when an\n" +
                            "attack is successfully blocked and also gain\n" +
                            "40/80/120 stored energy.\n" +
                            "Perform a sword wave when the block duration ends\n" +
                            "or when Basic attack is triggered during blocking,\n" +
                            "dealing 100%/200%/400% Physical damage and ending\n" +
                            "the block stance.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_bastion),
                    //15
                    "Protect self with a burst of energy,\n" +
                            "gaining 50%/100%/150% Defense worth of shield.\n" +
                            "Inflict 1/1.5/2s stun and 100%/200%/300%\n" +
                            "Physical damage when the ground is struck.",
                    //Basic Attack
                    "Swing the greatsword continuously, dealing a total of 790% Physical damage.",
                    //QTE 16
                    "Strike the target with the greatsword upon entering the field, dealing 500% Physical damage.\n" +
                            "Target is stunned for 3s and Defense reduced by 10% for 6s.",
                    //PROFESSION 17
                    "Targets hit take 20% more damage for 5s.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "TAll team members' Physical damage +10% when HP is above 70%.",
                    //CORE 20
                    "Gain 40 stored energy after any 3-orb combo.\n" +
                            "Stored energy limit is 120.\n" +
                            "Attack is increased by 6%/12%/18% when the stored energy value is at 0/40/80.\n" +
                            "Stored energy decreases by 8 points every second during the charged state.",
                    //ULTIMATE 21
                    "Expend 100 energy. Accumulate a burst of energy and swiftly swing the greatsword\n" +
                            "at the target, dealing 2000% Physical damage.",
                    //SS 22
                    "Gain 1 random signal orb after a successful block, 5s cooldown.",
                    //SSS 23
                    "When stored energy is greater than 60, Physical damage taken is reduced by 60%.\n" +
                            "Physical damage +8%.",
                    //SSS+ 24
                    "Physical damage +10% when a shield is present.",
                    //Skill 25
                    "Blue to shield up and stun\n" +
                            "Yellow to block and counter\n" +
                            "All triples and the counter grants charged energy",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.hanna),
                    "4 x Hanna",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CLASS",
                    //Remarks
                    "Awakening Parry God",
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
                    "6 ATK",
                    "6 QTE",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 3
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
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.big_kamui),
                    "Big Kamui",
                    "Physical damage +15%.\n" +
                            "After a successful block, damage +30% for the next skill used."
            },
            {"11",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/6/6f/Kamui_-_Tenebrion.png/revision/latest/scale-to-width-down/350?cb=20200728115108",
                    //Name 2
                    "Kamui",
                    //Model 3
                    "Tenebrion",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "50% Physical 50% Dark",
                    //CV 6
                    "Fukuyama Jun",
                    //Serial 7
                    "BPE-72",
                    //Affilation 8
                    "Strike Hawk",
                    //Class 9
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_tenebrion),
                    //11
                    "Perform a cross-slash, dealing 200%/400%/600%\n" +
                            "Physical damage and additional\n" +
                            "40%/80%/160% Dark damage.\n" +
                            "\n" +
                            "Shadow Form: Perform downward slashes on the target,\n" +
                            "dealing 800%/1000%/1200% Dark damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_tenebrion),
                    //13
                    "Continuously charge towards the target, dealing\n" +
                            "200%/400%/600% Physical damage and additional\n" +
                            "40%/80%/120% Dark damage.\n" +
                            "Damage received is reduced by 30%\n" +
                            "and the character is immune to impairments while charging.\n" +
                            "\n" +
                            "Shadow Form: Continuously charge towards the target,\n" +
                            "dealing 600%/700%/950% Dark damage.\n" +
                            "Damage received is reduced by 30%\n" +
                            "and the character is immune to impairments while charging",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_tenebrion),
                    //15
                    "Spin around and launch the target, dealing\n" +
                            "140%/280%/420% Physical damage and additional\n" +
                            "40%/80%/120% Dark damage.\n" +
                            "Target is pulled in during the spin.\n" +
                            "\n" +
                            "Shadow Form: Strike the ground and release a fan AOE\n" +
                            "energy wave, dealing 480%/600%/720% Dark damage\n" +
                            "and stun the target for 3/4/5s.",
                    //Basic Attack
                    "Continuously attack with the greatsword, dealing a total of 560% Physical damage.\n" +
                            "Shadow Form: Continuously attack with the shadow blade, dealing a total of 900% Dark damage.",
                    //QTE 16
                    "Spin and cut the target upon entering the field, dealing 580% Dark damage and\n" +
                            "reduce Dark resistance by 10% for 6s.",
                    //PROFESSION 17
                    "Targets hit take 20% more damage for 5s.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Elemental damage +10%, Physical damage +5% when there are 3 different professions.",
                    //CORE 20
                    "Gain 10 energy when 3-orb combos are performed.\n" +
                            "Physical and Dark resistance is increased by 30% during Shadow Form.",
                    //ULTIMATE 21
                    "Shadow Form can be activated when energy is greater than 60.\n" +
                            "All skills will be converted. Energy will drain at 8 points a second.\n" +
                            "Exit Shadow Form when energy is completely drained.\n" +
                            "Dark damage +40% during Shadow Form.",
                    //SS 22
                    "During Shadow Form, damage taken is reduced by 20% and\n" +
                            "targets struck have 15% reduced Dark resistance for 8s.",
                    //SSS 23
                    "3-orb skill damage +30%",
                    //SSS+ 24
                    "Dark damage +20% during Shadow Form.",
                    //Skill 25
                    "Spam triples to stay in ult form\n" +
                            "Switch away to preserve ult and return again with Matrix slow for easy triple\n" +
                            "Blue stuns",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.hanna),
                    "4 x Hanna",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "2 x Einsteina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 CLASS",
                    //Remarks
                    "Warzone DPS",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4 x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "2 x Einsteina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 Class",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 3
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
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.darkness),
                    "Darkness",
                    "Physical and Dark damage +20% for 5s after 3-orb.\n" +
                            "Triggering the effect again refreshes the duration."
            },
            {"11",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/7/75/Liv_-_Luminance.png/revision/latest/scale-to-width-down/350?cb=20210718135929",
                    //Name 2
                    "Liv",
                    //Model 3
                    "Luminance",
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
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_luminance),
                    //11
                    "Fire the beam cannons at target's location,\n" +
                            "dealing 200%/400%/600% Physical damage\n" +
                            "and reducing movement speed by 20% for 3s.\n" +
                            "Reduce target's damage by 5% during 3-orbs.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_luminance),
                    //13
                    "Empower the weapons. Basic attacks gain\n" +
                            "additional hits, dealing 30%/40%/50% Physical damage\n" +
                            "up to 16/20/32 hits for 2.5/3.5/5s.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_luminance),
                    //15
                    "Generate a particle field at target's location for 3/6/9s,\n" +
                            "Marking all enemies within and dealing\n" +
                            "100%/200%/300% Physical damage.\n" +
                            "Enemies are pulled to the center of the field every second.",
                    //Basic Attack
                    "Unleash energy shots at the target, dealing a total of 520% Physical damage.",
                    //QTE 16
                    "Heal nearby allies for 100% of Liv's Attack and gain 100% of Liv's Attack worth of shield for 2s.",
                    //PROFESSION 17
                    "Healing +20%",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' HP +15%.",
                    //CORE 20
                    "Attacking marked enemies has a 20% chance of triggering Judgment Ray, dealing 150% Physical damage.\n" +
                            "Heal nearby allies for 60% of Liv's Attack during 3-orb combos or after 5 Judgment Ray triggers.",
                    //ULTIMATE 21
                    "Expend 100 energy. Generate a large energy field and continuously unleash Judgment Ray towards\n" +
                            "enemies within the field at random, each dealing 150% Physical damage.\n" +
                            "Allies within the field gain 75% Physical resistance.",
                    //SS 22
                    "Damage +15% towards enemies in Blue orb field.",
                    //SSS 23
                    "Judgment Ray damage +50%",
                    //SSS+ 24
                    "All members' damage +15% for 5s after triggering ultimate.",
                    //Skill 25
                    "Place Blue to mark targets\n" +
                            "Triple yellow to immensely buff basic attacks\n" +
                            "Stay near targets with ult to gain heals",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.hanna),
                    "4 x Hanna",
                    //Memo 2
                    String.valueOf(R.drawable.darwin),
                    "2 x Darwin",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "12 atk+crit",
                    "-",
                    //Remarks
                    "DPS Liv",
                    //Role
                    "DPS",
                    //Build 2
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
                    "12 atk+crit",
                    "-",
                    //Remarks
                    "Meme DPS Build",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.philip_2),
                    "2x Philip II",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "12 atk+crit",
                    "-",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.dragon_wind),
                    "Dragon Wind",
                    "Basic attacks have 10% chance of weakning enemies,\n" +
                            "reducing Attack by 10% for 5s.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "10% chance of generating a signal orb when attacking weakened\n" +
                            "targets. 6s cooldown."
            },
            {"12",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/3/3d/Lee_-_Entropy.png/revision/latest/scale-to-width-down/350?cb=20210718135530",
                    //Name 2
                    "Lee",
                    //Model 3
                    "Entrophy",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Physical",
                    //CV 6
                    "Matsuoka Yoshitsugu",
                    //Serial 7
                    "BPN-08",
                    //Affilation 8
                    "Gray Raven",
                    //Class 9
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_entrophy),
                    //11
                    "Leap into the air and shoot forward in a small AOE,\n" +
                            "each bullet dealing 22.5%/45%/70% Physical damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_entrophy),
                    //13
                    "Step and shoot the enemy, dealing 180%/440%/700%\n" +
                            "Physical damage, Marking the target for 4/6/8s.\n" +
                            "Attacking Marked targets grant an additional shot,\n" +
                            "dealing 20%/40%/60% Physical damage.\n" +
                            "When the Mark is re-applied, the highest orb combo\n" +
                            "ability will always overwrite the lesser Mark.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_entrophy),
                    //15
                    "Shoot an energy projectile, dealing 100%/200%/300%\n" +
                            "Physical damage.\n" +
                            "Generate an energy field upon impact\n" +
                            "or after a certain distance traveled.\n" +
                            "The energy field will pull enemies towards the center once\n" +
                            "and deal 24%/48%/72% Physical damage per second\n" +
                            "for 3/4/5s.",
                    //Basic Attack
                    "Continuously fire at the target for a total of 825% Physical damage.",
                    //QTE 16
                    "Fire from mid-air, dealing a total of 675% Physical damage.",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Physical damage +15%, movement speed +10%",
                    //CORE 20
                    "After any 3-orb combo, the next Red orb will trigger additional follow-up shots,\n" +
                            "each dealing 55% Physical damage.",
                    //ULTIMATE 21
                    "Expend 100 energy. Call upon a long-range energy cannon support,\n" +
                            "each strike dealing 400% Physical damage.",
                    //SS 22
                    "Damage +15% towards enemies within the energy field.",
                    //SSS 23
                    "Damage +20% towards Marked enemies.",
                    //SSS+ 24
                    "Physical damage +10% for 5s after any 3-orb, stacks up to 3 times.\n" +
                            "Triggering the effect again refreshes the duration.",
                    //Skill 25
                    "Triple anything + Red or Swap-in attack + Red for Core\n" +
                            "Ult aoe position can be manuevered",
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
                    "12 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Awakening set",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Patton",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "12 ATK+CRIT",
                    "6 CORE",
                    //Remarks
                    "Awakening set",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.catherine),
                    "2x Catherine",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "12 atk+crit",
                    "-",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.zero_scale),
                    "Zero Scale",
                    "Core passive damage +10%.\n" +
                            "Physical damage +15% for 5s after 3-orb combos.\n" +
                            "Triggering the effect again refreshes the duration."
            },
            {"13",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/e/e8/Karenina_-_Ember.png/revision/latest/scale-to-width-down/350?cb=20210718140127",
                    //Name 2
                    "Karenina",
                    //Model 3
                    "Ember",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "30% Physical 70% Fire",
                    //CV 6
                    "Tomatsu Haruka",
                    //Serial 7
                    "BPD-72",
                    //Affilation 8
                    "Engineering",
                    //Class 9
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_ember),
                    //11
                    "Perform a cross attack with the cannon, dealing\n" +
                            "100%/200%/300% Physical damage.\n" +
                            "Gain Super Armor during the move.\n" +
                            "\n" +
                            "Enhanced state: Deal 150%/300%/450% Fire damage.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_ember),
                    //13
                    "Leap towards the target and crush them with the cannon,\n" +
                            "dealing 180%/360%/540% Physical damage.\n" +
                            "Damage taken is reduced by 30% during the move.\n" +
                            "\n" +
                            "Enhanced state: Deal 270%/540%/810% Fire damage.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_ember),
                    //15
                    "Summon aerial laser cannons, immediately\n" +
                            "dealing 6%/12%/18% Physical damage per hit.\n" +
                            "(Follow-up) The laser cannons will continually deal\n" +
                            "20%/40%/60% Physical damage.\n" +
                            "Additional laser cannons will always have the same\n" +
                            "output as the highest level existing one.\n" +
                            "\n" +
                            "Enhanced state: Deal 30%/60%/90% Fire damage.",
                    //Basic Attack
                    "Continuously attack, dealing a total of 720% Physical damage.\n" +
                            "Enhance state: Basic attacks deal a total of 720% Fire damage.",
                    //QTE 16
                    "Deal 720% Fire damage towards the target upon entering the field.",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Attack +10%, Assault structures' Attack +5% when there are 3 different professions.",
                    //CORE 20
                    "Gain Thermal Energy at the start of battle corresponding to Skill level,\n" +
                            "with each level granting 3% Thermal Energy. Performing 3-orbs and ultimate also grant Thermal Energy.\n" +
                            "Enter Enhanced state when Thermal Energy reaches 50%,\n" +
                            "Karenina's skills gain additional effects and Fire damage +20%.\n" +
                            "Thermal Energy drains at 5% a second during Enhanced state.",
                    //ULTIMATE 21
                    "Expend 100 energy. Continuously fire a beam towards the ground, dealing 200% Fire damage to targets\n" +
                            "and leave behind a scorching path for 5s, dealing 200% Fire damage each second\n" +
                            "to enemies in the path.",
                    //SS 22
                    "Fire damage +10% during Enhanced state.",
                    //SSS 23
                    "Damage of enhanced skills +10%",
                    //SSS+ 24
                    "Target's Fire resistance is reduced by 15% for 5s when damaged by ultimate.",
                    //Skill 25
                    "Spam triples and ult to maintain gauge",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.shakespeaere),
                    "4 x Shakespeare",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 YELLOW",
                    "6 ULT/ATK",
                    //Remarks
                    "Warzone",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.hanna),
                    "4 x Hannah",
                    //Memo 2
                    String.valueOf(R.drawable.darwin),
                    "2 x Darwin",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 YELLOW",
                    "6 ULT/ATK",
                    //Remarks
                    "Awakening set",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "2x Einsteina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "12 ATK+CRIT",
                    "-",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.fusion_dragon),
                    "Fusion Dragon",
                    "Fire damage +10%.\n" +
                            "Fire damage +10% for 5s when triggering Red orbs.\n" +
                            "Triggering the effect again refreshes the duration."
            },
            {"14",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/9/93/Nanami_-_Pulse.png/revision/latest/scale-to-width-down/350?cb=20210718140319",
                    //Name 2
                    "Nanami",
                    //Model 3
                    "Pulse",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "50% Physical 50% Fire",
                    //CV 6
                    "Tanaka Minami",
                    //Serial 7
                    "BMPL-00",
                    //Affilation 8
                    "?",
                    //Class 9
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_pulse),
                    //11
                    "PRush forward and attack with the chainsaw,\n" +
                            "dealing 20%/40%/60% Phyiscal damage per hit,\n" +
                            "up to 12 hits.\n" +
                            "\n" +
                            "Damage is converted to Fire element when it is a 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_pulse),
                    //13
                    "Flip forward and atttack with the chainsaw,\n" +
                            "dealing damage twice.\n" +
                            "During 1-orb or 2-orb combos, deal 100%/200%\n" +
                            "Physical damage.\n" +
                            "Deal 200% on both hits for 3-orb combos and\n" +
                            "also generate a fire energy ring,\n" +
                            "dealing 30% Fire damage per hit, up to 12 hits.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_pulse),
                    //15
                    "Trigger a burst of energy, interrupting incoming attacks\n" +
                            "and dealing damage thrice to surrounding targets\n" +
                            "for 50%/100%/200% Physical damage.\n" +
                            "Gain 5%/7.5%/10% of HP worth of shield for 5s.\n" +
                            "Grant Super Armor when the shield is present.\n" +
                            "Damage is converted to Fire element when it is a 3-orb.",
                    //Basic Attack
                    "Continuously attack with the chainsaw, dealing a total of 620% Physical damage.",
                    //QTE 16
                    "Deal 480% Fire damage in a circle and reduce target's Fire resistance by 10% for 6s.",
                    //PROFESSION 17
                    "Targets hit take 20% more damage for 5s.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All team members' Defense +15%, Fire resistance +10%",
                    //CORE 20
                    "Enter Overclock Mode after activating ultimate.\n" +
                            "Basic attacks deal Fire damage and enemies struck have 15% reduced Fire resistance for 8s.",
                    //ULTIMATE 21
                    "Expend 30 energy. Charge towards the target and deal 900% Fire damage along the way.",
                    //SS 22
                    "When dealing Fire damage, there is a 30% chance of triggering an explosion,\n" +
                            "causing additional 25% Fire damage.",
                    //SSS 23
                    "After activating ultimate, gain Super Armor, 20% increased damage reduction\n" +
                            "and +15% Fire damage for 8s.",
                    //SSS+ 24
                    "After activating ultimate, damage +15% for 8s.",
                    //Skill 25
                    "Blue to gain shield and break out of stun\n" +
                            "Ult grants fire buff for 8s",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.shakespeaere),
                    "4 x Shakespeare",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "2 x Einsteina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 CLASS",
                    //Remarks
                    "Awakening Set",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.shakespeaere),
                    "4 x Shakespeare",
                    //Memo 2
                    String.valueOf(R.drawable.condelina),
                    "2 x Condelina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 CLASS",
                    //Remarks
                    "Awakening Set",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "2x Einsteina",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "12 ATK",
                    "6 CLASS",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.hydroheat),
                    "Hydroheat",
                    "10% chance of reducing target's Fire resistance by 5% for 5s\n" +
                            "when attacking.\n" +
                            "8s cooldown towards the same target.\n" +
                            "Fire damage +20% after activating ultimate and the\n" +
                            "chance of reducing Fire resistance is doubled."
            },
            {"15",
                    //Gambar 1
                    "https://static.wikia.nocookie.net/punishing-gray-raven/images/f/f9/Lucia_-_Crimson_Abyss.png/revision/latest/scale-to-width-down/350?cb=20200728115035",
                    //Name 2
                    "Lucia",
                    //Model 3
                    "Crimson Abyss",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Physical",
                    //CV 6
                    "Ishikawa Yui",
                    //Serial 7
                    "α",
                    //Affilation 8
                    "Ascendants",
                    //Class 9
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_abyss),
                    //11
                    "Attack in a flash to all targets ahead, each strike dealing\n" +
                            "25%/50%/75% Physical damage.\n" +
                            "During a 3-orb combo, gain an additional strike\n" +
                            "on the final hit, dealing 75% Physical damage and\n" +
                            "launching targets.\n" +
                            "Gain Super Armor during the move.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_abyss),
                    //13
                    "Assault and pass through targets ahead,\n" +
                            "dealing 250%/500%/750% Physical damage along the way",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_abyss),
                    //15
                    "Enhance the energy supply for 5s.\n" +
                            "Movement speed is increased by 20%/30%/50%.\n" +
                            "Attacks gain 2 additional strikes, dealing\n" +
                            "4%/8%/12% Physical damage each.\n" +
                            "\n" +
                            "During Sword Wave, the additional strikes are converted\n" +
                            "to additional Sword Waves, each dealing\n" +
                            "8%/16%/24% Physical damage.",
                    //Basic Attack
                    "Attack the target with 5 sword styles, each style dealing 80%/100%/120%/270%/280% Physical damage.\n" +
                            "Continue from the 3rd Basic attack sequence after dodging.",
                    //QTE 16
                    "Unleash a Rising Dragon combo upon entering the field, launching targets\n" +
                            "and dealing a total of 600% Physical damage.",
                    //PROFESSION 17
                    "Damage +20%.",
                    //Awakening 18
                    "Gain 3 signal orbs at the start of battle.",
                    //Leader 19
                    "All Assault structures' Attack +10%, Critical stat +5%.",
                    //CORE 20
                    "After a Blue 3-orb combo, activate any 3-orb combo again\n" +
                            "and the character will retreat into Sword Wave mode (The retreat counts as a dodge).\n" +
                            "All existing signal orbs will be converted to Sword Wave orbs. Gain 2 extra Sword Wave orbs as well.\n" +
                            "During Sword Wave mode, orbs generated from Basic attacks will also be converted to Sword Wave orbs.\n" +
                            "Unleash a Sword Wave when expending the orb, dealing 340% Physical damage and gain Super Armor during the move.",
                    //ULTIMATE 21
                    "Expend 85 energy. Cut all targets in front in a flash, dealing 2600% Physical damage.",
                    //SS 22
                    "Physical damage +10% for 4s when performing Red 3-orb combos.",
                    //SSS 23
                    "Damage +5%. Gain 2 additional signal orbs when exiting Sword Wave mode.",
                    //SSS+ 24
                    "Physical damage +20% during Blue orb.",
                    //Skill 25
                    "3 Blue + 3 Anything to enter sword wave. Do them together for the best damage and not on\n" +
                            "separate instances.\n" +
                            "\n" +
                            "3 Blue + 3 Red if Alpha is SS and above",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.frederick),
                    "4 x Frederick",
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
                    "Awakening set.\n" +
                            "Great for bursting down bosses in\n" +
                            "Pain Cage, Warzone, pretty much everywhere else.\n" +
                            "Requires more planning because the burst window is during\n" +
                            "Matrix. Also has a higher overall ATK stat than\n" +
                            "Patton build.\n" +
                            "Dodge up to 3 times including Sword Wave dodge to\n" +
                            "have the highest damage stack.",
                    //Role
                    "DPS",
                    //Build 2
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
                    "More consistency in damage and crits without having to worry\n" +
                            "about burst windows.\n" +
                            "Also easier to farm than Fredericks in the early stages of PGR.",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.catherine),
                    "2x Catherine",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 QTE",
                    //Remarks
                    "QTE Support",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_aife),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_erwin),
                    "2 x Erwin",
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
                    String.valueOf(R.drawable.sakura),
                    "Sakura",
                    "Physical damage +2% for 5s, up to 10 stacks for every orb expended.\n" +
                            "Triggering the effect again refreshes the duration.\n" +
                            "Gain 1 additional Sword Wave orb when entering Sword Wave mode,\n" +
                            "10s cooldown."
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
