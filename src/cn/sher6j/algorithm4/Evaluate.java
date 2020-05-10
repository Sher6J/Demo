package cn.sher6j.algorithm4;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author sher6j
 * @create 2020-05-10-10:50
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>(); //运算符栈
        Stack<Double> vals = new Stack<>(); //操作数栈
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString(); //读取字符

            //忽略左括号
            if (s.equals("(")){ }
            //如果是运算符， 将运算符压入运算符栈
            else if (s.equals("+")) {
                ops.push(s);
            } else if (s.equals("-")) {
                ops.push(s);
            } else if (s.equals("*")) {
                ops.push(s);
            } else if (s.equals("/")) {
                ops.push(s);
            } else if (s.equals("sqrt")) {
                ops.push(s);
            }
            //如果是")"，弹出一个运算符，弹出所需数量的操作数，将运算符和操作数的运算结果压入操作数栈
            else if (s.equals(")")) {
                String op = ops.pop();
                Double val = vals.pop();
                if (op.equals("+")) {
                    val = vals.pop() + val;
                } else if (op.equals("-")) {
                    val = vals.pop() - val;
                } else if (op.equals("*")) {
                    val = vals.pop() * val;
                } else if (op.equals("/")) {
                    val = vals.pop() / val;
                } else if (op.equals("sqrt")) {
                    val = Math.sqrt(val);
                }
                vals.push(val);
            }
            //如果是操作数，则操作数入操作数栈
            else {
                vals.push(Double.parseDouble(s));
            }
        }
        //处理完后操作数栈上只有一个值，就是表达式的值
        StdOut.println(vals.pop());
    }
}
