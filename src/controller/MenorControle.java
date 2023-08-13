package controller;

public class MenorControle {
	
	public MenorControle() {
		super();
	}

	public int Menor(int[] vetor, int tamanho, int ultimo) {
		//Condi��o de parada -> Quando o vetor ter um �nico valor dentro dele, impossibilitando a compara��o
		if (tamanho == 1) {
			return ultimo;
		}
		else
		{
			tamanho = tamanho -1;
			
			/*A fun��o � chamada na defini��o da vari�vel menor, permitindo a compara��o entre o 
			�ltimo valor do vetor e o menor valor do vetor at� agora*/
			int menor = Menor(vetor, tamanho, vetor[tamanho-1]);
			if (ultimo<menor)
			{
				return ultimo;
			}
			else 
			{
				return menor;
			}
		}
	}
}
