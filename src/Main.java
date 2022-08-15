import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set =new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set1.add(0);
        set1.add(1);
        set1.add(2);
        System.out.println(set);
        System.out.println(set1);

       System.out.println(symmetricDifference(set,set1));
    }
    public static Set symmetricDifference(Set<Integer>set, Set<Integer>set1){
       HashSet<Integer>set2=new HashSet<>(set);
       HashSet<Integer>set3=new HashSet<>(set1);
        set3.addAll(set);
        set2.addAll(set1);
        set2.removeAll(set);
        set3.removeAll(set1);
        set2.addAll(set3);

      return set2;
    }
}