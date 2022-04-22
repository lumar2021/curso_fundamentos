import java.util.ArrayList;
import java.util.Random;
public class Zombie
{
    //atributos
    private String nombre;
    private int salud;
    private int date;
    private String tipoDeSangre;
    public static ArrayList<Zombie> zombies = new ArrayList<Zombie>();

    // m�todo
    public Zombie(String nombre, int salud, int date, String tipoDeSangre)
    {
        this.nombre= nombre;
        this.salud= salud;
        this.date= date;
        this.tipoDeSangre= tipoDeSangre;
        Zombie.zombies.add(this);
    }

    //setters

    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setSalud(int salud)
    {
        this.salud=salud;
    }
    
    public void setDate(int date)
    {
        this.date=date;
    }
    
    public void setTipoDeSangre(String tipoDeSangre)
    {
        this.tipoDeSangre=tipoDeSangre;
    }
    //getters
    public String getNombre()
    {
        return nombre;
    }
    
    public int getSalud()
    {
        return salud;
    }
    
    public int getDate()
    {
        return date;
    }
    
    public String getTipoDeSangre()
    {
        return tipoDeSangre;
    }

    public static String  casoDos()
    {
        String contador= "";
        if(Zombie.zombies.size()>0)
        {
            for(int x = 0; x<Zombie.zombies.size();x++)
            {
                Zombie a = Zombie.zombies.get(x);
                contador= contador+"Este es el zombie # " + x + ", su nombre es " + a.getNombre() + ", su numero en salud es " +a.getSalud() + ", su tipo de sangre es " + a.getTipoDeSangre() + " y naci� en " + a.getDate() +"\n";
            }
        }
        else
        {
            contador="No existen zombies creados hasta el momento";
        }
      return contador;  
    }
    
  public static String casoTres()
    {        
        return ("El n�mero de zombies creados hasta el momento son: " + Zombie.zombies.size());
        
    }
    
  public static String casoCuatro()
    {
       String contador= "";
        if(Zombie.zombies.size()>0)
        {
            for (int x = 0; x < Zombie.zombies.size(); x++)
            {
                Zombie a = Zombie.zombies.get(x);
                if (a.getTipoDeSangre().equalsIgnoreCase("o+") || a.getTipoDeSangre().equalsIgnoreCase("ab+"))
                {
                    contador= contador+ "Este es el zombie # " + x + ", su nombre es " + a.getNombre() + ", su numero en salud es " + a.getSalud() + ", su tipo de sangre es " + a.getTipoDeSangre() + " y naci� en el a�o " + a.getDate()+ "\n";
                }
            }
        }
        else
        {
            contador= contador+ "No existen zombies creados hasta el momento";
        }
        return contador;
    }
    
    public static String casoCinco()
    {
      
      String contadorString= "";
        for( int i=0; i<Zombie.zombies.size(); i++)
        {
          Zombie a = Zombie.zombies.get(i);
            if( a.getDate()>2000)
            {
                contadorString = contadorString + "El zombie " +a.getNombre() +" ,cuya salud es "+ a.getSalud() +", nacido en "+ a.getDate() + ", tiene como tipo de sangre "+a.getTipoDeSangre() + " \n";
            }
        }
      return contadorString;
    }
  
    public static String casoSeis()
  {
    String contador= "";
    for( int i=0; i<Zombie.zombies.size(); i++)
      {
        Zombie a= Zombie.zombies.get(i);
        contador= contador+"El zombie " +a.getNombre() +",su edad es "+ a.getDate() + ", su tipo de sangre es "+a.getTipoDeSangre() + ", tiene como nueva salud "+ a.getSalud()/2 +" \n";
      }
    return contador;
  }


  public static String casoOnce(){
    String frase1 = "Cuando los muertos echan a andar, �para qu� obstinarse en matarlos? No hay formas de vencerlos.";
    String frase2 = "Cada ser humano que salvamos es un zombie menos que combatir.";
    String frase3 = "Los zombies son los unicos hombres que te aman por tu cerebro.";
    String frase4 = "Nunca me convertire en un zombie, si me cuesta levantarme de la cama, imaginate de la tumba.";
    String frase5 = "Los zombies comen cerebros, no tienes de que preocuparte.";
    String Frase = "";
    Random r = new Random();
    int random = r.nextInt(5);
    switch (random){
      case 0: Frase = frase1;
      break;
      case 1: Frase = frase2;
      break;
      case 2: Frase = frase3;
      break;
      case 3: Frase = frase4;
      break;
      case 4: Frase = frase5;
      break;
    }
    return Frase;
  }


}

    
