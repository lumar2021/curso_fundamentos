import java.util.Scanner;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        mostrarMenu();
    }

    public static void mostrarMenu()
    {

        boolean trueOrFalse = true;
        Scanner teclado = new Scanner(System.in);

        while (trueOrFalse)
        {
            System.out.println("Ingrese por favor un numero del 0 al 12, segun el caso que desee de las sigueintes opciones:");
            System.out.println("Si ingresa el numero #0, finalizará el programa");
            System.out.println("Si ingresa el numero #1, creará un zombie");
            System.out.println("Si ingresa el numero #2, verá la información de todos los zombies almacenados hasta el momento");
            System.out.println("Si ingresa el numero #3, verá la cantidad zombies creados hasta el momento");
            System.out.println("Si ingresa el numero #4, verá la información de los zombies con con tipo de sangre 'O+' o 'AB+'");
            System.out.println("Si ingresa el numero #5, verá la información de los zombies que nacieron después del 2000");
            System.out.println("Si ingresa el numero #6, lanzará una bomba a los zombies, y reducirá la salud de todos estos a la mitad");
            System.out.println("Si ingresa el numero #7, para añadir información sobre zombies en un lugar en especifico");
            System.out.println("Si ingresa el numero #8, verá la información de todas las ubicaciones almacenadas hasta el momento");
            System.out.println("Si ingresa el numero #9, para ver la ubicación más segura en la ciudad");
            System.out.println("Si ingresa el numero #10, verá todas las ubicaciones de la ciudad organizadas de menor a mayor");
            System.out.println("Si ingresa el numero #11, verá algúna frase aleatoria sobre los zombies");
            System.out.println("Si ingresa el numero #12, verá una funcionalidad especial, la cual dirá cual es la ubicación más peligrosa");
            System.out.print("Ingrese aqui su numero ===> ");

            int num = teclado.nextInt();

            switch (num)
            {
                case 0: trueOrFalse = false;
                    break;
                case 1: casoUno();
                    break;
                case 2:
                    rayas1();
                    System.out.println(Zombie.casoDos());
                    rayas2();
                    break;
                case 3:
                    rayas1();
                    System.out.println(Zombie.casoTres());
                    rayas2();
                    break;
                case 4:
                    rayas1();
                    System.out.println(Zombie.casoCuatro());
                    rayas2();
                    break;
                case 5:
                    rayas1();
                    System.out.println(Zombie.casoCinco());
                    rayas2();
                    break;
                case 6:
                    rayas1();
                    System.out.println(Zombie.casoSeis());
                    rayas2();
                    break;
                case 7: casoSiete();
                    break;
                case 8:
                    rayas1();
                    System.out.println(Ubicacion.casoOcho());
                    rayas2();
                    break;
                case 9:
                    rayas1();
                    System.out.println("El lugar mas seguro de la ciudad es: ");
                    System.out.println(Ubicacion.casoNueve());
                    rayas2();
                    break;
                case 10:
                    rayas1();
                    System.out.println("Las ubicaciones cercanas son: ");
                    Collections.sort(Ubicacion.puntos);
                    for(Ubicacion aux : Ubicacion.puntos)
                    {
                        System.out.println(aux);
                    }
                    rayas2();
                    break;
                case 11:
                    rayas1();
                    System.out.println(Zombie.casoOnce());
                    rayas2();
                    break;
                case 12:
                    rayas1();
                    System.out.println("Me parecio pertinente avisarte, la ubicacion mas peligrosa es:");
                    System.out.println(Ubicacion.casoDoce());
                    rayas2();
                    break;
                default: break;
            }
        }
    }

    public static void rayas1()
    {
        System.out.print("\n");
        for (int i = 9; i > 0; i -= 2)
        {
            for (int j = 0; j < 9 - i / 2; j++)
                System.out.print(" ");

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void rayas2()
    {
        System.out.print("\n");
        for (int i = 1; i < 10; i += 2)
        {
            for (int j = 0; j < 9 - i / 2; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        System.out.print("\n");
    }

    public static void casoUno()
    {
        rayas1();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese por favor el nombre del zombie");
        String nombre = teclado.next();
        System.out.println("Ingrese por favor la salud del zombie (0-100)");
        int salud = teclado.nextInt();
        System.out.println("Ingrese por favor la fecha de nacimiento del zombie");
        System.out.println("Dia");
        int diaNacimiento = teclado.nextInt();
        System.out.println("Mes");
        int mesNacimiento =teclado.nextInt();
        System.out.println("Año");
        int fechaNacimiento = teclado.nextInt();
        System.out.println("Ingrese por favor el tipo de sangre");
        String tipoSangre = teclado.next();
        System.out.println("ZOMBIE CREADO");
        Zombie enlace = new Zombie(nombre,salud,diaNacimiento,mesNacimiento,fechaNacimiento,tipoSangre);
        enlace.setNombre(nombre);
        enlace.setSalud(salud);
        enlace.setDia(diaNacimiento);
        enlace.setMes(mesNacimiento);
        enlace.setDate(fechaNacimiento);
        enlace.setTipoDeSangre(tipoSangre);
        rayas2();
    }

    public static void casoSiete()
    {
        rayas1();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese por favor el nombre del lugar donde quiere brindar información sobre zombies");
        String nombreUbicacion = teclado.next();
        System.out.println("Ingrese por favor la distancia de este lugar con respecto a Alexandria (copiar solo en numeros la distancia en kilometros)");
        double distanciaAlexandria = teclado.nextDouble();
        System.out.println("Ingrese por favor la cantidad de zombies en esta ubicación");
        int cantidadZombies = teclado.nextInt();
        System.out.println("UBICACIÓN CREADA");
        Ubicacion enlaceUbicacion = new Ubicacion (nombreUbicacion, distanciaAlexandria, cantidadZombies);
        enlaceUbicacion.setNombre(nombreUbicacion);
        enlaceUbicacion.setDistancia(distanciaAlexandria);
        enlaceUbicacion.setCantZombies(cantidadZombies);
        rayas2();
    }
}



