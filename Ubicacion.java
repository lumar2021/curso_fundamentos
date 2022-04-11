
/**
 * Write a description of class Ubicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ubicacion
{
    private String nombre;
    private float distancia;
    private int cantZombies;
    
    public Ubicacion(String nombre, float distancia, int cantZombies)
    {
        this.nombre= nombre;
        this.distancia= distancia;
        this.cantZombies= cantZombies;
    }
    //setters
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setDistancia(float distancia)
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
    
    public float getDistancia()
    {
        return distancia;
    }
    
    public int getCantZombies()
    {
        return cantZombies;
    }
    
    
}
