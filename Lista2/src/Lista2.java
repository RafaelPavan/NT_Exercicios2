import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("PEDRO");
        nomes.add("ANA");
        nomes.add("LUCAS");
        nomes.add("MARIA");
        nomes.add("TALITA");
        nomes.add("JHONSON");
        nomes.add("AMANDA");
        nomes.add("JOICE");
        nomes.add("MARIO");
        nomes.add("CARLOS");
        nomes.add("JENIFER");

        List<String> vogal = new ArrayList<>();
        List<String> consoantes = new ArrayList<>();


        for ( String nome : nomes) {
                if (nome.startsWith("A") || nome.startsWith("E") || nome.startsWith("I") || nome.startsWith("O")
                        || nome.startsWith("U")) {
                    vogal.add(nome);
                } else {
                    consoantes.add(nome);
                }
        }


        System.out.println("Com Vogais: ");
        Collections.sort(vogal);
        vogal.forEach(System.out::println);

        System.out.println("\nCom Consoantes: ");
        Collections.sort(consoantes);
        consoantes.forEach(System.out::println);




        // Tentar desempacotar as Strings
    }

}
