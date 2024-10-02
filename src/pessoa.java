public class pessoa {
    private final double TAXA_SALARIO = 0.5;
    public String nome = "padrao";
    public int idade;
    public char sexo;

    public void atualizarNome(String novoNome){
        nome = novoNome;
    }

    public void acordar(){
        System.out.println("estou acordado");
    }

    public void comer(){
        System.out.println("estou comendo");
    }

    public void dormir(){
        System.out.println("estou dormindo");
    }

    public double calcularSalario(){
        double salario = 1200 * TAXA_SALARIO;
        return salario;
    }


}
