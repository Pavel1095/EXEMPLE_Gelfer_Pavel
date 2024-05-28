import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> examples = new ArrayList<>();
        examples.add("dog");
        examples.add("cat");
        examples.add("parrot");
        examples.add("dog");

        HashSet<String> set = new HashSet<>(examples);
        examples.clear();
        examples.addAll(set);

        System.out.println(examples);
    }
}