package vizualizaçao;

import Animal.GestaoAnimais;
import Carro.Carro;
import Pessoa.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa gerente = new Pessoa();
        Pessoa funcionario = new Pessoa();
        int rodas;

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

        Carro popular = new Carro();
        Carro luxo = new Carro();

        popular.marca = "volkswagem";
        popular.modelo = "fusca";
        popular.ano = 1975;
        popular.cor = "amarelo";
        popular.pagarIPVA(0.12);
        popular.fazerRevisao();


        luxo.marca = "Chevrolet";
        luxo.modelo = "tracker premium";
        luxo.ano = 2024;
        luxo.cor = "branco";
        luxo.pagarIPVA(0.50);
        luxo.fazerRevisao();



        GestaoAnimais cadastro = new GestaoAnimais();
        cadastro.imprimirInformacoesSemPedigri();

    }
}
