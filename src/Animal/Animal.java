package Animal;

public class Animal {
    protected String nome ;
    public String raca ;
    protected int idade ;
    public String cor ;

    public boolean avisarVacina(){
        boolean vacina ;
        if(idade <=1){
           vacina = true;
        }else{
            vacina = false;
        }
        return vacina;
    }
}
