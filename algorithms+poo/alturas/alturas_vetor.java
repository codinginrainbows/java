import java.util.Scanner;

    public class alturas_vetor {
        
        public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            int n, i;
            double menores = 0, alturasoma = 0, alturamedia, menoresporcentagem;
            
            System.out.print("quantas pessoas deseja contablizar? ");
            n = sc.nextInt();

            String[] nomes = new String[n];
            int[] idades = new int[n];
            double[] alturas = new double[n];

                for(i = 0; i < n; i++){
                    System.out.print("NOME: ");
                    nomes [i] = sc.next();
                    System.out.print("IDADE: ");
                    idades [i] = sc.nextInt();
                    System.out.print("ALTURA: ");
                    alturas [i] = sc.nextDouble();
                    System.out.println();

                    alturasoma = alturasoma + alturas[i];
                }

                alturamedia = alturasoma / n;

                System.out.print("ALTURA MEDIA: " + alturamedia);
                System.out.println();
                
                for(i = 0; i < n; i++){
                    if (idades [i] < 16){
                        menores = menores + 1;
                    }
                }    
                 
                menoresporcentagem = (menores / n) * 100;

                    System.out.print("PESSOAS COM MENOS DE 16 ANOS: ");
                    System.out.print(menoresporcentagem + "%");
                    System.out.println();

                
                for(i = 0; i < n; i++){
                    if (idades [i] < 16){
                        System.out.println(nomes [i]);
                    }
                }
            
        }
        
    }
