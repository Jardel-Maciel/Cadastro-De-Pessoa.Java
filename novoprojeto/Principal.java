package novoprojeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        while (true) {
            System.out.print("Digite o nome, ou [sair] para finalizar: ");
            String nome = tc.nextLine().trim();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            } else if (nome.isEmpty()) {
                System.out.println("O campo nome é obrigatório!");
                continue;
            }

            System.out.print("Digite a profissão: ");
            String profissao = tc.nextLine().trim();
            if (profissao.isEmpty()) {
                System.out.println("Campo Obrigatório!");
                continue;
            }

            System.out.print("Digite a Idade: ");

            int idade;

            try {

                idade = Integer.parseInt(tc.nextLine().trim());

            } catch (NumberFormatException e) {
                System.out.println("Error! Idade Inválida!");
                continue;
            }

            Pessoa novaPessoa = new Pessoa(nome, profissao, idade);
            listaPessoas.add(novaPessoa);
            System.out.println("Adicionado Com Sucesso!");

            System.out.print(System.lineSeparator());
        }
        tc.close();

        System.out.print(System.lineSeparator());

        System.out.println(" ---- Lista de Pessoas Cadastradas ---- ");
        for (Pessoa p : listaPessoas) {
            System.out.println(p.toString());
        }

    }
}
