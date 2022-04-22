
import java.util.ArrayList;
public class Ubicacion implements Comparable<Ubicacion>
{
  private String nombre;
  private double distancia;
  private int cantZombies;
  public static ArrayList<Ubicacion> puntos = new ArrayList<>();
  
  public Ubicacion(String nombre, double distancia, int cantZombies)
  {
    this.nombre= nombre;
    this.distancia= distancia;
    this.cantZombies= cantZombies;
    Ubicacion.puntos.add(this);
  }
    //setters
  public void setNombre(String nombre)
  {
    this.nombre=nombre;
  }
    
  public void setDistancia(double distancia)
  {
    this.distancia=distancia;
  }
    
  public void setCantZombies( int cantZombies)
  {
    this.cantZombies= cantZombies;
  }
    
    //getters
  public String getNombre()
  {
    return nombre;
  }
    
  public double getDistancia()
  {
    return distancia;
  }
    
  public int getCantZombies()
  {
    return cantZombies;
  }

  public static String  casoOcho()
  {
    String contador= "";
    
    if(Ubicacion.puntos.size()>0)
    {
      for(int x = 0; x<Ubicacion.puntos.size();x++)
      {
        Ubicacion a = Ubicacion.puntos.get(x);
        contador= contador+"Esta es la ubicacion # " + x+ ", el nombre de esta es " + a.getNombre() + ", su distancia con respecto a Alexandría es " +a.getDistancia() + " y la cantidad de zombies que se encuentran en este lugar es de " + a.getCantZombies()+"\n";
      }
    }
        else
        {
            contador="No se ha añadido información sobre una ubicación en especifico";
        }
      return contador;  
    }


  
  //punto 9
  public static Ubicacion casoNueve()
  {
    int menor = 0;
    for(int i = 0; i < puntos.size(); i++)
    {
      Ubicacion a = puntos.get(i);
      if(menor == 0){
        menor = a.getCantZombies();
      }
      else if( a.getCantZombies() < menor)
      {
         menor = a.getCantZombies();
      }
    }
    Ubicacion m = new Ubicacion("", 0, 0);
    for(int x = 0; x < puntos.size(); x++)
    {
      Ubicacion b = puntos.get(x);
      if(menor == b.getCantZombies())
      {
        m = b;
        break;
      }
    }
    return m;
  }

  // punto 10
  public String toString() 
  {
      
   return  "La ubicación es " + nombre + ", con distancia " + distancia + " de Alexandría,  y la cantidad de Zombies es de " + cantZombies + '}';
  }

  public int compareTo(Ubicacion u)
  {
    if(u.getDistancia()>distancia)
    {
      return -1;
    }
    else if(u.getDistancia()>distancia)
    {
      return 0;
    }
    else
    {
    return 1;
    }
  }

   public static Ubicacion casoDoce()
   {
    int mayor = 0;
    for(int i = 0; i < puntos.size();i++)
    {
      Ubicacion a = puntos.get(i);
      if(mayor == 0)
      {
        mayor = a.getCantZombies();
      }
      else if( a.getCantZombies() > mayor)
      {
         mayor = a.getCantZombies();
      }
    }
    Ubicacion m = new Ubicacion(" ", 0, 0);
    for(int x = 0; x < puntos.size(); x++)
    {
      Ubicacion b = puntos.get(x);
      if(mayor == b.getCantZombies())
      {
        m = b;
        break;
      }
    }
    return m;
  }
}