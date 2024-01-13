package trabajo_maven_Ruben_igual_entrega.NuevaCalculadora3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class NuevaCalculadora3
{
   
    	 public static void main(String[] args) {
    	        // Crear un objeto Scanner para leer la entrada del usuario
    	        Scanner scanner = new Scanner(System.in);

    	        // Obtener la operación, número 1 y número 2 desde el usuario
    	        System.out.print("Ingrese la operación (suma, resta, multiplicación o división): ");
    	        String operacion = scanner.next();

    	        System.out.print("Ingrese el primer número: ");
    	        double num1 = scanner.nextDouble();

    	        System.out.print("Ingrese el segundo número: ");
    	        double num2 = scanner.nextDouble();

    	        // Realizar la operación y mostrar el resultado
    	        double resultado = realizarOperacion(operacion, num1, num2);

    	        // Imprimir el resultado en la consola
    	        System.out.println("El resultado de " + operacion + " " + num1 + " y " + num2 + " es: " + resultado);

    	        // Cerrar el Scanner
    	        scanner.close();
    	    }

    	    // Método refactorizado para realizar operaciones
    	    private static double realizarOperacion(String operacion, double num1, double num2) {
    	        switch (operacion.toLowerCase()) {
    	            case "suma":
    	                return sumar(num1, num2);
    	            case "resta":
    	                return restar(num1, num2);
    	            case "multiplicacion":
    	                return multiplicar(num1, num2);
    	            case "division":
    	                return dividir(num1, num2);
    	            default:
    	                System.out.println("Operación no válida. Las opciones son: suma, resta, multiplicacion o division.");
    	                return 0;
    	        }
    	    }

    	    // Métodos para operaciones específicas
    	    private static double sumar(double num1, double num2) {
    	        return num1 + num2;
    	    }

    	    private static double restar(double num1, double num2) {
    	        return num1 - num2;
    	    }

    	    private static double multiplicar(double num1, double num2) {
    	        return num1 * num2;
    	    }

    	    private static double dividir(double num1, double num2) {
    	        // Verificar que el divisor no sea cero
    	        if (num2 != 0) {
    	            return num1 / num2;
    	        } else {
    	            System.out.println("Error: No se puede dividir por cero.");
    	            return 0;
    	        }
    }
}
