package com.abc.test;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Text2 {



    @Test
    public void aVoid (){
            Set<String> cities = new HashSet<>();
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(1);
        lis.add(3);
        lis.add(4);
       // lis.stream().filter(m-> m>3).map(c-> c=c*3).collect(Collectors.toList()).forEach(c-> System.out.println(c));
        lis.stream().map(m->m+1).peek(System.out::print).forEach(c-> System.out.println(c));
    }
    @Test
    public void aVoid02 () {
        String[] nums= {"111","2222","3333"};
        Arrays.stream(nums)
                .map(Integer::parseInt)
                .forEach(System.out::println);

    }
    @Test
    public void aVoid03 () {
        String words= "tn yu beijing shanghai";
        Stream.of(words.split(" ")).flatMap(word->{
                return Stream.of(word.split(""));}
                ).sorted()
                .forEach(System.out::println);

    }
    @Test
    public void aVoid04 () {
        Function<String,String> con = str -> str+"d";
        System.out.println(con.apply("4"));
    }

}
