import java.util.ArrayList;

public class Lista1 {
    public static void main(String[] args) {
        ArrayList<String> frases = new ArrayList<>();
        frases.add("A base do teto desaba");
        frases.add("A batata e o tabaco");
        frases.add("Acuda cadela da Leda caduca");
        frases.add("Vida vivida");
        frases.add("Anotaram a data da maratona");
        frases.add("A torre da derrota");
        frases.add("A casa esta casada");
        frases.add("O galo ama o lago");
        frases.add("Oito Morros Altos");

        for (String i : frases){
            System.out.print(i + ": ");
            String frase = i.replace(" ", "").toLowerCase();
            String invertida = new StringBuffer(frase).reverse().toString();
            invertida = (frase.equals(invertida)) ? "É palindromo " : "Não é palindromo";
            System.out.println(invertida);

        }





    }
}
