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
    System.out.println("Si ingresa el numero #0, finalizar� el programa");
    System.out.println("Si ingresa el numero #1, crear� un zombie");
    System.out.println("Si ingresa el numero #2, ver� la informaci�n de todos los zombies almacenados hasta el momento");
    System.out.println("Si ingresa el numero #3, ver� la cantidad zombies creados hasta el momento");
    System.out.println("Si ingresa el numero #4, ver� la informaci�n de los zombies con con tipo de sangre 'O+' o 'AB+'");
    System.out.println("Si ingresa el numero #5, ver� la informaci�n de los zombies que nacieron despu�s del 2000");
    System.out.println("Si ingresa el numero #6, lanzar� una bomba a los zombies, y reducir� la salud de todos estos a la mitad");
    System.out.println("Si ingresa el numero #7, para a�adir informaci�n sobre zombies en un lugar en especifico");
    System.out.println("Si ingresa el numero #8, ver� la informaci�n de todas las ubicaciones almacenadas hasta el momento");
    System.out.println("Si ingresa el numero #9, para ver la ubicaci�n m�s segura en la ciudad");
    System.out.println("Si ingresa el numero #10, ver� todas las ubicaciones de la ciudad ");
    System.out.println("Si ingresa el numero #11, ver� alg�n dato curioso sobre los zombies");
    System.out.println("Si ingresa el numero #12, ver� una funcionalidad especial");
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
        System.out.println("La ubicaci�n m�s segura es ");
        System.out.println(Ubicacion.casoNueve());
        rayas2();
        break;
        case 10:  
        rayas1();
        System.out.println("Las ubicaciones son: ");
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
          System.out.println("Me parecio pertinente avisarte, la ubicacion mas peligrosa es: ");
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
    System.out.println("Ingrese por favor la fecha de nacimiento del zombie (ej: 2003)");
    int fechaNacimiento = teclado.nextInt();
    System.out.println("Ingrese por favor el tipo de sangre");
    String tipoSangre = teclado.next();
    System.out.println("ZOMBIE CREADO");
    Zombie enlace = new Zombie(nombre,salud,fechaNacimiento,tipoSangre);
    enlace.setNombre(nombre);
    enlace.setSalud(salud);
    enlace.setDate(fechaNacimiento);
    enlace.setTipoDeSangre(tipoSangre);
    rayas2();
  }

  public static void casoSiete()
    {
      rayas1();
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese por favor el nombre del lugar donde quiere brindar informaci�n sobre zombies");
      String nombreUbicacion = teclado.next();
      System.out.println("Ingrese por favor la distancia de este lugar con respecto a Alexandria (copiar solo en numeros la distancia en kilometros)");
      double distanciaAlexandria = teclado.nextDouble();
      System.out.println("Ingrese por favor la cantidad de zombies en esta ubicaci�n");
      int cantidadZombies = teclado.nextInt();
      System.out.println("UBICACI�N CREADA");
      Ubicacion enlaceUbicacion = new Ubicacion (nombreUbicacion, distanciaAlexandria, cantidadZombies);
      enlaceUbicacion.setNombre(nombreUbicacion);
      enlaceUbicacion.setDistancia(distanciaAlexandria);
      enlaceUbicacion.setCantZombies(cantidadZombies);
      rayas2();
    }
}

