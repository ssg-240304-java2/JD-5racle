package com.ohracleLand.run;

import com.ohracleLand.controller.SignManager;
import com.ohracleLand.model.dto.UserDTO;
import com.ohracleLand.view.MainMenu;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        UserDTO loginUser;
        MainMenu mainMenu = new MainMenu();

        SignManager signManager = new SignManager();
        loginUser = signManager.test();

        if (loginUser != null) {
            mainMenu.mainMenu(loginUser);
        }
    }
}
