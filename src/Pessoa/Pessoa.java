package Pessoa;

public class Pessoa {
    public final double PORCENTAGEM = 0.12;
    public String nome;
    public int idade;
    private String CPF;
    public String cargo;
    private String senha;
    public double salario;

    public String getCPF(){
        return CPF;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    public void calcularComissao(){
        if(cargo.equalsIgnoreCase("gerente")) {
            salario = salario + (salario * PORCENTAGEM);
        }
    }
}


