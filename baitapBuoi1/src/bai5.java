import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float toan;
        float van;
        float ly;
        float hoa;
        float anh;

        System.out.println("nhap diem toan:");
        toan = Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem anh:");
        anh = Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem van:");
        van = Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem ly:");
        ly = Float.parseFloat(sc.nextLine());
        System.out.println("nhap diem hoa:");
        hoa = Float.parseFloat(sc.nextLine());
        float diemTB =  (hoa+ly+toan+van+anh)/5;
        System.out.println("diem trung binh: "+diemTB );
    if(diemTB >= 0 && diemTB<5){
        System.out.println("Xếp loại yếu");
    }
    else if(diemTB >=5 && diemTB<6.5){
        System.out.println("Xếp loại trung bình.");
    }else if(diemTB >=6.5 && diemTB<8){
        System.out.println("Xếp loại khá.");
    }else if(diemTB >=8 && diemTB<9){
        System.out.println("Xếp loại giỏi");
    }else if(diemTB >=9){
        System.out.println("Xếp loại xuất sắc");
    }
    else{
        System.out.println("ko hop le");
    }
    }
}

