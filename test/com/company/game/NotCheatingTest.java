package com.company.game;

import com.company.game.armor.Armor;
import com.company.game.armor.DaedricArmor;
import com.company.game.weapon.DaedricSword;
import com.company.game.weapon.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NotCheatingTest {

    @Test
    void main() {
        Hero hero = new Hero("???");
        Armor armor = new DaedricArmor();
        Weapon weapon = new DaedricSword();

        int lvl = 1;

        hero.statistics();

        assertEquals(hero.getLvl(),lvl);
        assertNotEquals(hero.getArmor(),armor);
        assertNotEquals(hero.getWeapon(),weapon);
    }
}