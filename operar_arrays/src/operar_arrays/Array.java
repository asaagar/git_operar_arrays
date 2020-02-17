package operar_arrays;

public class Array {

	public static void main(String[] args) {
		//Ordenamiento por seleccion
		int array[] = creaArrayNumerosAzar(10, 0, 100);
		mostrarArray(array);
		ordenamientoPorSeleccion(array);
		sumar_array(array);

	}
	
	public static void imprimir_array() {
		int array[] = creaArrayNumerosAzar(10, 0, 100);
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
	
	public static void sumar_array(int [] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
		}
		System.out.println();
		System.out.println("El resultado de la suma del array es de "+ suma);
	}
	
	public static void ordenamientoPorInsercion (int [] array) {
//		int array[] = creaArrayNumerosAzar(10, 0, 100);
//		mostrarArray(array);
		
		for (int i = 0; i < array.length; i++) {
			int aux = array[i];
			int j;
			// Hago los desplazamientos a derecha, uno a uno, de los valores del array
			// hasta encontrar un valor menor que el que contiene la var aux.
			for (j = i; j > 0 && array[j-1] > aux; j--) {
				array[j] = array[j-1];										
			}
			// Cuando acabo los desplazamientos a derecha de j indica la posicion del array
			// en la que debo insertar el valor de la var aux.
			array[j] = aux;
			
		}
		System.out.println();
		mostrarArray(array);
	}
	
	public static void ordenamientoPorSeleccion (int [] array) {
//		int array[] = creaArrayNumerosAzar(10, 0, 100);
//		mostrarArray(array);
		
		for (int i = 0; i < array.length; i++) {
			int indiceValorMinimo = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[indiceValorMinimo]) {
					indiceValorMinimo = j;
				}
				
			}
			// Al acabar el for de la j, la variable indiceValorMinimo apuntará a la posición
			// del array que contiene el valor minimo de todos los disponibles a la derecha
			// del valor al que apunta la variable i.
			int aux = array[i];
			array[i] = array[indiceValorMinimo];
			array[indiceValorMinimo] = aux;
		}
		System.out.println();
		mostrarArray(array);
	}
	
	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray (int [] array) { // Si el metodo es void no hace falta el return al final
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void creaArrayNumerosAzarEntre1y20() {
		int array[] = new int[10]; // Este array aunque se llame igual, es totalmente diferente, son independientes.
		for (int i = 0; i < array.length; i++) {
			array[i] = obtenerNumeroAleatorio (1, 20);
		}
	}
		/**
		 * 
		 * @param longitud
		 * @param limInf
		 * @param limSup
		 * @return
		 */
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud]; // Este array aunque se llame igual, es totalmente diferente, son independientes.
		for (int i = 0; i < array.length; i++) {
			array[i] = obtenerNumeroAleatorio (limInf, limSup);
		}
		return array;
	}
	
	/**
	 * 
	 * @return
	 */
	public static int obtenerNumeroAleatorio () {
		return (int) Math.round(Math.random() *100);
	}
	
	/**
	 * 
	 * @return
	 */
	public static int obtenerNumeroAleatorio (int limiteInferior, int limiteSuperior) {
		return (int) Math.round(Math.random() *(limiteSuperior - limiteInferior) + limiteInferior);
	}

	
		


}
