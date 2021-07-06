package com.company.game;

import com.company.game.armor.Armor;
import com.company.game.armor.ClothArmor;
import com.company.game.weapon.Daggers;
import com.company.game.weapon.Weapon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Hero implements Serializable {
    private static final int serialVersionUID = 1;

    String name;
    int lvl;
    Armor armor;
    Weapon weapon;
    int money;


    public Hero(String name){
        this.name = name;
        this.lvl = 1;
        this.armor = new ClothArmor();
        this.weapon = new Daggers();
        this.money = 0;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public Armor getArmor() {
        return armor;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void statistics(){
        name = getName();
        lvl = getLvl();
        weapon = getWeapon();
        armor = getArmor();
        money = getMoney();
        System.out.printf("Статистика персонажа %s: %n Уровень: %d.%n Оружие: %s.%n Броня: %s.%n Деньги: %d.%n", name, lvl, weapon, armor, money);

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
