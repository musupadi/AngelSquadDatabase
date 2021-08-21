package com.destiny.angelsquaddatabase.Model;

import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class FormasiArenaData {
    public static String[][] data = new String[][]{
            {"1",
                    "Zyarga Aurelius",
                    "Zyarga",
                    "Developer",
                    String.valueOf(R.drawable.zyarga),
                    //Formation
                    //1
                    ".",
                    ".",
                    //2
                    ".",
                    ".",
                    //3
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/wolf/valentina.png",
                    "XM104",
                    //4
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/irina.png",
                    "PP Bison",
                    //5
                    ".",
                    ".",
                    //6
                    ".",
                    ".",
                    //7
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/maria.png",
                    "FAMAS",
                    //8
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/wolf/nightingale-character.png",
                    "DEAGLE",
                    //9
                    ".",
                    ".",
                    //10
                    ".",
                    ".",
                    //11
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/karen.png",
                    "AUG",
                    //12
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/charlotte-character.png",
                    "AWM",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/charlotte-character.png",
                    "AWM",
                    "Menyerang"
            },
            {"2",
                    "Artaa.",
                    "Artaa",
                    "Content Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png",
                    //Formation
                    //1
                    ".",
                    ".",
                    //2
                    ".",
                    ".",
                    //3
                    ".",
                    ".",
                    //4
                    ".",
                    ".",
                    //5
                    ".",
                    ".",
                    //6
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/shino-character.png",
                    "Remington 870",
                    //7
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/irina.png",
                    "PP Bison",
                    //8
                    ".",
                    ".",
                    //9
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/sarah-character.png",
                    "M4A1",
                    //10
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png",
                    "QBZ97",
                    //11
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/charlotte-character.png",
                    "AWM",
                    //12
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/kasuga.png",
                    "CZ75",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png",
                    "QBZ97",
                    "Bertahan"
            },
            {"3",
                    "Artaa.",
                    "Artaa",
                    "Content Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png",
                    //Formation
                    //1
                    ".",
                    ".",
                    //2
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/irina.png",
                    "PP Bison",
                    //3
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/shino-character.png",
                    "Remington 870",
                    //4
                    ".",
                    ".",
                    //5
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/sarah-character.png",
                    "M4A1",
                    //6
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png",
                    "QBZ97",
                    //7
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/charlotte-character.png",
                    "AWM",
                    //8
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/kasuga.png",
                    "CZ75",
                    //9
                    ".",
                    ".",
                    //10
                    ".",
                    ".",
                    //11
                    ".",
                    ".",
                    //12
                    ".",
                    ".",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png",
                    "QBZ97",
                    "Menyerang"
            },
    };
    public static ArrayList<Model> getListData(){
        Model model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            model = new Model();
            model.setId(aData[0]);
            model.setNama(aData[1]);
            model.setUserid(aData[2]);
            model.setRole(aData[3]);
            model.setGambar(aData[4]);
            model.setImage1(aData[5]);
            model.setName1(aData[6]);
            model.setImage2(aData[7]);
            model.setName2(aData[8]);
            model.setImage3(aData[9]);
            model.setName3(aData[10]);
            model.setImage4(aData[11]);
            model.setName4(aData[12]);
            model.setImage5(aData[13]);
            model.setName5(aData[14]);
            model.setImage6(aData[15]);
            model.setName6(aData[16]);
            model.setImage7(aData[17]);
            model.setName7(aData[18]);
            model.setImage8(aData[19]);
            model.setName8(aData[20]);
            model.setImage9(aData[21]);
            model.setName9(aData[22]);
            model.setImage10(aData[23]);
            model.setName10(aData[24]);
            model.setImage11(aData[25]);
            model.setName11(aData[26]);
            model.setImage12(aData[27]);
            model.setName12(aData[28]);
            model.setCore(aData[29]);
            model.setCoreName(aData[30]);
            model.setFormation(aData[31]);
            list.add(model);
        }

        return list;
    }
}
