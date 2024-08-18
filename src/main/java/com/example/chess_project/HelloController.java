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

/**
 * Controller to starter gui (one that starts when u open an app
 */
public class HelloController {

    private ControllersHelper controllerHelper = new ControllersHelper();

    @FXML
    private ImageView main_menu_img_view;

    @FXML
    public void initialize() {
        main_menu_img_view.setImage(new Image(getClass().getResourceAsStream(File_names_menadger.FileNames.MAIN_MENU_IMAGE.getFullFileName())));
    }

    @FXML
    protected void pvp_button(ActionEvent event) throws IOException {
        String pvp_scene_name = File_names_menadger.FileNames.PVP_MENU_FXML.getFullFileName();
        controllerHelper.switchToStringScene(pvp_scene_name, event);
    }

    @FXML
    protected void pve_button(ActionEvent event) throws IOException {
        String pve_scene_name = File_names_menadger.FileNames.PVE_MENU_FXML.getFileName();
        controllerHelper.switchToStringScene(pve_scene_name, event);
    }

    @FXML
    protected void exit_button() {
        System.exit(0);
    }

    @FXML
    protected void settings_button(ActionEvent event) throws IOException {
        String settings_scene_name = File_names_menadger.FileNames.SETTINGS_MENU_FXML.getFullFileName();
        controllerHelper.switchToStringScene(settings_scene_name, event);
    }
}