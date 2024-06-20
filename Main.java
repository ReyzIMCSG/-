public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(isSumInRange(5, 10));
        printNumberSign(-3);
        System.out.println(isNegative(-5));
        printStringMultipleTimes("Hello", 3);
        System.out.println(isLeapYear(2024));
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        flipBinaryArray(binaryArray);
        printArray(binaryArray);
        int[] hundredArray = createSequentialArray(100);
        printArray(hundredArray);
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(array);
        printArray(array);
        int[][] squareArray = createDiagonalArray(5);
        print2DArray(squareArray);
        int[] filledArray = createArrayWithInitialValue(5, 7);
        printArray(filledArray);
    }

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign() {
        int a = 6;
        int b = -3;
        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void printColor() {
        int value = 1231;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 1;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6.
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // 7.
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8.
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9.
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10.
    public static void flipBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            }
            else{
                array[i] = 1;
            }
        }
    }

    // Вывод массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 11.
    public static int[] createSequentialArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 12.
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 13.
    public static int[][] createDiagonalArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[size-1-i][i] = 1;
        }
        return array;
    }

    // Вывод матрицы
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 14.
    public static int[] createArrayWithInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}