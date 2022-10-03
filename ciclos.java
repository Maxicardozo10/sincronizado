import java.util.scanner;
public class ciclos {
    public static void main (string [] args)  {
        scanner entrada =new scanner(system.in);

        System.out.println("¿cuantos numeros quieres procesar?");
        int cantidad=entrada.nextlnt();

        System.out.printf("ingresa %d datos", cantidad);
        for (int i=i; i <= cantidad; i++) {
            System.out.println("dato %d:", i);
            int num= entrada.nextlnt();
            int resultado = num * 2;
            System.out.println("dato %d precesado: %d", i, resultado);}
    }
}
