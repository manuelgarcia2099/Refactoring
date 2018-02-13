package cm1_extractMethod;
/**
 * @author Manuel Garc�a 2018
 * Problema Ejemplo para uso de T�cnicas de Refactoraci�n
 */
public class ProblemaCm1 {
	
	private static String nombre;
	private static double monto;

	public static void main(String[] args) {
		monto = 200.0;
		nombre = "San Juan S.A";
		
		imprimirDeuda();
	}
	
	private static void imprimirDeuda() {
		
		imprimirCabecera();
		
		//Imprime Detalles
		System.out.println("nombre de Empresa: "+ nombre);
		System.out.println("monto: "+monto);		
	}

	private static void imprimirCabecera() {
			System.out.println("*********************************");
			System.out.println("*****  Emisi�n de Reporte   *****");
			System.out.println("*********************************");
	}

}
