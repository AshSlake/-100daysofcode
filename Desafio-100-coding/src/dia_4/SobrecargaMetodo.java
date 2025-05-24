package dia_4;

/*
* Dia 04 do #100daysofcode :
*  aprendendo sobre Sobrecarga de Metodos. Onde se permite
* definir múltiplos métodos com o mesmo nome dentro da mesma classe,
* desde que tenham assinaturas diferentes.
* */

public class SobrecargaMetodo {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public int soma (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double soma (double num1, double num2) {
        return num1 + num2;
    }

    public int soma (int[] vetorInteiros) {
        int soma = 0;

        for (int i : vetorInteiros) {
            soma += i;
        }
        return soma;
    }
}
