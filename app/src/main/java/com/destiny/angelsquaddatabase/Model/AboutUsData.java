package com.destiny.angelsquaddatabase.Model;

import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class AboutUsData {
    public static String[][] data = new String[][]{
            {"1",
                    "Zyarga Aurelius",
                    "Zyarga",
                    "Developer",
                    String.valueOf(R.drawable.zyarga),
            },
            {"2",
                    "Artaa.",
                    "Artaa",
                    "Content Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/louise-character.png"
            },
            {"3",
                    "Abdullah",
                    "halibel",
                    "Content Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/nicole.png"
            },
            {"4",
                    "Avery",
                    "aditya_avery",
                    "Support Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/karen.png"
            },
            {"5",
                    "Reii",
                    "Reonaa",
                    "Support Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/maria.png"
            },
            {"6",
                    "Muha",
                    "Subaru21",
                    "Contributor Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/erii.png"
            },
            {"7",
                    "SystemSyeh",
                    "SystemSyeh",
                    "Contributor Developer",
                    "https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/sarah-character.png"
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
            list.add(model);
        }

        return list;
    }
}
