/**
 * Chương trình nhập cạnh của khối lập phương, sau đó tính và xuất thể tích.
 */
package tiil.edu;

import java.util.Scanner;

/**
 * @author GAMING-PC
 */
public class Lab1_Bai3_TheTich {

    /**
     * Phương thức main() - Điểm vào của chương trình
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = scanner.nextDouble();

        double theTich = Math.pow(canh, 3);

        System.out.printf("Thể tích của khối lập phương: %.2f\n", theTich);

        scanner.close();
    }
}
