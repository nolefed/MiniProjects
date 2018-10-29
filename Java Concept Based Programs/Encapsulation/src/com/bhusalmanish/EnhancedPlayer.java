package com.bhusalmanish;

public class EnhancedPlayer {
    private String name;
    private int health=100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health<=100){
            this.health=health;
        }

        this.weapon = weapon;
    }
    public void looseHealth(int damage){
        this.health=this.health-damage;
        if(this.health<=0){
            System.out.println("player knocked out");
            // reduce number of lives for player
        }
    }

    public int getHealth() {
        return health;
    }
}
