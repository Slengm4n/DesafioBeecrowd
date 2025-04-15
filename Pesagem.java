
import java.util.Scanner;

public class Pesagem {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        double ValorEmKG = digitar.nextDouble();
        double ValorDaTara = digitar.nextDouble();
        double PesoDoPrato = digitar.nextDouble();
        double conversao = PesoDoPrato*1000;
        double Result = (conversao-ValorDaTara)/100 * ValorEmKG;
        System.out.printf("Total = R$ %.2f\n", Result);
    }
}
