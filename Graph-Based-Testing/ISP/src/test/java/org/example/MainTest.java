package org.example;

import org.apache.commons.numbers.core.ArithmeticUtils;
import org.apache.commons.numbers.primes.Primes;
import org.junit.jupiter.api.Test;
import org.apache.commons.numbers.arrays.*;

import java.util.Arrays;

class MainTest {

    @Test
    void TR1() {
        // TR 1: n = 1 with TR [1,2,3] expected res = false
        System.out.println(Primes.isPrime(1));
    }

    @Test
    void TR2() {
        // TR 2: n = 3 with TR [1,2,4,5,6,7] expected res = true
        System.out.println(Primes.isPrime(3));
    }

    @Test
    void TR3() {
        // TR 3: n = 7 with TR [1,2,3,4,5,8,5,6,7] expected res = true
        System.out.println(Primes.isPrime(7));
    }

    @Test
    void TR5() {
        // TR 5: n = 3673 expected res = true
        System.out.println(Primes.isPrime(3673));
    }

    @Test
    void TR6() {
        // TR 6: x[] array size != yList[] array size with TR [1,2,3,5] expected res = IllegalArgument
        double[] x = {1,5};
        double[] yList = {7, 3, 9};

        SortInPlace.ASCENDING.apply(x, yList);
    }

    @Test
    void TR8() {
        // TR 7: x = [1, 8, 2] ; yList = [5, 12, 33] with TR [1,2,3,4,2,6,7,8,7,9,10,11,10,12,13,14,15,16,17,13,18] expected res =
        double[] x = {1, 8, 2};
        double[] yList = {5, 12, 33};

        System.out.println("Before:");
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(yList));

        SortInPlace.ASCENDING.apply(x, x, yList);

        System.out.println("After:");
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(yList));
    }

    @Test
    void TR9() {
        // TR 9: n = -1 with TR [1,2] expected res = IllegalArgument
        System.out.println(Primes.nextPrime(-1));
    }

    @Test
    void TR10() {
        // TR 10: n = 2 with TR [1,3,4] expected res = 2
        System.out.println(Primes.nextPrime(2));
    }

    @Test
    void TR11() {
        // TR 11: n = 3 with TR [1,3,5,6] expected res = 3
        System.out.println(Primes.nextPrime(3));
    }

    @Test
    void TR13() {
        // TR 12: n = 8 with TR [1,3,5,7,8,9,12] expected res = 11
        System.out.println(Primes.nextPrime(8));
    }

    @Test
    void TR14() {
        // TR 14: n = 48 with TR [1,3,5,7,10,9,12] expected res = 53
        System.out.println(Primes.nextPrime(48));
    }

    @Test
    void TR15() {
        // TR 15: n = 208 with TR [1,3,5,7,11,9,13,14] expected res = 211
        System.out.println(Primes.nextPrime(208));
    }

    @Test
    void TR16() {
        // TR 16: n = 206 with TR [1,3,5,7,8,9,13,14] expected res = 211
        System.out.println(Primes.nextPrime(206));
    }

    @Test
    void TR17() {
        // TR 17: n= 205 with TR [1,3,5,7,10,9,13,14] expected res = 211
        System.out.println(Primes.nextPrime(205));
    }

    @Test
    void TR18() {
        // TR 18: n = 549 with TR [1,3,5,7,8,9,13,15,9,12] expected res = 557
        System.out.println(Primes.nextPrime(549));
    }

    @Test
    void TR19() {
        // TR 19: e=-1  with TR [1,2] expected res = IllegalArgumentException
        System.out.println(ArithmeticUtils.pow(10, -1));
    }

    @Test
    void TR20() {
        // TR 20: e=0, k=0 with TR [1,3,4,5] expected res = 1
        System.out.println(ArithmeticUtils.pow(0, 0));
    }

    @Test
    void TR21() {
        // TR 21: e=3, k=0 with TR [1,3,4,6] expected res = 0
        System.out.println(ArithmeticUtils.pow(0,3));
    }

    @Test
    void TR22() {
        // TR 22: e=3, k=1 with TR [1,3,7,8] expected res = 1
        int k = 1;
        int e = 3;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR23() {
        // TR 23: e=4, k=-1 with TR [1,3,7,9,10,11] expected res = 1
        int k = -1;
        int e = 4;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR24() {
        // TR 24: e=3, k=-1 with TR [1,3,7,9,10,12] expected res = -1
        int k = -1;
        int e = 3;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR25() {
        // TR 25: e=42, k=4 with TR [1,3,7,9,13,14] expected res = ArithmeticException
        int k = 4;
        int e = 42;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR26() {
        // TR 26: e=6, k=4 with TR [1,3,7,9,13,15,16,17,18,19] expected res = 4096
        int k = 4;
        int e = 6;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR27() {
        // TR 27: e=7, k=4 with TR [1,3,7,9,13,15,16,20,18,19] expected res =16384
        int k = 4;
        int e = 7;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR28() {
        // TR 28: e=11, k=4 with TR [1,3,7,9,13,15,16,17,18,21,16,17,18,19] expected res =4194304
        int k = 4;
        int e = 11;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR29() {
        // TR 29: e=12, k=4 with TR [1,3,7,9,13,15,16,20,19,21,16,20,18,19] expected res =16777216
        int k = 4;
        int e = 12;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

}