package ru.netology.javaqa.javaqamvnsecond.sqrservice;

public class SqrService {

    public int calqSqrt(int x, int y) {


        int count = 0;

        for (int i = 10; i <= 99; i++) {

            if ((i * i > x) && (i * i < y)) {

                count = count + 1;

            }
        }
        return count;
    }
}
