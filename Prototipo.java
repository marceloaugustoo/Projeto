package br.com.generation.projetja;
import java.util.Scanner;
public class Prototipo {
	public static void produto(int dispositivo) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		while (dispositivo == 0) {
			System.out.println("Escolha uma das op��es");
			System.out.println("\n1 - Ar condicionado" + "\n2 - Chuveiro" + "\n3 - Forno Eletrico"
					+ "\n4 - Geladeira" + "\n5 - Voltar para a pergunta anterior" + "\n6 - Voltar para o menu principal"
					+"\n7 - Sair do programa");
			dispositivo = scan.nextInt();
			
			if (dispositivo == 1) {
				System.out.println("Ar condicionado");
				
			}
			else if (dispositivo == 2) {
				System.out.println("Chuveiro");
				
			}
			else if (dispositivo == 3) {
				System.out.println("Forno Eletrico");
				
			}
			else if (dispositivo == 4) {
				System.out.println("Geladeira");
				
			}
			else if (dispositivo == 5) {
				System.out.println("Volta a pergunta");
				
			}
			else if (dispositivo == 6) {
				System.out.println("Volta ao menu");
				
			}
			else if (dispositivo == 7) {
				System.out.println("Porgrama finalizado, agradecemos a utilizacao.");
				
			}
			else {
				System.out.println("Favor inserir escolha valida.");
				dispositivo = 0;
			}
			
		}
		scan.close();
		return;
	}
}
