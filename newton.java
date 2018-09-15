package Metodos;

import javax.swing.JOptionPane;

public class newton {
	public static void main(String[] args) {
        //inicializa las variables de contador Valor Anterior, Valor actual, x0, xi y el porcentaje de error.
		double contador = 0;   
		double valorAnterior = 0;
		double valorActual, xo, xi;
		double ea = 100; //porcentaje de error
	    double fxo, fo; //valor de y en las funcion original y la derivada
        //se pregunta al usuario por el porcentaje de error minimo aceptado y la x con la que empieza a correr el programa 
	    double es = Double.parseDouble(JOptionPane.showInputDialog("Dame el % minimo aceptado"));
	    xo = Double.parseDouble(JOptionPane.showInputDialog("Dame Xo"));
	    
		do{
			fxo = Funcion(xo); //obtiene el valor de y al evaluar x0 en la funcion
		    fo = FuncionDer(xo); //obtiene el valor de y al evaluar x0 en la funcion derivada
			xi = xo - (fxo / fo); 
	        valorActual = xi;
	        valorAnterior = xo;
	        System.out.println("Xo: " + xo);
	        System.out.println("Xi: " + xi);
	        ea = ((valorActual - valorAnterior) / valorActual) * 100; //calcula el porcentaje de error nuevo
	        ea = Math.abs(ea); 
	        System.out.println("Ea: " + ea);
	        System.out.println("Es: " + es);
	        xo = xi;
	        contador++;
	        System.out.println("Iteracion: " + contador);
	        System.out.println("");
		}
		while (ea > es); //realiza n numero de iteraciones mientras el porcentaje de error sea mayor al aceptado
		System.out.println("La raiz es: " + xi); //imprime la raiz que se obtuvo
	}
	
	public static double Funcion(double x){
    double res = ((-0.6)*Math.pow(x, 2))+(2.4*x)+5.5; //Ejemplo de una funcion cuadratica -0.06x^2 + 2.4x + 5.5
		return res; 
		
	}
	
	public static double FuncionDer(double x){
		double res = -1.2*x+2.4;  //Derivada de la funcion cuadratica dando como resultado -1.2x + 2.4 
		return res;
	}
}