import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("hello");
        int x = 99;
        ArrayList ar = new ArrayList();
        for (int i =0; i<5; i++){
            ar.add(i);
        }

        ar.add(42);

        System.out.println(ar);
        System.out.println(ar.size());

        ar.sort();


        }




    }

