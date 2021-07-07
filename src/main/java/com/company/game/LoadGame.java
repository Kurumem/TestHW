package com.company.game;

import java.io.*;

public class LoadGame {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (FileInputStream outputStream = new FileInputStream("src/com/company/game/resources/SavedGame.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(outputStream)){
            Hero hero =(Hero) objectInputStream.readObject();

            hero.statistics();


        }
    }
}
