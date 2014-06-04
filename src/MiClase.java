
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
	{
		return false;
	}
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
	int i=num;
	{
		for (int i=0, i<potencia, i++)
	{
		return (potencia=i*num)
	}
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
		return -1;
	}
	
	//devuelve el numero mayor de un arreglo
	static int getMayorArreglo(int arreglo[])
	{
		return -1;
	}
	
	//devuelve el numero menor de un arreglo
	static int getMenorArreglo(int arreglo[])
	{
		return -1;
	}
	
	//devuelve true si encuentra cadena dentro arreglo
	static boolean existe(String arreglo[],String cadena)
	{
		return false;
	}
	
	public static void main(String args[])
	{
		
	}
}
