package Animal;

public class GestaoAnimais {
    Animal semPedigri = new Animal();
    Animal comPedigri = new Animal();
    public void cadastrarAnimal(){

        semPedigri.nome = "caramelo";
        semPedigri.raca = "vira-lata";
        semPedigri.idade = 15;
        semPedigri.cor = "marrom";
    }

    public void imprimirInformacoesSemPedigri(){
        System.out.println("nome do animal: " + semPedigri.nome);
        System.out.println("nome do animal: " + semPedigri.raca);
        System.out.println("nome do animal: " + semPedigri.cor);
    }
}
