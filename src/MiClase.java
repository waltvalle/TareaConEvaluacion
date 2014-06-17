public class MiClase
{
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		return (a+b);
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return (a-b);
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return (a*b);
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
		if ((num%2)==0)
			return true;
		else
			return false;
	}
	//devuelve el numero mayor entre a, b o c
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
		return (a);
	}
	
	//devuelve num elevado a la potencia. http://foro.elhacker.net/java/calcular_potencia_en_java-t366409.0.html
	static int potencia(int num, int potencia)
	{
		int calculo = num;
		for (int i = 1; i < potencia; i++)
		{
			calculo = (calculo * num) ;
		}
		return (calculo);
	}	
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
		int calculo = 0;
		for (int i = 0; i < arreglo.length; i++)
		{
			calculo = calculo + arreglo[i] ;
		}
		return (calculo);
	}
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
		int num = arreglo[0] ;
		for (int i = 0; i < arreglo.length; i++)
		{
			if (arreglo[i] > num)
			  num = arreglo[i] ;
		}
		return (num);
	}
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
		int num = arreglo[0] ;
		for (int i = 0; i < arreglo.length; i++)
		{
			if (arreglo[i] < num)
			  num = arreglo[i] ;
		}
		return (num);
	}
	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
	for ( int i = 0; i < arreglo.length ; i ++)
	{
		if(arreglo [i] == cadena)
    		return true;
	}
	return false;
	}
	
}
