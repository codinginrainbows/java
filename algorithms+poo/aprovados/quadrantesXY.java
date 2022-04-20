import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o valor do eixo X: ");
        int eixoX = scanner.nextInt();
        System.out.print("digite o valor do eixo Y: ");
        int eixoY = scanner.nextInt();

        if (eixoX > 0 && eixoY < 0) {
            System.out.println("quadrante UM");
        } else if (eixoX > 0 && eixoY > 0) {
            System.out.println("quadrante DOIS");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.println("quadrante TRES");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.println("quadrante QUATRO");
        } else if (eixoX == 0 && eixoY != 0) {
            System.out.println("no eixo");
        } else if (eixoX != 0 && eixoY == 0) {
            System.out.println("no eixo");
        } else if (eixoX == 0 && eixoY == 0) {
            System.out.println("origem!");
        }
    }
}
