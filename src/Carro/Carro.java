package Carro;

public class Carro {
    public String marca ;
    public String modelo;
    public int ano;
    public String cor ;

    public double pagarIPVA(double impostoAno){
        double ipva;
        if(marca.equalsIgnoreCase("bmw")){
             ipva = 3500.00 + impostoAno;
        }else{
            ipva = 1200.00 + impostoAno;
        }

        return ipva;

    }

    public void fazerRevisao(){
        if(ano >= 1980){
            System.out.println("levar a carroça pra revisao");
        }else{
            System.out.println("da pra usar");
        }
    }


}
