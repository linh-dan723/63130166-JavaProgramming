/**
 * Chương trình nhập chiều dài và chiều rộng của hình chữ nhật,
 * sau đó tính và xuất chu vi, diện tích, cạnh nhỏ nhất ra màn hình.
 */
package tiil.edu;

import java.util.Scanner;

/**
 * @author GAMING-PC
 */
public class ChuviDT {

    /**
     * Phương thức main() - Điểm vào của chương trình
     * @param args
     */
    public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài
        System.out.print("Nhập chiều dài: ");
        double dai = scanner.nextDouble();

        // Nhập chiều rộng
        System.out.print("Nhập chiều rộng: ");
        double rong = scanner.nextDouble();

        // Tính toán chu vi, diện tích, cạnh nhỏ nhất
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả ra màn hình
        System.out.printf("Chu vi: %.2f\n", chuVi);
        System.out.printf("Diện tích: %.2f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);

        // Đóng Scanner
        scanner.close();
    }
}
