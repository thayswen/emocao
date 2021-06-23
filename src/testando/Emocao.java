package testando;

import java.util.Scanner;

public class Emocao {

	public static void main(String[] args) {
//Bem vindo
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = entrada.next();

		System.out.println("Olá " + nome + ". Como você está? ");
		String emocao = entrada.next();

		if (emocao.toLowerCase().contains("mal") || emocao.toLowerCase().contains("triste")) {
			System.out.println("Eu posso ajudar?\n Sim/Não");
			String escolha = entrada.next();

			if (escolha.toLowerCase().contains("sim")) {
				System.out.println("Então vou ajudar");

				if (escolha.toLowerCase().contains("não") || escolha.toLowerCase().contains("nao")) {
					System.out.println("Então vamos falar de outra coisa.");
				}
			} else {
				System.out.println("ERROR--- Use sim ou não para responder...");
			}
			if (emocao.toLowerCase().contains("bem") || emocao.toLowerCase().contains("feliz")) {
				System.out.println("Que ótimo!!");
			}
		}

	}

}
