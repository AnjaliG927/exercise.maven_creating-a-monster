package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
public class StoneMonster implements Monster {
    String attackMode="Rock";
    @Override
    public String attack() {
        return attackMode;
    }
}
