import java.util.Scanner;
import java.util.Arrays;

public class home {
    public static void main(String[] args) {
        //one();
        //two();
        //three();
        //four();
//        print(22);
//        print(22, 44);
//        print(22, 'a');
//        print(2);
//        print("asd", 33);
//        print("asd", 's');
        //six(4);
        seven();


    }

    public static void one() {
        //Создать массив на 10 чисел, ввести все элементы через консоль. Посчитать количество
        // отрицательных чисел, вывести его на экран.
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) a++;

        }
        System.out.println("Количество отрицательных элементов равно " + a);
    }

    public static void two() {
        //Проинициализировать массив на 1000 случайных чисел. Вычислить среднее арифметическое первых 250 чисел,
        // вторых 250 чисел и т.д. Вывести на экран средние арифметические всех четырех диапазонов. Найти наибольший
        // из них и вывести на экран
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + (Math.random() * (501 - 1)));
        }
        int a = 0;
        for (int i = 0; i < arr.length - 750; i++) {
            a = a + arr[i];
        }
        System.out.println("Среднее число первого деапазона = " + a / 250);

        int b = 0;
        for (int i = 250; i < arr.length - 500; i++) {
            b = b + arr[i];
        }
        System.out.println("Среднее число второго деапазона = " + b / 250);

        int c = 0;
        for (int i = 500; i < arr.length - 250; i++) {
            c = c + arr[i];
        }
        System.out.println("Среднее число третьего деапазона = " + c / 250);

        int d = 0;
        for (int i = 750; i < arr.length; i++) {
            d = d + arr[i];
        }
        System.out.println("Среднее число четвёртого деапазона = " + d / 250);

        if (a > b && a > c && a > d) System.out.println("Среднее число первго диапазона наибольшее " + a / 250);
        if (b > a && b > c && b > d) System.out.println("Среднее число второго диапазона наибольшее " + b / 250);
        if (c > a && c > b && c > d) System.out.println("Среднее число третьего диапазона наибольшее " + c / 250);
        if (d > a && d > b && d > c) System.out.println("Среднее число четвёртого диапазона наибольшее = " + d / 250);
    }

    public static void three() {
        //Дано число N и два массива разных размеров (размер каждого массива больше либо равен N). Массивы считаются
        // похожими, если содержат N одинаковых элементов. Написать программу, которая на основании двух массивов
        // сообщает, похожи ли они..
        System.out.println("Какое количество элементов массива должно совпасть?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[40];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + (Math.random() * (51 - 1)));
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[40];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = (int) (1 + (Math.random() * (51 - 1)));
        }
        System.out.println(Arrays.toString(arr2));
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++)
                if (arr[i] == arr2[j]) {
                    a++;
                }
        }
        if (a < n) System.out.println("Массивы не похожи, найдено " + a + " совпадений");
        else System.out.println("Массивы похожи, найдено " + a + " совпадений");


    }

    public static void four() {
        //Создать массив размерностью в 1 элемент. Намеренно вызвать элемент по индексу за пределами массива.
        // Обработать исключение ArrayOutOfBoundsException при помощи try/catch, в блоке catch вывести сообщение
        // о выходе за границы массива.
        int[] arr = new int[1];
        try {
            arr[2] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }

    //Создать пять методов print с разными сигнатурами, внутри них выводить все переданные переменные в консоль.
    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(int a, int b) {
        System.out.println(a + b);
    }

    public static void print(String a, int b) {
        System.out.println(a + b);
    }

    public static void print(int a, char b) {
        System.out.println(a + b);
    }

    public static void print(String a, char b) {
        System.out.println(a + b);
    }

    public static void six(int intValue) {
        //Есть конструкция вида if (intValue == 3) { print(“first”); } else if (intValue == 4) { print(“second”);
        // } else { print(“third”); } Привести ее к оператору switch/case.
        switch (intValue) {
            case 3:
                System.out.println("first");
                break;
            case 4:
                System.out.println("second");
                break;
            default:
                System.out.println("third");
        }
    }

    public static void seven() {
        //Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке,
        // разделяя их пробелами или новыми строками.
        //При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
        // Разрешена только рекурсия и целочисленная арифметика.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int first = n %10;
        int second = n/10%10;
        int thrid = n/100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(thrid);

    }


}