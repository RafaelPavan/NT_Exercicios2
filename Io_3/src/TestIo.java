import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestIo {
    public static void main(String[] args) throws IOException, InterruptedException {
        while(true){
            escreverArquivo();
            adicionaArquivoNovo();
            Thread.sleep(10000);
        }
    }

    public static void criaArquivo() throws IOException{
        FileWriter criarArquivo = new FileWriter(new File("Io_3/novo.txt"));
        criarArquivo.write(leArquivo());
        criarArquivo.close();
    }

    public static String escreverArquivo()throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        String palavra = scan.nextLine();
        String [] names = {palavra};
        BufferedWriter br = new BufferedWriter(new FileWriter("Io_3/in.txt"));

        for (String name : names){
            br.write(name);
            br.newLine();
        }

        br.close();

        return palavra;
    }

    public static String leArquivo() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("Io_3/in.txt"));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        return line;
    }


    public static void adicionaArquivoNovo() throws IOException {
        Scanner scanner = new Scanner(new File("Io_3/in.txt"), StandardCharsets.UTF_8);
        PrintStream adicionaLista = new PrintStream("Io_3/out.txt");
        try {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                adicionaLista.println(linha);
            }
        } catch (NumberFormatException exc) {
            System.out.println(exc);
        }

        PrintStream linhaZerada = new PrintStream("Io_3/in.txt");
        linhaZerada.print("");

        scanner.close();
        adicionaLista.close();


    }
}
