import java.util.Scanner;

public class BAI4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float width;
        float height;
        System.out.println("nhap chieu rong:");
        width = Float.parseFloat(sc.nextLine());
        System.out.println("nhap chieu dai:");
        height = Float.parseFloat(sc.nextLine());
        System.out.println("chu vi = " + (width + height) * 2);
        System.out.println("dien tich = " + (width * height));
    }
}