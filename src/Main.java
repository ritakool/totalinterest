import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double money;
        double interestRate;
        byte month;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thang ban gui: ");
        month = sc.nextByte();

        System.out.println("Nhap so tien ban gui: ");
        money = sc.nextDouble();

        System.out.println("Nhap lai: ");
        interestRate = sc.nextDouble();

        double totalinterest = 0;
        for (int i = 0; i < month; i++){
            totalinterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("lai suat la: " + totalinterest);
    }
}