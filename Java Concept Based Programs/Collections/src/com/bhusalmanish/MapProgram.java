package com.bhusalmanish;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages= new HashMap<String,String>();
        languages.put("Java","object oriented platform independent language");
        languages.put("Python","an interpreted object oriented language");
        languages.put("Algol","an algorithmic language");
        languages.put("BASIC","Beginners all purpose symbolic instruction code");
        languages.put("Lisp","Therein lies madness");

        System.out.println(languages.get("Java"));

        System.out.println("================================");
        for(String key:languages.keySet()){
            System.out.println(key+":"+languages.get(key));
        }


    }
}
