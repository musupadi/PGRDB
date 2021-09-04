package com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick;

import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class BossPaternID {
    public static String[][] data = new String[][]{
            {"1",
                    String.valueOf(R.drawable.nozle),
                    "Nozzle",
                    "-\tMencakar: Evade saat dia sudah mengangkat tangannya\n" +
                            "-\tMenginjak: Evade saat dia sudah mengangkat kakinya\n" +
                            "-\tMelompat dan jatuh: Evade saat dia sudah “hampir” jatuh\n" +
                            "-\tSummon Bug: Dekati dan jauhi secara bersamaan. Setidaknya sampai tanda lingkaran yang mereka buat berubah warna menjadi lebih terang. Jangan sekali kali menyerang mereka. \n"
            },
            {"2",
                    String.valueOf(R.drawable.iron_maiden),
                    "Iron Maiden",
                    "Mode 1\n" +
                            "-\tSummon duri dari bawah tanah: evade saat lingkaran sudah mulai muncul. Sangat disarankan untuk meningkatkan kecerahan HPmu agar lebih mudah membaca serangan ini.\n" +
                            "-\tMenembakkan duri: Evade setelah delay 1 detik. Dihitung dari duri darinya pertamakali muncul.\n" +
                            "-\tMenembakkan Bola Kegelapan: Evade kesamping saat bola darinya sudah mulai dekat denganmu. Kalian juga bisa dengan hanya berlari untuk menghindarinya saat bola darinya masih jauh.\n" +
                            "Mode 2\n" +
                            "-\tSummon duri dari bawah tanah dan menjebakmu: Evade kesamping saat dia sudah mengangkat tangannya\n" +
                            "-\tMelempar bola kegelapan: Evade saat bola sudah hampir jatuh (sekitar ¾ dari setengah lingkaran. Kalian juga akan paham dengan yang kumaksud)\n"
            },
            {"3",
                    String.valueOf(R.drawable.musashi),
                    "Musashi",
                    "-\tMelempar sword: Evade saat sword darinya sudah dekat denganmu.\n" +
                            "-\tBerputar dan melakukan sword wave secara bersamaan: Saat dia akan melakukannya, larilah sejauh mungkin darinya, dan baca arah sword wave yang dia buat. Jangan sekali² menyerangnya saat dia melakukan ini\n" +
                            "-\tMengayunkan Pedang: Evade saat tangannya sudah dia angkat\n" +
                            "-\tMenusuk dan melemparmu jauh darinya: Evade saat ia sudah ambil ancang-ancang untuk menusukmu\n" +
                            "-\tMenghilang. Ada 2 Tipe\n" +
                            "• Sword Wave: 3× hilang, evade. 2× hilang, evade. 2× hilang, evade\n" +
                            "• Melempar Sword: 2× hilang,  evade. 1× hilang, evade. 1× hilang, evade.\n" +
                            "\n" +
                            "Tips: Dia lemah dengan tipe tanker. Kurangi darahnya secepat mungkin, dan dia akan tertunduk selama beberapa detik. Manfaatkan kesempatan ini untuk menyerangnya tanpa gangguan.\n"
            },
            {"4",
                    String.valueOf(R.drawable.alpha),
                    "Alpha",
                    "Untuk awalan, jangan langsung menyerangnya. Biarkan dia menyerang terlebih dahulu, evade kesamping saat dia sudah tepat berada dihadapanmu\n" +
                            "-\tJurus Sword (1): Evade saat sword darinya sudah mulai dekat denganmu. Kau bisa menyerangnya saat sudah menghindarinya\n" +
                            "-\tJurus Sword Wave (2): Hindari dengan cara berlari/evade kesamping. Kau bisa menyerangnya saat berhasil masuk matrix, tapi seranglah dari samping.\n" +
                            "-\tSummon “perisai” dan menghantammu/Menyerang dan membuatmu tak bisa bergerak: Evade setelah 1 detik. Dihitung dari saat “perisai” yang ia buat mulai muncul.\n" +
                            "-\tMenusukmu dari berbagai arah: Evade kesamping saat ia sudah berada didekatmu. Jika kau berada didalamnya, segeralah keluar, lalu serang dia dari belakang\n" +
                            "-\tMenyerangmu dengan serangan biasa: Evade saat ia dekat denganmu. Biasanya ia akan melakukan zig-zag sebelum itu\n"
            },
            {"5",
                    String.valueOf(R.drawable.roseblade),
                    "Roseblade",
                    "Mode 1\n" +
                            "-\tMenyerangmu dengan teknik pedangnya: Jika kuhitung, jeda tiap serangan ini adalah 2 detik. Evade kesamping saat ia mengangkat pedangnya\n" +
                            "-\tBunga: Evade setelah 0,5-1 detik. Dihitung dari saat bunga pertamakali muncul\n" +
                            "-\tMenyerangmu dengan membuat bayangan dirinya menjadi banyak: Segera ev ade saat ia sudah mulai menunduk. \n" +
                            "Mode 2\n" +
                            "-\tMembuat area api dibawahmu: Evade setelah 1 detik. Dihitung dari saat area api mulai muncul\n" +
                            "-\tMenyerangmu dengan api pedangnya 3 kali: Evade saat tangannya sudah ancang-ancang menyerangmu. Setelah itu, evade tiap 1 detik.\n" +
                            "Mode 3\n" +
                            "-\tTusuk, tusuk, dan tusuk!: Delay tiap serangan ini adalah 1 detik, dihitung dari saat serangannya berakhir\n" +
                            "-\tLempar sword, tusuk!: Saat dia sudah mulai menjauh, evade saat tangannya sudah ambil ancang-ancang kebelakang. Evade lagi 1 detik kemudian, dihitung dari saat ia ambil ancang-ancang\n" +
                            "-\tMenghilang dan menyerangmu sesekali: Segera evade saat bola diatasmu sudah pecah. Dia akan kembali menyerang setelah 4 detik/3 detik/2 detik/1 detik sejak dia menghilang. \n"
            },
            {"6",
                    String.valueOf(R.drawable.vassago),
                    "Vassago",
                    "-\tPatternnya adalah yang paling mudah kedua setelah Nozzle menurutku. Akan memakan lebih banyak waktu kalau kau tak bisa membunuhnya langsung saat ia terbujur lemas sebelum masuk ke tanah lagi. \n" +
                            "-\tMenembakkan tanah kearahmu: Evade saat mulutnya sudah menganga\n" +
                            "-\tMemukulmu menggunakan badannya. Evade saat badannya sudah ambil ancang-ancang kebelakang. Ada 2 pattern dalam serangan ini. Yang pertama hanya sekali, yang kedua berkali-kali. Untuk mengantisipasi pattern kedua, kusarankan evade sebanyak 2×. Lanjutkan evade jika ia masih menyerang. Jangan evade kebelakang, evade kesamping sangat direkomendasikan saat ia melakukan serangan ini.\n" +
                            "-\tMengaum: Evade saat mulutnya sudah menganga, dan seranglah dari belakang.\n"
            },
            {"7",
                    String.valueOf(R.drawable.camu),
                    "Camu",
                    "-\tLemah dengan elemen gelap dan Kamui. Jika tak punya, akali dengan menggunakan 3 karakter sekaligus. Ganti karakter tiap 8 detik. Ini caraku untuk mengakalinya. Kalian bisa menggunakan cara lain, tergantung playstyle milikmu\n" +
                            "-\tMeledakkan diri dan memberi damage AOE: Evade setelah 0,5 detik, dihitung dari saat aura kegelapan mulai muncul dalam dirinya. Jika tidak bisa, cobalah untuk menyesuaikan tempo dengannya beberapa kali. Aku sudah mencobanya, dan itu sangat membantuku untuk mengatur tempo dodge dan seranganku terhadapnya.\n" +
                            "-\tMenyerang tanpa ampun: Evade kesamping saat ia mulai ambil ancang ancang dengan pedang besarnya. Tak ada delay dalam serangan ini. Sekali ancang-ancang, ia akan langsung menyerangmu. Menghindarlah sampai kau sudah yakin tak akan kena serangan darinya. Jangan terlalu dekat dengannya saat ia melakukan ini.\n" +
                            "-\tParry: Jika kau menyerang dan posisi pedang miliknya seperti menahan seranganmu, evade kesamping pada saat itu juga\n" +
                            "-\tMengeluarkan tangan kegelapan dan menangkapmu: Evade kesamping saat kau sudah melihat tangannya. \n" +
                            "\n" +
                            "Tips: Saat terkena stun karena serangannya, akali dengan switch character dan evade segera. Kau akan masuk mode matrix setelah itu. \n"
            },
            {"8",
                    String.valueOf(R.drawable.rolland),
                    "Roland",
                    "-\tSerangan biasa: Delay tiap serangan 1 detik, dihitung dari saat ia berbalik kearahmu. Segera evade kesamping saat ia mengangkat tangannya\n" +
                            "-\tTembak: Evade kesamping saat ia mengarahkan tangannya padamu\n" +
                            "-\tSerangan biasa (2): Ini saat ia mengangkat tangannya lebih lama dari biasanya. Delay ±2 detik, setelah itu ia akan menyerang. Dihitung dari saat ia mulai mengangkat tangannya. Evade kesamping.\n" +
                            "-\tSummon 3 balok dari bawah tanah: Evade saat ia mengangkat tangannya (seperti saat Tifa membangkitkan duri dari bawah tanah).\n" +
                            "-\tSerangan “angin” spiral (AOE dan kedepan): Segera evade kesamping saat ia ambil ancang-ancang dengan tangannya yang ditaruh dibelakang. Serang dari belakang.\n" +
                            "-\tTARZAAANNN!!!: Evade kesamping saat ia hampir berada ditempatmu. \n" +
                            "-\tMelempar bom dan meledakkannya di langit: Evade saat “pedang” dia sudah tersangkut di langit-langit (Sekilas pattern yang satu ini mirip saat ia akan bergelantungan. Aku masih mencari tahu perbedaannya).\n"
            },
            {"9",
                    String.valueOf(R.drawable.roseblade),
                    "Riot",
                    "Mode 1\n" +
                            "-\tEvade tiap 1 detik sejak dia berbalik ke arahmu. Evade kesamping, jangan kebelakang\n" +
                            "-\tHindari terlalu sering evade kesamping dirinya saat ia tak menyerang. Itu akan memakan waktu lebih banyak untuk mengalahkannya karena ia akan lebih sering menghilang daripada menyerangnya secara berhadapan langsung\n" +
                            "-\tBocorkan defense miliknya saat berada di mode ini sebelum masuk ke mode 2\n" +
                            "-\tRudal: Berlarilah dan hindari tanda lingkaran (itu adalah tempat rudal yang akan jatuh). Kau boleh evade saat lingkarannya sudah berada dibawahmu walau berlari. Saat kau masuk matrix ketika dia melakukan ini, seranglah dia tanpa berlari (tak ada yang namanya berjalan disini, ingat itu). Segera evade saat matrix sudah berakhir.\n" +
                            "-\tMenembakkan Bug: Untuk melakukan hal ini, HP/Device kalian harus support untuk tampilan yang sangat ramai secara mendadak. Jika tidak, cara ini tak akan berjalan dengan sempurna. Dekati bug, sentuh bug, dan evade secara bersamaan. Jangan harap kalian akan diberi lingkaran sebagai waktu istirahat, karena ini tak berlaku untuk bug milik Riot. Sekali sentuh, mereka akan meledak\n" +
                            "-\tMenghilang: Hindari laser yang dia tinggalkan, hindari garis merah yang ada. Itu adalah penanda laser yang akan datang. Beberapa laser tak ditandai dengan garis, jadi semoga terbiasa dengan serangannya. Baca arah lasernya. Walau terkesan random, kalian akan menemukan cara untuk menghindarinya. Ya, ada saatnya kau harus memutari area sesekali untuk menghindari lasernya. Satu-satunya cara untuk terbiasa dalam pattern ini hanyalah pengalaman (bagiku). Saat garis merah banyak secara mendadak, evade. \n" +
                            "-\tSangat disarankan menggunakan 3 karakter sekaligus jika skill evade mu masih belum bagus. Ganti character tiap evade habis. Timing QTE, Ulti, dan lainnya juga berpengaruh. Jika kalian terlalu cepat melakukan Ulti, dia akan menghilang (Khusus structure yang saat melakukan ulti waktu disekitarnya masih berjalan)\n" +
                            "Mode 2\n" +
                            "-\tHindari lingkaran merah yang ada. Delay serangan 1 detik sejak dia berbalik kearahmu. Api yang ia tinggalkan tak terlalu berasa, jadi kalian masih bisa masuk area itu. Evade kesamping saat ia mulai memutar tubuhnya ke arahmu. Damage api yang ia berikan disitu sudah lumayan sakit. Selalu dekat dengannya, jangan jauh darinya. Di mode ini, dia tak akan menghilang lagi, jadi gunakan seluruh kekuatan kalian untuk membunuhnya.\n" +
                            "\n"
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
            model.setDeskripsi(aData[3]);
            list.add(model);
        }

        return list;
    }
}
