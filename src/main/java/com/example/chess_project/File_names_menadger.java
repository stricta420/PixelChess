package com.example.chess_project;

/**
 * This class is just a way to menage file names (mainly .png and .fxml files)
 * if u changed any file name / path to any file this is where u should change it
 * every file has 2 arguments - filename and file path,
 */
public class File_names_menadger {

    private static final String path_to_pvp_menu_buttons = "scens_images/pvp_menu/buttons/";
    private static final String path_to_pvp_menu = "scens_images/pvp_menu/";

    public enum FileNames {
        MAIN_MENU_FXML("hello-view.fxml", ""),

        PVP_MENU_FXML("pvp_menu_scen.fxml", ""),

        PVE_MENU_FXML("pve_menu_scen.fxml", ""),

        SETTINGS_MENU_FXML("settings_menu_scen.fxml", ""),
        MAIN_MENU_IMAGE("main_menu.png", ""),
        PVP_MAIN_MENU_IMAGE("PVP_MENU.png", path_to_pvp_menu),
        ONLINE_BUTTON_ON("online_button_clicked.png", path_to_pvp_menu_buttons),
        ONLINE_BUTTON_OFF("online_button.png", path_to_pvp_menu_buttons),
        LOCAL_BUTTON_ON("local_button_clicked.png", path_to_pvp_menu_buttons),
        LOCAL_BUTTON_OFF("local_button.png", path_to_pvp_menu_buttons),
        TIME_1_MIN_BUTTON_ON("1_min_clicked.png", path_to_pvp_menu_buttons),
        TIME_1_MIN_BUTTON_OFF("1_min.png", path_to_pvp_menu_buttons),
        TIME_5_MIN_BUTTON_ON("5_min_clicked.png", path_to_pvp_menu_buttons),
        TIME_5_MIN_BUTTON_OFF("5_min.png", path_to_pvp_menu_buttons),
        TIME_15_MIN_BUTTON_ON("15_min_clicked.png", path_to_pvp_menu_buttons),
        TIME_15_MIN_BUTTON_OFF("15_min.png", path_to_pvp_menu_buttons),
        TIME_30_MIN_BUTTON_ON("30_min_clicked.png", path_to_pvp_menu_buttons),
        TIME_30_MIN_BUTTON_OFF("30_min.png", path_to_pvp_menu_buttons),

        TIME_NO_LIMIT_BUTTON_OFF("no_limit.png", path_to_pvp_menu_buttons),
        GAME_TYPE_RANKED_ON("ranked_clicked.png", path_to_pvp_menu_buttons),
        GAME_TYPE_RANKED_OFF("ranked.png", path_to_pvp_menu_buttons),
        GAME_TYPE_NORMAL_ON("normal_clicked.png", path_to_pvp_menu_buttons),
        GAME_TYPE_NORMAL_OFF("normal.png", path_to_pvp_menu_buttons),
        TIME_NO_LIMIT_BUTTON_ON("no_limit_clicked.png", path_to_pvp_menu_buttons);






        private final String fileName;
        private final String path;

        FileNames(String fileName, String path) {
            this.fileName = fileName;
            this.path = path;
        }

        public String getFileName() {
            return fileName;
        }

        public String getFullFileName() {
            return path + fileName;
        }

        public String getPath() {
            return path;
        }
    }

}
