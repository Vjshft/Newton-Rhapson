def funcion(x):
  resultado = (0.06**x)+(2.4*x)+5.5 ##Ejemplo de una funcion cuadratica -0.06x^2 + 2.4x + 5.5
  return resultado

def funcionDerivada(x):
  resultado = -1.2*x+2.4;  ##Derivada de la funcion cuadratica dando como resultado -1.2x + 2.4 
  return resultado

##se pregunta al usuario por el porcentaje de error minimo aceptado y la x con la que empieza a correr el programa 
print("Dame el % minimo aceptado")
es = float(input())
print("Dame Xo")
x0 = float(input())
##inicializa las variables de contador Valor Anterior, Valor actual, x0, xi y el porcentaje de error.
contador = 0
valorAnterior = 0
valorActual = 0 
xo = 0
xi = 0
ea = 100 ##porcentaje de error
##valor de y en las funcion original y la derivada
fxo = 0
fo = 0 

while(ea > es):
	fxo = funcion(xo) ##obtiene el valor de y al evaluar x0 en la funcion
	fo = funcionDerivada(xo) ##obtiene el valor de y al evaluar x0 en la funcion derivada
	xi = xo - (fxo / fo) 
	valorActual = xi
	valorAnterior = xo
	print("Xo: ", xo)
	print("Xi: ", xi)
	ea = ((valorActual - valorAnterior) / valorActual) * 100 ##calcula el porcentaje de error nuevo
	ea = abs(ea) 
	print("Ea: ", ea)
	print("Es: ", es)
	xo = xi
	contador = contador + 1
	print("Iteracion: ", contador)
	print("")

print("La raiz es: ", xi) ##imprime la raiz que se obtuvo