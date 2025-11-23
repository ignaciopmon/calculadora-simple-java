package calculadora; // No olvides el paquete
public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora simple.");
        int resultado = OperacionSuma.sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);
    }
}