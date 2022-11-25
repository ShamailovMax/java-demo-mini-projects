package BillGenerator;

import java.util.Objects;
import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("По очереди введите Название, Цену и Количество закупленных вами товаров: ");
        Bill position = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
        position.getReadyBill();

        // TODO: 25.11.2022 заменить цикл на файловое дополнение


        System.out.println("Если вы хотите закончили работу с программой, введите 0, если нет - введите любое число от 1 до 9: ");
        int i = scan.nextInt();
//        do {
////            i = scan.nextInt();
//            System.out.println("Окей, введите еще одну позицию по тому же принципу: ");
//            Bill position1 = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
////            System.out.println("");
//            position1.getReadyBill();
//
//        } while (i != 0);

        while (i != 0) {
            System.out.println("Окей, введите еще одну позицию по тому же принципу: ");
//            Bill position1 = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
//            position1.getReadyBill();
            String name = scan.nextLine();
//            scan.close();
            i = scan.nextInt();
        }


//            Bill position = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
//            position.getReadyBill();

//            System.out.println("Вы хотите ввести еще товары? Y - да, N - нет");
//            String idx = scan.nextLine();

//            String keyWord;
//
//            do {
//                Bill position1 = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
//                position1.getReadyBill();
//                System.out.println("Если на этом все, завершите выполнение словом exit");
//                keyWord = scan.nextLine();
//            } while (Objects.equals(keyWord, "exit"));

//            if (idx == "Y") {
//                Bill position1 = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
//                position1.getReadyBill();
//            } else if (idx == "N") {
//                System.out.println("Завершение программы");
//                break;
//            }



//        Bill position2 = new Bill("Макароны", 70, 4);
//        position2.getReadyBill();
    }
}

class Bill {
    private String productName;
    private int productPrice;
    private int positionCount;

    public Bill(String productName, int productPrice, int positionCount) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.positionCount = positionCount;
    }

    public void getReadyBill() {
        String result = String.format("%s ... %d рублей (%d шт.)", productName, productPrice, positionCount);
        System.out.println(result);
    }
}
