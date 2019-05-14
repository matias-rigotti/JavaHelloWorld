package main;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hola mundo");
		
		/*
		 * DECLARACION DE VARIABLES (son espacios de memoria a los cuales le asignamos algun tipo y valor)
		 * 	Tipos de datos primitivos:
		 * 		>enteros: 
		 * 			>byte
		 * 			>short
		 * 			>int			Ej: int version = 9;
		 * 			>long 
		 * 		>decimales: 
		 * 			>float			Ej: float version = 9.1f;
		 * 			>double
		 * 		>caracteres: 
		 * 			>char
		 * 		>booleanos: 
		 * 			>boolean
		 */
		
		/*
		 *  PALABRAS RESERVADAS: ACTUALMENTE SON 50
		 *  >assert
		 *  >continue
		 *  >for
		 *  >...
		 */
		
		/*
		 *  SECUENCIAS DE ESCAPES: nos permiten dar formato a las cadenas de texto
		 *  	> \n. Salto de línea.
		 *		> \t. Tabulador.
		 *		> \\. Diagonal inversa.
		 * 		> \". Comillas dobles.
		 * 		> \'. Comillas simples.
		 */
		
		/*
		 *  CONSTANTES: se le asigna valor una sola vez
		 *  	> final float pi = 3.1415f;
		 */
		
		/*
		 *  OPERADORES ARITMETICOS
		 *  	> suma: +
		 *  	> resta: -
		 *  	> multiplicacion: *
		 *  	> division: /
		 *  	> incremento en uno: ++
		 *  	> decremento en uno: --
		 */
		
		/*
		 *  CASTING:
		 *  	int variableX = 50;
		 *  	float variableZ = 5.5f;
		 *  
		 *  	resultado = variableX + (int)variableZ;
		 *  
		 *  	System.out.println(resultado);
		 */
		
		/*
		 *  OPERADORES RELACIONALES: siempre devuelven un booleano
		 *  	> >
		 *  	> <
		 *  	> >=
		 *  	> <=
		 *  	> ==
		 *  	> !=
		 */
		
		/*
		 *  OPERADORES LOGICOS: siempre devuelven un booleano
		 *  	> and: &&
		 *  	> or: ||
		 *  	> not: !
		 */
		
		/*
		 *  OPERADOR TERNARIO: si verdadero, esto, sino, entonces lo segundo
		 *   	> expresion1 ? expresion2 : expresion3
		 *   
		 *   String mensaje = 10 > 9 ? "Es mayor" : "Es menor";	
		 */
		
		/*
		 *  METODOS DE AYUDA PARA TRABAJAR CON STRINGS:
		 * 		> length: largo de la cadena (cuenta los espacios)
		 * 		> contains: devuelve true o false, dependiendo si encuentra un string en la cadena.
		 * 		> startsWith: devuelve true o false, comienza con...
		 * 		> endsWith: devuelve true o false, termina con...
		 * 		> concat: concatena dos strings
		 * 		> toUppercase: pasa a mayusculas
		 * 		> toLowerCase: pasa a minusculas
		 * 		> trim: 
		 * 		> format: permite generar nuevos string a partir de otros elementos de datos
		 * 			>%d int
		 * 			>%f float
		 * 			>%s string
		 * 
		 * 			Ej: String mensaje = "";
		 * 				String nombre = "Pedrito";
		 * 				mensaje = String.format("Bienbenido %s", nombre);
		 * 				System.out.println(mensaje);
		 * 
		 * 				float valor = 10.123649f;
		 * 				mensaje = String.format("El total de %d articulos es %.2f %s", 3, valor, "PESOS");
		 * 				System.out.println(mensaje);
		 * 
		 * 		> equals: para ver si dos strings son iguales.
		 * 		> equalsIgnoreCase: sin tener en cuenta las mayusculas
		 */
		
		/*
		 * 	INSTRUCCIONES DE CONTROL: Permiten que el flujo de ejecucion del programa avance, se detenga o se ramifique (segun los cambios de estado).
		 * 		> De Seleccion: ejecutar ciertos bloques de codigo dependiendo de ciertos criterios a evaluar. Permite condicionar nuestro codigo.
		 * 			> CONDICIONAL
		 * 				Ej.	if (condicion){
		 * 						sentencias a ejecutar cuando la condicion sea true.
		 * 					}else{
		 * 						sentencias a ejecutar cuando la condicion sea false.
		 * 					}
		 * 			> MULTIPLE CONDICIONAL
		 * 				Ej.	if (condicion1){
		 * 						sentencias a ejecutar cuando la condicion1 sea true.
		 * 					}else if (condicion2){
		 * 						sentencias a ejecutar cuando la condicion2 sea true.
		 * 					}else{
		 * 						cuando ninguna condicion sea verdadera
		 * 					}
		 * 			> CONDICIONES ANIDADAS: Condiciones dentro de condiciones.
		 * 			> SWITCH: se evalua una sola condicion 
		 * 				Ej. switch(expresion){
		 * 						case valor_a_comparar_con_la_expresion : accion;
		 * 							break; --break termina un flujo, es decir, en este caso, termina el case.
		 * 						case valor2 : accion;
		 * 							break;
		 * 						default: accion; --se ejecuta cuando no se cumpla ninguno de los anteriores
		 * 					}
		 * 
		 * 		> De Iteracion
		 * 			> WHILE: Permite repetir un bloque mientras la condicion se cumpla. Se usa cuando no conocemos de antemano el numero de iteraciones. 
		 * 			> DO WHILE: Primero se ejecuta el bloque de codigo y luego se evalua la condicion.
		 * 				Ej. do {
		 * 						bloque a ejecutar
		 * 					}while(condicion);
		 * 			> FOR: conocemos la cantidad de iteraciones a realizar.
		 * 				> Ej. for (inicializacion; condicion; iteracion) {
		 * 						bloque de codigo
		 * 					  }
		 * 		> De Salto
		 * 			> BREAK
		 * 				> Permite terminar una secuencia de instrucciones.
		 * 				> Permite salir de un ciclo
		 * 				> Se puede usar como GOTO
		 * 			> CONTINUE
		 * 				> Tambien se usa dentro de ciclos, para saltar a la siguiente iteracion.
		 * 			> RETURN
		 */
		
		/*
		 *  SCOPE: area o ambito donde la variable puede utilizarse. Delimitado por las llaves { }
		 */
		
		/*
		 * *******************************EJERCICIOS***************************************
		 */
		
		/*
		 * 1) Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70, 
		 *    en caso contrario mostrar el mensaje "Reprobado".
		 */
		int calification = 60;
		if (calification >= 70) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Reprobado");
		}
		/*
		 * 2) Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. 
		 *    Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
		 */
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(9);
		lista.add(50);
		lista.add(4);
		lista.sort((o1, o2) -> o1.compareTo(o2)); //Usando expresión lambda
		
		for(int i : lista) {
            System.out.println(i);
        }
		
		/*
		 * ********************************************************************************
		 */
	}

}
