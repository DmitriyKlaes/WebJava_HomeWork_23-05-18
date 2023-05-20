package ru.gb.core;

public class Remover {

    public void kernelRemove() {
        int currentSeconds = SecondsGetter.getSeconds();
        timer(currentSeconds);
    }

    private void timer(int numberOfTimes) {
        System.out.println("Удаление ядра через:");
        for (int i = numberOfTimes; i > 0; i--) {
            System.out.printf("%d...%n", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Ошибка удаления ядра! Перезапустите программу!");
    }
}
