package com.bhusalmanish;

public class Player {

    public String weapon;
    public String fullName;
    public int health;

    public void looseHealth(int damage){
        this.health=this.health-damage;
        if(this.health<=0){
            System.out.println("player knocked out");
            // reduce number of lives for player
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
