package com.java_tr1.sandbox;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main (String[] args){
        String[] array = {"Java", "Python", "C++"};

        List<String> arrayList = Arrays.asList("Java", "Python", "C++");

        for(String a : arrayList){
            System.out.println(a);
        }
    }
}
