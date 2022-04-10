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
            System.out.println("Si ingresa el numero #10, verá todas las ubicaciones de la ciudad ");
            System.out.println("Si ingresa el numero #11, verá algún dato curioso sobre los zombies");
            System.out.println("Si ingresa el numero #12, verá una funcionalidad especial");
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