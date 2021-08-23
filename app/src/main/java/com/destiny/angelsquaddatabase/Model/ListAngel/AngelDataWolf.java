package com.destiny.angelsquaddatabase.Model.ListAngel;

import com.destiny.angelsquaddatabase.Model.Model;

import java.util.ArrayList;

public class AngelDataWolf {
    public static String[][] data = new String[][]{
            {"1",
                    "DEAGLE",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/wolf/nightingale-character.png",
                    "Lahir di White Night, sekarang bergabung ke dalam W.O.L.F.. Nightingale merupakan gadis yang berpikiran tajam, cerdik, dan memiliki jaringan informasi yang luas. Dibalik penampilannya yang tenang, terdapat semangat pertempuran yang berapi-api\n" +
                            "\n" +
                            "Past Roles : Jenny Realite - Fairy Tail",
                    "Kaori Nazuka",
                    "WOLF",
                    "Nightingale",
                    "Pistol",
                    "SSR"
            },
            {"2",
                    "HK416",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/wolf/lilith-character.png",
                    "Tergabung dalam W.O.L.F., sedikit liar dan pemarah. Dalam pertempuran, ia cenderung agresif dan membasmi musuhnya dengan teknik yang langsung dan sederhana. Sangat ahli dalam Special Attack.",
                    "Kanae Ikadai",
                    "WOLF",
                    "Lilith",
                    "Assault Rifle",
                    "SR"
            },
            {"3",
                    "AK47",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/wolf/toria.png",
                    "Salah satu Angel Tingkat 4 terbaik yang pernah dicatat sejarah, keberadaannya merupakan perwujudan Teknologi dan Semangat Membara diluar Federasi Bumi Manusia. Keahliannya sangat jauh melampaui Angel dengan tingkatan yang sama, sehingga membuat minimnya pengalaman Toria tertutup dengan prestasinya.",
                    "Saya Horigome",
                    "WOLF",
                    "Toria",
                    "Assault Rifle",
                    "SSR"
            },
            {"4",
                    "SG550",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/mk14.png",
                    "Salah satu anggota W.O.L.F, namun kepintarannya sedikit dibawah rekan-rekannya. Gegabah dan bertindak sebelum berpikir, selalu mengacaukan strategi yang sudah disusun. dia menyadari hal ini, namun prinsip hidupnya adalah \"Maju terlebih dahulu, berpikir belakangan!\".",
                    "Asuka Ito",
                    "WOLF",
                    "Lin Lin",
                    "Assault Rifle",
                    "N"
            },
            {"5",
                    "XM1014",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/qbz95.png",
                    "Angel langka hasil penelitian menggunakan Manusia. Kemampuannya semua berdasarkan hasil penelitian dan analisa, berkebalikan dengan kemampuan tempurnya yang rendah. Namun ada beberapa cara \"Pintar\" untuk meningkatkan kemampuan tempurnya selama pertempuran.\n" +
                            "\n" +
                            "Past Roles : Phil - Promised Neverland, Kirara Mizutani - It Was Slime When Reincarnated",
                    "Hiyori Kono",
                    "WOLF",
                    "Valentina",
                    "Shotgun",
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
