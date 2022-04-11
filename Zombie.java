
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
    private Date date;
    private String tipoDeSangre;
    
    // mètodo
    public Zombie(String nombre, int salud, Date date, String tipoDeSangre)
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
    public void setDate(Date date)
    {
        this.date=date;
    }
    public void setTipoDeSangre(String tipoDeSangre)
    {
        this.tipoDeSangre=tipoDeSangre;
    }
    //getter
    public String getNombre()
    {
        return nombre;
    }
    public int getSalud()
    {
        return salud;
    }
    public Date getDate()
    {
        return date;
    }
    public String getTipoDeSangre()
    {
        return tipoDeSangre;
    }
    
    public int imprimir()
    {
        System.out.println(1);
        return 1;
    }
}
    

    
