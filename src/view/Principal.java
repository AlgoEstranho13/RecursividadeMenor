package view;
import controller.MenorControle;

public class Principal {

	public static void main(String arqs[]) {
		
		MenorControle MC = new MenorControle();
		
		int[] vetor = {3,4,-1,2,5};
		int tamanho = vetor.length;
		int ultimo = vetor[tamanho-1];
		
		System.out.println("O menor valor do vetor é: "+MC.Menor(vetor, tamanho, ultimo));
	}

}
