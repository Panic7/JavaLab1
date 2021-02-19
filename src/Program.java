import java.util.Scanner;

public class Program {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        zavd1();
        zavd2_1();
        zavd2_2();
        zavd3_A1();
        zavd3_A2();
        zavd3_B1();
        zavd3_B2();
        zavd4_A();
        zavd4_B();
    }

    static void zavd4_B() //Дано цілочислову матрицю А розмірності n*m. Знайти кількість входжень максимального та мінімального елементів.(заповнення рандомно)
    {
        System.out.println("Завдання 4(B)");
        int[][] matr;
        int min=0, max=0, countMax = 0, countMin = 0;
        byte n = 0, m = 0;
        while(n<=0)
        {
            System.out.print("Введіть кількість рядочків матриці(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть кількість рядочків матриці(1 - 127): ");
                in.next();
            }
            n = in.nextByte();
        }
        while(m<=0)
        {
            System.out.print("Введіть кількість стовпців матриці(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть кількість стовпців матриці(1 - 127): ");
                in.next();
            }
            m = in.nextByte();
        }
        matr = new int[n][m];
        System.out.println("Заповнена рандомно матриця:");

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matr[i][j] = (int) ((Math.random()*(200+1)) - 100);
                if(j == 0 && i == 0){ min = matr[i][j]; max = min; }
                if (min > matr[i][j]) min = matr[i][j];
                if (max < matr[i][j]) max = matr[i][j];
            }
        }
        System.out.println("Введена матриця: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(matr[i][j] + "\t");
                if (min == matr[i][j]) countMin++;
                if (max == matr[i][j]) countMax++;
            }
            System.out.println();
        }
        System.out.println("Кількість входжень максимального елементу: " + countMax);
        System.out.println("Кількість входжень мінімального елементу: " + countMin);
    }

    static void zavd4_A() //Дано цілочислову матрицю А розмірності n*m. Знайти кількість входжень максимального та мінімального елементів.(ввід з консолі)
    {
        System.out.println("Завдання 4(A)");
        int[][] matr;
        int min=0, max=0, countMax = 0, countMin = 0;
        byte n = 0, m = 0;
        while(n<=0)
        {
            System.out.print("Введіть кількість рядочків матриці(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть кількість рядочків матриці(1 - 127): ");
                in.next();
            }
            n = in.nextByte();
        }
        while(m<=0)
        {
            System.out.print("Введіть кількість стовпців матриці(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть кількість стовпців матриці(1 - 127): ");
                in.next();
            }
            m = in.nextByte();
        }
        matr = new int[n][m];
        System.out.println("Заповніть матрицю:");

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print("Введіть [" + (i+1) + "][" + (j+1) + "]елемент матриці: ");
                while(!in.hasNextInt())
                {
                    System.out.print("Введіть [" + (i+1) + "][" + (j+1) + "] елемент матриці: ");
                    in.next();
                }
                matr[i][j] = in.nextInt();
                if(j == 0 && i == 0){ min = matr[i][j]; max = min; }
                if (min > matr[i][j]) min = matr[i][j];
                if (max < matr[i][j]) max = matr[i][j];
            }
        }
        System.out.println("Введена матриця: ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(matr[i][j] + "\t");
                if (min == matr[i][j]) countMin++;
                if (max == matr[i][j]) countMax++;
            }
            System.out.println();
        }
        System.out.println("Кількість входжень максимального елементу: " + countMax);
        System.out.println("Кількість входжень мінімального елементу: " + countMin);
    }

    static void zavd3_B1()//Масив ввести рандомно і Визначити кількість від’ємних елементів масиву
    {
        System.out.println("Завдання 3.1(В)");
        byte n = 0 , count = 0;
        while(n<=0)
        {
            System.out.print("Введіть розмірність масиву(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть розмірність масиву(1 - 127): ");
                in.next();
            }
            n = in.nextByte();
        }
        int[] array = new int[n];
        System.out.println("Рандомно заповнений масив:");
        for(int i = 0; i < n;i++)
        {
            array[i] = (int) ((Math.random()*(200+1)) - 100);
            System.out.print(array[i] + "\t");
            if(array[i] < 0) count++;
        }
        System.out.println("\nКількість від'ємних елементів масиву = " + count);
    }
    
    static void zavd3_B2()//Масив ввести рандомно і визначити суму елементів масиву, розташованих після мінімального за модулем елемента.
    {
        System.out.println("Завдання 3.2(В)");
        byte n = 0; int min=0; byte cnt = 0;
        int suma = 0;
        byte index = 0;
        while(n<=0) {
            System.out.print("Введіть розмірність масиву(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть розмірність масиву(1 - 127): ");
                in.next();
            }
            n = in.nextByte();
        }
        int[] array = new int[n];
        System.out.println("Рандомно заповнений масив:");
        for(byte i = 0; i < n;i++) {
            array[i] = (int) ((Math.random()*(200+1)) - 100);
            System.out.print(array[i] + "\t");
            if(i==0) min = array[i];
            if(Math.abs(min) > Math.abs(array[i])) {min = array[i]; index = i;}
        }
        for (int ar : array)
        {
            if(ar == min) cnt++;
        }
        if(cnt >=2) {System.out.println("В масиві немає мінімального елементу."); return;}
        index+=1;
        for(byte i = index; i<array.length;i++)
        {
            suma+=array[i];
        }
        index -= 1;
        System.out.print("\nСума елементів масиву, розташованих після мінімального за модулем елемента = " + suma);
    }

    static void zavd3_A2()//Ввід масиву вручну і визначити суму елементів масиву, розташованих після мінімального за модулем елемента.
    {
        System.out.println("Завдання 3.2(А)");
        byte n = 0;
        byte cnt = 0;
        int min=0;
        int suma = 0;
        byte index = 0;
        while(n <= 0)
        {
            System.out.print("Введіть розмірність масиву(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть розмірність масиву(1 - 127): ");
                in.next();
            }
            n = in.nextByte();
        }
        int[] array = new int[n];
        for(byte i = 0; i < n;i++) {
            System.out.print("Введіть " + (i + 1) + " елемент масиву:  ");
            while (!in.hasNextInt()) {
                System.out.print("Введіть " + (i + 1) + " елемент масиву:  ");
                in.next();
            }
            array[i] = in.nextInt();
            if(i==0) min = array[i];
            if(Math.abs(min) > Math.abs(array[i])) {min = array[i]; index = i;}
        }
        for (int ar : array)
        {
            if(ar == min) cnt++;
        }
        if(cnt >=2) {System.out.println("В масиві немає мінімального елементу."); return;}
        index+=1;
        for(byte i = index; i<array.length;i++)
        {
            suma+=array[i];
        }
        index-=1;
        System.out.print("Сума елементів масиву, розташованих після мінімального за модулем елемента = " + suma);
    }

    static void zavd3_A1()//ввід масиву вручну і Визначити кількість від’ємних елементів масиву
    {
        System.out.println("Завдання 3.1(А)");
        byte n = 0, count = 0;
        while(n<=0) {
            System.out.print("Введіть розмірність масиву(1 - 127): ");
            while (!in.hasNextByte()) {
                System.out.print("Введіть розмірність масиву(1 - 127): ");
                in.next();
            }
            n = in.nextByte();
        }
        int[] array = new int[n];
        for(int i = 0; i < n;i++)
        {
            System.out.print("Введіть "+ (i+1) +" елемент масиву:  ");
                while (!in.hasNextInt()) {
                    in.next();
                }
            array[i] = in.nextByte();
            if(array[i] < 0) count++;
        }
        System.out.println("Кількість від'ємних елементів масиву = " + count);
    }

    static void zavd2_1()//do_while
    {
        float a = 1f ,dx = 0.025f;
        int b = 2;
        System.out.println("x\t\t|\ty=log2(x)");
        while (a<b)
        {

            System.out.printf("%.3f\t|\t%.3f\n", a, Math.log(a)/Math.log(2));
            a+=dx;
        }
    }
    static void zavd2_2()//while_do
    {
        float a = 1f ,dx = 0.025f;
        int b = 2;
        System.out.println("x\t\t|\ty=log2(x)");
        do
        {

            System.out.printf("%.3f\t|\t%.3f\n", a, Math.log(a)/Math.log(2));
            a+=dx;
        }
        while (a<b);
    }

    static void zavd1()
    {
        int n;
        boolean check = false ;
        System.out.println("Завдання 1.\nВведіть поштовий індекс міста:");
        n = in.nextInt();
        while(!check) {
            switch (n) {
                case 58000 -> {
                    System.out.println("Мі1сто: Чернівці\n");
                    check = true;
                }
                case 64424 -> {
                    System.out.println("Місто: Абазовка\n");
                    check = true;
                }
                case 67632 -> {
                    System.out.println("Місто: Августовка\n");
                    check = true;
                }
                case 19161 -> {
                    System.out.println("Місто: Аврамовка\n");
                    check = true;
                }
                case 27620 -> {
                    System.out.println("Місто: Аджамка\n");
                    check = true;
                }
                case 91484 -> {
                    System.out.println("Місто: Александровск\n");
                    check = true;
                }
                case 41346 -> {
                    System.out.println("Місто: Алтыновкач\n");
                    check = true;
                }
                case 15560 -> {
                    System.out.println("Місто: Анисов\n");
                    check = true;
                }
                case 28153 -> {
                    System.out.println("Місто: Антонины\n");
                    check = true;
                }
                case 16261 -> {
                    System.out.println("Місто: Атюша\n");
                    check = true;
                }
                default -> {
                    System.out.println("Індекса " + n + " немає в базі. Введіть новий поштовий індекс:");
                    n = in.nextInt();
                }
            }
        }
    }
}