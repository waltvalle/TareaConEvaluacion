import static org.junit.Assert.*;

import org.junit.Test;


public class Evaluar {

	@Test
	public void testSumarNumeros()
	{
		assertEquals("10 + 20 deberia ser igual a 30", 30, MiClase.sumarNumeros(10,20));
		assertEquals("100 + 230 deberia ser igual a 330", 330, MiClase.sumarNumeros(100,230));
		assertEquals("-5 + 10 deberia ser igual a 5", 5, MiClase.sumarNumeros(-5,10));
		assertEquals("22 + 11 deberia ser igual a 11", 11, MiClase.sumarNumeros(22,-11));
	}
	
	@Test
	public void testRestarNumeros()
	{
		assertEquals("50 - 40 deberia ser igual a 10", 10, MiClase.restarNumeros(50,40));
		assertEquals("27 - 5 deberia ser igual a 22", 22, MiClase.restarNumeros(27,5));
		assertEquals("-5 - 10 deberia ser igual a -15", -15, MiClase.restarNumeros(-5,10));
		assertEquals("22 - 11 deberia ser igual a 33", 11, MiClase.restarNumeros(22,11));
	}
	
	@Test
	public void testMultiplicarNumeros()
	{
		assertEquals("4 * 4 deberia ser igual a 16", 16, MiClase.multiplicarNumeros(4,4));
		assertEquals("3 * 2 deberia ser igual a 6", 6, MiClase.multiplicarNumeros(3,2));
		assertEquals("7 * 3 deberia ser igual a 21", 21, MiClase.multiplicarNumeros(7,3));
		assertEquals("8 * 2 deberia ser igual a 16", 16, MiClase.multiplicarNumeros(8,2));
	}
	
	@Test
	public void testEsPar()
	{
		assertEquals("8 deberia de ser par", true, MiClase.esPar(8));
		assertEquals("-5 deberia de ser impar", false, MiClase.esPar(-5));
		assertEquals("5 deberia de ser impar", false, MiClase.esPar(5));
		assertEquals("12 deberia de ser par", true, MiClase.esPar(12));
		assertEquals("3 deberia de ser impar", false, MiClase.esPar(3));
	}
	
	@Test
	public void testGetMayor()
	{
		assertEquals("El mayor entre 6, 2 y 3 deberia ser 6", 6, MiClase.getMayor(6, 2, 3));
		assertEquals("El mayor entre -2, 7 y 1 deberia ser 7", 7, MiClase.getMayor(-2, 7, 1));
		assertEquals("El mayor entre 1, 8 y 10 deberia ser 10", 10, MiClase.getMayor(1, 8, 10));
	}
	
	@Test
	public void testPotencia()
	{
		assertEquals("2 a la 3 deberia de ser 8", 8, MiClase.potencia(2,3));
		assertEquals("4 a la 2 deberia de ser 16", 16, MiClase.potencia(4,2));
		assertEquals("5 a la 4 deberia de ser 625", 625, MiClase.potencia(5,4));
	}
	
	@Test
	public void testSumarArreglo()
	{
		int arr1[]={5,2,3};
		assertEquals("5 + 2 + 3 deberia de ser 10", 10, MiClase.sumarArreglo(arr1));
		int arr2[]={7,1,4,2};
		assertEquals("7 + 1 + 4 + 2 deberia de ser 14", 14, MiClase.sumarArreglo(arr2));
		int arr3[]={2,9};
		assertEquals("2 + 9 deberia de ser 11", 11, MiClase.sumarArreglo(arr3));
	}
	
	@Test
	public void testGetMayorAreglo()
	{
		int arr1[]={5,2,3};
		assertEquals("El mayor de 5, 2 y 3 deberia ser 5", 5, MiClase.getMayorArreglo(arr1));
		int arr2[]={7,1,4,2};
		assertEquals("El mayor de 7, 1, 4, 2 deberia ser 7", 7, MiClase.getMayorArreglo(arr2));
		int arr3[]={2,9};
		assertEquals("El mayor de 2 y 9 deberia ser 9", 9, MiClase.getMayorArreglo(arr3));
	}
	
	@Test
	public void testGetMenorAreglo()
	{
		int arr1[]={5,2,3};
		assertEquals("El mayor de 5, 2 y 3 deberia ser 2", 2, MiClase.getMenorArreglo(arr1));
		int arr2[]={7,1,4,2};
		assertEquals("El mayor de 7, 1, 4, 2 deberia ser 1", 1, MiClase.getMenorArreglo(arr2));
		int arr3[]={2,9};
		assertEquals("El mayor de 2 y 9 deberia ser 2", 2, MiClase.getMenorArreglo(arr3));
	}
	
	@Test
	public void testExiste()
	{
		String arr1[]={"hola","mundo","chuy"};
		assertEquals("{ \"hola\", \"mundo\", \"chuy\"} si contiene hola", true, MiClase.existe(arr1,"hola"));
		String arr2[]={"montuca","semita","rosquilla","pan blanco"};
		assertEquals("{ \"hola\", \"mundo\", \"chuy\"} si contiene a semita", true, MiClase.existe(arr2,"semita"));
		String arr3[]={"a","b"};
		assertEquals("{ \"b\", \"a\"} no contiene c", false, MiClase.existe(arr3,"c"));
	}
}
