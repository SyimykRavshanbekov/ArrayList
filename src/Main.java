import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers1.add(random.nextInt(100));
        }

        for (int i = 0; i < numbers1.size(); i++) {
            if (numbers1.get(i)%2 == 1){
                numbers2.add(numbers1.get(i));
            }else {
                numbers3.add(numbers1.get(i));
            }
        }

        System.out.println("Баардык сандар:");
        System.out.println(numbers1);
        System.out.println("Так сандар: ");
        System.out.println(numbers2);
        System.out.println("Жуп сандар: ");
        System.out.println(numbers3);
    }
}