import java.util.Scanner;

public class baitap05042021 {
    public static boolean kiemTraSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean kiemTraSoChanLe(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean kiemTraSoChinhPhuong(int number) {
        if (Math.sqrt(number) % 1 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Nhập phương án bạn muốn: ");
        System.out.println("1. Kiểm tra số nguyên tố");
        System.out.println("2. Kiểm tra số chẵn lẻ");
        System.out.println("3. Kiểm tra số chính phương");
        System.out.println("4. Thoát chương trình");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 4) {
            System.out.println("Nhập số bạn muốn kiểm tra: ");
            int soNhap = sc.nextInt();
            switch (a) {
                case 1: {
                    if (kiemTraSoNguyenTo(soNhap)) {
                        System.out.println(soNhap + " là số nguyên tố");
                        break;
                    }
                    System.out.printf(soNhap + " không là số nguyên tố");
                    break;
                }
                case 2: {
                    if (kiemTraSoChanLe(soNhap)) {
                        System.out.println(soNhap + " là số chẵn");
                        break;
                    }
                    System.out.println(soNhap + " là số lẻ");
                    break;
                }
                case 3: {
                    if (kiemTraSoChinhPhuong(soNhap)) {
                        System.out.println(soNhap + " là số chính phương");
                        break;
                    }
                    System.out.println(soNhap + " không là số chính phương");
                    break;
                }
            }
        }
    }
}
