import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class io1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("Io_1/Request.txt"), StandardCharsets.UTF_8);
        PrintStream adicionaLista = new PrintStream("Io_1/Response.txt");

        try{
            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();
                String [] valores = linha.split(":");
                Integer valor = Integer.valueOf(valores [1]);
                String funcao = valores[2].toLowerCase();
                String nome = valores[0];

                if ( valor < 3000 && funcao.startsWith("fun")){
                    adicionaLista.println(nome);

                }
            }
        } catch (NumberFormatException exc){
            System.out.println(exc);
        }
        scanner.close();
        adicionaLista.close();
    }
}
