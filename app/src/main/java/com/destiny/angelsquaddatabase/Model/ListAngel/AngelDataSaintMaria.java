package com.destiny.angelsquaddatabase.Model.ListAngel;

import com.destiny.angelsquaddatabase.Model.Model;

import java.util.ArrayList;

public class AngelDataSaintMaria {
    public static String[][] data = new String[][]{
            {"1",
                    "AWM",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/charlotte-character.png",
                    "Kapten Tim Utama Saint Maria, lulus dengan nilai tertinggi, Kapten termuda dalam sejarah Saint Maria. Dalam timnya, dia bukanlah hanya sekedar pemimpin, namun dia juga merupakan \"Senjata Utama\", dia sangat ahli melakukan serangan penentu dengan bantuan rekan-rekannya, karena itulah mereka terkenal dengan tim dengan kerjasama tim terbaik.",
                    "Tomoyo Nakajo",
                    "Saint Maria",
                    "Charlotte",
                    "Sniper",
                    "SSR"
            },
            {"2",
                    "UMP 45",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/sayaka-character.png",
                    "Lulusan Terkenal dari Saint Maria, satu angkatan dengan Kapten. Walaupun kempuannya secara keseluruhan tidak sehebat AWM dan yang lain, kecepatan dan misi penyerangannya menunjukkan kemampuan yang jauh diatas kapten.",
                    "Saki Aizawa",
                    "Saint Maria",
                    "Sayaka",
                    "SMG",
                    "SR"
            },
            {"3",
                    "Baretta M125",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/beretta.png",
                    "Instruktur untuk para tentara muda di Saint Maria, ketika masih di masa pelatihan dulu, dia mengikuti eksperimen Factor Fusion karena kecocokan dalam DNAnya. Beretta termasuk Angel legendaris yang berhasil bertahan di periode konflik dan Miracle War.",
                    "-",
                    "Saint Maria",
                    "Baretta",
                    "SMG",
                    "SSR"
            },
            {"4",
                    "Famas",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/maria.png",
                    "Lulusan terbaik Saint Maria, anggota khusus dalam pasukan Gerilya dengan kemampuan bertarung secara gerilya yang luar biasa. Terlahir dari keluarga kaya raya, dia mendedikasikan hidupnya untuk melayani masyarakat, dia akhirnya bergabung ke sekolah militer Saint Maria. Setelah itu dia mendapatkan Factor Fusion dan menjadi Angel.",
                    "Tamari Hinata",
                    "Saint Maria",
                    "Chalala Maria",
                    "Assault Rifle",
                    "SSR"
            },
            {"5",
                    "M1911",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/alia.png",
                    "Gadis kesayangan semua orang di Saint Maria dikarenakan fisiknya yang mungil dan wajahnya yang terlihat sangat muda, orang-orang bahkan tidak akan tega mengirimkannya ke medan perang. Dia bertekad untuk menunjukkan keimutannya ke semua orang di dunia.",
                    "Kanako Ito",
                    "Saint Maria",
                    "Alia",
                    "Pistol",
                    "N"
            },
            {"6",
                    "M24",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/elizabeth.png",
                    "Anggota Tim Utama Saint Maria, merupakan Lulusan Terbaik sama seperti AWM, berperan sebagai penembak jarah jauh dalam tim, biasanya dia memposisikan diri di belakang untuk melindungi kedua anggota tim yang ada di depan.",
                    "Sawako Shirakabe",
                    "Saint Maria",
                    "Elizabeth",
                    "Sniper",
                    "SR"
            },
            {"7",
                    "Scar-L",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/agnes.png",
                    "Anggota Tim Utama Saint Maria, merupakan Lulusan Terbaik sama seperti AWM, berperan sebagai penembak jarah jauh dalam tim, biasanya dia memposisikan diri di belakang untuk melindungi kedua anggota tim yang ada di depan.",
                    "Kaori Nazuka",
                    "Saint Maria",
                    "Agnes",
                    "Assault Rifle",
                    "SSR"
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
