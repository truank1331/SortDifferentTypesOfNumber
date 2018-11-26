package sortdifferenttypesofnumber;
import java.util.Collections;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
public class SortDifferentTypesOfNumber {
    public static void main(String[] args) {
        int no1[]= new int[1000000];
        Integer no2[] = new Integer[1000000];
        ArrayList <Integer> no3 = new ArrayList<Integer>();
        LinkedList <Integer> no4 = new LinkedList<Integer>();
        for(int i=0;i<999999;i++){
            no1[i] = new Random().nextInt(1000001)-500000;
            no2[i] = new Random().nextInt(1000001)-500000;
            no3.add(new Random().nextInt(1000001)-500000);
            no4.add(new Random().nextInt(1000001)-500000);
        }
        long ta0 = System.nanoTime();
        Arrays.sort(no1);
        long ta1 = System.nanoTime();
        long tn1 = ta1-ta0;
        
        long tb0 = System.nanoTime();
        Arrays.sort(no2, Collections.reverseOrder()); 
        long tb1 = System.nanoTime();
        long tn2 = tb1-tb0;
        
        long tc0 = System.nanoTime();
        Collections.sort(no3);
        long tc1 = System.nanoTime();
        long tn3 = tc1-tc0;
        
        long td0 = System.nanoTime();
        Collections.sort(no4);
        long td1 = System.nanoTime();
        long tn4 = td1-td0;
        
        System.out.printf("sort(int) took: %.6f s.\n",(double)tn1/1000000000);
        System.out.printf("sort(Integer) took: %.6f s.\n",(double)tn2/1000000000);
        System.out.printf("sort(ArrayList) took: %.6f s.\n",(double)tn3/1000000000);
        System.out.printf("sort(LinkedList) took: %.6f s.\n",(double)tn4/1000000000);
    }
    
}
