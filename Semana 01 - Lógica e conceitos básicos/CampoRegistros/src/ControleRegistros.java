import java.util.Scanner;

	public class ControleRegistros {
		public static void main(String args[]){
			Scanner input = new Scanner(System.in);
			String [] carros = {"Uno", "Hb20","Gol","Ka"};
			String [] ordem = {"1", "2","3","4"};
			
			for (int pos=0; pos<=3; pos++){
				System.out.println(ordem[pos]+ " - " + carros[pos]);
				}
	
			input.close();		
		}
}
