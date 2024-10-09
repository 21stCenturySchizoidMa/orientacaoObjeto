package Pessoa;

public class GestaoPessoa {
    Pessoa gerente = new Pessoa();
    Pessoa funcionario = new Pessoa();

    public void cadastrarPessoa(){
        gerente.nome = " ana maria ";
        gerente.idade = 43;
        gerente.salario = 4300.00;
        gerente.cargo = "gerente";
        gerente.calcularComissao();
        System.out.println(" o novo salario de " + gerente.nome + " é agora " + gerente.salario);

        funcionario.nome = " pedro luiz ";
        funcionario.idade = 32;
        funcionario.salario = 1200.00;
        funcionario.cargo = "RH";
        funcionario.calcularComissao();
        System.out.println(" o salario de " + funcionario.nome);
    }

    public void trocarSenhaFuncionario(String novaSenha){
        funcionario.setSenha(novaSenha);
    }
}
