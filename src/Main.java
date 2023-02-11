import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(10);

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        TreeSetImplementation treeSetImplementation = new TreeSetImplementation();

        treeSetImplementation.add(1);
        treeSetImplementation.add(10);
        treeSetImplementation.add(100);

        System.out.println(treeSetImplementation.root);

        System.out.print(treeSetImplementation.root.left + "       ");
        System.out.println(treeSetImplementation.root.right);

        System.out.print("           " + treeSetImplementation.root.right.left + "           " );
        System.out.println(treeSetImplementation.root.right.right);



    }
    }