package controller;

public class MenorControle {
	
	public MenorControle() {
		super();
	}

	public int Menor(int[] vetor, int tamanho, int ultimo) {
		//Condição de parada -> Quando o vetor ter um único valor dentro dele, impossibilitando a comparação
		if (tamanho == 1) {
			return ultimo;
		}
		else
		{
			tamanho = tamanho -1;
			
			/*A função é chamada na definição da variável menor, permitindo a comparação entre o 
			último valor do vetor e o menor valor do vetor até agora*/
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
