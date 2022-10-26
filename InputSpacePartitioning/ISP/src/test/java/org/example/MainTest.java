package org.example;

import org.apache.commons.numbers.angle.CosAngle;
import org.apache.commons.numbers.core.ArithmeticUtils;
import org.apache.commons.numbers.core.Precision;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.numbers.arrays.*;

import java.util.Arrays;

class MainTest {

    @Test
    void TR1() {
        double[] a1_ascending = {-24, -2, 0, 3, 128, 3158};
        double[] a2_size4 = {3, 1, 42, 0};

        // TR 1: Initial array is in ascending order, being used for more than one argument, and another array is of a different size
        SortInPlace.ASCENDING.apply(a1_ascending, a1_ascending, a2_size4);
    }

    @Test
    void TR2() {
        // TR 2: Initial array is in ascending order, all arrays are of same size, all arrays are distinct in the argument
        double[] a1_ascending = {-24, -2, 0, 3, 128, 3158};
        double[] a2 = {42, 512, -123, 25, 0, 42};
        double[] a3 = {923, 5921, -95312, 1, 23, -92};

        System.out.println("Before:");
        System.out.println(Arrays.toString(a1_ascending));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));

        SortInPlace.ASCENDING.apply(a1_ascending, a2, a3);

        System.out.println("After:");
        System.out.println(Arrays.toString(a1_ascending));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
    }

    @Test
    void TR4() {
        // TR 4: Initial array is in descending order, all arrays are same size, same array is used for two args
        double[] a1_descending = {2512.12, 932.23, 512, 42};
        double[] a2 = {529.23, 152, -19853.21, 21};

        System.out.println("Before:");
        System.out.println(Arrays.toString(a1_descending));
        System.out.println(Arrays.toString(a2));

        SortInPlace.ASCENDING.apply(a1_descending, a1_descending, a2);

        System.out.println("After:");
        System.out.println(Arrays.toString(a1_descending));
        System.out.println(Arrays.toString(a2));
    }

    @Test
    void TR5() {
        // TR 5: Initial array is in descending order, some arrays have different size, all args are distinct arrays
        double[] a1_descending_5d = {2367.356, 986, 346.23, 0, -23};
        double[] a2_2d = {81412.54034 ,96968.63268};
        double[] a3_2d = {96789.98616 ,-3276.50780};

        System.out.println("Before:");
        System.out.println(Arrays.toString(a1_descending_5d));
        System.out.println(Arrays.toString(a2_2d));
        System.out.println(Arrays.toString(a3_2d));

        SortInPlace.ASCENDING.apply(a1_descending_5d, a2_2d, a3_2d);

        System.out.println("After:");
        System.out.println(Arrays.toString(a1_descending_5d));
        System.out.println(Arrays.toString(a2_2d));
        System.out.println(Arrays.toString(a3_2d));
    }

    @Test
    void TR6() {
        // TR 6: Initial array is in descending order, all arrays same size, same array is used for all args
        double[] a1_descending_5d = {21586.23, 5123.52, 346.23, -531, -25776.23};

        System.out.println("Before:");
        System.out.println(Arrays.toString(a1_descending_5d));

        SortInPlace.ASCENDING.apply(a1_descending_5d, a1_descending_5d, a1_descending_5d);

        System.out.println("After:");
        System.out.println(Arrays.toString(a1_descending_5d));
    }

    @Test
    void TR7() {
        // TR 7: Initial array is in no specific order, some arrays have different size, same array is used for 2 args
        double[] a1_no_order_5d = {42521.54474 ,49361.82632 ,78329.81913 ,26698.16149 ,54586.00311};
        double[] a2_3d = {-1841.87535 ,31433.65978 ,38165.52451};

        System.out.println("Before:");
        System.out.println(Arrays.toString(a1_no_order_5d));
        System.out.println(Arrays.toString(a2_3d));

        SortInPlace.ASCENDING.apply(a1_no_order_5d, a1_no_order_5d, a2_3d);

        System.out.println("After:");
        System.out.println(Arrays.toString(a1_no_order_5d));
        System.out.println(Arrays.toString(a2_3d));
    }

    @Test
    void TR8() {
        // TR 8: Initial array is in no specific order, all arrays same size, all args distinct
        double[] a1 = {57620.55854 ,50906.97646 ,9577.30448 ,61735.27867 ,14224.13176 ,41153.94638};
        double[] a2 = {70739.59943 ,-5486.80522 ,60022.46461 ,97257.00631 ,72061.75543 ,49839.44902};
        double[] a3 = {-4149.52655 ,63643.10852 ,60165.96815 ,28405.12362 ,16050.11970 ,94611.94512};

        System.out.println("Before:");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));

        SortInPlace.ASCENDING.apply(a1, a2, a3);

        System.out.println("After:");
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
    }

    @Test
    void TR10() {
        // TR 10: v1 values are 0, size of v1 > size of v2, entries of v1 = v2
        double[] v1_2d = {0 ,0};
        double[] v2_3d = {21730.45568 ,-4921.66757 ,10609.71538};
        double res = CosAngle.value(v1_2d, v2_3d);

        System.out.println(res);
    }

    @Test
    void TR11() {
        // TR 11: v1 values are not all 0, size of v1 > size of v2, entries of v1 does not equal v2
        double[] v1_2d = {34553.55157 ,58359.14676};
        double[] v2_3d = {21730.45568 ,-4921.66757 ,10609.71538};
        double res = CosAngle.value(v1_2d, v2_3d);

        System.out.println(res);
    }

    @Test
    void TR12() {
        // TR 12: v1 values are all 0, size of v1 > size of v2, entries of v1 does not equal v2
        double[] v1_2d = {34553.55157 ,58359.14676};
        double[] v2_3d = {21730.45568 ,-4921.66757 ,10609.71538};
        double res = CosAngle.value(v1_2d, v2_3d);

        System.out.println(res);
    }

    @Test
    void TR13() {
        // TR 13: v1 values are not all 0, size of v1 = size of v2, entries of v1 = v2
        double[] v1 = {96832.92535 ,25506.01037 ,96041.55751};
        double[] v2 = {96832.92535 ,25506.01037 ,96041.55751};
        double res = CosAngle.value(v1, v2);

        System.out.println(res);
    }

    @Test
    void TR14() {
        // TR 14: v1 values are all 0, size of v1 = size of v2, entries of v1 = v2
        double[] v1 = {0 ,0 ,0};
        double[] v2 = {0 ,0 ,0};
        double res = CosAngle.value(v1, v2);

        System.out.println(res);
    }

    @Test
    void TR15() {
        // TR 15: v1 values are not all 0, size of v1 = size of v2, entries of v1 does not equal v2
        double[] v1 = {9237.59150 ,57468.25417 ,38922.19659};
        double[] v2 = {43097.98279 ,-8150.83372 ,47354.83921};
        double res = CosAngle.value(v1, v2);

        System.out.println(res);
    }

    @Test
    void TR16() {
        // TR 16: v1 values are all 0, size of v1 < size of v2, entries of v1 does not equal v2
        double[] v1_3d = {0 ,0 ,0};
        double[] v2_2d = {65986.57623 ,25709.75429};
        double res = CosAngle.value(v1_3d, v2_2d);

        System.out.println(res);
    }

    @Test
    void TR17() {
        // TR 17: v1 values are not all 0, size of v1 < size of v2, entries of v1 = v2
        double[] v1_3d = {21730.45568 ,-4921.66757 ,10609.71538};
        double[] v2_2d = {21730.45568 ,-4921.66757};
        double res = CosAngle.value(v1_3d, v2_2d);

        System.out.println(res);
    }

    @Test
    void TR18() {
        // TR 18: v1 values are all 0, size of v1 < size of v2, entries of v1 = v2
        double[] v1_3d = {0 ,0 ,0};
        double[] v2_2d = {0 ,0};
        double res = CosAngle.value(v1_3d, v2_2d);

        System.out.println(res);
    }

    @Test
    void TR19() {
        // TR 19: K > 0, E > 0, the result of k^e would surpass 10 digits
        int k = 22;
        int e = 8;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR20() {
        // TR 20: K > 0, E = 0, the result of k^e would not surpass 10 digits
        int k = 100;
        int e = 0;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR21() {
        // TR 21: K > 0, E < 0, the result of k^e would surpass 10 digits
        int k = 20;
        int e = -29;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR22() {
        // TR 22: K = 0, E > 0, the result of k^e would not surpass 10 digits
        int k = 0;
        int e = 241;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR24() {
        // TR 24: K = 0, E < 0, the result of k^e would not surpass 10 digits
        int k = 0;
        int e = -29;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR25() {
        // TR 25: K < 0, E > 0, the result of k^e would surpass 10 digits
        int k = -29;
        int e = 14;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR26() {
        // TR 26: K < 0, E = 0, the result of k^e would not surpass 10 digits
        int k = -512;
        int e = 0;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

    @Test
    void TR27() {
        // TR 27: K < 0, E > 0, the result of k^e would not surpass 10 digits
        int k = -2;
        int e = 21;

        System.out.println( ArithmeticUtils.pow(k,e));
    }

}