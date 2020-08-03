package Day08_LogicalOperators;

public class Logical {

    public static void main(String[] args) {

        // !: opposite boolean

        boolean r1 = 9 > 7;
        boolean r2 = !r1;
        System.out.println(r1 + " : "  );

        // || : or

        boolean r8 = true ==!false || false == true;
        System.out.println(r8);

        boolean r9 = !false == false || true == !false;
        System.out.println(r9);

        boolean r10 = !false == false && true == !false;
        System.out.println(r10);

    }
}
