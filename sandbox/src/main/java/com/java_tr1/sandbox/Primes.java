package com.java_tr1.sandbox;

public class Primes {

    public static boolean isPrime (int n){
        int m = (int) Math.sqrt(n);
        for (int i = 2; i < m; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
