import java.util.Scanner;
public class AnoBissexo {
    public static void main(String[] args) {    
    Scanner digitar = new Scanner(System.in);
    int Inicio = digitar.nextInt();
    int Fim = digitar.nextInt();
    int contagem = 0 ;
    if (Inicio>Fim){
        System.out.println("erro");
    }else{
    for (int i = Inicio; i <= Fim; i+=4) {
        System.out.println(i);
        contagem++;
        if (Inicio>Fim){
            System.out.println("erro");
        }
    }
    }
    System.out.println("Bissextos:\n" + contagem);
    
    }
    
    
}
