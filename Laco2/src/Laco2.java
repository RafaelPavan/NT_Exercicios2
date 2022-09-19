import java.util.ArrayList;

public class Laco2 {
    public static void main(String[] args) {
        for (int x = 1; x <= 20; x++){
            //System.out.println(x);
            Double result = ((Math.sqrt(x/3)) * 4000 + (x/2)) / 2;
            System.out.printf("%.2f\n", result);
        }
    }
}
