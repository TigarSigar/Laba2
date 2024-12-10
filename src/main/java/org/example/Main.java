package org.example;
import geometry2d.*;
import geometry3d.*;
import exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1:");
        Button button = new Button();
        button.click();
        button.click();
        button.click();
        button.click();
        System.out.println();

        // Задание 2
        System.out.println("Задание 2:");
        Balance balance = new Balance();
        balance.addLeft(23);
        balance.addRight(1);
        balance.showResult();
        System.out.println();

        // Задание 3
        System.out.println("Задание 3:");
        Bell bell = new Bell();
        bell.sound();
        System.out.println();

        // Задание 4
        System.out.println("Задание 4:");
        OddEvenSeparator oddEvenSeparator = new OddEvenSeparator();
        oddEvenSeparator.addNumber(1);
        oddEvenSeparator.addNumber(4);
        oddEvenSeparator.addNumber(2);
        System.out.print("Четные: ");
        oddEvenSeparator.showEven();
        System.out.print("Нечетные: ");
        oddEvenSeparator.showOdd();
        System.out.println();

        // Задание 5
        System.out.println("Задание 5:");
        Table table = new Table(6, 6);
        System.out.println("Количество строк: " + table.getRowCount());
        System.out.println("Количество столбцов: " + table.getColumnCount());
        table.setValue(2, 2, 5);
        table.setValue(3, 3, 5);
        System.out.println("Значение в (2, 2): " + table.getValue(, 2));
        System.out.println("Таблица:");
        System.out.println(table);
        System.out.println("Среднее значение: " + table.getAverage());
        System.out.println();
    }
}

class Button {
    private int clickCount = 0;

    public void click() {
        clickCount++;
        System.out.println("Кнопка нажата " + clickCount + " раз(а)");
    }
}

class Balance {
    private int leftWeight = 0;
    private int rightWeight = 0;

    public void addLeft(int weight) {
        leftWeight += weight;
    }

    public void addRight(int weight) {
        rightWeight += weight;
    }

    public void showResult() {
        if (leftWeight == rightWeight) {
            System.out.println("Баланс: =");
        } else if (leftWeight > rightWeight) {
            System.out.println("Баланс: L");
        } else {
            System.out.println("Баланс: R");
        }
    }
}

class Bell {
    public void sound() {
        System.out.println("ding");
        System.out.println("dong");
    }
}

class OddEvenSeparator {
    private final List<Integer> oddNumbers = new ArrayList<>();
    private final List<Integer> evenNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void showOdd() {
        System.out.println(oddNumbers);
    }

    public void showEven() {
        System.out.println(evenNumbers);
    }
}

class Table {
    private final int[][] data;

    public Table(int rows, int cols) {
        data = new int[rows][cols];
    }

    public int getRowCount() {
        return data.length;
    }

    public int getColumnCount() {
        return data[0].length;
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public double getAverage() {
        int sum = 0;
        int count = 0;
        for (int[] row : data) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int[] row : data) {
            for (int value : row) {
                builder.append(value).append(" ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
