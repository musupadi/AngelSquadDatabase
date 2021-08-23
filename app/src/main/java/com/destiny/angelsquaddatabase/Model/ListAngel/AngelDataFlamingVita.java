package com.destiny.angelsquaddatabase.Model.ListAngel;

import com.destiny.angelsquaddatabase.Model.Model;

import java.util.ArrayList;

public class AngelDataFlamingVita {
    public static String[][] data = new String[][]{
            {"1",
                    "NOVA",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/cassandra-character.png",
                    "Salah satu petinggi Flaming Vita, Angel veteran yang kaya akan pengalaman. Sebagai Angel tingkat 2, sangatlah mengagetkan bahwa ia tidak ikut serta dalam \"Miracle War\", namun jumlah pertempuran baik skala kecil dan besar yang ia menangkan sudah tidak terhitung.\n" +
                            "\n" +
                            "Past Roles : Edward Elric - Full Metal Alchemist, Temari - Naruto, Pakunoda - Hunter x Hunter",
                    "Romi Park",
                    "Flaming Vita",
                    "Kai",
                    "Shotgun",
                    "R"
            },
            {"2",
                    "QBZ97",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png",
                    "Bagian dari Tim Penyelamatan Flaming Vita, dulunya tergabung di Pasukan Khusus. Walapun kemampuan bertempurnya luar biasa, namun dia lebih fokus dalam penyembuhan dan penyalamatan di medan tempur, karena itu lah dia akhirnya memutuskan untuk bergabung dengan Flaming Vita.",
                    "-",
                    "Flaming Vita",
                    "Louise",
                    "Assault Rifle",
                    "SSR"
            },
            {"3",
                    "Barrett M82A1",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/barrett-character.png",
                    "Salah satu petinggi Flaming Vita, memiliki sifat tegas dan jujur dalam setiap perkataannya, sudah sangat terbiasa dengan perang. Senjata yang digunakan adalah Senjata Anti-Equipment M82A1, yang terkenal memiliki daya tembak yang kuat dan mematikan dikalangan para Angel. Prajuri Veteran yang telah merasakan Peperangan Shura.\n" +
                            "\n" +
                            "Past Roles : Edward Elric - Full Metal Alchemist, Temari - Naruto, Pakunoda - Hunter x Hunter, Zoe Hange - Attack on Titan,Naoto - Persona 4, Lucas Nemesis - Gundam Try, Tao Ren - Shaman King, Komatsu - Toriko",
                    "Romi Park",
                    "Flaming Vita",
                    "Dawn",
                    "Sniper",
                    "SSR"
            },
            {"4",
                    "MK14 ",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/mk14.png",
                    "Dulunya adalah Angel Pasukan Khusus, sangat peduli terhadap orang lain dan senang memperhatikan mereka. dia adalah Cyborg Angel yang sangat langka, sendi mekanis yang tertanam di tubuhnya membuat kemampuannya menjadi lebih istimewa daripada Angel biasa.",
                    "Hikaru Aono",
                    "Flaming Vita",
                    "Nanna",
                    "Sniper",
                    "R"
            },
            {"5",
                    "QBZ95",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/qbz95.png",
                    "Salah satu manajer di Flaming Vita, terlahir di Federasi Bumi Manusia dan kemudian bergabung dalam Pasukan Khusus, dia merupakan salah satu Angel yang sangat efektif dalam pertarungan dibawah perintah Komandan. Setalah \"Miracle War\", dia meninggalkan Pasukan Khusus tanpa konfirmasi dan bergabung ke Flaming Vita, namun sepertinya ada sesuatu yang disembunyikan.\n" +
                            "\n" +
                            "Past Roles :Menma - Anohana, Demon Slayer: Kimetsu no Yaiba - Kanae Kocho, Food Wars: Shokugeki no Soma - Ryōko Sakaki",
                    "Kayano Ai",
                    "Saint Maria",
                    "Amelia",
                    "Assault Rifle",
                    "SR"
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
            model.setDeskripsi(aData[3]);
            model.setVa(aData[4]);
            model.setFaction(aData[5]);
            model.setRealname(aData[6]);
            model.setWeapon(aData[7]);
            model.setRarity(aData[8]);
            list.add(model);
        }

        return list;
    }
}
