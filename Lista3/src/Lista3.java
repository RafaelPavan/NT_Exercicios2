import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista3 {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 15, 6, 12,90, 800, 1, 25, 400, 2, 9, 2);
        Collections.sort(number, Collections.reverseOrder());
        for (Integer i : number){
            System.out.println(i);
        }
    }
}
