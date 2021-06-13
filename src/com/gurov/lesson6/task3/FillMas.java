package com.gurov.lesson6.task3;

import java.util.Arrays;

public class FillMas {

    public static void main(String[] args) {

        FillMas app = new FillMas();
        app.Start();
    }

    public static void Start(){

        Integer[] squares = new Integer[10];
        Fill(squares,Integer -> Integer * Integer);
        System.out.println(Arrays.toString(squares));
        Double[] roots = new Double[10];
        Fill(roots,Integer -> Math.sqrt(Integer));
        System.out.println(Arrays.toString(roots));
    }

    public static <T> void Fill(T[] objects,FunctionInterface<Integer, ? extends T> function){

        for (int i=0;i<objects.length;i++)
            objects[i] = function.Apply(i);
    }
}
