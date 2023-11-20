package Generics;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world from Generics!");
      //  new GenericsSample<Integer>().add(1); or in below another way to declare
        var list = new GenericsSample<Integer>();
        list.add(1);
        int number = list.get(0);
        System.out.println("Here is the saved integer  : "+ number );
    }
}