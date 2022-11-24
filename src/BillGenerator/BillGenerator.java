package BillGenerator;

import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("По очереди введите Название, Цену и Количество закупленных вами товаров: ");
        while (true) {
            Bill position = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
            position.getReadyBill();

            System.out.println("Вы хотите ввести еще товары? Y - да, N - нет");
            if (scan.nextLine() == "Y") {
                Bill position1 = new Bill(scan.nextLine(), scan.nextInt(), scan.nextInt());
                position1.getReadyBill();
            } else if (scan.nextLine() == "N") {
                System.out.println("Завершение программы");
                break;
            }

        }


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
