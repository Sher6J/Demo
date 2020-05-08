package cn.sher6j.corejava;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author sher6j
 * @create 2020-05-08-16:02
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();

        staff.add("aa");
        staff.add("bb");
        staff.add("cc");

        ListIterator<String> iter = staff.listIterator();

        System.out.println(iter.next());
        iter.add("dd");
        System.out.println(iter.next());
        iter.add("ee");
        iter.add("ff");
        System.out.println("=============");
        staff.forEach(System.out::println);
    }
}
