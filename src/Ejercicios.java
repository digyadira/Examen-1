import java.util.Scanner;


//Implementar las funciones
//Sugerencia: pueden usar la funcion main para probar sus funciones pero no es necesario
//Recuerden que pueden:
//"devolver" valores con el "return"
//"Imprimir" valores con el "System.out.print"
//"Pedir" valores con el "Scanner"

public class Ejercicios
{
	//devuelve x multiplicado por 2 (1pt)
	int multiplicarPorDos(int x)
	{
		return x=x*2;
	}
	
	//devuelve el numero mayor entre a, b, c y d (2pts)
	int getMayor(int a, int b, int c, int d)
	{
		

		if ((a>b)&&(a>c)&&(a>d))
		{
			return a;
		}
		else if ((b>a)&&(b>c)&&(b>d))
		{
			return b;
		}
		else if ((c>a)&&(c>b)&&(c>d))
		{
			return c;
				
		}else
		
		return d;
	}
			
	
		
			
	
		
	
	//Pide 2 nombres de personas.
	//Si los nombres son iguales imprime "Tocayos" de lo contrario imprime "No son tocayos". (2pts)
	void sonTocayos()
	{
		Scanner s = new Scanner(System.in);
		String nom1;
		String nom2;
		System.out.println("ingrese un nombre: ");
           nom1=s.next();
           System.out.println("ingrese otro nombre: ");
           nom2=s.next();
           {
        	   if(nom1.equals(nom2 ))
        	   {
        		   
           
        		System.out.println("son tocayos ");
        	   
        	   }else 
        	   {
        		   System.out.println("no son tocayos ");
        	   }
           
	}

	
}
			
	
	//Imprime 100 numeros que sean multiplos de 5(3pts)
	void imprimirMultiplosDe5()
	{
		int numero;
		 numero=1;
		 while(numero<=100){
			 System.out.println("numero");
			 numero=numero+1;
			 if (numero%5==0){
				 System.out.println(numero+"es multiplo de 5");
			 }
		 }
	}
	
	//Devuelve true si edad es menor o igual a 25 y promedio mayor o igual a 85 (3pts)
	boolean aplicaBeca(int edad, int promedio)
	{
		if (edad<=25)
			return true;
		else if (promedio>=85)
			return true;
		return false;
		
	}
	
	//Pide 4 numeros, si todos son pares devuelve true, de lo contrario devuelve false (4puntos)
	boolean sonPares()
	{
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		System.out.println("ingrese numer1: ");
        num1=s.nextInt();
        System.out.println("ingrese numer2: ");
        num2=s.nextInt();
        System.out.println("ingrese numer3: ");
        num3=s.nextInt();
        System.out.println("ingrese numer4: ");
        num4=s.nextInt();
		 return num1/2==0;
		 
	
}
	
	
	//Pueden probar sus funciones en el main pero no es necesario ni será evaluado
	public static void main(String args[])
	{
		
	}
}
