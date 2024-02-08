package org.zerock.gestbook.entity.character;

import org.zerock.gestbook.entity.Character;
import org.zerock.gestbook.entity.weapon.BowAndArrowBehavior;

public class Queen extends Character {

    @Override
    public void fight() {
        setWeapon(new BowAndArrowBehavior());
        weapon.attack();
    }
}
