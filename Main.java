import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
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
                case 1: trueOrFalse = false;
                break;
                case 2: trueOrFalse = false;
                break;
                case 3: trueOrFalse = false;
                break;
                case 4: trueOrFalse = false;
                break;
                case 5: trueOrFalse = false;
                break;
                case 6: trueOrFalse = false;
                break;
                case 7: trueOrFalse = false;
                break;
                case 8: trueOrFalse = false;
                break;
                case 9: trueOrFalse = false;
                break;
                case 10: trueOrFalse = false;
                break;
                case 11: trueOrFalse = false;
                break;
                case 12: trueOrFalse = false;
                break;
                default: break;
            }

        }
    }
}