package main;

public class Singleton {

    private static Singleton oneInstance;
    private String name;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {

        if (oneInstance == null) {
            oneInstance = new Singleton(name);
        }

        return oneInstance;
    }

    public String getName() {
        return name;
    }

}
