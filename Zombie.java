import java.util.ArrayList;
import java.util.Random;

public class Zombie
{
  
  private String nombre;
  private int salud;
  private int dia;
  private int mes;
  private int date;
  private String tipoDeSangre;
  public static ArrayList<Zombie> zombies = new ArrayList<Zombie>();

  public Zombie(String nombre, int salud, int dia, int mes ,int date, String tipoDeSangre)
  {
    this.nombre= nombre;
    this.salud= salud;
    this.date= date;
    this.tipoDeSangre= tipoDeSangre;
    this.dia= dia;
    this.mes= mes;
    Zombie.zombies.add(this);
  }

  public void setNombre(String nombre)
  {
    this.nombre=nombre;
  }
  
  public void setSalud(int salud)
  {
    this.salud=salud;
  }
  
  public void setDia(int dia)
  {
    this.dia=dia;
  }
  
  public void setMes(int mes)
  {
    this.mes=mes;
  }
  
  public void setDate(int date)
  {
    this.date=date;
  }
    
  public void setTipoDeSangre(String tipoDeSangre)
  {
    this.tipoDeSangre=tipoDeSangre;
  }
    
  public String getNombre()
  {
    return nombre;
  }
  
  public int getSalud()
  {
    return salud;
  }
  
  public int getDia()
  {
   return dia;
  }
  
  public int getMes()
  {
    return mes;
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
        contador= contador+"Este es el zombie # " + x + ", su nombre es " + a.getNombre() + ", su numero en salud es " +a.getSalud() + ", su tipo de sangre es " + a.getTipoDeSangre() + " y naci� el dia " + a.getDia() + " del mes " + a.getMes() +" del a�o " + a.getDate() +"\n";
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
    return ("El numero de zombies creados hasta el momento son: " + Zombie.zombies.size());

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
          contador= contador+"Este es el zombie # " + x + ", su nombre es " + a.getNombre() + ", su numero en salud es " +a.getSalud() + ", su tipo de sangre es " + a.getTipoDeSangre() + " y naci� el dia " + a.getDia() + " del mes " + a.getMes() +" del a�o " + a.getDate() +"\n";
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
        contadorString = contadorString + "Este es el zombie # " + i + ", su nombre es " + a.getNombre() + ", su numero en salud es " +a.getSalud() + ", su tipo de sangre es " + a.getTipoDeSangre() + " y naci� el dia " + a.getDia() + " del mes " + a.getMes() +" del a�o " + a.getDate() +"\n";
      }
    }
    return contadorString;
  }

  public static String casoSeis()
  {
    String contador= "";
    for( int i=0; i<Zombie.zombies.size(); i++)
    {
      zombies.get(i).setSalud(zombies.get(i).getSalud()/2);
      Zombie a= Zombie.zombies.get(i);
      contador= contador+"Este es el zombie # " + i + ", su nombre es " + a.getNombre() + ", su nuevo numero en salud es " +a.getSalud() + ", su tipo de sangre es " + a.getTipoDeSangre() + " y nacio el dia " + a.getDia() + " del mes " + a.getMes() +" del a�o " + a.getDate() +"\n";
    }
    return contador;
  }


  public static String casoOnce()
  {
    String frase1 = "Segun la tradicion zombie, la unica manera de matar a uno de estos es da�ar su cerebro o cortar su cabeza.";
    String frase2 = "Cada ser humano que salvamos es un zombie menos que combatir.";
    String frase3 = "Los zombies son los unicos hombres que te aman por tu cerebro.";
    String frase4 = "En el caso de un brote de zombies, la aptitud f�sica de una persona tendra una influencia significativa en las probabilidades de supervivencia de la misma.";
    String frase5 = "La mejor arma para matar zombies es una escopeta o una metralleta.";
    String Frase = "";
    Random r = new Random();
    int random = r.nextInt(5);
    switch (random)
    {
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