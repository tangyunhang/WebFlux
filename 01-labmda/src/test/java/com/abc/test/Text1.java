package com.abc.test;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Text1 {

    private static void accept(Object k, Object v) {
        System.out.println(k + ":" + v);
        Person[]  personl ={new Person("22",3),new Person("24",4)};
        Arrays.stream(personl).
                map(person -> {person.setAge(person.getAge() + 1);
        return person;}).peek(person -> {System.out.println(person);
                    System.out.println("name="+person.getName()+","+ person.getAge());}).collect(Collectors.toList());

    }

    @Test
    public void aVoid (){

        test1(hashMap-> {
            HashMap<String, Integer> map = new HashMap<>();
            hashMap.forEach((k,v)->{
                map.put(k+"4444",(Integer) v+3);
            });
            return map;
        });
    }

    /**
     *
     */
    void test1(CoustFunction<HashMap> action){
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("tang",12);
        map1.put("tang3",123);

        HashMap hashMap = action.apply(map1);
        hashMap.forEach(Text1::accept);

    }

}
