import java.util.Scanner;
//1.	Desarrolla un TicTacToe (o Juego de Gato)
//2.	Debe de dibujar en la pantalla la cuadrícula y mantenerla actualizada conforme los usuarios colocan su siguiente jugada
//3.	En cada jugada, debe solicitarle a los jugadores las coordenadas de su siguiente movimiento y posteriormente, pintarlo.
//4.	El juego debe ser capaz de detectar cuando las X’s o las O’s han ganado, y en ese momento, detener el juego y anunciar el ganador.
//5.	Se deben utilizar objetos y funciones para optimizar el código. Ejemplo:

//public void dibujar(int x, int y, int symbol)

//6.	Debe estar programado en Java
//7.	Se debe de programar con las convenciones de Java: Clases con mayúscula, etc.


public class Examen{
	public static void main(String[] args) {
		String p1="";
		String p2="";
		String jugar="si";
		Scanner sc=new Scanner(System.in);
		System.out.println("Bienvenido a TIC TAC TOE");
		System.out.println("");
		System.out.println("Instrucciones: Por turnos, escribir el numero de fila y columna donde quieras colocar tu ficha.Recuerda que es de 0 a 3.");

		while(jugar.equals("si")){
		System.out.println("");
		System.out.println("Nombre del jugador 1");
		p1=sc.nextLine();		

		System.out.println("Nombre del jugador 2");
		p2=sc.nextLine();
		System.out.println("\n");		
			String Arreglo[][];
			Arreglo= new  String[3][3];
		
			for(int k=0; k<3; k++){
				for(int b=0; b<3; b++){
					
				Arreglo[k][b]="";	
				}
			} 
			
			boolean gana=false;
			while( gana==false){
				System.out.print("Turno de " + p1);
				System.out.println();
				System.out.print("Fila: " );
				String tf1;
				tf1=sc.nextLine();
				
				boolean mayor=false;
				
				if(tf1.equals("2")){
					mayor=true;	
				}
				if(tf1.equals("1")){
					mayor=true;
				}
				if(tf1.equals("0")){
					mayor=true;
				}
				
				while(mayor==false){
					System.out.print("Tienes que escribir un numero de 0 a 2" );
					System.out.println();		
					System.out.print("Fila: " );
					tf1=sc.nextLine();
					if(tf1.equals("2")){
						mayor=true;	
					}
					if(tf1.equals("1")){
						mayor=true;
					}
					if(tf1.equals("0")){
						mayor=true;
					}
				}
				System.out.println();
				System.out.print("Columna: " );
				String tc1=sc.nextLine();
				
				mayor=false;
				
				if(tc1.equals("2")){
					mayor=true;	
				}
				if(tc1.equals("1")){
					mayor=true;
				}
				if(tc1.equals("0")){
					mayor=true;
				}
				
				while(mayor==false){
					System.out.print("Tienes que escribir un numero de 0 a 2" );
					System.out.println();		
					System.out.print("Fila: " );
					tf1=sc.nextLine();
					if(tc1.equals("2")){
						mayor=true;	
					}
					if(tc1.equals("1")){
						mayor=true;
					}
					if(tc1.equals("0")){
						mayor=true;
					}
				}
				boolean fallaConversion=false;
				int ntf1=0;
				int ntc1=0;
				
				try{
					ntf1=(Integer.parseInt(tf1));
					ntc1=(Integer.parseInt(tc1));
				}
				catch(NumberFormatException nfe){
					fallaConversion=true;
				}
				//while
				
				while(fallaConversion==true){
					System.out.println("Estimado usuario: Favor de colocar numeros ");
					System.out.print("Fila: " );
					tf1=sc.nextLine();
					System.out.println();
					System.out.print("Columna: " );
					 tc1=sc.nextLine();
					//System.out.println("despues del fc");
					try{
						ntf1=(Integer.parseInt(tf1));
						ntc1=(Integer.parseInt(tc1));
						//System.out.println("entra al try para convertir");
						fallaConversion=false;
					}
					catch(NumberFormatException nfe){
						//System.out.println("catch");
						fallaConversion=true;
					}
				}
				boolean vacio=false;
				if((Arreglo[ntf1][ntc1]=="") & fallaConversion==false){
					//System.out.println("vacio true");
					//System.out.println(ntf1+"-"+ntc1);
					vacio=true;
					Arreglo[ntf1][ntc1]="X";
				}
				while (vacio==false){	
					System.out.println("Tienes que elegir una celda vacía");
					System.out.print("Fila: " );
					tf1=sc.nextLine();
					System.out.println();
					System.out.print("Columna: " );
					tc1=sc.nextLine();
				
					try{
						ntf1=(Integer.parseInt(tf1));
						ntc1=(Integer.parseInt(tc1));
					}
					catch(NumberFormatException nfe){
						fallaConversion=true;
					}
					if(fallaConversion==true){
						System.out.println("Estimado usuario: Favor de colocar numeros ");
					}
					if((Arreglo[ntf1][ntc1]=="")){
						vacio=true;
						Arreglo[ntf1][ntc1]="X";
					}
					}
				
			imprimirmatriz(Arreglo);
				//evaluar(Arreglo);
				if((Arreglo[0][0]=="X" & Arreglo[0][1]=="X"  & Arreglo[0][2]=="X" ) | (Arreglo[1][0]=="X" & Arreglo[1][1]=="X" &  Arreglo[1][2]=="X" ) | (Arreglo[2][0]=="X" & Arreglo[2][1]=="X" & Arreglo[2][2]=="X" )){
					gana=true;
				}
				if((Arreglo[0][0]=="X" & Arreglo[2][0]=="X" & Arreglo[1][0]=="X" )|(Arreglo[0][1]=="X" & Arreglo[1][1]=="X" & Arreglo[2][1]=="X" )|(Arreglo[0][2]=="X"  & Arreglo[1][2]=="X" & Arreglo[2][2]=="X" )){
					gana=true;
				}
				if((Arreglo[0][0]=="X" & Arreglo[2][2]=="X" & Arreglo[1][1]=="X" )|(Arreglo[0][2]=="X" & Arreglo[1][1]=="X" & Arreglo[2][0]=="X" )){
					gana=true;
				}

				//String resultado=evaluar(Arreglo);
				//System.out.print(resultado);
				if(gana==true){
					System.out.print("Felicidades, "+ p1+ ". ¡Ganaste!");
				}
				//checar si ya se llenó 
				
				int i=0;
				for(int k=0; k<3; k++){
					for(int b=0; b<3; b++){
						if((Arreglo[k][b]=="X") | (Arreglo[k][b]=="O")){;	
								i++;
						}
					}
				} 
				if(i==9){
					System.out.print("Es gato!");
					gana=true;
				}
			
			if(gana==false){
				System.out.print("Turno de " + p2);
				System.out.println();
				System.out.print("Fila: " );
				String tf2;
				tf2=sc.nextLine();
				mayor=false;
				
				if(tf2.equals("2")){
					mayor=true;	
				}
				if(tf2.equals("1")){
					mayor=true;
				}
				if(tf2.equals("0")){
					mayor=true;
				}
				
				while(mayor==false){
					System.out.print("Tienes que escribir un numero de 0 a 2" );
					System.out.println();		
					System.out.print("Fila: " );
					tf2=sc.nextLine();
					if(tf2.equals("2")){
						mayor=true;	
					}
					if(tf2.equals("1")){
						mayor=true;
					}
					if(tf2.equals("0")){
						mayor=true;
					}
				}
				System.out.println();
				System.out.print("Columna: " );
				String tc2;
				tc2=sc.nextLine();
				mayor=false;
				
				if(tc2.equals("2")){
					mayor=true;	
				}
				if(tc2.equals("1")){
					mayor=true;
				}
				if(tc2.equals("0")){
					mayor=true;
				}
				
				while(mayor==false){
					System.out.print("Tienes que escribir un numero de 0 a 2" );
					System.out.println();		
					System.out.print("Fila: " );
					tc2=sc.nextLine();
					if(tc2.equals("2")){
						mayor=true;	
					}
					if(tc2.equals("1")){
						mayor=true;
					}
					if(tc2.equals("0")){
						mayor=true;
					}
				}
				int ntf2 = 0;
				int ntc2=0;
				boolean fallaConversion2=false;
				try{
					ntf2=(Integer.parseInt(tf2));
					ntc2=(Integer.parseInt(tc2));
				}
				catch(NumberFormatException nfe){
					fallaConversion2=true;
				}
				//while
				
				while(fallaConversion2==true){
					System.out.println("Estimado usuario: Favor de colocar numeros ");
					System.out.print("Fila: " );
					tf2=sc.nextLine();
					System.out.println();
					System.out.print("Columna: " );
					 tc2=sc.nextLine();
					//System.out.println("despues del fc");
					try{
						ntf2=(Integer.parseInt(tf2));
						ntc2=(Integer.parseInt(tc2));
						//System.out.println("entra al try para convertir");
						fallaConversion2=false;
					}
					catch(NumberFormatException nfe){
						//System.out.println("catch");
						fallaConversion=true;
					}
				}
				boolean vac=false;
				if((Arreglo[ntf2][ntc2]=="") & fallaConversion==false){
					//System.out.println("vacio true");
					//System.out.println(ntf2+"-"+ntc2);
					vac=true;
					Arreglo[ntf2][ntc2]="O";
				}
				while (vac==false){	
					System.out.println("Tienes que elegir una celda vacía");
					System.out.print("Fila: " );
					tf2=sc.nextLine();
					System.out.println();
					System.out.print("Columna: " );
					tc2=sc.nextLine();
				
					try{
						ntf2=(Integer.parseInt(tf2));
						ntc2=(Integer.parseInt(tc2));
					}
					catch(NumberFormatException nfe){
						fallaConversion2=true;
					}
					if(fallaConversion2==true){
						System.out.println("Estimado usuario: Favor de colocar numeros ");
					}
					if((Arreglo[ntf2][ntc2]=="")){
						vac=true;
						Arreglo[ntf2][ntc2]="O";
					}
					}
				
				imprimirmatriz(Arreglo);
				if((Arreglo[0][0]=="O" & Arreglo[0][1]=="O"  & Arreglo[0][2]=="O" ) | (Arreglo[1][0]=="O" & Arreglo[1][1]=="O" &  Arreglo[1][2]=="O" ) | (Arreglo[2][0]=="O" & Arreglo[2][1]=="O" & Arreglo[2][2]=="O" )){
					gana=true;
				}
				if((Arreglo[0][0]=="O" & Arreglo[2][0]=="O" & Arreglo[1][0]=="O" )|(Arreglo[0][1]=="O" & Arreglo[1][1]=="O" & Arreglo[2][1]=="O" )|(Arreglo[0][2]=="O"  & Arreglo[1][2]=="O" & Arreglo[2][2]=="O" )){
					gana=true;
				}
				if((Arreglo[0][0]=="O" & Arreglo[2][2]=="O" & Arreglo[1][1]=="O" )|(Arreglo[0][2]=="O" & Arreglo[1][1]=="O" & Arreglo[2][0]=="O" )){
					gana=true;
				}
				if(gana==true){
					System.out.print("Felicidades, "+ p2+ ". ¡Ganaste!");
				}
				i=0;
				for(int k=0; k<3; k++){
					for(int b=0; b<3; b++){
						if((Arreglo[k][b]=="X") | (Arreglo[k][b]=="O")){;	
								i++;
						}
					}
				} 
				if(i==9){
					System.out.print("Es gato!");
					gana=true;
				}
			
			}
					
			}	
			System.out.println("\n");
			System.out.print("¿Quieres volver a jugar?");
					jugar=sc.nextLine();		
			}
			sc.close();	

			}
				
private static void  imprimirmatriz(String arg[][]) {
	// TODO Auto-generated method stub
	System.out.println("");
	for(int k=0; k<3; k++){
		for(int b=0; b<3; b++){
		if(arg[k][b]==null){
			System.out.print(" |  ");	
		}
		else{
			System.out.print(" | "+ arg[k][b]);	
		}
			
		}
		System.out.print(" | ");
		System.out.println();
	}
	System.out.println("");
}
private static String  evaluar(String arr[][]) {
	// TODO Auto-generated method stub
	boolean ganas=false;
	if((arr[0][0]==arr[0][1] & arr[0][2]==arr[0][1])|(arr[1][0]==arr[1][1] & arr[1][1]==arr[1][2])|(arr[2][0]==arr[2][1] & arr[2][1]==arr[2][2])){
		if((!(arr[0][0]=="") & (!(arr[0][1]=="")) & !(arr[0][2]=="")) | (!(arr[1][0]=="") & (!(arr[1][1]=="")) & !(arr[1][2]=="")) | (!(arr[2][0]=="") & (!(arr[2][1]=="")) & !(arr[2][2]==""))) {
			ganas=true;
		}
	}
	if((arr[0][0]==arr[1][0] & arr[2][0]==arr[1][0])|(arr[0][1]==arr[1][1] & arr[1][1]==arr[2][1])|(arr[0][2]==arr[1][2] & arr[1][2]==arr[2][2])){
		if((!(arr[0][0]=="") & (!(arr[1][0]=="")) & !(arr[2][0]=="")) | (!(arr[0][1]=="") & (!(arr[1][1]=="")) & !(arr[2][1]=="")) | (!(arr[0][2]=="") & (!(arr[1][2]=="")) & !(arr[2][2]==""))) {
			ganas=true;
		}
	}
	if((arr[0][0]==arr[1][1] & arr[2][2]==arr[1][1])|(arr[0][2]==arr[1][1] & arr[1][1]==arr[2][0])){
		if((!(arr[0][0]=="") & (!(arr[1][1]=="")) & !(arr[2][2]=="")) | (!(arr[0][2]=="") & (!(arr[1][1]=="")) & !(arr[2][0]==""))) {
			ganas=true;
		}
	}
	if (ganas==true){
		System.out.println("Felicidades, fuiste el ganador");
		int o=1;
	
	}
	return "";

}	
private static void  fc(String t, String c) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Fila: " );
	String tf1;
	tf1=sc.nextLine();
	System.out.println();
	System.out.print("Columna: " );
	String tc1=sc.nextLine();

}

}
