package com.test.trytest;

public class Calculatrice {

    public Integer Add(Integer nb1, Integer nb2){
        return nb1 + nb2;
    }

    public Integer Subsract(Integer nb1,Integer nb2){
        return nb1 - nb2;
    }

    public float Divide(Integer nb1, Integer nb2){
        if(nb2!=0){
            return ((float)nb1/(float)nb2);
        }else{
            throw new RuntimeException("Pas de division par 0 !!!");
        }
    }

    public Integer Multiply(Integer nb1, Integer nb2){
        return nb1*nb2;
    }
}
