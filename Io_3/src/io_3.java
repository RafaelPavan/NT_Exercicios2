import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class io_3 {
    public static void main(String[] args) throws IOException, InterruptedException {


                FileWriter fw = new FileWriter("Io_3/in.txt");
                fw.write("Isso é um outro teste"); // Colocar um counter até 10 a cada volta?
                fw.close();


                Scanner scanner = new Scanner(new File("Io_3/in.txt"), StandardCharsets.UTF_8);
                PrintStream adicionaLista = new PrintStream("Io_3/out.txt");
                Path path = Paths.get("Io_3/in.txt");
                try {
                    while (scanner.hasNextLine()) {
                        String linha = scanner.nextLine();
                        adicionaLista.println(linha);

                    }
                } catch (NumberFormatException exc) {
                    System.out.println(exc);
                }

                scanner.close();
                adicionaLista.close();
                System.out.println("Escrito...");


                Files.delete(path);





    }


}
