package com.ohracleLand.run;

import com.ohracleLand.controller.SignManager;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        SignManager signManager = new SignManager();
        signManager.test();

    }
}
