import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Random rn = new Random();
        for (int i = 0; i < 50; i++) {
            list.add(rn.nextInt(1,100));
            if (list.get(i) % 2==0){
                even.add(list.get(i));
            }
           if (list.get(i) % 2 !=0){
               odd.add(list.get(i));
           }
        }
        System.out.println("ArrayList: "+list);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}