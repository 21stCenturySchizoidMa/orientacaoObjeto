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

    
    }
}
