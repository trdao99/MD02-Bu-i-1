import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String typeMoney;
        System.out.println("chọn loại tiền muốn quy đổi(USD/VND) ");
        typeMoney = sc.nextLine();
        if (typeMoney.equals("USD")) {
            float USD;
            System.out.println("nhập số tiền USD");
            USD = Float.parseFloat(sc.nextLine());
            System.out.println(USD+"usd" + " = " + USD * 24000 + "VND");
        }
        else if(typeMoney.equals("VND")) {
            float VND;
            System.out.println("nhập số tiền VND");
            VND = Float.parseFloat(sc.nextLine());
            System.out.println(VND+"VND" + " = " + (VND / 24000) + "USD");
        }
        else{
            System.out.println("hông có loại tiền này");
        }
    }
}
