import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Io2 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream adicionaLista = new PrintStream("Io_2/Agrupamento.txt");
        String dir = "Io_2";
        File file = new File(dir);
        for(String arq : file.list()){
            if(arq.endsWith(".batata")){
                try{
                    adicionaLista.println(arq + "\n" + leitura(dir + "\\" + arq));
                }
                catch(Exception ex){}
            }
        }
        System.out.println("Adicionados :D");
    }

    private static String leitura(String dir) throws Exception {
        String  linha = "", conteudo = "";
        BufferedReader br = new BufferedReader(new FileReader(new File(dir)));
        while((linha = br.readLine())!= null){
            if(!linha.isEmpty()){
                conteudo = new StringBuilder(conteudo).append(linha.concat("\n")).toString();
            }
        }
        br.close();
        return conteudo;
    }




}
