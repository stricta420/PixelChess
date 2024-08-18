package com.example.chess_project;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.AttributedCharacterIterator;

/**
 * this class have 2 roles,
 * First one is just to change gui so information about game config is readable for end user
 * Second is to save that info in GameConfig class and then to pass it to next class
 */
public class PvpMenuController {

    private final GameConfig game_config = new GameConfig();

    public PvpMenuController() {
        game_config.set_game_mode(GameConfig.gameMode.PVP);
        game_config.set_game_time(GameConfig.gameTime.UNLIMITED);
        game_config.setPvp_game_mode(GameConfig.pvpGameMode.LOCAL);
        game_config.setPvp_game_type(GameConfig.pvpGameType.NORMAL);
    }

    private final ControllersHelper controllerHelper = new ControllersHelper();



    @FXML
    ImageView local_button_image_view;

    @FXML
    ImageView online_button_image_view;

    @FXML
    ImageView min_30;
    @FXML
    ImageView min_15;
    @FXML
    ImageView min_5;
    @FXML
    ImageView min_1;

    @FXML
    ImageView no_limit;

    @FXML
    ImageView ranked;
    @FXML
    ImageView normal;

    @FXML
    public void initialize() {
        local_button_image_view.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.LOCAL_BUTTON_ON.getFullFileName())));
        online_button_image_view.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.ONLINE_BUTTON_OFF.getFullFileName())));
        min_30.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_30_MIN_BUTTON_OFF.getFullFileName())));
        min_15.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_15_MIN_BUTTON_OFF.getFullFileName())));
        min_5.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_5_MIN_BUTTON_OFF.getFullFileName())));
        min_1.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_1_MIN_BUTTON_OFF.getFullFileName())));
        no_limit.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_NO_LIMIT_BUTTON_ON.getFullFileName())));
        ranked.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.GAME_TYPE_RANKED_OFF.getFullFileName())));
        normal.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.GAME_TYPE_NORMAL_ON.getFullFileName())));
    }



    @FXML
    protected void back_button(ActionEvent event) throws IOException {
        String main_menu_scene = File_names_menadger.FileNames.MAIN_MENU_FXML.getFullFileName();
        controllerHelper.switchToStringScene(main_menu_scene, event);
    }

    @FXML
    protected void play_button(ActionEvent event) throws IOException {
        System.out.println("PLAY!!!");
    }

    /**
     * GameMode
     */

    @FXML
    protected void local_button(ActionEvent event) throws IOException {
        Image new_img_local = new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.LOCAL_BUTTON_ON.getFullFileName()));
        Image new_img_online = new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.ONLINE_BUTTON_OFF.getFullFileName()));
        local_button_image_view.setImage(new_img_local);
        online_button_image_view.setImage(new_img_online);
        game_config.setPvp_game_mode(GameConfig.pvpGameMode.LOCAL);

    }

    @FXML
    protected void online_button(ActionEvent event) throws IOException {
        Image new_img_local = new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.LOCAL_BUTTON_OFF.getFullFileName()));
        Image new_img_online = new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.ONLINE_BUTTON_ON.getFullFileName()));
        local_button_image_view.setImage(new_img_local);
        online_button_image_view.setImage(new_img_online);
        game_config.setPvp_game_mode(GameConfig.pvpGameMode.ONLINE);
    }

    /**
     * Time
     */


    private void change_all_time_buttons_to_off() {
        min_30.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_30_MIN_BUTTON_OFF.getFullFileName())));
        min_15.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_15_MIN_BUTTON_OFF.getFullFileName())));
        min_5.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_5_MIN_BUTTON_OFF.getFullFileName())));
        min_1.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_1_MIN_BUTTON_OFF.getFullFileName())));
        no_limit.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_NO_LIMIT_BUTTON_OFF.getFullFileName())));
    }
    @FXML
    protected void min_1_button(ActionEvent event) throws IOException {
        change_all_time_buttons_to_off();
        min_1.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_1_MIN_BUTTON_ON.getFullFileName())));
        game_config.set_game_time(GameConfig.gameTime.min_1);
    }
    @FXML
    protected void min_5_button(ActionEvent event) throws IOException {
        change_all_time_buttons_to_off();
        min_5.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_5_MIN_BUTTON_ON.getFullFileName())));
        game_config.set_game_time(GameConfig.gameTime.min_5);
    }
    @FXML
    protected void min_15_button(ActionEvent event) throws IOException {
        change_all_time_buttons_to_off();
        min_15.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_15_MIN_BUTTON_ON.getFullFileName())));
        game_config.set_game_time(GameConfig.gameTime.min_15);
    }
    @FXML
    protected void min_30_button(ActionEvent event) throws IOException {
        change_all_time_buttons_to_off();
        min_30.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_30_MIN_BUTTON_ON.getFullFileName())));
        game_config.set_game_time(GameConfig.gameTime.min_30);
    }
    @FXML
    protected void min_UNLIMITED_button(ActionEvent event) throws IOException {
        change_all_time_buttons_to_off();
        no_limit.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.TIME_NO_LIMIT_BUTTON_ON.getFullFileName())));
        game_config.set_game_time(GameConfig.gameTime.UNLIMITED);
    }


    /**
     * Game type
     */

    @FXML
    protected void normal_button(ActionEvent event) {
        ranked.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.GAME_TYPE_RANKED_OFF.getFullFileName())));
        normal.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.GAME_TYPE_NORMAL_ON.getFullFileName())));
        game_config.setPvp_game_type(GameConfig.pvpGameType.NORMAL);
    }

    @FXML
    protected void ranked_button(ActionEvent event) {
        ranked.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.GAME_TYPE_RANKED_ON.getFullFileName())));
        normal.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.GAME_TYPE_NORMAL_OFF.getFullFileName())));
        game_config.setPvp_game_type(GameConfig.pvpGameType.RANKED);
    }
}
