
/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Date;

public class Zombie
{
    //atributos
    private String nombre; 
    private int salud;
    private int date;
    private String tipoDeSangre;
    
    // mètodo
    public Zombie(String nombre, int salud, int date, String tipoDeSangre)
    {
        this.nombre= nombre;
        this.salud= salud;
        this.date= date;
        this.tipoDeSangre= tipoDeSangre;
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
    
    public static void arregloPunto4(Zombie[] arreglo)
    {
        for(int i =0; i<arreglo.length; i++)
        {
            if(arreglo[i].getTipoDeSangre()=="O+" || arreglo[i].getTipoDeSangre()=="AB+")
            {
                System.out.println(arreglo[i].getNombre()+arreglo[i].getSalud() + arreglo[i].getDate()+ arreglo[i].getTipoDeSangre());
            }
        }
    }
    
    public static void arregloPunto5(Zombie[] arreglo)
    {
        for( int i=0; i<arreglo.length; i++)
        {
            if( arreglo[i].getDate()>2000)
            {
                System.out.println(arreglo[i].getNombre()+arreglo[i].getSalud() + arreglo[i].getDate()+ arreglo[i].getTipoDeSangre());
            }
        }
    }
    
    public static void arregloPunto6(Zombie[] arreglo)
    {
        for (int i=0; i<arreglo.length; i++)
        {
            System.out.println(arreglo[i].getNombre()+arreglo[i].getSalud()/2 + arreglo[i].getDate()+ arreglo[i].getTipoDeSangre());
        }
    }
    
}
    

    
