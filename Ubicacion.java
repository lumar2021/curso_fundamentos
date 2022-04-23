import java.util.ArrayList;
public class Ubicacion 
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
        contador= contador+"Esta es la ubicacion # " + x + ", el nombre de esta es " + a.getNombre() + ", su distancia con respecto a alexandria es " +a.getDistancia() + " y la cantidad de zombies que se encuentran en este lugar es " + a.getCantZombies()+"\n";
      }
    }
    else
    {
      contador="No se ha añadido informacion sobre una ubicacion en especifico";
    }
    return contador;
  }
    
  public static Ubicacion casoNueve()
  {
    int menor = -1;
      
    for(int i = 0; i < puntos.size(); i++)
    {
      Ubicacion a = puntos.get(i);
        
      if(menor == -1)
      {
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


  public String toString() 
  {
    return "Nombre de la ubicacion: {" + "nombre= " + nombre + ", distancia= " + distancia + ", cantidad de Zombies= " + cantZombies + '}';
  }

  public static void ordenamiento(ArrayList<Ubicacion> puntos,int numeros){
        int posicionMenor;
        double temp;
        for (int i = 0; i < numeros - 1; i++) {
            posicionMenor = i;
            for (int j = i + 1; j < numeros; j++) {
                if (puntos.get(j).getDistancia() < puntos.get(posicionMenor).getDistancia()){
                    posicionMenor = j;
                }
            }
            temp = puntos.get(i).getDistancia();
            puntos.get(i).setDistancia(puntos.get(posicionMenor).getDistancia());
            puntos.get(posicionMenor).setDistancia(temp);
        }
    }
  
  public static String casoDiez()
  {
    String contadorString="";
    if(puntos.size() == 0)
    {
      contadorString="No hay informacion de ninguna ubicacion";
    }
    else
    {
      Ubicacion.ordenamiento(puntos,puntos.size());
      contadorString=contadorString+"\n Ordenamiento de ubicaciones de la ciudad con respecto a Alexandria:";
       
      for(int i=0; i<puntos.size(); i++)
      {
        contadorString=contadorString+"\nLa ubicacion # " + (i+1) + " : ";
        contadorString=contadorString+"tiene como nombre " + puntos.get(i).getNombre();
        contadorString=contadorString+", cuya distancia respecto a Alexandria es de " + puntos.get(i).getDistancia();
        contadorString=contadorString+" y tiene " + puntos.get(i).getCantZombies() + "zombies a su alrededor.";
      }
    }
    return contadorString;
  }
  
   
  public static Ubicacion casoDoce()
  {
    int mayor = -1;
    for(int i = 0; i < puntos.size();i++)
    {
      Ubicacion a = puntos.get(i);
      if(mayor == -1)
      {
        mayor = a.getCantZombies();
      }
      else if( a.getCantZombies() > mayor)
      {
        mayor = a.getCantZombies();
      }
    }
    Ubicacion inicializar = new Ubicacion("", 0, 0);
    for(int x = 0; x < puntos.size(); x++)
    {
      Ubicacion ubicacionArreglo = puntos.get(x);
      if(mayor == ubicacionArreglo.getCantZombies())
      {
        inicializar = ubicacionArreglo;
        break;
      }
    }
    return inicializar;
  }
}