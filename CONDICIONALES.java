public class CONDICIONALES {
    public static void main(String[] args) {
        sacanner entrada = new scanner(system.in);

        System.out.println("calculadora de propinas");
        System.out.println("ingresa la cantdad a pagar");
        double cantidad= entrada.nexdouble();
        System.out.println("ingresa el %d propina");
        int porcentaje= entrada.nextlnt();

        if ((porcentaje)<15) {
            System.out.println("el servisio no fue muy bueno");
        } else [
        System.out.println("el servicio fue bueno");
        ]
        double total= cantidad * porcentaje / 100;
        System.out.println("el total es : %f", total);
    }

}
