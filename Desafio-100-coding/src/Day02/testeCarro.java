package Day02;

public class testeCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Van";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro carro = new Carro("volkswagen", "gol", 4, 51, 9);
		
		System.out.println(carro.marca);
		System.out.println(carro.modelo);
		System.out.println(carro.numPassageiros);
		System.out.println(carro.capCombustivel);
		System.out.println(carro.consumoCombustivel);
	}
	
	

}
