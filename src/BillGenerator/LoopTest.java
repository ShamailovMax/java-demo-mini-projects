package BillGenerator;

import java.util.Scanner;

// ТУПО ПРОВЕРКА РАБОТЫ ОСНОВНОГО АЛГОРИТМА - НЕ НУЖЕН ДЛЯ УСПЕШНОЙ КОМПИЛЯЦИИ ПРОГРАММЫ
// РАБОТАЕТ
public class LoopTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i;

        do {
            System.out.println("if u want exit type 0, if no - any else: ");
            i = scan.nextInt();

        } while (i != 0);
    }
}
