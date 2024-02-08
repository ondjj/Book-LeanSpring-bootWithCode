package org.zerock.gestbook.entity;

import org.zerock.gestbook.entity.weapon.WeaponBehavior;

public abstract class Character {

    public WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }
}
