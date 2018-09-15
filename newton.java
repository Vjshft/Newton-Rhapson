package Metodos;

import javax.swing.JOptionPane;

public class newton {
	public static void main(String[] args) {
		double contador = 0;
		double valorAnterior = 0;
		double valorActual, xo, xi;
		double ea = 100;
	    double fxo, fo;
	    double es = Double.parseDouble(JOptionPane.showInputDialog("Dame el % minimo aceptado"));
	    xo = Double.parseDouble(JOptionPane.showInputDialog("Dame Xo"));
	    
		do{
			fxo = Funcion(xo);
		    fo = FuncionDer(xo);
			xi = xo - (fxo / fo);
	        valorActual = xi;
	        valorAnterior = xo;
	        System.out.println("Xo: " + xo);
	        System.out.println("Xi: " + xi);
	        ea = ((valorActual - valorAnterior) / valorActual) * 100;
	        ea = Math.abs(ea);
	        System.out.println("Ea: " + ea);
	        System.out.println("Es: " + es);
	        xo = xi;
	        contador++;
	        System.out.println("Iteracion: " + contador);
	        System.out.println("");
		}
		while (ea > es);
		System.out.println("La raiz es: " + xi);
	}
	
	public static double Funcion(double x){
		double res = ((-0.6)*Math.pow(x, 2))+(2.4*x)+5.5;
		//double res = (x/(1-x))*Math.sqrt(7/2+x) - 0.04;
		return res; 
		
	}
	
	public static double FuncionDer(double x){
		double res = -1.2*x+2.4;
		//double res = (Math.sqrt(7)*(Math.pow(x, 2)+x+4))/(2*Math.pow(1-x, 2)*Math.pow(x+2, (3/2)));
		return res;
	}
}