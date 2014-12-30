package main;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("Mario Peñate Fariñas");

        System.out.println(singleton.getName());

    }

}
