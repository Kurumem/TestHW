package com.company.game;

import com.company.game.armor.ClothArmor;
import com.company.game.armor.LeatherArmor;
import com.company.game.weapon.ShortSword;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SaveGame {
    public static void main(String[] args) throws Exception{
        Hero hero = new Hero("Kurumem");

        hero.statistics();



        hero.setLvl(20);
        hero.setArmor(new LeatherArmor());
        hero.setWeapon(new ShortSword());
        hero.setMoney(100);

        hero.statistics();



        try (FileOutputStream outputStream = new FileOutputStream("src/com/company/game/resources/SavedGame.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)){
            objectOutputStream.writeObject(hero);

        }



    }
}
