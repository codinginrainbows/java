public class lista4_ex29 {
    public static void main(String[] args) {

        int numero = 100, primeiroAlgarismo = 1, segundoAlgarismo = 0, terceiroAlgarismo = 0, produtoAlgarismos = 0;

        System.out.println("100 - 1*0*0 = 0");

        while (numero < 999) {
            numero++;

            terceiroAlgarismo++;

            if (terceiroAlgarismo == 10) {
                segundoAlgarismo++;
                terceiroAlgarismo = 0;
            }

            if (segundoAlgarismo == 10) {
                primeiroAlgarismo++;
                segundoAlgarismo = 0;
            }

            if (segundoAlgarismo == 2 && terceiroAlgarismo == 1 || segundoAlgarismo == 4 && terceiroAlgarismo == 1
                    || segundoAlgarismo == 6 && terceiroAlgarismo == 1
                    || segundoAlgarismo == 8 && terceiroAlgarismo == 1
                    || segundoAlgarismo == 0 && terceiroAlgarismo == 1) {
                System.out.println("\n----- PAUSA -----\n");
            }

            produtoAlgarismos = primeiroAlgarismo * segundoAlgarismo * terceiroAlgarismo;

            System.out.print(numero + " - " + primeiroAlgarismo + "*" + segundoAlgarismo + "*" + terceiroAlgarismo
                    + " = " + produtoAlgarismos + "\n");
        }
    }
}