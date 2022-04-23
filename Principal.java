import java.util.Scanner;

public class Principal
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
      System.out.println("Si ingresa el numero #2, verá la informacion de todos los zombies almacenados hasta el momento");
      System.out.println("Si ingresa el numero #3, verá la cantidad zombies creados hasta el momento");
      System.out.println("Si ingresa el numero #4, verá la información de los zombies con tipo de sangre 'O+' o 'AB+'");
      System.out.println("Si ingresa el numero #5, verá la información de los zombies que nacieron después del 2000");
      System.out.println("Si ingresa el numero #6, lanzará una bomba a los zombies, y reducira la salud de todos estos a la mitad");
      System.out.println("Si ingresa el numero #7, va a añadir información sobre zombies en un lugar en especifico");
      System.out.println("Si ingresa el numero #8, verá la información de todas las ubicaciones almacenadas hasta el momento");
      System.out.println("Si ingresa el numero #9, verá la ubicación más segura en la ciudad");
      System.out.println("Si ingresa el numero #10, verá todas las ubicaciones de la ciudad organizadas de menor a mayor");
      System.out.println("Si ingresa el numero #11, verá alguna frase aleatoria sobre los zombies");
      System.out.println("Si ingresa el numero #12, verá una funcionalidad especial, la cual dirá cual es la ubicacion mas peligrosa");
      System.out.print("Ingrese aqui su numero ===> ");

      int num = teclado.nextInt();

      switch (num)
      {
        case 0: trueOrFalse = false;
          break;
        case 1: casoUno();
          break;
        case 2:
          separadorUno();
          System.out.println(Zombie.casoDos());
          separadorDos();
          break;
        case 3:
          separadorUno();
          System.out.println(Zombie.casoTres());
          separadorDos();
          break;
        case 4:
          separadorUno();
          System.out.println(Zombie.casoCuatro());
          separadorDos();
          break;
        case 5:
          separadorUno();
          System.out.println(Zombie.casoCinco());
          separadorDos();
          break;
        case 6:
          separadorUno();
          System.out.println(Zombie.casoSeis());
          separadorDos();
          break;
        case 7: casoSiete();
          break;
        case 8:
          separadorUno();
          System.out.println(Ubicacion.casoOcho());
          separadorDos();
          break;
        case 9:
          separadorUno();
          System.out.println("El lugar mas seguro de la ciudad es: ");
          System.out.println(Ubicacion.casoNueve());
          separadorDos();
          break;
        case 10:
          separadorUno();
          System.out.println(Ubicacion.casoDiez());
          separadorDos();
          break;
        case 11:
          separadorUno();
          System.out.println(Zombie.casoOnce());
          separadorDos();
          break;
        case 12:
          separadorUno();
          System.out.println("Me parece pertinente avisarte que la ubicacion mas peligrosa es:");
          System.out.println(Ubicacion.casoDoce());
          separadorDos();
          break;
        default: break;
      }
    }
  }

  public static void separadorUno()
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

  public static void separadorDos()
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
    separadorUno();
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
    Zombie enlaceZombie = new Zombie(nombre,salud,diaNacimiento,mesNacimiento,fechaNacimiento,tipoSangre);
    enlaceZombie.setNombre(nombre);
    enlaceZombie.setSalud(salud);
    enlaceZombie.setDia(diaNacimiento);
    enlaceZombie.setMes(mesNacimiento);
    enlaceZombie.setDate(fechaNacimiento);
    enlaceZombie.setTipoDeSangre(tipoSangre);
    separadorDos();
  }

  public static void casoSiete()
  {
    separadorUno();
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese por favor el nombre del lugar donde quiere brindar informacion sobre zombies");
    String nombreUbicacion = teclado.next();
    System.out.println("Ingrese por favor la distancia de este lugar con respecto a Alexandria (copiar solo en numeros la distancia en kilometros)");
    double distanciaAlexandria = teclado.nextDouble();
    System.out.println("Ingrese por favor la cantidad de zombies en esta ubicacion");
    int cantidadZombies = teclado.nextInt();
    System.out.println("UBICACION CREADA");
    Ubicacion enlaceUbicacion = new Ubicacion (nombreUbicacion, distanciaAlexandria, cantidadZombies);
    enlaceUbicacion.setNombre(nombreUbicacion);
    enlaceUbicacion.setDistancia(distanciaAlexandria);
    enlaceUbicacion.setCantZombies(cantidadZombies);
    separadorDos();
  }
}








