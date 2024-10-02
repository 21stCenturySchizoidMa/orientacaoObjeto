public class gestaoPessoas {
    public static void main(String[] args) {

    pessoa professor = new pessoa();
    pessoa aluno = new pessoa();
    pessoa admin = new pessoa();

    professor.nome = "lenin";
    professor.idade = 43;
    professor.sexo = 'M';
    professor.acordar();
    professor.calcularSalario();

    aluno.nome = "andreia";
    aluno.idade = 34;
    aluno.sexo = 'F';
    aluno.acordar();
    aluno.comer();

    admin.nome = "carla";
    admin.idade = 45;
    admin.sexo = 'F';
    admin.atualizarNome("ana clara");
    admin.calcularSalario();


    }
}
