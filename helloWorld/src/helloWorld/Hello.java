package helloWorld;

/**
 * Created by Lenovo on 12.07.2017.
 */
public class Hello {
    public static void main(String[] args){
        Print print = new Print();
        for (String str : args){
            System.out.printf("Аргумент-> %s%n", str);
        }
        //print.printHello();
       // System.out.println("Hello World");
    }
}

class Print{
    void printHello(){
        System.out.println("Hello world!!!");
    }
}