package ru.gb.core;

import java.util.Random;

public class SecondsGetter {
    public static int getSeconds() {
        Random rnd = new Random();
        return rnd.nextInt(3, 7);
    }
}
