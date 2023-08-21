package org.listaalgoritmos.template;

public class RespostaListaExercicio {
	
	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. 
	 * Não se faz necessário implementar dentro do escopo do método.
	 */
	
	public static void main(String[] args) {
	//  question 1 -> calculo do imc	
		System.out.println(RespostaListaExercicio.calcularImc(83f, 1.86f));
		
	//  question 2 -> calcular area do trapezio
		System.out.println(RespostaListaExercicio.calcularAreaTrapezio(24, 9, 15) + " cm²");
		
	//  question 3 -> Maior entre dois inteiros
		System.out.println("o maior entre os dois inteiros é "+maiorEntreDoisInteiros(10, 5));
		
	//  question 4 -> Verificar se é impar ou par.
		System.out.println(verificarParImpar(7));
		
	//  question 5 -> Calcular Media aritmetica das notas
		float [] notas_semestreone = {10f,6f,8f,7f};
		float [] notas_semestretwo = {9f,4f,6f,5f};
		
		System.out.println(calcularMediaNotas(notas_semestretwo));
		
	//  question 6 -> Imprimir array inverso.
		int [] array_vetor = {1,2,3,4,5,6};
		
		RespostaListaExercicio.imprimirArrayInverso(array_vetor);
		
	//  question 7 -> Imprimir os Numeros primos.
		int [] vetor_primos = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		RespostaListaExercicio.imprimirElementosPrimos(vetor_primos);
		
	//  question 8 -> imprimir os elementos impares.
		int [] arrayimpares = {1,2,3,4,5,6,7,8,9,10};
		
		RespostaListaExercicio.imprimirElementosImpares(arrayimpares);
		
	//  question 9 -> imprimir os elementos pares.
		int [] arraypar = {1,2,3,4,5,6,7,8,9,10};
			
		RespostaListaExercicio.imprimirElementosPares(arraypar);
		
	//  question 10 -> imprimir o maior e o menor numero de um array.
		int [] array_mm = {5,7,9,14,20};
		
		RespostaListaExercicio.imprimirMaiorMenorElemento(array_mm);
		
	//  question 11 -> Calcular media aritmetica com inteiros.
		int [] vetor_med = {9,6,6,8};
		
		System.out.println(RespostaListaExercicio.calcularMediaAritmetica(vetor_med));
		
	}
	
//	 * Método deve calcular o IMC utilizando peso e altura. Como resultado
//	 * o método deve retornar uma variável resultado do tipo float.
//	 * @param peso
//	 * @param altura
//	 * @return resultado
	 
	public static float calcularImc(float peso, float altura) {
			
		float imc = peso/(altura * altura);
		
		return imc;
	}
	
//	 * Método deve calcular a área do trapézio independente da unidade de medida.
//	 * Como resultado, o método deve retornar a área calculada.
//	 * @param baseMaior
//	 * @param baseMenor
//	 * @param altura
//	 * @return areaTrapezio
	 
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {	
		
		float area = ((baseMaior + baseMenor) * altura) / 2;
		
		return area;
	}

//	 * O método deve calcular o maior entre dois inteiros, que são fornecidos
//	 * como argumento do método. O retorno deve ser o maior valor dado
//	 * como entrada, sendo do tipo inteiro.
//	 * @param num_a
//	 * @param num_b
//	 * @return maiorValor
	 
	public static int maiorEntreDoisInteiros(int num_a, int num_b) {
		
		if(num_a > num_b) {
			return num_a;
		} else {
			return num_b;
		}
		
	}
	
//	 * Método verifica se o número apresentado como argumento é ímpar ou par.
//	 * caso seja par, o retorno do método deve ser verdadeiro. Caso contrário,
//	 * o valor retornado deve ser falso.
//	 * @param num
//	 * @return condicao
	 
