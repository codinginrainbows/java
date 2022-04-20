import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 0, precoDoPlano = 0;

        while (idade != -1) {
            System.out.print("qual sua idade? ");
            idade = scanner.nextInt();

            if (idade == -1) {
                break;
            } else if (idade < 10) {
                precoDoPlano = precoDoPlano + 100 + 80;
            } else if (idade >= 10 && idade <= 30) {
                precoDoPlano = precoDoPlano + 100 + 50;
            } else if (idade >= 40 && idade <= 60) {
                precoDoPlano = precoDoPlano + 100 + 95;
            } else if (idade > 60) {
                precoDoPlano = precoDoPlano + 100 + 130;
            }
        }

        System.out.println(precoDoPlano);
    }
}
