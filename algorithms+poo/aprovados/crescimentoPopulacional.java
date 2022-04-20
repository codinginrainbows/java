import java.util.Scanner;

public class crescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anos = 0;
        int taxaDeCrescimentoPrimeiroPais = 0, taxaDeCrescimentoSegundoPais = 0;

        System.out.print("informe a populacao do PRIMEIRO pais: ");
        int primeiroPaisPopulacao = scanner.nextInt();

        System.out.print("informe a taxa de crescimento do PRIMEIRO pais: ");
        double primeiroPaisCrescimento = scanner.nextDouble();

        System.out.print("informe a populacao do SEGUNDO pais: ");
        int segundoPaisPopulacao = scanner.nextInt();

        System.out.print("informe a taxa de crescimento do SEGUNDO pais: ");
        double segundoPaisCrescimento = scanner.nextDouble();

        if (primeiroPaisPopulacao == 0 || segundoPaisPopulacao == 0) {
            System.out.println("FIM");
        } else {
            while (segundoPaisPopulacao <= primeiroPaisPopulacao) {
                taxaDeCrescimentoPrimeiroPais = (int) (primeiroPaisPopulacao * primeiroPaisCrescimento) / 100;

                taxaDeCrescimentoSegundoPais = (int) (segundoPaisPopulacao * segundoPaisCrescimento) / 100;

                primeiroPaisPopulacao += taxaDeCrescimentoPrimeiroPais;

                segundoPaisPopulacao += taxaDeCrescimentoSegundoPais;

                anos++;
            }

            if (primeiroPaisCrescimento == segundoPaisCrescimento) {
                System.out.println("o segundo pais nao ultrapassara o primeiro");
            } else {
                System.out.println(anos + " anos para o segundo passar o primeiro");
            }
        }
    }
}
