package cn.sher6j.corejava;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

/**
 * @author sher6j
 * @create 2020-05-06-11:06
 */
public class test01 {
    public static void main(String[] args) {
        int n = 123456789;
        float f = n;
        System.out.println(f);

        System.out.println((byte)300);

        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TEN);

        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Integer a = 1;
        Integer b = 2;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);

        Random random = new Random();
        System.out.println(random);
        System.out.println(random.nextInt(10));

        System.out.println(System.out.hashCode());
        System.out.println(System.out);

        System.out.println(Double.NEGATIVE_INFINITY);

        double doubleValue = -1.0 / 0.0;  //-Infinity
//        int intValue = -1 / 0;  //java.lang.ArithmeticException: / by zero
        System.out.println(doubleValue);
//        System.out.println(intValue);

    }

    public static void swap(Integer x,Integer y) {
        Integer temp = x;
        x = y;
        y = temp;
    }
}
