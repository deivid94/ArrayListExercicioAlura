import modelo.pessoal.Pessoas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoas pessoa = new Pessoas("Deivid", 29);
        Pessoas pessoa1 = new Pessoas("Barbara", 29);
        Pessoas pessoa2 = new Pessoas("Maria", 70);

        ArrayList<Pessoas> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);


        System.out.println(listaDePessoas.get(0).getNome());
        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.toString());



    }
}