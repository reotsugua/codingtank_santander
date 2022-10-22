import java.util.Scanner;

public class MainConversorDeTemperatura {

    public static void main(String[] args) {

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Informe o valor da temperatura à ser convertida: ");
            double temp1 = teclado.nextDouble();
            System.out.println("Informe a unidade de Origem: " +
                    "\n1. para Celsius" +
                    "\n2. para Fahrenheit" +
                    "\n3. para Kelvin");
            double unid1 = teclado.nextDouble();
            System.out.println("Informe a unidade de Destino: " +
                    "\n1. para Celsius" +
                    "\n2. para Fahrenheit" +
                    "\n3. para Kelvin");
            double unid2 = teclado.nextDouble();
            Double fator1 = (double) 9 / 5;
            int fator2 = 32;
            float fatork = 273.15f;

            if (unid1 == 1 && unid2 == 2) {

                Double resCF = (temp1 * fator1) + fator2;
                Double media = (temp1 + resCF) / 2;
                System.out.printf("%.2fºC, convertido em Fahrenheit é: %.2fºF \n", temp1, resCF);
                System.out.printf("A média das temperaturas é: %.2f Graus", media);

            } else if (unid1 == 1 && unid2 == 3) {
                Double resCK = temp1 + fatork;
                Double media = (temp1 + resCK) / 2;
                System.out.printf("%.2fºC, convertido em Kelvin é: %.2fK \n", temp1, resCK);
                System.out.printf("A média das temperaturas é: %.2f Graus", media);

            } else if (unid1 == 2 && unid2 == 1) {
                Double resFC = (temp1 - fator2) / fator1;
                Double media = (temp1 + resFC) / 2;
                System.out.printf("%.2fºF, convertido em Celsius é: %.2fºC \n", temp1, resFC);
                System.out.printf("A média das temperaturas é: %.2f Graus", media);

            } else if (unid1 == 2 && unid2 == 3) {
                Double resFK = ((temp1 - fator2) / fator1) + fatork;
                Double media = (temp1 + resFK) / 2;
                System.out.printf("%.2fºF, convertido em Kelvin é: %.2fK \n", temp1, resFK);
                System.out.printf("A média das temperaturas é: %.2f Graus", media);

            } else if (unid1 == 3 && unid2 == 1) {
                Double resKC = temp1 - fatork;
                Double media = (temp1 + resKC) / 2;
                System.out.printf("%.2fK, convertido em Celsius é: %.2fºC \n", temp1, resKC);
                System.out.printf("A média das temperaturas é: %.2f Graus", media);

            } else if (unid1 == 3 && unid2 == 2) {
                Double resKF = ((temp1 - fatork) * fator1) + fator2;
                Double media = (temp1 + resKF) / 2;
                System.out.printf("%.2fK, convertido em Fahrenheit é: %.2fºF \n", temp1, resKF);
                System.out.printf("A média das temperaturas é: %.2f Graus", media);

            } else {
                System.out.println("Não é possível realizar a conversão.");
            }
            teclado.close();

        }
        catch(java.util.InputMismatchException exception){
            System.out.print("Valor Inválido.");
        }

        finally{
            System.out.println("\nAplicação Finalizada. Reinicie para usar novamente!");
        }









    }


}