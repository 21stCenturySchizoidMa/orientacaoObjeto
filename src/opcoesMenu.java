import java.util.Scanner;
public class opcoesMenu {
    Scanner sc = new Scanner(System.in);

    public int mostrarMenu() {

        int opc;
        System.out.println("menu principal");
        System.out.println("1. comparar valores");
        System.out.println("2. buscar um numero");
        System.out.println("3. converter valores");
        System.out.println("4. sair");
        opc = sc.nextInt();
        return opc;
    }

    public void compararValores(){
        int valor1=20, valor2=10;
        if(valor1>valor2){
            System.out.println(valor1 + " é maior que " + valor2);
        }else{
            System.out.println(valor2 + " é maior que " + valor1);
        }
    }

}
