import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PartesProntas {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /**
         * Gerador do alfabeto
         */
        StringBuilder alfabeto = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++){
            alfabeto.append(c);
        }
        // Imprime os indices do alfabeto
        System.out.println(convertePalavraAscii(String.valueOf(alfabeto)));

        /**
         * Vai scanear a palavra e retornar uma lista de caracteres e os indíces ascii
         * Exemplo: [h,   e,   l,   l,    o]
         *         [104, 101, 108, 108, 111]
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(converte(word));
        System.out.println(convertePalavraAscii(word));

    }


    /**
     * Vai converter e concatenar uma String em Lista
     * Exemplo : String "hello" -> List 'h', 'e', 'l', 'l', 'o'
     * @param str
     * @return
     */
    public static List<Character> converte (String str){
        return str.chars().mapToObj(e ->(char) e).collect(Collectors.toList());
    }

    /**
     * Vai receber uma palavra e retornar os respectivos indíces de cada letra em um Array, pela tabela ascii
     * Exemplo: String "hello" -> bytes: [104, 101, 108, 108, 111]
     * @param palavra
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String convertePalavraAscii (String palavra) throws UnsupportedEncodingException {
        byte[] bytes = palavra.getBytes("US-ASCII");
        String arrayCaracter = Arrays.toString(bytes);
        return arrayCaracter;
    }


    public static String cifraPalavra (List<Character> palavra, List<Character> alfabeto, List<Character> alfabetoCifrado){
        StringBuilder palavraCifrada = new StringBuilder();
        int index = 0;
        for (Character item : palavra){
            index = alfabeto.get(item);
            palavraCifrada.append(alfabetoCifrado.get(index));
        }

        return palavraCifrada.toString();
    }
}
