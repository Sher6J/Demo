package cn.sher6j.corejava;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author sher6j
 * @create 2020-05-08-17:01
 */
public class TreeSetTest {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        TreeSet<String> set = new TreeSet<>();
        set.add("bb");
        set.add("cc");
        set.add("aa");
        set1.add("bb");
        set1.add("cc");
        set1.add("aa");
        set.forEach(System.out::println);
        set1.forEach(System.out::println);
    }



}
