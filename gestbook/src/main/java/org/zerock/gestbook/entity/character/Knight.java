package org.zerock.gestbook.entity.character;

import org.zerock.gestbook.entity.Character;
import org.zerock.gestbook.entity.weapon.SwordBehavior;

public class Knight extends Character {
    @Override
    public void fight() {
        setWeapon(new SwordBehavior());
        weapon.attack();
    }
}
