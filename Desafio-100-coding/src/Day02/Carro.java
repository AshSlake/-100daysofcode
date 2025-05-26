package Day02;

/*
 * Dia 2 do #100daysofcode, hoje vimos sobre construtores e a forma de definilos tornando o codigo mais limpo, organizado e modular.
 * */

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//toda classe ja vem com um contrutor vazio por padrão, 
	//mais podemos declara-lá para definir parametros iniciais padrões.
	Carro() {
		System.out.println("A classe Carro foi instanciada.");
	}
	
	// podemos criar um construtor com quantos parametros quisermos, assim como todos os da classe.
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
	void exibirAutonomia() {
		
	    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		return km/consumoCombustivel;
	}

}
