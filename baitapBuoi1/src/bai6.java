import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.println("nhap so bat ki: ");
        num = Float.parseFloat(sc.nextLine());
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("so chia het cho 3 va 5");
        } else if (num % 5==0) {
            System.out.println("so chia het cho 5");
        } else if (num % 3==0) {
            System.out.println("so chia het cho 3");
        }
        else{
                System.out.println("số không chia hết cho 3 và 5");
            }
        }
    }

