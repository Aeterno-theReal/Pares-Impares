import java.util.Scanner;

public class JuegoParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int a=0;
		int b=0;
		int modo=-1;
		int pares=-1;
		
		System.out.print("Introduce el primer número: ");
		a=teclado.nextInt();
		teclado.nextLine();
		
		do 
		{
			System.out.print("Introduce el segundo número (menor que el primero): ");
			b=teclado.nextInt();
			teclado.nextLine();
		}while(b>=a);
		
		do
		{
			System.out.println("Introduzca 0 para mostrar los pares y 1 para los impares:");
			pares = teclado.nextInt();
			teclado.nextLine();
		}while(pares!=0 && pares!=1);
		
		do 
		{
			System.out.println("¿Que modo quieres? 0 Descendente, 1 Ascendente:");
			modo = teclado.nextInt();
			teclado.nextLine();
		}while(modo!=0 && modo!=1);
		
		if(modo==0)
		{
			//DESCENDENTE
			for(int i=a; i>=b; i--)
			{
				//MOSTRAMOS LOS PARES
				if(pares==0)
				{
					if(i%2==0)
					{
						System.out.print(i+ " ");
					}
				}
				else
				{
					//MOSTRAMOS LOS IMPARES
					if(i%2!=0)
					{
						System.out.print(i+ " ");
					}
				}
			}
		}
		else
		{
			//ASCENDENTE
			for(int i=b; i<=a; i++)
			{
				//MOSTRAMOS LOS PARES
				if(pares==0)
				{
					if(i%2==0)
					{
						System.out.print(i+ " ");
					}
				}
				else
				{
					//MOSTRAMOS LOS IMPARES
					if(i%2!=0)
					{
						System.out.print(i+ " ");
					}
				}
			}
		}
		
	}
}