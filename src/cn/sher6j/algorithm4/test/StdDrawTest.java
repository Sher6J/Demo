package cn.sher6j.algorithm4.test;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author sher6j
 * @create 2020-05-10-10:18
 */
public class StdDrawTest {

    /**
     * 表1.1.20 函数值
     */
    @Test
    public void test1() throws InterruptedException {
        int N = 100;
        StdDraw.setXscale(0, N); //x轴的范围
        StdDraw.setYscale(0, N * N); //y轴的范围
        StdDraw.setPenRadius(.01); //画笔粗细
        for (int i = 0; i < N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
        Thread.currentThread().sleep(5000);
    }

    /**
     * 表1.1.20 随机数组
     * @throws InterruptedException
     */
    @Test
    public void test2() throws InterruptedException {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random(); //生成0-1的随机数
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
        Thread.currentThread().sleep(5000);
    }

    /**
     * 表1.1.20 已排序的随机数组
     */
    @Test
    public void test3() throws InterruptedException {
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random(); //生成0-1的随机数
        }
        Arrays.sort(a);
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
        Thread.currentThread().sleep(5000);
    }
}
