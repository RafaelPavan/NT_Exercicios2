import java.util.*;
import java.util.stream.Collectors;

public class Lista5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite quantas rotações quer do alfabeto: ");
        int index = scan.nextInt();


        String alfabetoStr = "abcdefghijklmnopqrstuvwxyz";
        List<Character> alfabeto = converte(alfabetoStr);
        List<Character> alfabetoCifrado = cifraAlfabeto(alfabeto, index);

        String palavra = "Hello World".toLowerCase();
        System.out.printf("A palavra para decifrar é: %s\n", palavra);
        ArrayList<Integer> listaIndex = new ArrayList<>();
        try {
            for (int i = 0; i < palavra.length(); i++){
                String letra = String.valueOf(palavra.charAt(i));
                listaIndex.add(alfabetoStr.indexOf(letra));
            }
            System.out.print("A Palavra decifrada é: ");

            for (int pegaIndex : listaIndex){
                if (pegaIndex == -1){
                    listaIndex.remove(true);
                    System.out.print(" ");
                } else {
                    String letra = String.valueOf(alfabetoCifrado.get(pegaIndex));
                    System.out.print(letra);
                }
            }

        } catch (IndexOutOfBoundsException exc){
            System.out.println(exc);
        }

    }

    public static List<Character> converte (String str){
        return str.chars().mapToObj(e ->(char) e).collect(Collectors.toList());
    }

    public static List<Character> cifraAlfabeto (List<Character> alfabeto, Integer index){
        List<Character> resultado = alfabeto;
        Character character;
        while(index > 0) {
            character = resultado.remove(0);
            resultado.add(character);
            index--;
        }
        return resultado;
    }

}














/*String palavra = "Hello";
        List<Character> chars = converte(palavra.toLowerCase());*/

//System.out.println("alfabeto\n" + converteAlfabeto);

        /*System.out.println("Palavra\n" + chars );

        if (converteAlfabeto.get(7) == chars.get(0)){
            System.out.println(true);
        }*/




        /*// Loop qtd char no alfabeto
        for (Integer i = 0; i < chars.size(); i++){
            System.out.print(i);
        }*/


        /*// Avançando letras pelo índice
        Scanner scanIndex = new Scanner(System.in);
        System.out.print("\nDigite um indice para pegar a letra: ");
        int pega = scanIndex.nextInt() - 1;
        System.out.println("Letra selecionada: " + chars.get(pega) );
        System.out.println("Nova Letra selecionada: " + chars.get(pega + 3) );*/


        /*// Pegando palavra e fatiando (funcionou)
        Scanner scanWord = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String word = scanWord.nextLine();
        List<Character> chars = converte(word);
        System.out.println(chars);*/
