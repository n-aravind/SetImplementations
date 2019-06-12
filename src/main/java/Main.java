import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("John");
        hashSet.add("Michael");
        hashSet.add("Rose");
        hashSet.add("Alfred");
        hashSet.add("Sean");
        System.out.println("No Order => " + hashSet);

        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("John");
        treeSet.add("Michael");
        treeSet.add("Rose");
        treeSet.add("Alfred");
        treeSet.add("Sean");
        System.out.println("Sorted Order => " +treeSet);

        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("John");
        linkedHashSet.add("Michael");
        linkedHashSet.add("Rose");
        linkedHashSet.add("Alfred");
        linkedHashSet.add("Sean");
        System.out.println("Inserted Order => " +linkedHashSet);
    }
}
