package com.destiny.angelsquaddatabase.Model.ListAngel;

import com.destiny.angelsquaddatabase.Model.Model;

import java.util.ArrayList;

public class AngelDataJude {
    public static String[][] data = new String[][]{
            {"1",
                    "MAG-7M1",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/jude/mika-character.png",
                    "Sebagai Intel, MAG-7M1 sangat terkenal hingga ke seluruh penjuru dunia. Namun selain ketenarannya sebagai mata-mata, tidak ada lagi yang bisa diketahui tentang kekuatannya.",
                    "Akane Hanazawa",
                    "JUDE",
                    "Mika",
                    "Shotgun",
                    "SSR"
            },
            {"2",
                    "MICRO UZI",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/jude/natalie-character.png",
                    "Dilahirkan di Flaming Vita, sekarang menjadi \"Gatekeeper\" bagi Organisasi Intelijen JUDE. Gadis pendiam dengan senyum yang selalu terpasang di wajahnya. Merupakan siswi berprestasi selama pelatihan.",
                    "Satsuki Morita",
                    "JUDE",
                    "Natalie",
                    "SMG",
                    "SR"
            },
            {"3",
                    "GLOCK17",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/jude/stina-character.png",
                    "\"Jika kita tidak bisa menghentikan peperangan, lebih baik katakan sejujurnya kepada dunia!\" -- Angel yang menjadikan kalimat tersebut sebagai prinsip hidup. Dalam medan perang, ada lebih dari sekedar tembak menembak.\n" +
                            "\n" +
                            "Past Roles : Cinderella - Fantasy the Blood",
                    "Kana Nishizawa",
                    "JUDE",
                    "Stina",
                    "Pistol",
                    "R"
            },
            {"4",
                    "HK USP",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/jude/meimei-character.png",
                    "Berasal dari keluarga biasa saja, menjadi Angel bukanlah merupakan keinginannya pribadi, meskipun begitu dia tetap menunjukkan sisi ceria dan optimisnya. Stephanie selalu bekerja keras setiap harinya dan impian satu-satunya adalah menjadi independen.\n" +
                            "\n" +
                            "Past Roles : Chelsea - Akame ga Kill!, UFO Baby - Miyu Kōzuki, GeGeGe no Kitaro - Maik0",
                    "Kaori Nazuka",
                    "JUDE",
                    "Mei Mei",
                    "Pistol",
                    "SR"
            },
            {"5",
                    "STEYR SCOUT",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/jude/pita-character.png",
                    "Lahir di grup asing yang bernama Defenders, semua yang dia lakukan sangat aneh, mulai dari perkataan dan tindakan, membuatnya menjadi sulit dimengerti. Contohnya dia bermata normal namun selalu memakai kacamata.",
                    "Izumi Iwamatsu",
                    "JUDE",
                    "Pi Ta",
                    "Sniper",
                    "N"
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
