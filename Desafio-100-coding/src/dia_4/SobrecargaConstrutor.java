package dia_4;

/*
* Dia 04 do #100daysofcode:
* A sobrecarga de construtores é a capacidade de definir múltiplos construtores em uma mesma classe,
* com o mesmo nome (que é o nome da classe), mas com assinaturas diferentes (número, tipo ou ordem dos parâmetros).
* */

public class SobrecargaConstrutor {

    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    public SobrecargaConstrutor(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public SobrecargaConstrutor(String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    public SobrecargaConstrutor(String marca, String modelo) {
        this(marca,modelo,0,51.1,8);
    }
}
