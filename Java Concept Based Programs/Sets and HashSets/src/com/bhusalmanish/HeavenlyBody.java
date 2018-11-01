    package com.bhusalmanish;

import java.util.HashSet;
import java.util.Set;


/* moon, planet all are heavenly bodies. moon revolve around their
plannets, and plannets revolve around sun. so all heavenly bodies have
their orbital periods. Set satellites has been created because
plannets have their satellites, and they are stored in satellites
set.
 */

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites=new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return  this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass is " +obj.getClass());     // so that subclass do not compare equal
        System.out.println("this.getClass() is" +this.getClass()); // m still not sure fully what getClass does or how is it useful in comparing
        if((obj==null)||(obj.getClass()!=this.getClass())){
            return false;
        }

        String objName  = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);

    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode()+57;
    }
}
