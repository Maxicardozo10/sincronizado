public class teclado {
    public static void main (string[] args)  {
    scanner entrada= new scanner(system.in);

    system.out.println("¿cual es tu nombre?");
    string nombre= entrada.nextline();
    system.out.println("tu nombre es"+nombre);
    system.out.println("¿cual es tu edad?");
    int edad= entrada.nextline();
    system.out.println("tu edad es"+edad);
    }
}