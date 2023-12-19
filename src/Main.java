import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Persona persona = new Persona("Nicola");
        System.out.println("Hello Git! Soy: " + persona.getName());
        System.out.println("Cuantos años tienes?");
        var age = entrada.nextInt();
        System.out.println("Ok..tienes "+ age + " años");
    }
}