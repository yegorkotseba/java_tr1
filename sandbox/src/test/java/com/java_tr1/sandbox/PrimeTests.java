package com.java_tr1.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

    @Test
    public void testPrimes(){
        Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
    }

    @Test
    public void testNonPrime(){
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE-2));
    }

}
