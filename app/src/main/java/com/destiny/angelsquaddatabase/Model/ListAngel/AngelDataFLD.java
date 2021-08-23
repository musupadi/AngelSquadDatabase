package com.destiny.angelsquaddatabase.Model.ListAngel;

import com.destiny.angelsquaddatabase.Model.Model;

import java.util.ArrayList;

public class AngelDataFLD {
    public static String[][] data = new String[][]{
            {"1",
                    "TAR-21",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/maeve-character.png",
                    "Ketua Organisasi F.L.D., sangat ahli dalam menjalankan misi sulit dengan strategi ketat, namun masih mampu memberikan hasil terbaik. dia memimpin secara langsung Tim Delta sebagai salah satu pilar penopang F.L.D, dengan pengalamannya dalam berbagai Pertempuran Shura, dia berhasil membawa pulang kemenangan di setiap peperangan.",
                    "Karin Mitarai",
                    "FLD",
                    "Maeve",
                    "Assault Rifle",
                    "SSR"
            },
            {"2",
                    "KAR.98K",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/andrea-character.png",
                    "Andrea merupakan Pemimpin Markas Militer 01 F.L.D, sebelumnya dia menjabat sebagai Kapten Tim Tempur, posisi tersebut didapatkan dari hasil pencapaiannya yang sangat luar biasa, namun setelah dia menjabat sebagai Pemimpin Markas Militer, dia berhenti berlatih dan kemampuannya dalam bertempur menurun.\n" +
                            "\n" +
                            "Past Roles : Queen Amaryllis - Dragon Nest",
                    "Yuka Kato",
                    "FLD",
                    "Andrea",
                    "Sniper",
                    "SR"
            },
            {"3",
                    "Diemaco C8",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/magdalena-character.png",
                    "Magdalena merupakan anggota baru dari F.L.D., sebagai Angel baru, dia termasuk luar biasa dalam kemampuan serta kepribadian yang sangat baik, dua hal tersebut menutupi minimnya pengalaman yang dia miliki. Kemampuannya diakui oleh petinggi F.L.D, dia pun akhirnya ditugaskan untuk menjaga [Moonlight Base].",
                    "-",
                    "FLD",
                    "Magdalena",
                    "Assault Rifle",
                    "SR"
            },
            {"4",
                    "G3SG1",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/otina-character.png",
                    "Anggota Tim Delta, gadis cantik yang sangat berterus terang dan cenderung tomboy. dia bertempur bersama TAR-21, selalu datang menyelamatkan kapanpun TAR-21 berada dalam situasi yang berbahaya.",
                    "Takao Koizumi",
                    "FLD",
                    "Otina",
                    "Sniper",
                    "N"
            },
            {"5",
                    "M4A1",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/sarah-character.png",
                    "Anggota Angel Tingkat 3 di F.L.D, dan berhasil menjadi pemimpin pasukan akademi angel terbaik. Awalnya kemampuannya tidak terlalu mencolok, namun dengan kerja keras dan potensinya dia berhasil menempati posisinya sekarang. Kemampuan bertarungnya kelas atas, selain itu juga dia memiliki kepemimpinan yang luar biasa tanpa melihat dengan tim apapun yang ditugaskan dengannya.\n" +
                            "\n" +
                            "Past Roles : Miss Announcement - Hunter x Hunter",
                    "Tomoko Matsuno",
                    "FLD",
                    "Sarah",
                    "Assault Rifle",
                    "SSR"
            },
            {"6",
                    "R1895",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/hannah-character.png",
                    "Anggota Tim Delta, gadis yang berparas sedikit tampan dan berdandan seperti Cowboy. Berdasarkan karakteristik senjatanya, Hannah menyerang dari jarak dekat menengah dan lebih mengutamakan kecepatan gerakan dan serangan daripada daya tembaknya.",
                    "Yoshie Sakai",
                    "FLD",
                    "Hannah",
                    "Pistol",
                    "R"
            },
            {"7",
                    "REMINGTON 870",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/shino-character.png",
                    "Dilahirkan di F.L.D sebagai Angel tingkat 4, seorang gadis yang selalu berusaha melakukan yang terbaik dalam apapun yang dilakukannya. Karena kepribadiannya yang lemah dan kurangnya pengalaman, dia mendapatkan rekor kegagalan dalam latihan dan misi terbanyak.\n" +
                            "\n" +
                            "Past Roles : Water Fairy - Fantasy Chronicle",
                    "Yuzumi Kira",
                    "FLD",
                    "Shino",
                    "Shotgun",
                    "SSR"
            },
            {"8",
                    "TRG-42",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/aubrey-character.png",
                    "Kepala Moonlight Base milik F.L.D, tenang dan sangat pintar. Seperti tipikal orang yang gila kerja lainnya, Aubrey membangun Moonlight Base menjadi markas militer yang paling penting milik F.L.D, dan menjadikannya sebagai Komandan Pangkalan Militer.",
                    "-",
                    "FLD",
                    "Aubrey",
                    "Sniper",
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
