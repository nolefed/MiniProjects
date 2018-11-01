package com.bhusalmanish;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* planets set has been created so that it keeps the list of all planets.
solar system is a hashmap which contains list of all heavenly bodies, be it moon
or planet.

In the below code, heavenly bodies are being created, each heavenly body is being added
to solary system. if there are planets being created they are also being added to planet set.

then if a plannet has satellites/moon, then they are created (as heavenly bodies), moons
are put in solar systems, and then all the moons are added to the plannet it belongs to

 */

public class Main {

    private static Map<String,HeavenlyBody> solarSystem=new HashMap<>();
    private static Set<HeavenlyBody> planets= new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp= new HeavenlyBody("Mercury",88);  // heavenlybody class contains a hashset as well


        solarSystem.put(temp.getName(),temp);  // Map contains a object which contains a set
        planets.add(temp); //set contains an object, object itself contains a set

        temp= new HeavenlyBody("Venus",225);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp= new HeavenlyBody("Earth",365);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        HeavenlyBody tempMoon=new HeavenlyBody("Moon",27);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);

        temp=new HeavenlyBody("Mars",687);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon=new HeavenlyBody("Deimos",1.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);  // temp is still Mars

        tempMoon=new HeavenlyBody("Phobos",0.3);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp=new HeavenlyBody("Jupiter",4332);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        tempMoon=new HeavenlyBody("Io",1.8);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);  // temp is still Jupiter

        tempMoon=new HeavenlyBody("Europa",3.5);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);  // temp is still Jupiter

        tempMoon=new HeavenlyBody("Ganymede",7.1);
        solarSystem.put(tempMoon.getName(),tempMoon);
        temp.addMoon(tempMoon);  // temp is still Jupiter

        temp=new HeavenlyBody("Saturn",10759);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Uranus",30660);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Neptune",165);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        temp=new HeavenlyBody("Pluto",248);
        solarSystem.put(temp.getName(),temp);
        planets.add(temp);

        System.out.println("Planets");
        for(HeavenlyBody planet:planets){
            System.out.println("\t"+ planet.getName());
        }

        HeavenlyBody body=solarSystem.get("Jupiter");
        System.out.println("Moons of"+body.getName()+" are " );
        for(HeavenlyBody jupiterMoons:body.getSatellites()){
            System.out.println(jupiterMoons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All moons");
        for(HeavenlyBody moon:moons){
            System.out.println(moon.getName());
        }

        HeavenlyBody pluto= new HeavenlyBody("Pluto",842);
        planets.add(pluto);

        for(HeavenlyBody planet:planets){
            System.out.println(planet.getName()+ ": "+ planet.getOrbitalPeriod());
        }


    }
}