	public static boolean verificarParImpar (int numero) {
		
		if(numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	
//	 * Método calcula a média aritmetica dos elementos float a partir de um array. 
//	 * O retorno deve ser o resultado do cálculo da média.
//	 * @param notas
//	 * @return media
	 
	public static float calcularMediaNotas(float[] notas) {
		
		float soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		
		float media = (soma/notas.length);
		
		return media;
	}
	
	
//	 * Método imprime array de inteiros no sentido inverso, separando os elementos por vírgula.
//	 * O último elemento impresso não deve preceder vírgula. Use o System.out.print() para imprimir os valores.
//	 * Os elementos devem ser impresso numa única linha.
//	 * @param array

	
	public static void imprimirArrayInverso(int[] array) {
		
		for(int n = array.length - 1; n >= 0; n--) {
			if(array[n] > 1) {
				System.out.print(array[n] + ",");
			} else {
				System.out.print(array[n]);
			}

		}
		
	}

//	 * Método deve imprimir os elementos primos de um array de inteiros. O formato da impressão 
//	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
//	 * após o último elemento. Utilize System.out.print()
//	 * @param array

	// array = {1,2,3,4,5,6,7,8,9,10};
	public static void imprimirElementosPrimos(int[] array) {
		
		int divisores = 0;   // variavel para somar a quantidade de divisores
		
		for(int j = 0; j < array.length; j++) {  // primeiro for para percorrer todo o array
			if(array[j] != 1 && array[j] > 0) {  // condicao para verificar se é maior que 0 e diferente de 1
				
			for(int x = array[j]; x > 0; x--) {  // o x recebe o numero a ser testado e vai decrementando 
				if(array[j] % x == 0) { 		// testando se o numero é divisivel por mais de 2 numeros.
					divisores++;
				}	
			}
			if(divisores < 3) {                 // condicao para saber se tem menos de 3 divisores e logo sera primo
				System.out.print(array[j] + " ");
			}
			divisores = 0;						// zerando a variavel divisores novamente para testar o proximo num.
		}
	}
}


	
//	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato da impressão 
//	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
//     * após o último elemento. Utilize System.out.print()
//	 * @param array

	public static void imprimirElementosImpares(int[] array_impares) {
		
		for(int k = 0; k < array_impares.length; k++) {
			if(array_impares[k] % 2 != 0) {
			System.out.print(array_impares[k] + " ");
			}
		}
	}
	

	
//	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da impressão 
//	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
//	 * após o último elemento. Utilize System.out.print()
//	 * @param array

	public static void imprimirElementosPares(int[] array_par) {
		
		for(int y = 0; y < array_par.length; y++) {
			if(array_par[y] % 2 == 0) {
			System.out.print(array_par[y] + " ");
			}
		}
	}


//	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O formato da impressão 
//	 * deve ser feito numa única linha, utilizando espaço em branco (" ") entre os elementos e 
//	 * após o último elemento. Utilize System.out.print()
//	 * @param array
	 
	
	//  array_mm = {5,7,9,14,20};
	// menor numero = qtd = 0;  
	// maior numero = qtd = 4;
	public static void imprimirMaiorMenorElemento(int[] array) {
		
		int qtd = 0;
		
		for(int r = 0; r < array.length; r++) {
			for(int num = 0; num < array.length; num++) {
				if(array[r] > array[num]) {
					qtd++;
				}
			}
			if(qtd == (array.length-1) || qtd == 0) {
				System.out.print(array[r] + " ");
			}
			qtd = 0;
		}
	}
	
//	 * O método calcula a média aritmética dos elementos de um array de inteiros. 
//	 * Como resultado, o valor da média deve ser retornado no método.
//	 * @param array
//	 * @return media
	 
	public static int calcularMediaAritmetica(int[] array_med) {
		
    int soma = 0;
		
		for(int p = 0; p < array_med.length; p++) {
			soma += array_med[p];
		}
		
		int mediaAritmetica = (soma/array_med.length);
		
		return mediaAritmetica;
	}
	
}
