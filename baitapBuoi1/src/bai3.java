import java.sql.SQLOutput;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("nhap so tu 1-999");
            num = sc.nextInt();
            int hangTram = num / 100;
            int hangChuc = num % 100 / 10;
            int hangDV = num % 10;
            String chuoi = "";

            switch (hangTram) {
                case 1:
                    chuoi = " one-Hundred";
                    break;
                case 2:
                    chuoi = " two-Hundred";

                    break;
                case 3:
                    chuoi = " three-Hundred";

                    break;
                case 4:
                    chuoi = " four-Hundred";

                    break;
                case 5:
                    chuoi = " five-Hundred";

                    break;
                case 6:
                    chuoi = " six-Hundred";

                    break;
                case 7:
                    chuoi = " seven-Hundred";

                    break;
                case 8:
                    chuoi = " eight-Hundred";

                    break;
                case 9:
                    chuoi = " nine-Hundred";
                    break;
            }

            if (hangChuc >= 2) {
                switch (hangChuc) {
                    case 2:
                        chuoi += " twenty";

                        break;
                    case 3:
                        chuoi += " thirsty";

                        break;
                    case 4:
                        chuoi += " forty";

                        break;
                    case 5:
                        chuoi += " fifty";

                        break;
                    case 6:
                        chuoi += " sixty";

                        break;
                    case 7:
                        chuoi += " seventy";

                        break;
                    case 8:
                        chuoi += " eighty";

                        break;
                    case 9:
                        chuoi += " ninety";
                        break;
                }
            }
            if (hangChuc == 1) {
                switch (hangDV) {
                    case 1:
                        chuoi += " eleven";
                        break;

                    case 2:
                        chuoi += " twenteen";

                        break;
                    case 3:
                        chuoi += " thirsteen";

                        break;
                    case 4:
                        chuoi += " forteen";

                        break;
                    case 5:
                        chuoi += " fifteen";

                        break;
                    case 6:
                        chuoi += " sixteen";

                        break;
                    case 7:
                        chuoi += " seventeen";

                        break;
                    case 8:
                        chuoi += " eighteen";

                        break;
                    case 9:
                        chuoi += " nineteen";
                        break;
                }
            }
            if (hangChuc != 1) {
                switch (hangDV) {
                    case 1:
                        chuoi += " one";
                        break;
                    case 2:
                        chuoi += " two";

                        break;
                    case 3:
                        chuoi += " three";

                        break;
                    case 4:
                        chuoi += " four";

                        break;
                    case 5:
                        chuoi += " five";

                        break;
                    case 6:
                        chuoi += " six";

                        break;
                    case 7:
                        chuoi += " seven";

                        break;
                    case 8:
                        chuoi += " eight";

                        break;
                    case 9:
                        chuoi += " nine";
                        break;
                }
            }
            System.out.println(chuoi);
        }
    }
}

