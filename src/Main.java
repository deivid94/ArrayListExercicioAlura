import modelo.pessoal.Pessoas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoas pessoa = new Pessoas();
        pessoa.setNome("Deivid");
        pessoa.setIdade(29);

        var pessoa1 = new Pessoas();
        pessoa1.setNome("Barbara");
        pessoa1.setIdade(29);

        var pessoa2 = new Pessoas();
        pessoa2.setNome("Lucas");
        pessoa2.setIdade(8);

        ArrayList<Pessoas> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);

        System.out.println(listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.toString());



    }
}