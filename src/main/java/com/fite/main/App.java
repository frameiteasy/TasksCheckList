package com.fite.main;

import com.fite.ui.AppUI;

public class App {

    public static void main(String[] args) {
        AppUI app = new AppUI(new DefaultDataManager());
    }
}
