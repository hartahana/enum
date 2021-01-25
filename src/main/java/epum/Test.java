//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package epum;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public Test() {
    }

    //ввод данных с обработкой ошибки

    public static void main(String[] args) throws IOException {
        System.out.println("Введите длину массива");
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        int c = in2.nextInt();
        epum.Series series = new epum.Series(c);
        System.out.println("Введите данные массива");
        for(int i = 0; i < c; ++i) {
            String a = in.nextLine();

            try {
                int b = Integer.parseInt(a);
                series.addItem(b);
            } catch (InputMismatchException var10) {
                System.out.println("Ошибка. Невозможно преобразовать строку в число. Программа будет закрыта!");
            }
        }

        System.out.println("Введите тип операции (min/max/avg):");
        String oper = in.nextLine();
        epum.Result result = new epum.Result(series.getItem(), oper);
        result.Oper();

        for(int i = 0; i < result.array.length; ++i) {
            int var1 = result.array[i];
            System.out.println(var1 + " ");
        }

        System.out.println(result.oper + " " + result.result);
    }
}
