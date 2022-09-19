import java.util.ArrayList;
import java.util.Collections;

public class Lista4 {
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

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }


    }
}
