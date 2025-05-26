package Day03;

/*
 * Dia 3 do #100daysofcode
 *  - falando sobre o parametro "THIS".
 *  - vimos tambem sobre modificadores de acesso public e private.
 * */

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;


    Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    // chamando o construtor existente dentro de um novo construtor:
    public Carro(String marca, String modelo) {
        this(marca, modelo, 0, 0, 0);
    }

    void exibirAutonomia() {

        System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
    }

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");
        return this.capCombustivel * this.consumoCombustivel;
    }

    double calcularCombustivel(double km) {
        return km/this.consumoCombustivel;
    }


}



