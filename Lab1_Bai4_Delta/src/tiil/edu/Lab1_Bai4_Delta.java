/**
 * Chương trình nhập các hệ số của phương trình bậc 2,
 * tính delta và xuất căn delta ra màn hình.
 */
package tiil.edu;

import java.util.Scanner;

/**
 * @author GAMING-PC
 */
public class Lab1_Bai4_Delta {

    /**
     * Phương thức main() - Điểm vào của chương trình
     * @param args
     */
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập hệ số a, b, c
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // Tính căn delta
        double canDelta = Math.sqrt(delta);

        // Xuất kết quả
        System.out.printf("Delta: %.2f\n", delta);
        System.out.printf("Căn Delta: %.2f\n", canDelta);

        // Đóng Scanner
        scanner.close();
    }
}
