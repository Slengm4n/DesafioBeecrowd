import java.util.Scanner;

public class piramide{
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        int tamanhoDaPiramide = digitar.nextInt();
        String contagem = "";
        for (int i = 0; i <= tamanhoDaPiramide; i++) {
            contagem += "*";
            System.out.println(contagem);
        }
    }
}