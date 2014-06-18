public class MiClase
{
	//devuelve la suma de a y b.
	//se toman ambas variables y se opera la suma
	static int sumarNumeros(int a, int b)
	{
		return (a+b);
	}
	
	//devuelve la resta de a y b
	//se toman ambas variables y se opera la resta
	static int restarNumeros(int a, int b)
	{
		return (a-b);
	}
	
	//devuelve la multiplicación de a y b
	//se toman ambas variables y se opera la multiplicacion
	static int multiplicarNumeros(int a, int b)
	{
		return (a*b);
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	//se utiliza un modulo para determinar si el numero es divisible entre dos y el residuo es 0, si es 0 entonces es par, si no devuelve falso
	static boolean esPar(int num)
	{
		if ((num%2)==0)
			return true;
		else
			return false;
	}
	//devuelve el numero mayor entre a, b o c
	//se compara la variable a con b y c, variable b con a y c y variable c con a y b. 
	static int getMayor(int a, int b, int c)
	{
		if (a>b && a>c)
		{
			return a;
		}
		if (b>a && b>c)
		{
			return b;
		}
		if (c>a && c>b)
		{
			return c;
		}
		// La mayor de las variables es impresa, si no se cumple se retorna cualquiera
		return (a);
	}
	
	//devuelve num elevado a la potencia. 
	//fuente: http://foro.elhacker.net/java/calcular_potencia_en_java-t366409.0.html
	// La variable calculo sera igual a lo que tiene num. Se crea un for con un contador que termina cuando el ciclo  es menor que la potencia 
	static int potencia(int num, int potencia)
	{
		int calculo = num;
		for (int i = 1; i < potencia; i++)
		{
			// calculo sera igual a lo que tiene calculo por lo que tiene num
			calculo = (calculo * num) ;
		}
		// finalmente se retorna calculo
		return (calculo);
	}	
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
		// Se crea una variable calculo que toma valor 0
		int calculo = 0;
		// se asigna un contador que recorra todo el arreglo
		for (int i = 0; i < arreglo.length; i++)
		{
			// calculo sera igual a calculo mas lo que tenga el arreglo en cada vuelta
			calculo = calculo + arreglo[i] ;
		}
		// se retorna calculo
		return (calculo);
	}
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
	// Num sera igual a lo que tenga arreglo desde la posicion 0	
		int num = arreglo[0] ;
		for (int i = 0; i < arreglo.length; i++)
		// se asigna un contador que recorra todo el arreglo
		{
		// se crea una condicion que lo que tenga el arreglo en una posicion es mayor a num entonces num sera igual a lo que tenga el arreglo en esa posicion
			if (arreglo[i] > num)
			  num = arreglo[i] ;
		}
		return (num);
	}
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
		// Num sera igual a lo que tenga arreglo desde la posicion 0
		int num = arreglo[0] ;
		// se asigna el contador que recorra el arreglo
		for (int i = 0; i < arreglo.length; i++)
		{
			// se crea una condicion que lo que tenga el arreglo en una posicion es menor a num entonces num sera igual a lo que tenga el arreglo en esa posicion
			if (arreglo[i] < num)
			  num = arreglo[i] ;
		}
		return (num);
	}
	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
	// se crea un for que recorra el arreglo
	for ( int i = 0; i < arreglo.length ; i ++)
	{
		// si una posicion en el arreglo contiene la cadena devuelve true
		if(arreglo [i] == cadena)
    		return true;
	}
	// si no se cumple es false
	return false;
	}
	
}

