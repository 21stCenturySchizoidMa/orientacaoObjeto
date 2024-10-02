import java.util.Scanner;
public class sistemaGestaoTarefas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        opcoesMenu menu = new opcoesMenu();
        int opcao;


        opcao = menu.mostrarMenu();
        switch (opcao) {
            case 1:
                System.out.println("comparar valores");
                menu.compararValores();
                break;



        }


    }


}
