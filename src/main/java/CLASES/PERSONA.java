package CLASES;

import static CLASES.Funtions.Calcular;
import CLASES.Funtions.TryFunction;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juan_K
 */
public class PERSONA implements TryFunction {
    public PERSONA (){   
    }

    public PERSONA(String DPI, String Nombre, Date Fecha_Naci) {
        this.DPI = DPI;
        this.Nombre = Nombre;
        this.Fecha_Naci = Fecha_Naci;
        this.Calcular_Edad();
    }
    
    private String DPI;
    private String Nombre;
    private Date Fecha_Naci;

    private void Calcular_Edad(){
        Calendar c = Calendar.getInstance();
        c.setTime(Fecha_Naci);
        int Año = c.get(Calendar.YEAR);
        int Mes = c.get(Calendar.MONTH);
        int Dia = c.get(Calendar.DAY_OF_MONTH);
        
        this.Edad = Calcular.apply(Año, Mes, Dia);
    }
    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFecha_Naci() {
        return Fecha_Naci;
    }

    public void setFecha_Naci(Date Fecha_Naci) {
        this.Fecha_Naci = Fecha_Naci;
    }
    private int Edad;

    public int getEdad() {
        return Edad;
    }
    
    public String Saludo()
    {
        return "¡Hola! soy " + this.Nombre + ", tengo la edad de " + Edad + " y cuento con el DPI " + this.DPI;
    }
    
    @Override
    public Object apply(Object t, Object u, Object v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
