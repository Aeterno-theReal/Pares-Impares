import java.util.Scanner;

public class DibujarCuadrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion=-1;
		int filas=-1;
		int columnas=-1;
		String hueco="";
		boolean correcto=true;
		boolean vacio=true;

		
		System.out.println("---- DIBUJOS GEOMÉTRICOS ----");
		
		do 
		{
			correcto=true;
			System.out.print("escriba [1] para dibujar cuadrados o rectángulos, [2] para formas geométricas: ");
			opcion=teclado.nextInt();
			teclado.nextLine();
			if(opcion<0 || opcion>2)
			{
				correcto=false;
				System.out.println("Error al introducir la opción");
			}
		}while(!correcto);
		
		do
		{
			correcto=true;
			System.out.print("Introduzca el número de filas que desea: ");
			filas=teclado.nextInt();
			teclado.nextLine();
			
			if(filas<0)
			{
				correcto=false;
				System.out.println("Error al introducir el número");
			}
		}while(!correcto);
		
		if(opcion==1)
		{
			do 
			{
				correcto=true;
				System.out.print("Introduzca el número de columnas que desea: ");
				columnas=teclado.nextInt();
				teclado.nextLine();
				
				if(columnas<0)
				{
					correcto=false;
					System.out.println("Error al introducir el número");
				}
			}while(!correcto);
			
			do
			{
				correcto=true;
				System.out.print("¿Desea dibujar el cuadrado/rectángulo hueco? [V/v = vacio || R/r = relleno]: ");
				hueco=teclado.nextLine();
				
				if(hueco.equals("V") || hueco.equals("v"))
					vacio=true;
				else
					if(hueco.equals("R") || hueco.equals("r"))
						vacio=false;
					else
						correcto=false;
			}while(!correcto);
			
			System.out.println("Se procede a dibujar un cuadro con " + filas + " filas y " + columnas + " columnas:\n");
			
			//Comprobamos si lo desea hueco o relleno
			if(vacio==false) //En caso de ser relleno
				for(int i=1;i<=filas;i++)
				{
					for(int j=1;j<=columnas;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
			else //En caso de ser hueco
				for(int i=1;i<=filas;i++)
				{
					for(int j=1;j<=columnas;j++)
					{
						if(i>1 && i<filas && j>1 && j<columnas)
							System.out.print("  ");
						else
							System.out.print("* ");
					}
					System.out.println();
				}
		}
		else {
			//DIBUJAMOS LA FIGURA 1.
			System.out.println("-++++ FIGURA 1 ++++-\n");

			for(int i=0; i<filas; i++)
			{
				for(int j=0; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			//DIBUJAMOS LA FIGURA 2.
			System.out.println("\n-++++ FIGURA 2 ++++-\n");

			for(int i=0; i<filas; i++)
			{
				for(int j=filas; j>i; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			//DIBUJAMOS LA FIGURA 3.
			System.out.println("\n-++++ FIGURA 3 ++++-\n");

				for(int i=0; i<filas; i++)
				{
					for(int h=0; h<filas-i-1; h++)
					{
						System.out.print(" ");
					}
					for(int j=0; j<=i; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
			//DIBUJAMOS LA FIGURA 4.
			System.out.println("\n-++++ FIGURA 4 ++++-\n");

			for(int i=0; i<filas; i++)
			{
				for(int h=0; h<i; h++)
				{
					System.out.print(" ");
				}
				for(int j=0; j<filas-i; j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
			
			//DIBUJAMOS LA FIGURA 5.
			System.out.println("-++++ FIGURA 5 ++++-\n");

			for(int i=0; i<=filas-1; i++)
			{
				for(int j=0; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=filas*2-1; i>filas; i--)
			{
				for(int j=i-filas; j>0; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			//DIBUJAMOS LA FIGURA 6.
			System.out.println("\n-++++ FIGURA 6 ++++-\n");
			
			for(int i=0; i<filas; i++)
			{
				for(int l=0; l<filas-i-1; l++)
				{
					System.out.print(" ");
				}
				for(int j=0; j<=i; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=filas*2-1; i>filas; i--)
			{
				for(int l=0; i+l<filas*2; l++)
				{
					System.out.print(" ");
				}
				for(int j=0; i-j>filas; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}

			//DIBUJAMOS LA FIGURA 7
			System.out.println("\n-++++ FIGURA 7 ++++-\n");

				for(int i=1; i<=filas; i++)
				{
					for(int l=0; l<filas-i; l++)
					{
						System.out.print(" ");
					}
					for(int j=0; j<i*2-1; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
			//DIBUJAMOS LA FIGURA 8
			System.out.println("\n-++++ FIGURA 8 ++++-\n");

				for(int i=1; i<=filas; i++)
				{
					for(int l=0; l<filas-i; l++)
					{
						System.out.print("*");
					}
					for(int j=0; j<i*2-1; j++)
					{
						System.out.print(" ");
					}
					System.out.println();
				}
		}
		System.out.println("\n---- FIN DEL PROGRAMA ----");
	}

}
