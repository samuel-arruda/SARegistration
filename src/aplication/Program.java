package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Form;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Cadastro: ");

		System.out.print("Quantos registros serão feitos? ");
		int n = sc.nextInt();

		List<Form> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("------------------");
			System.out.println("Pessoa n°" + i + ":");
			System.out.print("\nDigite o seu nome: ");
			String nome = sc.nextLine();

			System.out.print("\nDigite o ano do seu nascimento: ");
			Integer ano = sc.nextInt();

			System.out.print("\nDigite a sua idade: ");
			Integer idade = sc.nextInt();

			System.out.print("\nDigite seu genero biologico:(M/F) ");
			Character gen = sc.next().toUpperCase().charAt(0);
			
			
			 if (gen != 'M' && gen != 'F') {
				 System.out.print("\nPor favor digite M para Masculino ou F para feminino: ");
				 gen = sc.next().toUpperCase().charAt(0);
			 }
		
			list.add(new Form(nome, ano, idade, gen));
			System.out.println();
		}
		System.out.println("Pessoas cadastradas:");
		
		for (Form obj : list) {
			System.out.println(obj);
			System.out.println("-----------------------");
		}

		sc.close();

	}

}
