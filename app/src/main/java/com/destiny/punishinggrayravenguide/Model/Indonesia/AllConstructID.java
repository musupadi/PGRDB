package com.destiny.punishinggrayravenguide.Model.Indonesia;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.google.gson.internal.bind.JsonTreeReader;

import java.util.ArrayList;

public class AllConstructID {
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
                    "80% Fisik 20% Api",
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
                    "Dorong ke depan menuju target, tarik mereka ke dalam dan\n" +
                            "memberikan 266,72%/533,32%/800% Kerusakan fisik.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_lotus),
                    //13
                    "Luncurkan target dengan cepat dalam satu serangan,\n" +
                            "memberikan 150%/300%/450% Kerusakan fisik.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_lotus),
                    //15
                    "Nyalakan senjata,\n" +
                            "memberikan 100%/200%/300% Kerusakan fisik.\n" +
                            "Serangan mendapatkan tambahan 10%/15%/20%\n" +
                            "Kerusakan api selama 4/4/6 detik.",
                    //Basic Attack
                    "Terus menyerang, memberikan 540% Kerusakan Fisik.\n",
                    //QTE 16
                    "Masuki medan perang dengan bilah ganda, memberikan 1110% Kerusakan Fisik.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Mendapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "All Assault structures' attack +10%",
                    //CORE 20
                    "Semua serangan karakter Assault +10%",
                    //ULTIMATE 21
                    "Expend 100 energy to unleash a flurry of blades, dealing 140% Physical\n" +
                            "damage for every hit, and 1000% Physical damage on the final hit.",
                    //SS 22
                    "Target yang diluncurkan ke udara menerima 20% kerusakan Fisik tambahan.",
                    //SSS 23
                    "Kerusakan +15% selama mode bilah ganda.",
                    //SSS+ 24
                    "Kerusakan serangan dasar +15%.",
                    //Skill 25
                    "Tiga kali apa pun + Merah atau Tukar dalam serangan + Merah untuk Inti\n" +
                            "Biru untuk serangan buff\n" +
                            "Kuning untuk diluncurkan",
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
                    "Awakening Set",
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
                    "Dukungan QTE Pra-Wanshi Es",
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
                    "Kerusakan serangan dasar +10%.\n" +
                            "Kerusakan fisik +5% selama 2 detik saat tampil\n" +
                            "Serangan dasar, hingga 5 tumpukan.\n" +
                            "Memicu efek lagi menyegarkan durasi."
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
                    "100% Fisik",
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
                    "Berlari maju dan menyerang, memberikan 240%/480%/720%\n" +
                            "Kerusakan fisik pada musuh dalam persegi panjang AOE di depan.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.storm_yellow),
                    //13
                    "Berputar cepat di tempat,\n" +
                            "menangani 200%/400%/600% Kerusakan fisik di sekitar\n" +
                            "karakter.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.storm_blue),
                    //15
                    "arik musuh ke arah karakter, berurusan\n" +
                            "100%/200%/300% Kerusakan fisik.\n" +
                            "Pertahanan target berkurang 10%/20%/30% dan\n" +
                            "Ketahanan fisik karakter meningkat\n" +
                            "sebesar 20%/40%/60% selama 4/4,5/5 detik",
                    //Basic Attack
                    "Terus serang dengan gergaji mesin, memberikan total 800% Kerusakan Fisik.",
                    //QTE 16
                    "Lakukan serangan berputar saat memasuki lapangan, memberikan total 770% Kerusakan Fisik dan menjatuhkan musuh.",
                    //PROFESSION 17
                    "Target yang terkena menerima 20% lebih banyak kerusakan selama 5 d.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Pertahanan semua anggota tim +15%.",
                    //CORE 20
                    "Any 3-orb combo followed by a Yellow orb will trigger an EX-Cutting Storm,\n" +
                            "striking surrounding enemies continuously 8 times, dealing 100% Physical damage per hit.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi untuk melepaskan medan gaya,\n" +
                            "memblokir semua serangan dan melindungi sekutu di dalamnya.\n" +
                            "Setelah 5 detik, ledakan terjadi, memberikan 1000% Kerusakan Fisik.",
                    //SS 22
                    "Kerusakan serangan dasar +15%, generasi Aggro +20%",
                    //SSS 23
                    "Ketika inti pasif dipicu, resistensi fisik +30%.",
                    //SSS+ 24
                    "Setelah mengaktifkan ultimate, damage +20% selama 5 d.",
                    //Skill 25
                    "Tiga kali lipat apa pun + Serangan Kuning atau Tukar + Kuning untuk Inti\n" +
                            "Biru menyebabkan DEF turun\n" +
                            "Ult untuk bidang invuln",
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
                    "jika Anda sudah SSS",
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
                    "Co-op atau Babel Ultimate Spam",
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
                    "Kemungkinan 20% untuk menerapkan kondisi Rusak selama 3 d saat menyerang,\n" +
                            "hingga 10 tumpukan. Target menerima 2% Kerusakan fisik setiap detik.\n" +
                            "Efeknya berlipat ganda ketika target menderita pengurangan Pertahanan\n" +
                            "sementara Rusak.\n" +
                            "Kerusakan fisik +10% terhadap musuh yang Rusak."
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
                    "100% Fisik",
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
                    "Perintah meriam untuk menembakkan laser sekali,\n" +
                            "Menangani 200%/400%/600% Kerusakan fisik.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_eclipse),
                    //13
                    "Lepaskan lubang hitam di posisi target,\n" +
                            "menarik musuh di sekitar.\n" +
                            "Menimbulkan 90%/150%/210% Kerusakan fisik\n" +
                            "selama 1/2/3 detik menuju musuh di dalam.\n" +
                            "Lubang hitam akan meledak setelahnya, menangani\n" +
                            "80%/160%/240% Kerusakan fisik.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_eclipse),
                    //15
                    "Melepaskan ledakan energi,\n" +
                            "menghancurkan musuh di sekitar dan menangani\n" +
                            "100%/200%/300% Kerusakan fisik.\n" +
                            "Sekutu terdekat disembuhkan sebesar 40%/80%/120%\n" +
                            "Serangan Liv dan dapatkan 16%/32%/48%\n" +
                            "Kerusakan fisik hingga 5 detik.",
                    //Basic Attack
                    "Terus membombardir target dengan balok untuk total 640% kerusakan fisik.",
                    //QTE 16
                    "Melepaskan ledakan energi saat memasuki medan, memulihkan HP berdasarkan 20% dari HP Maks Liv\n" +
                            "dan memberikan 200% Kerusakan Fisik.",
                    //PROFESSION 17
                    "Penyembuhan +20%",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "HP Maksimal semua anggota tim + 10%.",
                    //CORE 20
                    "Kombo 3 bola mana pun yang diikuti oleh bola Merah akan memicu rentetan laser,\n" +
                            "Menangani total 800% Kerusakan fisik.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi dan memanggil pemboman balok besar di\n" +
                            "area target selama 2 d. Setiap sinar memberikan 70% Kerusakan Fisik.",
                    //SS 22
                    "Dapatkan 3 bola biru setelah menggunakan ultimate.",
                    //SSS 23
                    "Anggota aktif saat ini memperoleh Kerusakan fisik +10% ketika Liv tidak berada di lapangan.",
                    //SSS+ 24
                    "Damage +20% selama 8 detik setelah menggunakan ultimate.",
                    //Skill 25
                    "Tiga kali lipat apa pun + Merah atau Tukar serangan + Merah untuk Inti\n" +
                            "Biru untuk menyembuhkan\n" +
                            "Kuning untuk menarik\n" +
                            "Peringkat SSS untuk buff kerusakan fisik pasif kepada orang lain saat tidak di lapangan",
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
                    "Kerusakan Orb Merah Eclipse +50%.\n" +
                            "Serang +15% selama 5 d setelah 3-orb.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"4",
                    //Gambar 1
                    String.valueOf(R.drawable.lucia_dawn_real),
                    //Name 2
                    "Lucia",
                    //Model 3
                    "Dawn",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "40% Fisik 60% Petir",
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
                    "Lakukan serangkaian serangan, terus-menerus mengenai\n" +
                            "5/5/5 kali, menimbulkan 40%/80%/144% Kerusakan fisik.\n" +
                            "Kerusakan berubah menjadi kerusakan Petir saat\n" +
                            "Ini adalah 3-orb. Dapatkan Super Armor selama serangan.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_dawn),
                    //13
                    "Lepaskan medan petir,\n" +
                            "menimbulkan 100%/200%/300% Kerusakan fisik.\n" +
                            "Target Ditandai.\n" +
                            "Bidang bertahan selama 3/4/5 detik, berurusan\n" +
                            "20%/30%/40% Kerusakan petir per detik.\n" +
                            "Tanda menumpuk hingga 3 kali dan durasi\n" +
                            "diperbarui ketika Tanda tambahan diterapkan.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_dawn),
                    //15
                    "Cepat luncurkan serangan ke target,\n" +
                            "menimbulkan 80%/160%/240% Kerusakan dan tarikan petir\n" +
                            "target menuju karakter, berurusan\n" +
                            "80%/160%/240% Kerusakan fisik.\n" +
                            "Target Ditandai.\n" +
                            "Tanda menumpuk hingga 3 kali dan durasi\n" +
                            "diperbarui ketika Tanda tambahan diterapkan.",
                    //Basic Attack
                    "Serang musuh secara terus menerus, memberikan total 650% Physical Damage.",
                    //QTE 16
                    "Lakukan serangan menyapu saat memasuki medan perang, menimbulkan 210% Kerusakan Fisik\n" +
                            "dan 570% kerusakan Petir ke target.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Serangan semua struktur Assault +10%",
                    //CORE 20
                    "Menyerang target yang Ditandai memiliki peluang 25%/50%/75% untuk memicu sambaran petir\n" +
                            "Berdasarkan jumlah tumpukan Mark, memberikan 60% kerusakan Petir.",
                    //ULTIMATE 21
                    "Habiskan 50 energi. Lepaskan bilah Gurren tambahan.\n" +
                            "Serangan dan keterampilan dasar mendapatkan tambahan 25% kerusakan Petir selama 15 d.\n" +
                            "Durasi diperbarui ketika pamungkas dipicu lagi dalam keadaan ini.",
                    //SS 22
                    "Kerusakan petir +20% saat karakter berada di dalam medan petir.",
                    //SSS 23
                    "Kerusakan sambaran petir yang ditandai +20%",
                    //SSS+ 24
                    "Damage +15% selama 10 detik setelah mengaktifkan ultimate.",
                    //Skill 25
                    "Biru atau Kuning untuk menandai target terlebih dahulu\n" +
                            "Ultimate akan dimatikan saat swap",
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
                            "akan diambil oleh Bianca nanti",
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
                            "akan diambil oleh Bianca nanti",
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
                    "Kerusakan petir +5% selama 4 d, hingga 4 tumpukan saat\n" +
                            "menangani kerusakan Petir.\n" +
                            "Memicu efek lagi menyegarkan durasi.\n" +
                            "Damage +10% selama 10 d saat mengaktifkan ultimate.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"5",
                    //Gambar 1
                    String.valueOf(R.drawable.lee_palefire_real),
                    //Name 2
                    "Lee",
                    //Model 3
                    "Palefire",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "60% Fisik 40% Api",
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
                    "Cepat tembakkan 15 tembakan ke target dengan pistol ganda,\n" +
                            "setiap peluru menimbulkan 16%/30%/48% Kerusakan fisik.\n" +
                            "Dapatkan Super Armor selama serangan.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_palefire),
                    //13
                    "Tembakan peluru pembakar ke sasaran, menghasilkan\n" +
                            "100%/150%/200% Kerusakan api akibat benturan dan\n" +
                            "meninggalkan medan yang terbakar selama 3/4/5 detik yang\n" +
                            "menimbulkan 12%/24%/36% Kerusakan api setiap 0,5 d.\n" +
                            "Menyerang musuh di dalam medan memberikan\n" +
                            "tambahan 12% kerusakan Api, memicu pada\n" +
                            "maksimal sekali setiap 0,1 detik.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_palefire),
                    //15
                    "Menembakkan semburan listrik ke target,\n" +
                            "Menangani 200%/400%/600% Kerusakan fisik.",
                    //Basic Attack
                    "Tembak terus menerus, menghasilkan total 880% Kerusakan Fisik.",
                    //QTE 16
                    "Tembak dengan pistol ganda saat memasuki medan, menimbulkan 330% Kerusakan Fisik dan menimbulkan Listrik.\n" +
                            "(Target menerima tambahan 20% Physical Damage selama 5 detik saat terkena. Dapat dipicu hingga 15 kali",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Kerusakan fisik semua anggota tim +5%, Kerusakan elemen +5%.",
                    //CORE 20
                    "Mengkonsumsi Orb Kuning akan menambahkan efek Ledakan ke Orb Merah berikutnya.\n" +
                            "(Peluru meledak pada benturan, memberikan 40% kerusakan Api di suatu area)",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi dan menembak ke seluruh karakter, menimbulkan total 800% Kerusakan Fisik\n" +
                            "dengan pukulan terakhir menghasilkan 1200% kerusakan Api.",
                    //SS 22
                    "Kerusakan +15% pada musuh di dalam medan yang terbakar.",
                    //SSS 23
                    "Kerusakan +15% saat damage tidak diterima, cooldown 10 detik.",
                    //SSS+ 24
                    "Kerusakan pasif inti +20%",
                    //Skill 25
                    "Kuning lalu Merah",
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
                    "Kerusakan +20% terhadap target\n" +
                            "dalam bidang Orb Kuning."
            },
            {"6",
                    //Gambar 1
                    String.valueOf(R.drawable.liv_lux_real),
                    //Name 2
                    "Liv",
                    //Model 3
                    "Lux",
                    //Class Profession 4
                    "Support",
                    //Element 5
                    "20% Fisik 80% Petir",
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
                    "Tembakan meriam ion sekali, berurusan\n" +
                            "200%/400%/600% Kerusakan fisik.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_lux),
                    //13
                    "Buat kubus di lokasi target, menimbulkan target\n" +
                            "dengan efek Matrix selama 1/2/3 detik,\n" +
                            "menimbulkan 60%/90%/120% Kerusakan petir\n" +
                            "dan sedikit menarik target.\n" +
                            "Kubus meledak sebesar 60%/120%/180%\n" +
                            "Petir merusak saat menghilang.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_lux),
                    //15
                    "Buat dinding ion di lokasi target, menggemparkan\n" +
                            "target yang melewati 60% Kerusakan petir\n" +
                            "per detik selama 2/4/6 d dan mengurangi kecepatan gerakan\n" +
                            "sebesar 20%/40%/80%.\n" +
                            "Target Ditandai selama 8 detik.",
                    //Basic Attack
                    "Terus menembakkan sambaran petir ke musuh, memberikan total 650% Kerusakan Fisik.",
                    //QTE 16
                    "Memanggil serangan EX-Lightning saat memasuki lapangan, menimbulkan 200% kerusakan Lightning\n" +
                            "ke target di dalam area. Bidang ion yang dihasilkan menyembuhkan semua sekutu selama 25% dari Serangan Liv setiap detik.",
                    //PROFESSION 17
                    "Penyembuhan +20%",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "HP Maks +5% semua anggota tim, Serangan +5%",
                    //CORE 20
                    "\tMenyerang target yang Ditandai memiliki peluang 30% untuk memanggil sambaran Petir, menimbulkan 60% kerusakan Petir.\n" +
                            "Orb merah memiliki peluang 30%/60%/100% untuk memicu sambaran Petir.\n" +
                            "Setelah 4 pemicu, sambaran Petir berikutnya akan memanggil sambaran EX-Petir sebagai gantinya,\n" +
                            "menimbulkan 200% kerusakan Petir dan menyembuhkan sekutu untuk 40% dari Serangan Liv.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi dan menciptakan medan listrik.\n" +
                            "Sekutu di lapangan mendapatkan 1 bola sinyal setiap detik dan 20% Serangan meningkat.\n" +
                            "Musuh di lapangan mengalami pengurangan kecepatan gerakan 50%.",
                    //SS 22
                    "Bidang yang dihasilkan dari EX-Lightning juga meningkatkan kerusakan Petir sekutu sebesar 20%.",
                    //SSS 23
                    "Kerusakan sambaran petir +20%",
                    //SSS+ 24
                    "Musuh di dalam kubus memiliki 15% pengurangan resistensi Petir.",
                    //Skill 25
                    "Biru untuk menandai target untuk melakukan Serangan Petir saat terkena\n" +
                            "Merah untuk juga melakukan Serangan Petir\n" +
                            "Sambaran Petir ke-5 akan menghasilkan lebih banyak dmg dan penyembuhan.\n" +
                            "Kuning untuk OP lambat pada target\n" +
                            "Tetap di ult untuk mendapatkan orb setiap detik dan meningkatkan ATK",
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
                    "Gunakan ini hanya untuk Meme",
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
                    "Set Sekunder",
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
                    "Setelah mengeluarkan 12 bola, kerusakan +10% selama 5 d\n" +
                            "ke semua sekutu dalam radius 5m.\n" +
                            "Memicu efek lagi menyegarkan durasi.\n" +
                            "Kerusakan +10% terhadap target yang dipenjara."
            },
            {"7",
                    //Gambar 1
                    String.valueOf(R.drawable.karenina_blast_real),
                    //Name 2
                    "Karenina",
                    //Model 3
                    "Blast",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "80% Fisik 20% Api",
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
                    "Tembakan 6 peluru ke depan, berurusan\n" +
                            "40%/80%/120% Kerusakan fisik.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_blast),
                    //13
                    "Luncurkan peluru dengan cepat ke target,\n" +
                            "menimbulkan 150%/300%/450% Kerusakan fisik\n" +
                            "dan Menandainya.\n" +
                            "Target yang ditandai memiliki peluang 75% untuk menerima\n" +
                            "10%/20%/30% Kerusakan api saat menerima kerusakan.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_blast),
                    //15
                    "Menembakkan peluru khusus ke depan, menarik musuh ke dalam\n" +
                            "dan memberikan 100%/200%/300% Kerusakan fisik.\n" +
                            "Musuh di dalam area menerima 50% Kerusakan Fisik\n" +
                            "setiap detik selama 1/2/3 detik",
                    //Basic Attack
                    "Serang terus menerus dengan meriam, memberikan total 600% Kerusakan Fisik.",
                    //QTE 16
                    "Menembakkan peluru berputar, menghasilkan hingga 500% Kerusakan fisik.",
                    //PROFESSION 17
                    "Kerusakan +20%",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Serangan anggota tim +10% ketika ada 3 profesi berbeda.",
                    //CORE 20
                    "Masukkan status Burst setelah memicu kombo 3 bola 3 kali.\n" +
                            "Serangan dasar berubah menjadi tembakan meriam jarak jauh selama 3 detik, menghasilkan 80% Kerusakan Fisik per serangan.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi dan terus membombardir area target\n" +
                            "dengan setiap pengeboman menghasilkan 100% Kerusakan Fisik.\n" +
                            "Masukkan status Burst setelah menggunakan ultimate.",
                    //SS 22
                    "Kerusakan skill bola kuning +50%",
                    //SSS 23
                    "Musuh yang ditandai menerima 15% lebih banyak kerusakan.",
                    //SSS+ 24
                    "Kerusakan serangan dasar +20%",
                    //Skill 25
                    "Tiga kali lipat apa pun 3 kali untuk mengaktifkan inti\n" +
                            "Ult juga akan segera mengaktifkan inti\n" +
                            "Biru untuk ditarik\n" +
                            "QTE juga menarik",
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
                    "Kerusakan fisik +10%.\n" +
                            "Kerusakan Serangan Dasar +30% selama 5 d setelah 3-orb.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"8",
                    //Gambar 1
                    String.valueOf(R.drawable.bianca_zero_real),
                    //Name 2
                    "Bianca",
                    //Model 3
                    "Zero",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Fisik",
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
                    "Terus tembak 1/2/3 panah ke target.\n" +
                            "Setiap panah memberikan 200% Kerusakan fisik.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_zero),
                    //13
                    "Tembakan 5/5/7 panah energi ke depan, setiap panah\n" +
                            "menimbulkan 30%/60%/90% Kerusakan fisik saat terkena benturan.\n" +
                            "Hasilkan 1/2/3 energi saat target dipukul.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_zero),
                    //15
                    "Masukkan senjata dengan energi selama 4/6/8 d.\n" +
                            "Serangan dasar mendapatkan tambahan 1/2/3 panah.\n" +
                            "Menangani 20%/30%/40% Kerusakan fisik per panah.",
                    //Basic Attack
                    "Terus menembakkan 9 panah ke target, memberikan total 580% Kerusakan Fisik.",
                    //QTE 16
                    "Menembak 5 kali terus menerus pada target, memberikan 60% kerusakan Fisik per pukulan dan dijamin kritis.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Kerusakan Kritis Semua anggota tim +10%",
                    //CORE 20
                    "1 panah energi disimpan untuk setiap 3-orb yang dilakukan.\n" +
                            "Maksimum 3 panah dapat disimpan.\n" +
                            "Semua panah dilepaskan pada serangan pamungkas berikutnya, setiap panah memberikan 100% Kerusakan Fisik dua kali.",
                    //ULTIMATE 21
                    "Expend 60 energy and fire an arrow shower at the target, each arrow dealing 200% Physical damage.",
                    //SS 22
                    "Kerusakan serangan dasar +15%",
                    //SSS 23
                    "Kerusakan kritis +30%",
                    //SSS+ 24
                    "Kerusakan utama +20%",
                    //Skill 25
                    "Kuning mengembalikan energi ult.\n" +
                            "Lakukan triple blue dan spam normal untuk kerusakan besar.\n" +
                            "Setiap triple yang dilakukan menempatkan 1 panah energi di punggungnya, hingga 3. Lepaskan mereka yang memiliki ult.",
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
                    "Bianca Fisik",
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
                    "Kerusakan pamungkas +15%.\n" +
                            "Resistensi Fisik target berkurang 2% selama 5 d untuk setiap\n" +
                            "Ultimate hit mendarat, hingga 8 tumpukan.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"9",
                    //Gambar 1
                    String.valueOf(R.drawable.watanabe_nightblade_real),
                    //Name 2
                    "Watanabe",
                    //Model 3
                    "Nightblade",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Fisik",
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
                    "Terus serang target 4 kali,\n" +
                            "menimbulkan 160%/320%/480% Kerusakan fisik.\n" +
                            "Lakukan serangan tambahan untuk 160%\n" +
                            "Kerusakan fisik untuk kombo 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_nightblade),
                    //13
                    "Cepat maju dan tembus musuh,\n" +
                            "menimbulkan 160%/320%/480% Kerusakan fisik\n" +
                            "sepanjang jalan.\n" +
                            "Lakukan serangan tambahan untuk 120%\n" +
                            "Kerusakan fisik untuk kombo 3-orb.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_nightblade),
                    //15
                    "Tusukkan pisau ke sasaran lalu tarik keluar.\n" +
                            "Menimbulkan 80%/160%/240% Kerusakan fisik untuk dorong,\n" +
                            "dan 70%/140%/210% untuk tarikan.\n" +
                            "Damage dijamin kritis saat menyerang\n" +
                            "dari belakang target.",
                    //Basic Attack
                    "Terus serang dengan bilah ganda untuk 740% Kerusakan fisik.",
                    //QTE 16
                    "Menusuk ke bawah dari udara, memberikan 600% Kerusakan Fisik.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //CORE 20
                    "Tandai target sekali di akhir setiap kombo 3 bola.\n" +
                            "Hasilkan klon energi selama 5 d saat ada 2 tumpukan Tanda.\n" +
                            "Klon energi menyerang sekali untuk 90% Kerusakan fisik kapan pun\n" +
                            "Serangan dasar dilakukan.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi dan melepaskan serangan pedang, memberikan total 3000% Kerusakan Fisik.",
                    //SS 22
                    "Damage +15% saat menyerang dari belakang target.",
                    //SSS 23
                    "Kerusakan +15% saat ada klon energi.",
                    //SSS+ 24
                    "Musuh yang terkena serangan pamungkas memiliki 15% pengurangan resistensi Fisik selama 10 detik.",
                    //Skill 25
                    "Spam tiga kali lipat dan selalu mengejar mereka",
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
                    "Apapun",
                    "-",
                    //Remarks
                    "5 Star Memory",
                    //Role
                    "5 Star Memory",
                    String.valueOf(R.drawable.soul_ripper),
                    "Soul Ripper",
                    "Saat melakukan serangan Kritis dari belakang,\n" +
                            "terapkan kondisi Rusak selama 3 d, berikan 50% Kerusakan Fisik\n" +
                            "setiap detik. Memicu efeknya lagi menyegarkan durasi.\n" +
                            "Kerusakan fisik +20% terhadap musuh yang Rusak.."
            },
            {"11",
                    //Gambar 1
                    String.valueOf(R.drawable.kamui_tenebrion_real),
                    //Name 2
                    "Kamui",
                    //Model 3
                    "Tenebrion",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "50% Fisik 50% Gelap",
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
                    "Lakukan tebasan silang, menghasilkan 200%/400%/600%\n" +
                            "Kerusakan fisik dan tambahan\n" +
                            "40%/80%/160% Kerusakan gelap.\n" +
                            "\n" +
                            "Bentuk Bayangan: Lakukan tebasan ke bawah pada target,\n" +
                            "Menangani 800%/1000%/1200% Kerusakan gelap.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_tenebrion),
                    //13
                    "Terus menagih ke arah target, menangani\n" +
                            "200%/400%/600% Kerusakan fisik dan tambahan\n" +
                            "40%/80%/120% Kerusakan gelap.\n" +
                            "Kerusakan yang diterima berkurang 30%\n" +
                            "dan karakternya kebal terhadap gangguan saat mengisi daya.\n" +
                            "\n" +
                            "Bentuk Bayangan: Terus menyerang target,\n" +
                            "menimbulkan 600%/700%/950% Kerusakan gelap.\n" +
                            "Kerusakan yang diterima berkurang 30%\n" +
                            "dan karakter kebal terhadap gangguan saat mengisi daya",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_tenebrion),
                    //15
                    "Berputar dan luncurkan target, berurusan\n" +
                            "140%/280%/420% Kerusakan fisik dan tambahan\n" +
                            "40%/80%/120% Kerusakan gelap.\n" +
                            "Target ditarik selama putaran.\n" +
                            "\n" +
                            "Bentuk Bayangan: Pukul tanah dan lepaskan kipas AOE\n" +
                            "gelombang energi, menimbulkan 480%/600%/720% Kerusakan gelap\n" +
                            "dan setrum target selama 3/4/5 d.",
                    //Basic Attack
                    "Serang terus menerus dengan pedang besar, menimbulkan total 560% Kerusakan fisik.\n" +
                            "Bentuk Bayangan: Terus serang dengan bilah bayangan, menghasilkan total 900% Kerusakan gelap.",
                    //QTE 16
                    "Putar dan potong target saat memasuki medan, menimbulkan 580% Kerusakan gelap dan\n" +
                            "mengurangi resistensi Gelap sebesar 10% selama 6 d.",
                    //PROFESSION 17
                    "Target yang terkena menerima 20% lebih banyak kerusakan selama 5 d.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Kerusakan Elemental semua anggota tim +10%, Kerusakan fisik +5% ketika ada 3 profesi berbeda.",
                    //CORE 20
                    "Dapatkan 10 energi saat kombo 3 bola dilakukan.\n" +
                            "Resistensi Fisik dan Gelap meningkat 30% selama Bentuk Bayangan.",
                    //ULTIMATE 21
                    "Bentuk Bayangan dapat diaktifkan ketika energi lebih besar dari 60.\n" +
                            "Semua keterampilan akan dikonversi. Energi akan terkuras sebanyak 8 poin per detik.\n" +
                            "Keluar dari Bentuk Bayangan saat energi benar-benar habis.\n" +
                            "Dark damage +40% selama Shadow Form.",
                    //SS 22
                    "Selama Bentuk Bayangan, kerusakan yang diterima berkurang 20% ​​dan\n" +
                            "target yang terkena memiliki 15% pengurangan resistensi Gelap selama 8 d.",
                    //SSS 23
                    "Kerusakan skill 3-orb +30%",
                    //SSS+ 24
                    "Dark damage +20% selama Shadow Form.",
                    //Skill 25
                    "Spam tiga kali lipat untuk tetap dalam bentuk ulti\n" +
                            "Beralih untuk mempertahankan ult dan kembali lagi dengan Matrix lambat untuk triple mudah\n" +
                            "Stun biru",
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
                    "Kerusakan Fisik dan Gelap +20% selama 5 d setelah 3-orb.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"11",
                    //Gambar 1
                    String.valueOf(R.drawable.liv_luminance_real),
                    //Name 2
                    "Liv",
                    //Model 3
                    "Luminance",
                    //Class Profession 4
                    "Support",
                    //Element 5
                    "Kerusakan Fisik dan Gelap +20% selama 5 d setelah 3-orb.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
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
                    "Tembakan meriam balok ke lokasi target,\n" +
                            "menimbulkan 200%/400%/600% Kerusakan fisik\n" +
                            "dan mengurangi kecepatan gerakan sebesar 20% selama 3 d.\n" +
                            "Mengurangi kerusakan target sebesar 5% selama 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_luminance),
                    //13
                    "Berdayakan senjata. Keuntungan serangan dasar\n" +
                            "hit tambahan, menimbulkan 30%/40%/50% Kerusakan fisik\n" +
                            "hingga 16/20/32 hit untuk 2.5/3.5/5s.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_luminance),
                    //15
                    "Hasilkan medan partikel di lokasi target selama 3/6/9 detik,\n" +
                            "Menandai semua musuh di dalam dan menangani\n" +
                            "100%/200%/300% Kerusakan fisik.\n" +
                            "Musuh ditarik ke tengah lapangan setiap detik.",
                    //Basic Attack
                    "Lepaskan tembakan energi ke target, memberikan total 520% ​​Kerusakan Fisik.",
                    //QTE 16
                    "Sembuhkan sekutu terdekat untuk 100% Serangan Liv dan dapatkan 100% perisai senilai Serangan Liv selama 2 d.",
                    //PROFESSION 17
                    "Penyembuhan +20%",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "HP semua anggota tim +15%.",
                    //CORE 20
                    "Menyerang musuh yang ditandai memiliki peluang 20% ​​untuk memicu Judgment Ray, menimbulkan 150% Kerusakan Fisik.\n" +
                            "Sembuhkan sekutu terdekat untuk 60% Serangan Liv selama kombo 3 bola atau setelah 5 pemicu Sinar Penghakiman.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi. Menghasilkan medan energi yang besar dan terus menerus melepaskan Sinar Penghakiman menuju\n" +
                            "musuh di dalam medan secara acak, masing-masing menimbulkan 150% Kerusakan Fisik.\n" +
                            "Sekutu di dalam lapangan mendapatkan 75% ketahanan fisik.",
                    //SS 22
                    "Damage +15% terhadap musuh di bidang Blue orb.",
                    //SSS 23
                    "Kerusakan Judgment Ray +50%",
                    //SSS+ 24
                    "Kerusakan semua anggota +15% selama 5 d setelah memicu pamungkas.",
                    //Skill 25
                    "Tempatkan Biru untuk menandai target\n" +
                            "Tiga kali lipat kuning untuk sangat meningkatkan serangan dasar\n" +
                            "Tetap dekat target dengan ult untuk mendapatkan penyembuhan",
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
                    "Build DPS Meme",
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
                    "Serangan dasar memiliki 10% kemungkinan melemahkan musuh,\n" +
                            "mengurangi Serangan sebesar 10% selama 5 d.\n" +
                            "Memicu efek lagi menyegarkan durasi.\n" +
                            "10% kemungkinan menghasilkan bola sinyal saat menyerang melemah\n" +
                            "target. Cooldown 6 detik."
            },
            {"12",
                    //Gambar 1
                    String.valueOf(R.drawable.lee_entrophy_real),
                    //Name 2
                    "Lee",
                    //Model 3
                    "Entrophy",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Fisik",
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
                    "Melompat ke udara dan menembak ke depan dalam AOE kecil,\n" +
                            "setiap peluru menghasilkan 22,5%/45%/70% Kerusakan fisik.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_entrophy),
                    //13
                    "Langkah dan tembak musuh, menghasilkan 180%/440%/700%\n" +
                            "Kerusakan fisik, Menandai target selama 4/6/8 d.\n" +
                            "Menyerang target yang Ditandai memberikan tembakan tambahan,\n" +
                            "menimbulkan 20%/40%/60% Kerusakan Fisik.\n" +
                            "Ketika Tanda diterapkan kembali, kombo bola tertinggi\n" +
                            "kemampuan akan selalu menimpa Mark yang lebih rendah.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_entrophy),
                    //15
                    "Tembak proyektil energi, menghasilkan 100%/200%/300%\n" +
                            "Kerusakan fisik.\n" +
                            "Hasilkan medan energi saat tumbukan\n" +
                            "atau setelah menempuh jarak tertentu.\n" +
                            "Medan energi akan menarik musuh ke tengah sekali\n" +
                            "dan memberikan 24%/48%/72% Kerusakan fisik per detik\n" +
                            "untuk 3/4/5 detik.",
                    //Basic Attack
                    "Terus menembak target dengan total 825% Kerusakan fisik.",
                    //QTE 16
                    "Tembakan dari udara, menghasilkan total 675% Kerusakan fisik.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Kerusakan fisik semua anggota tim +15%, kecepatan gerakan +10%",
                    //CORE 20
                    "Setelah kombo 3 bola, bola Merah berikutnya akan memicu tembakan lanjutan tambahan,\n" +
                            "masing-masing memberikan 55% Kerusakan Fisik.",
                    //ULTIMATE 21
                    "Habiskan 100 energi. Panggil dukungan meriam energi jarak jauh,\n" +
                            "setiap serangan memberikan 400% Kerusakan Fisik.",
                    //SS 22
                    "Damage +15% terhadap musuh di dalam medan energi.",
                    //SSS 23
                    "Damage +20% terhadap musuh yang Ditandai.",
                    //SSS+ 24
                    "Kerusakan fisik +10% selama 5 d setelah 3 bola mana pun, menumpuk hingga 3 kali.\n" +
                            "Memicu efek lagi menyegarkan durasi.",
                    //Skill 25
                    "Tiga kali lipat apa pun + Merah atau Tukar serangan + Merah untuk Inti\n" +
                            "Posisi ult aoe bisa dimanuver",
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
                    "Kerusakan pasif inti +10%.\n" +
                            "Kerusakan fisik +15% selama 5 d setelah kombo 3 bola.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"13",
                    //Gambar 1
                    String.valueOf(R.drawable.karenina_ember_real),
                    //Name 2
                    "Karenina",
                    //Model 3
                    "Ember",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "30% Fisik 70% Api",
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
                    "Lakukan serangan silang dengan meriam, berurusan\n" +
                            "100%/200%/300% Kerusakan fisik.\n" +
                            "Dapatkan Super Armor selama bergerak.\n" +
                            "\n" +
                            "Status yang ditingkatkan: Menangani 150%/300%/450% Kerusakan api.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_ember),
                    //13
                    "Lompat ke arah target dan hancurkan mereka dengan meriam,\n" +
                            "menimbulkan 180%/360%/540% Kerusakan fisik.\n" +
                            "Kerusakan yang diterima berkurang 30% selama perpindahan.\n" +
                            "\n" +
                            "Status yang ditingkatkan: Menangani 270%/540%/810% Kerusakan api.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_ember),
                    //15
                    "Panggil meriam laser udara, segera\n" +
                            "menimbulkan 6%/12%/18% Kerusakan fisik per pukulan.\n" +
                            "(Tindak lanjut) Meriam laser akan terus menyerang\n" +
                            "20%/40%/60% Kerusakan fisik.\n" +
                            "Meriam laser tambahan akan selalu sama\n" +
                            "output sebagai level tertinggi yang sudah ada.\n" +
                            "\n" +
                            "Status yang ditingkatkan: Menangani 30%/60%/90% Kerusakan api.",
                    //Basic Attack
                    "Serang terus-menerus, menimbulkan total 720% Kerusakan Fisik.\n" +
                            "Tingkatkan status: Serangan dasar menghasilkan total 720% Kerusakan api.",
                    //QTE 16
                    "Menimbulkan kerusakan 720% Api ke arah target saat memasuki lapangan.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Serangan semua anggota tim +10%, Serangan struktur serangan +5% ketika ada 3 profesi berbeda.",
                    //CORE 20
                    "Dapatkan Energi Panas di awal pertempuran sesuai dengan level Keterampilan,\n" +
                            "dengan setiap level memberikan 3% Energi Panas. Melakukan 3-orb dan pamungkas juga memberikan Energi Panas.\n" +
                            "Masukkan status Ditingkatkan saat Energi Panas mencapai 50%,\n" +
                            "Keterampilan Karenina mendapatkan efek tambahan dan kerusakan Api +20%.\n" +
                            "Energi Panas terkuras pada 5% per detik selama keadaan Ditingkatkan.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi. Terus menembakkan sinar ke tanah, menimbulkan 200% Kerusakan api pada target\n" +
                            "dan meninggalkan jalan yang panas selama 5 d, menimbulkan 200% Kerusakan api setiap detik\n" +
                            "untuk musuh di jalan.",
                    //SS 22
                    "Kerusakan api +10% selama status Enhanced.",
                    //SSS 23
                    "Kerusakan keterampilan yang ditingkatkan +10%",
                    //SSS+ 24
                    "Target's Fire resistance berkurang 15% selama 5 d saat dirusak oleh ultimate.",
                    //Skill 25
                    "Spam tiga kali lipat dan ult untuk mempertahankan ukuran",
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
                    "Kerusakan api +10%.\n" +
                            "Kerusakan api +10% selama 5 d saat memicu bola Merah.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"14",
                    //Gambar 1
                    String.valueOf(R.drawable.nanami_pulse_real),
                    //Name 2
                    "Nanami",
                    //Model 3
                    "Pulse",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "50% Fisik 50% Api",
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
                    "Cepat maju dan serang dengan gergaji mesin,\n" +
                            "menimbulkan 20%/40%/60% Kerusakan fisik per pukulan,\n" +
                            "hingga 12 hit.\n" +
                            "\n" +
                            "Damage diubah menjadi elemen Api ketika itu adalah 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_pulse),
                    //13
                    "Balik ke depan dan serang dengan gergaji mesin,\n" +
                            "menimbulkan kerusakan dua kali.\n" +
                            "Selama kombo 1 bola atau 2 bola, berikan 100%/200%\n" +
                            "Kerusakan fisik.\n" +
                            "Deal 200% pada kedua hit untuk kombo 3-orb dan\n" +
                            "juga menghasilkan cincin energi api,\n" +
                            "Menangani 30% kerusakan Api per pukulan, hingga 12 pukulan.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_pulse),
                    //15
                    "Memicu ledakan energi, menghentikan serangan yang masuk\n" +
                            "dan memberikan kerusakan tiga kali pada target di sekitarnya\n" +
                            "untuk 50%/100%/200% Kerusakan fisik.\n" +
                            "Dapatkan 5%/7,5%/10% dari perisai senilai HP selama 5 d.\n" +
                            "Berikan Super Armor saat perisai ada.\n" +
                            "Damage diubah menjadi elemen Api ketika itu adalah 3-orb.",
                    //Basic Attack
                    "Serang terus menerus dengan gergaji mesin, memberikan total 620% Kerusakan fisik.",
                    //QTE 16
                    "Menimbulkan 480% Fire damage dalam lingkaran dan mengurangi Fire resistance target sebesar 10% selama 6 d.",
                    //PROFESSION 17
                    "Target yang terkena menerima 20% lebih banyak kerusakan selama 5 hari.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Pertahanan semua anggota tim +15%, Tahan api +10%",
                    //CORE 20
                    "Masuk ke Mode Overclock setelah mengaktifkan ultimate.\n" +
                            "Serangan dasar menangani kerusakan Api dan musuh yang terkena memiliki 15% pengurangan resistensi Api selama 8 d.",
                    //ULTIMATE 21
                    "Menghabiskan 30 energi. Serang ke arah target dan berikan 900% Fire damage di sepanjang jalan.",
                    //SS 22
                    "Saat menangani kerusakan Api, ada kemungkinan 30% memicu ledakan,\n" +
                            "Menyebabkan tambahan 25% kerusakan Api.",
                    //SSS 23
                    "Setelah mengaktifkan pamungkas, dapatkan Super Armor, 20% peningkatan pengurangan kerusakan\n" +
                            "dan +15% Kerusakan api selama 8 detik.",
                    //SSS+ 24
                    "Setelah mengaktifkan ultimate, damage +15% selama 8 d.",
                    //Skill 25
                    "Biru untuk mendapatkan perisai dan mengeluarkan setrum\n" +
                            "Ult memberikan buff api selama 8 detik",
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
                    "10% kemungkinan mengurangi resistensi Api target sebesar 5% selama 5 d\n" +
                            "saat menyerang.\n" +
                            "Cooldown 8 detik menuju target yang sama.\n" +
                            "Kerusakan api +20% setelah mengaktifkan pamungkas dan\n" +
                            "peluang mengurangi ketahanan Api menjadi dua kali lipat."
            },
            {"10",
                    //Gambar 1
                    String.valueOf(R.drawable.kamui_bastion_real),
                    //Name 2
                    "Kamui",
                    //Model 3
                    "Bastion",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "100% Fisik",
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
                    "Lakukan potongan ke bawah,\n" +
                            "menimbulkan 200%/400%/400% Kerusakan fisik.\n" +
                            "Lakukan serangan tambahan\n" +
                            "untuk 400% Kerusakan Fisik saat 3-orb\n" +
                            "kombo selesai.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_bastion),
                    //13
                    "Pergi ke posisi blok selama 2 detik,\n" +
                            "mengurangi kerusakan yang diterima sebesar 75%.\n" +
                            "Lakukan serangan balik di seluruh area untuk\n" +
                            "200%/400%/600% Kerusakan fisik saat\n" +
                            "serangan berhasil diblokir dan juga mendapatkan\n" +
                            "40/80/120 energi tersimpan.\n" +
                            "Lakukan gelombang pedang saat durasi blok berakhir\n" +
                            "atau ketika serangan Dasar dipicu selama pemblokiran,\n" +
                            "menimbulkan 100%/200%/400% Kerusakan fisik dan berakhir\n" +
                            "sikap blok.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_bastion),
                    //15
                    "Lindungi diri dengan ledakan energi,\n" +
                            "mendapatkan 50%/100%/150% Pertahanan senilai perisai.\n" +
                            "Menimbulkan setrum 1/1.5/2 detik dan 100%/200%/300%\n" +
                            "Kerusakan fisik saat tanah dihantam.",
                    //Basic Attack
                    "Ayunkan pedang besar secara terus menerus, menghasilkan total 790% Kerusakan Fisik.",
                    //QTE 16
                    "Serang target dengan pedang besar saat memasuki medan, menimbulkan 500% Kerusakan Fisik.\n" +
                            "Target terkena stun selama 3 d dan Pertahanan berkurang 10% selama 6 d.",
                    //PROFESSION 17
                    "Target yang terkena menerima 20% lebih banyak kerusakan selama 5 d.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Kerusakan fisik semua anggota tim +10% saat HP di atas 70%.",
                    //CORE 20
                    "Dapatkan 40 energi yang tersimpan setelah kombo 3 bola apa pun.\n" +
                            "Batas energi yang tersimpan adalah 120.\n" +
                            "Serangan meningkat sebesar 6%/12%/18% saat nilai energi yang tersimpan di 0/40/80.\n" +
                            "Energi yang tersimpan berkurang 8 poin setiap detik selama keadaan terisi daya.",
                    //ULTIMATE 21
                    "Dapatkan 40 energi yang tersimpan setelah kombo 3 bola apa pun.\n" +
                            "Batas energi yang tersimpan adalah 120.\n" +
                            "Serangan meningkat sebesar 6%/12%/18% saat nilai energi yang tersimpan di 0/40/80.\n" +
                            "Energi yang tersimpan berkurang 8 poin setiap detik selama keadaan terisi daya.",
                    //SS 22
                    "Dapatkan 1 bola sinyal acak setelah blok berhasil, cooldown 5 detik.",
                    //SSS 23
                    "Saat energi yang tersimpan lebih besar dari 60, Kerusakan fisik yang diterima berkurang 60%.\n" +
                            "Kerusakan fisik +8%.",
                    //SSS+ 24
                    "Kerusakan fisik +10% saat ada perisai.",
                    //Skill 25
                    "Biru untuk melindungi dan menyetrum\n" +
                            "Kuning untuk memblokir dan melawan\n" +
                            "Semua tiga kali lipat dan penghitung memberikan energi yang diisi",
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
                    "Kerusakan fisik +15%.\n" +
                            "Setelah blok berhasil, damage +30% untuk skill berikutnya yang digunakan."
            },
            {"15",
                    //Gambar 1
                    String.valueOf(R.drawable.lucia_crimson_abyss_real),
                    //Name 2
                    "Lucia",
                    //Model 3
                    "Crimson Abyss",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "100% Fisik",
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
                    "Serang dalam sekejap ke semua target di depan, setiap serangan menghasilkan\n" +
                            "25%/50%/75% Kerusakan fisik.\n" +
                            "Selama kombo 3 bola, dapatkan serangan tambahan\n" +
                            "pada pukulan terakhir, menimbulkan 75% Kerusakan Fisik dan\n" +
                            "meluncurkan target.\n" +
                            "Dapatkan Super Armor selama bergerak.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_abyss),
                    //13
                    "Serang dan lewati target di depan,\n" +
                            "menangani 250%/500%/750% Kerusakan fisik di sepanjang jalan",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_abyss),
                    //15
                    "Tingkatkan pasokan energi selama 5 detik.\n" +
                            "Kecepatan gerakan meningkat 20%/30%/50%.\n" +
                            "Serangan mendapatkan 2 serangan tambahan, menghasilkan\n" +
                            "4%/8%/12% Kerusakan fisik masing-masing.\n" +
                            "\n" +
                            "Selama Sword Wave, serangan tambahan dikonversi\n" +
                            "untuk Gelombang Pedang tambahan, masing-masing berurusan\n" +
                            "8%/16%/24% Kerusakan fisik.",
                    //Basic Attack
                    "Serang target dengan 5 gaya pedang, masing-masing gaya menghasilkan 80%/100%/120%/270%/280% Kerusakan fisik.\n" +
                            "Lanjutkan dari urutan serangan Dasar ke-3 setelah menghindar.",
                    //QTE 16
                    "Lepaskan kombo Rising Dragon saat memasuki lapangan, meluncurkan target\n" +
                            "dan memberikan total 600% Kerusakan Fisik.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Serangan semua struktur Serangan +10%, Stat Kritis +5%.",
                    //CORE 20
                    "Setelah kombo 3 bola Biru, aktifkan kombo 3 bola mana pun lagi\n" +
                            "dan karakter akan mundur ke mode Sword Wave (Mundur dihitung sebagai menghindar).\n" +
                            "Semua bola sinyal yang ada akan diubah menjadi bola Pedang Gelombang. Dapatkan 2 bola Gelombang Pedang tambahan juga.\n" +
                            "Selama mode Sword Wave, bola yang dihasilkan dari serangan Dasar juga akan diubah menjadi bola Sword Wave.\n" +
                            "Lepaskan Sword Wave saat mengeluarkan orb, memberikan 340% Physical Damage dan mendapatkan Super Armor selama bergerak.",
                    //ULTIMATE 21
                    "Menghabiskan 85 energi. Memotong semua target di depan dalam sekejap, memberikan 2600% Kerusakan Fisik.",
                    //SS 22
                    "Kerusakan fisik +10% selama 4 d saat melakukan kombo 3-orb Merah.",
                    //SSS 23
                    "Damage +5%. Dapatkan 2 bola sinyal tambahan saat keluar dari mode Sword Wave.",
                    //SSS+ 24
                    "Kerusakan fisik +20% selama Orb Biru.",
                    //Skill 25
                    "3 Biru + 3 Apa saja untuk memasuki gelombang pedang. Lakukan bersama-sama untuk kerusakan terbaik dan bukan pada\n" +
                            "instance terpisah.\n" +
                            "\n" +
                            "3 Biru + 3 Merah jika Alpha SS ke atas",
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
                    "Awakening Set.\n" +
                            "Bagus untuk menghancurkan bos di\n" +
                            "Pain Cage, Warzone, hampir di semua tempat lain.\n" +
                            "Memerlukan lebih banyak perencanaan karena jendela burst sedang berlangsung\n" +
                            "Matriks. Juga memiliki statistik ATK keseluruhan yang lebih tinggi daripada\n" +
                            "Bangunan Patton.\n" +
                            "Menghindar hingga 3 kali termasuk Pedang Gelombang menghindar untuk\n" +
                            "memiliki tumpukan kerusakan tertinggi.",
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
                    "Lebih banyak konsistensi dalam kerusakan dan kritik tanpa harus khawatir\n" +
                            "tentang jendela pecah.\n" +
                            "Juga lebih mudah untuk bertani daripada Fredericks pada tahap awal PGR.",
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
                    "Kerusakan fisik +2% selama 5 d, hingga 10 tumpukan untuk setiap bola yang dikeluarkan.\n" +
                            "Memicu efek lagi menyegarkan durasi.\n" +
                            "Dapatkan 1 bola Sword Wave tambahan saat memasuki mode Sword Wave,\n" +
                            "10 detik cooldown."
            },
            {"16",
                    //Gambar 1
                    String.valueOf(R.drawable.watanabe_astral_real),
                    //Name 2
                    "Watanabe",
                    //Model 3
                    "Astral",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "50% Fisik 50% Gelap",
                    //CV 6
                    "Hosoya Yoshimasa",
                    //Serial 7
                    "BPO-29",
                    //Affilation 8
                    "Oblivion",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_astral),
                    //11
                    "Mundur dan lempar anak panah ke depan dengan kipas,\n" +
                            "menimbulkan 200%/400%/600% Kerusakan fisik.\n" +
                            "Kerusakan diubah menjadi elemen Gelap ketika itu adalah 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_astral),
                    //13
                    "Melompat ke depan dan melakukan serangan berputar,\n" +
                            "menangani 40%/80%/120%\n" +
                            "Kerusakan fisik pada target terdekat.\n" +
                            "Menimbulkan kerusakan fisik tambahan 50%/100%/150%\n" +
                            "untuk serangan terdekat saat mendarat.\n" +
                            "Kerusakan diubah menjadi elemen Gelap ketika itu adalah 3-orb.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_astral),
                    //15
                    "Langsung bergerak ke belakang target dan serang, hadapi\n" +
                            "150%/300%/450% Kerusakan fisik.\n" +
                            "Kerusakan diubah menjadi elemen Gelap ketika itu adalah 3-orb",
                    //Basic Attack
                    "Bunuh target secara terus-menerus, menimbulkan total 600% Kerusakan fisik.\n" +
                            "Serangan dasar dapat memicu Tindak lanjut setelah menghindari atau mengonsumsi Orb Merah, memberikan 200% Kerusakan Fisik.",
                    //QTE 16
                    "Serang target dari udara saat memasuki pertempuran, bubar ke dalam bayangan saat mendarat dan\n" +
                            "Serang lagi, setiap pukulan menghasilkan 300% kerusakan Gelap.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Dark damage semua anggota tim +10%, serangan struktur tipe Assault +5%.",
                    //CORE 20
                    "Mengonsumsi bola Merah setelah kombo 3 bola mana pun akan membubarkan karakter ke dalam bayangan dan tampil\n" +
                            "serangkaian serangan, setiap serangan menghasilkan 60% kerusakan Gelap.\n" +
                            "Masukkan status Enhanced Shadow selama 5 d saat serangan berakhir, serangan dasar mendapatkan tambahan 300% Kerusakan gelap,\n" +
                            "Tindak lanjut mendapatkan tambahan 100% kerusakan Gelap.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi. Menyebar ke dalam bayangan dan terus membunuh target,\n" +
                            "setiap pukulan memberikan 600% kerusakan Gelap.",
                    //SS 22
                    "Menimbulkan 10% lebih banyak kerusakan pada musuh yang terkena skill Orb Biru selama 4 d.",
                    //SSS 23
                    "Menimbulkan 10% lebih banyak kerusakan pada musuh yang terkena Follow-up selama 5 d.",
                    //SSS+ 24
                    "Dark damage +20% selama kondisi Enhanced Shadow.",
                    //Skill 25
                    "Tiga kali lipat apa pun + Serangan Merah atau Tukar Masuk + Merah untuk Inti",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.baron),
                    "4 x Baron",
                    //Memo 2
                    String.valueOf(R.drawable.darwin),
                    "2 x Darwin",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 CORE",
                    //Remarks
                    "Awakening Set",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.baron),
                    "4 x Baron",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 CORE",
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
                    String.valueOf(R.drawable.requiescat),
                    "Requiescat",
                    "Kerusakan +10%.\n" +
                            "Dark damage +10% selama inti pasif."
            },
            {"17",
                    //Gambar 1
                    String.valueOf(R.drawable.ayla_briliance_real),
                    //Name 2
                    "Ayla",
                    //Model 3
                    "Briliance",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "100% Fisik",
                    //CV 6
                    "Itou Shizuka",
                    //Serial 7
                    "BPF-22",
                    //Affilation 8
                    "Arts Association",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_briliance),
                    //11
                    "Ayunkan sabit di tempatnya dan serang targetnya,\n" +
                            "Menangani 150%/300%/900% Kerusakan fisik.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_briliance),
                    //13
                    "Menagih ke target, menangani 90%/180%/270%\n" +
                            "Kerusakan fisik dan tindak lanjut dengan sabit,\n" +
                            "Menangani 120%/240%/360% Kerusakan fisik.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_briliance),
                    //15
                    "Lempar sabit dan tarik kembali,\n" +
                            "menimbulkan 20%/40%/60% Kerusakan Fisik setiap kali\n" +
                            "untuk musuh di sepanjang jalan.",
                    //Basic Attack
                    "Terus serang target dengan sabit, menimbulkan 610% Kerusakan Fisik.",
                    //QTE 16
                    "Terus serang target saat memasuki medan, menimbulkan 500% Kerusakan Fisik dan mengurangi\n" +
                            "pertahanan target sebesar 10% selama 6 d. Pukulan terakhir meluncurkan target.",
                    //PROFESSION 17
                    "Target yang terkena menerima 20% lebih banyak kerusakan selama 5 d.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Pertahanan semua anggota tim +10%, Serangan +5% ketika ada 3 profesi berbeda.",
                    //CORE 20
                    "Mengonsumsi bola Biru setelah kombo 3 bola mana pun akan menarik musuh di sekitar.\n" +
                            "Dapatkan perisai senilai 8% HP selama 7 d dan berikan 700% Kerusakan Fisik.\n" +
                            "Damage yang diambil selama bergerak berkurang 70%.",
                    //ULTIMATE 21
                    "Habiskan 80 energi. Ayunkan sabit sambil bergerak, serang target di area tersebut.\n" +
                            "Setiap serangan menghasilkan 120% Kerusakan fisik dengan serangan terakhir menghasilkan 600% Kerusakan fisik.\n" +
                            "Arah serangan dapat dinavigasi dengan tongkat pengarah.",
                    //SS 22
                    "Dapatkan Pertahanan dan Kerusakan Fisik +10% selama 5 d ketika bola sinyal Kuning mengenai target.",
                    //SSS 23
                    "Target yang terkena serangan pasif inti memiliki 15% pengurangan Pertahanan selama 5 d.",
                    //SSS+ 24
                    "Damage +20% selama 10 detik setelah memicu ultimate.",
                    //Skill 25
                    "Tiga kali lipat apa pun + Biru atau Serangan Tukar + Biru untuk inti\n" +
                            "Arah pamungkas dapat dimanuver",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Baron",
                    //Memo 2
                    String.valueOf(R.drawable.catherine),
                    "2 x Catherine",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CLASS",
                    //Remarks
                    "Awakening Set",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.patton),
                    "4 x Baron",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK+CRIT",
                    "6 CLASS",
                    //Remarks
                    "Pengganti Awakening Set",
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
                    String.valueOf(R.drawable.lilac),
                    "Lilac",
                    "Kerusakan +2% selama 5 d ke arah musuh dengan Super Armor, hingga 3 tumpukan.\n" +
                            "Memicu efek lagi menyegarkan durasi.\n" +
                            "Stun selama 2 detik saat Super Armor rusak,\n" +
                            "cooldown 10 detik untuk target yang sama.\n" +
                            "Kerusakan fisik +15% selama 7 d setelah memicu pasif inti.\n" +
                            "Memicu efek lagi menyegarkan durasi."
            },
            {"17",
                    //Gambar 1
                    String.valueOf(R.drawable.bianca_veritas_real),
                    //Name 2
                    "Bianca",
                    //Model 3
                    "Veritas",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "20% Fisik 80% Petir",
                    //CV 6
                    "Kawasumi Ayako",
                    //Serial 7
                    "BPO-87",
                    //Affilation 8
                    "Purification Force",
                    //Class 9
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_veritas),
                    //11
                    "Tarik tali busur, kumpulkan kekuatan, lalu\n" +
                            "menembakkan panah energi jarak jauh ke depan,\n" +
                            "menimbulkan 240%/480%/720% Kerusakan fisik.\n" +
                            "\n" +
                            "Kerusakan diubah menjadi elemen Petir\n" +
                            "ketika itu adalah 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_veritas),
                    //13
                    "Melayang ke udara dan menembakkan panah energi\n" +
                            "di lokasi target.\n" +
                            "Panah energi meledak untuk 100%/200%/300%\n" +
                            "Kerusakan fisik dan meninggalkan medan listrik,\n" +
                            "mengurangi 20%/35%/50% kecepatan gerakan\n" +
                            "dari target dalam area dan menangani 40%/60%/80%\n" +
                            "Kerusakan petir setiap detik selama 3/5/7 detik.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_veritas),
                    //15
                    "Ledakan panah energi, pukul mundur\n" +
                            "target terdekat, menangani 40%/80%/120% Fisik\n" +
                            "kerusakan dan dapatkan status bermuatan petir selama 8 detik.\n" +
                            "Serangan dasar akan menghasilkan 1 panah petir tambahan,\n" +
                            "menimbulkan 16%/32%/48% Kerusakan petir.\n" +
                            "Orb merah dan serangan pasif inti akan menghasilkan 2\n" +
                            "panah petir tambahan, menghasilkan 24%/48%/72%\n" +
                            "Kerusakan petir.",
                    //Basic Attack
                    "Terus serang target dengan menembakkan 7 anak panah dengan cepat, menimbulkan total 560% Kerusakan fisik.\n" +
                            "Panah terakhir adalah jarak jauh dan menembus target.",
                    //QTE 16
                    "Muncul di udara dan tembakkan 4 anak panah ke lokasi target, masing-masing memberikan 160% kerusakan Petir.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "Kerusakan petir semua anggota tim +10%. Serangan struktur serangan +5%.",
                    //CORE 20
                    "Masuk ke Mode Penembak Jitu setelah 3 bola Merah diikuti dengan bola Biru.\n" +
                            "Serangan dasar akan menembakkan panah petir jarak jauh, menimbulkan 500% Kerusakan petir.\n" +
                            "Keluar dari mode setelah 6 detik atau saat 6 panah telah ditembakkan.\n" +
                            "Waktu pengisian panah berikutnya berkurang saat menghindar selama Mode Penembak Jitu.\n" +
                            "Sinyal bola tidak akan dihasilkan selama keadaan ini.",
                    //ULTIMATE 21
                    "Menghabiskan 100 energi. Tembakkan panah ke langit, memicu sambaran petir terus menerus,\n" +
                            "masing-masing memberikan 160% kerusakan Petir pada musuh dalam jangkauan.\n" +
                            "Setelah penundaan singkat, ledakan dipicu, memberikan 180% kerusakan Petir untuk setiap ledakan",
                    //SS 22
                    "Target yang terkena bola Merah menerima 10% lebih banyak kerusakan selama 8 d.",
                    //SSS 23
                    "Target dalam bidang bola Kuning menerima 15% lebih banyak kerusakan.",
                    //SSS+ 24
                    "Damage +20% selama 10 detik setelah memicu ultimate.",
                    //Skill 25
                    "Self Lightning damage +20% during core passive mode.",
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
                    "6 ATK",
                    "6 CORE",
                    //Remarks
                    "Set kebangkitan.\n" +
                            "Curi saja dari Dawn.\n" +
                            "Menghindar hingga 3 kali untuk mendapatkan bonus kerusakan paling banyak\n" +
                            "sebelum Menembak.",
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
                    "6 ATK",
                    "6 CORE",
                    //Remarks
                    "Alternatif jika Anda tidak memiliki Freds.\n" +
                            "Kelemahannya adalah Condelina hanya meningkatkan Serangan Normal dan bukan\n" +
                            "yang lainnya.",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.einsteina),
                    "2x Esinteina",
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
                    String.valueOf(R.drawable.lightning),
                    "Lightning",
                    "Kerusakan petir +15%.\n" +
                            "Lepaskan petir, menimbulkan 150% Kerusakan petir saat\n" +
                            "target yang sama telah diserang 5 kali dengan keterampilan elemen Petir.\n" +
                            "2 detik pendinginan."
            },
            {"18",
                    //Gambar 1
                    String.valueOf(R.drawable.sofia_silverfang_real),
                    //Name 2
                    "Sofia",
                    //Model 3
                    "Silverfang",
                    //Class Profession 4
                    "Support",
                    //Element 5
                    "20% Fisik 80% Api",
                    //CV 6
                    "Koshimizu Ami",
                    //Serial 7
                    "ADL-22",
                    //Affilation 8
                    "Akdilek Commercial Alliance",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_silverfang),
                    //11
                    "Luncurkan putaran pelacakan di tempat pada target,\n" +
                            "menimbulkan 240%/480%/720% Kerusakan api.\n" +
                            "Menjatuhkan 1 bola energi pada pukulan untuk kombo 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_silverfang),
                    //13
                    "Cepat bergerak menuju target, berurusan\n" +
                            "40%/80%/120% Kerusakan fisik di sepanjang jalan.\n" +
                            "Serangan diubah menjadi Kerusakan api untuk kombo 3 bola\n" +
                            "dan menjatuhkan 1 bola energi.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_silverfang),
                    //15
                    "Tembakan tembakan ke depan di area kipas menghasilkan\n" +
                            "200%/400%/600% Kerusakan akibat kebakaran\n" +
                            "lalu kocok mundur.\n" +
                            "Menjatuhkan 1 bola energi pada pukulan untuk kombo 3-orb.",
                    //Basic Attack
                    "Terus menembak dengan pistol dan lengan mekanik,\n" +
                            "Menangani total 850% Kebakaran dan Kerusakan Fisik.",
                    //QTE 16
                    "Tembak target dari udara saat memasuki pertempuran, menimbulkan 400% Kerusakan Api dan menjatuhkan 1 bola energi.\n" +
                            "Jatuhkan bola energi tambahan saat Skill Level mencapai 10.",
                    //PROFESSION 17
                    "Penyembuhan +20%",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal di awal pertempuran.",
                    //Leader 19
                    "HP+10% semua anggota tim, kecepatan gerakan +5% ketika ada 3 profesi berbeda.",
                    //CORE 20
                    "Lepaskan 1 bola energi saat Sofia melakukan urutan terakhir serangan Dasar, kombo 3 bola, pamungkas, atau QTE.\n" +
                            "Mengambil bola energi akan menyembuhkan sekitar anggota sebesar 20% dari Serangan Sofia dan kerusakan Api +10% selama 5 d.\n" +
                            "Sofia memperoleh 4 energi dan 75 Panas setiap kali sebuah bola diambil.\n" +
                            "Sofia mendapatkan 5%/10%/15% serangan tambahan ketika nilai Panas melampaui 0/100/200.",
                    //ULTIMATE 21
                    "Habiskan 100 energi. Kumpulkan energi dan tembak ke depan untuk 200% Kerusakan api,\n" +
                            "terus menarik musuh di sekitar dan menimbulkan 20% kerusakan Api setiap kali.\n" +
                            "Ledakan untuk 600% kerusakan Api di akhir dan jatuhkan 2 bola energi.",
                    //SS 22
                    "Ultimate dan QTE menjatuhkan bola energi tambahan",
                    //SSS 23
                    "Kerusakan api meningkat 10% selama 5 d ketika karakter mengambil bola energi.",
                    //SSS+ 24
                    "Musuh yang terkena ultimate memiliki 15% pengurangan Fire resistance selama 5 d.",
                    //Skill 25
                    "Tiga kali lipat apa pun/QTE/Basic attack/ultimate semua drop healing orb. Ambil untuk menyembuhkan dan buff.",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.shakespeaere),
                    "4 x Heisen",
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
                    "Set untuk Meme.",
                    //Role
                    "DPS",
                    //Build 2
                    //Memo 1
                    String.valueOf(R.drawable.guineavere),
                    "4 x Guineavere",
                    //Memo 2
                    String.valueOf(R.drawable.adolphe),
                    "2 x Adolphe/Cottie",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 CORE",
                    //Remarks
                    "Can substitute 2 Adolphe/Cottie with 2 Gloria.",
                    //Role
                    "Support",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.da_vinci),
                    "4x Da Vinci",
                    //Memo 2
                    String.valueOf(R.drawable.guineavere),
                    "2x Guineavere",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 ATK",
                    "6 QTE",
                    //Remarks
                    "Kebangkitan Set Dukungan QTE",
                    //Role
                    "QTE Support",
                    //Build 4
                    //Memo 1
                    String.valueOf(R.drawable.memory_samantha),
                    "4 x Aife",
                    //Memo 2
                    String.valueOf(R.drawable.memory_richelieu),
                    "2 x Richelieu",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "Apa pun",
                    "-",
                    //Remarks
                    "5 Star Memory",
                    //Role
                    "5 Star Memory",
                    String.valueOf(R.drawable.sin),
                    "Sin",
                    "Kerusakan +3% selama 5 d saat mengambil bola energi, hingga 5 tumpukan.\n" +
                            "Dapatkan 1 bola sinyal acak dan 10 energi saat 5 bola energi\n" +
                            "telah dikumpulkan, cooldown 10 detik."
            },
            {"19",
                    //Gambar 1
                    String.valueOf(R.drawable.chrome_archlight_real),
                    //Name 2
                    "Chrome",
                    //Model 3
                    "Archlight",
                    //Class Profession 4
                    "Armored",
                    //Element 5
                    "30% Fisik 70% Listrik",
                    //CV 6
                    "Hirakawa Daisuke",
                    //Serial 7
                    "BPE-07",
                    //Affilation 8
                    "Strike Hawk",
                    //Class 9
                    "A",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_archlight),
                    //11
                    "Serangan di tempat dengan sabit, \n"+
                            "setiap hit berurusan dengan 18% / 36% / 54% Kerusakan fisik."+
                            "Kerusakan diubah menjadi elemen Petir \n" +
                            "Ketika itu adalah 3-orb.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_archlight),
                    //13
                    "Terus bergerak dan berputar beberapa kali,\n" +
                            "menarik target terdekat dan kemudian melakukan \n" +
                            "serangan ke bawah, masing-masing hit dealingn" +
                            "20%/40%/60% Kerusakan fisik\n"+
                            "Menangani 60% / 120% / 180% Kerusakan petir di suatu daerah  \n"+
                            "saat sabit menyerang tanah.\n" +
                            "Kerusakan diubah menjadi elemen Petir n" +
                            "Ketika itu adalah 3-orb.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_archlight),
                    //15
                    "Berputar dalam ledakan listrik,\n"+
                            "menangani 150% / 300% / 450% Kerusakan petir dan  \n"+
                            "Menandai target untuk 6s.\n"+
                            "Tangani tambahan 6%/8%/10% kerusakan \n" +
                            "menuju target yang ditandai.\n" +
                            "Terima 10%/15%/20% mengurangi kerusakan\n" +
                            "dari serangan target yang ditandai.",
                    //Basic Attack
                    "Terus menyerang dengan sabit, menangani total 610% kerusakan fisik.",
                    //QTE 16
                    "target di sekitar daerah setelah memasuki pertempuran, menangani 250% kerusakan petir dan mengurangi \n"+
                            "Resistensi petir sebesar 10% untuk 6s. Menyerang tanah setelahnya, menangani 250% kerusakan petir di daerah tersebut. ",
                    //PROFESSION 17
                    "Target hit mengambil 20% lebih banyak kerusakan untuk 5s",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal pada awal pertempuran.",
                    //Leader 19
                    "Pertahanan semua anggota tim +10%, HP +5% ketika ada 3 profesi yang berbeda",
                    //CORE 20
                    "Mengkonsumsi bola Biru setelah kombo 3-orb memberikan perisai senilai 10% HP untuk 4s.\n" +
                            "                            \"Ketika perisai memperbaharui atau berakhir, menangani 200% kerusakan Petir di sekitar karakter.",
                    //ULTIMATE 21
                    "Keluarkan 100 energi. Isi diri dengan petir selama 8s dan tarik target terdekat di.n \n" +
                            "Serangan dasar diubah menjadi Lightning Strike.\n" +
                            "Dalam durasi, inti pasif dipicu setelah setiap Sambaran Petir ke-5.\n" +
                            "Saat memicu Lightning Strike, tangani 35% kerusakan petir selama sprint\n" +
                            "Dan kemudian memangkas 120% kerusakan petir.",
                    //SS 22
                    "Kerusakan petir +10% saat Arc Shield aktif.",
                    //SSS 23
                    "Ketika Chrome ditukar ke dalam pertempuran, dapatkan keadaan akhir untuk 4s.",
                    //SSS+ 24
                    "Lightning Strike reduces Lightning resistance by 15% for 8s.",
                    //Skill 25
                    "Tiga apa pun + Serangan Biru atau Swap-in + Biru untuk melakukan inti.",
                    //Build 1
                    //Memo 1
                    String.valueOf(R.drawable.heisen),
                    "4 x Heisen",
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
                    "Awakening Set Heisen Bawah dan Einsteina Atas",
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
                    "6 CORE",
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
                    "Apapun",
                    "-",
                    //Remarks
                    "5 Star Memory",
                    //Role
                    "5 Star Memory",
                    String.valueOf(R.drawable.saint_elmo),
                    "Saint Elmo",
                    "Kerusakan petir +10%.\n" +
                            "Selama akhir, jumlah sambaran petir yang diperlukan untuk mengaktifkan\n" +
                            "nti pasif dikurangi menjadi 3."
            },
            {"20",
                    //Gambar 1
                    String.valueOf(R.drawable.lucia_plume_real),
                    //Name 2
                    "Lucia",
                    //Model 3
                    "Plume",
                    //Class Profession 4
                    "Assault",
                    //Element 5
                    "20% Fisik 80% Es",
                    //CV 6
                    "Ishikawa Yui",
                    //Serial 7
                    "BPL-01",
                    //Affilation 8
                    "Gray Raven",
                    //Class 9
                    "S",
                    //Red Orb 10
                    String.valueOf(R.drawable.red_plume),
                    //11
                    "Dengan cepat memangkas di tempat 4/4/8 kali, masing-masing\n" +
                            "menangani 60%/120%/120% Kerusakan fisik.\n" +
                            "Mode glasial: Hasilkan tornado yang bergerak maju,n\"\n" +
                            "berurusan dengan total 9 hits untuk 30% / 60% / 90% Kerusakan es per hit.\n" +
                            "Tangani 390% kerusakan es sebagai,\n" +
                            "Tornado mencapai titik terjauh.",
                    //Yellow Orb 12
                    String.valueOf(R.drawable.yellow_plume),
                    //13
                    "Cepat bergegas menuju target, mencolok dua kali untuk\n" +
                            "115%/235%/355% Kerusakan fisik per hit.\n" +
                            "Mode glasial: Cepat melompat ke arah target,\n" +
                            "Mencolok dua kali untuk 150% / 300% / 450% Kerusakan es per hit.",
                    //Blue Orb 14
                    String.valueOf(R.drawable.blue_plume),
                    //15
                    "Lakukan serangan berputar diikuti dengan garis miring ke bawah.\n" +
                            "Tangani 30%/60%/90% Kerusakan fisik saat berputar,\n" +
                            "dan 70% / 160% / 250% Kerusakan fisik untuk garis miring." +
                            "Mode glasial: Lepaskan tornado di depan, menyerang 5 kali \n" +
                            "untuk 40%/80%/120% Kerusakan es per hit dan cepat n\" +\n" +
                            "tarik target kembali ke diri sendiri, berurusan\"\n" +
                            "80% / 160% / 240% Kerusakan es.",
                    //Basic Attack
                    "Slash terus menerus untuk total 640% Kerusakan fisik.\n" +
                            "Mode glasial: Manfaatkan dual-wielding dan terus menyerang target, menangani 310% kerusakan fisik dan 370% Es.",
                    //QTE 16
                    "Bergegas menuju target, menangani 320% Kerusakan fisik dan 320% es.",
                    //PROFESSION 17
                    "Kerusakan +20%.",
                    //Awakening 18
                    "Dapatkan 3 bola sinyal pada awal pertempuran.",
                    //Leader 19
                    "Semua kerusakan es anggota tim +10%. Serangan membangun 'Serangan +5%",
                    //CORE 20
                    "Selama mode Normal, kombo 3-orb menghasilkan energi 50% dan 1 muatan akhir, hingga maksimum 2 muatan.\n" +
                            "Mode glasial: Energi terkuras dari waktu ke waktu. Kerusakan es meningkat sebesar 50% ketika pengukur tidak kosong.\n" +
                            "Combo 3-orb menghasilkan 1 muatan tertinggi, hingga maksimum 4 biaya.\n" +
                            "Ultimate didorong ketika pengukur tidak kosong.",
                    //ULTIMATE 21
                    "Dengan cepat beralih mode ke Glacial, dapatkan Super Armor selama transisi. \n" +
                            "Selama perubahan mode energi penuh, bola sinyal diatur ulang, memprioritaskan bola tiga."+
                            "Mode glasial: Melompat dan melemparkan senjata offhand ke tanah, memperlambat semua musuh untuk durasi singkat\n"+
                            "dan menangani 900% / 1200% / 1600% / 3040% Kerusakan es sesuai dengan jumlah muatan akhir yang ada, dan kemudian \"+\n" +
                            "Kembali ke mode normal. Mode Switch: Dapat diaktifkan kapan saja selama mode Normal; dapat diaktifkan selama mode Glacial ketika n\"+\n" +
                            "Ada satu atau lebih biaya tertinggi. 3s transisi cooldown.",
                    //SS 22
                    "Target yang terkena bola biru mengambil 10% lebih banyak kerusakan untuk 8s.\n" +
                            "Bonus kerusakan hanya berlaku untuk diri sendiri.",
                    //SSS 23
                    "Opsi 1: Dapatkan energi penuh dan 2 tumpukan utama pada awal pertempuran. Kerusakan orb +5% ketika pengukur tidak kosong selama mode Glacial.n\" +n\" +\n" +
                            "Opsi 2: Dapatkan energi penuh pada awal pertempuran. Kerusakan orb +10% ketika pengukur tidak kosong selama mode Glacial.n\" +n\" +\n" +
                            "(Beralih di halaman Keterampilan Karakter)",
                    //SSS+ 24
                    "Kerusakan es +20% selama mode pasif inti.",
                    //Skill 25
                    "Lakukan 3 bola untuk menyiapkan mode Ult\n" +
                            "Jangan masuk ke mode Ult dengan bola kecil, bangun beberapa sebelum masuk.\n" +
                            "Mode Ult akan mengurutkan semua bola yang ada menjadi tiga kali lipat.\n" +
                            "Nuke dengan semua tiga kali lipat dan selesaikan dengan tombol Ult lagi sebelum pengukur habis.",
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
                    "6 MERAH",
                    "6 CORE",
                    //Remarks
                    "Awakening set. Hanna Bawah Dan Darwin Atas",
                    //Role
                    "DPS",
                    //Build 2
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
                    "6 RED",
                    "6 CORE",
                    //Remarks
                    "For Pre-Changyu Hanna Atas Einsteina Bawah",
                    //Role
                    "DPS",
                    //Build 3
                    //Memo 1
                    String.valueOf(R.drawable.frederick),
                    "4x Frederick",
                    //Memo 2
                    String.valueOf(R.drawable.darwin),
                    "2x Darwin",
                    //Memo 3,
                    "-",
                    "-",
                    //Resonance
                    "6 RED",
                    "6 QTE",
                    //Remarks
                    "Khusus tinggi burst membangun.\n" +
                            "Kurang berotak dari hanna membangun.\n" +
                            "Perencanaan meledak di sekitar jendela Matrix diperlukan.\n" +
                            "Frederick Bawah dan Hanna Atas",
                    //Role
                    "DPS",
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
                    "Apapun",
                    "-",
                    //Remarks
                    "5 Star Memory",
                    //Role
                    "5 Star Memory",
                    String.valueOf(R.drawable.crimson_birch),
                    "Crimson Birch",
                    "Kerusakan es +15%.\n" +
                            "Kerusakan +10% untuk 5s setelah 3-orb."
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
