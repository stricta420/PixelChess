package com.example.chess_project;

/**
 * This class works as a container for all game config
 */
public class GameConfig {
    public enum gameMode {
        PVP,
        PVE
    }

    private gameMode game_mode = gameMode.PVP;

    public void set_game_mode(gameMode game_mode) {
        this.game_mode = game_mode;
    }

    public gameMode get_game_mode() {
        return this.game_mode;
    }


    public enum gameTime {
        UNLIMITED,
        min_30,
        min_15,
        min_5,
        min_1
    }

    private gameTime game_time;

    public void set_game_time(gameTime game_time) {
        this.game_time = game_time;
    }

    public gameTime get_game_time() {
        return this.game_time;
    }


    public enum pvpGameMode {
        LOCAL,
        ONLINE
    }
    private pvpGameMode pvp_game_mode;

    public void setPvp_game_mode(pvpGameMode pvp_game_mode) {
        this.pvp_game_mode = pvp_game_mode;
    }

    public pvpGameMode getPvp_game_mode() {
        return this.pvp_game_mode;
    }



    public enum pvpGameType {
        NORMAL,
        RANKED
    }

    private pvpGameType pvp_game_type;

    public void setPvp_game_type(pvpGameType pvp_game_type) {
        this.pvp_game_type = pvp_game_type;
    }

    public pvpGameType getPvp_game_type() {
        return this.pvp_game_type;
    }
}
