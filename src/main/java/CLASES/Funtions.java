package CLASES;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

/**
 *
 * @author Juan_K
 */
public class Funtions {
    public static Function<Integer, String> addZeros = x -> x < 10 ? "0" + x : String.valueOf(x);
    
    public static TryFunction<Integer, Integer, Integer, LocalDate> Convertir_Fecha = 
            (Año, Mes, Dia) -> LocalDate.parse(
            Año + "-" + addZeros.apply(Mes) + "-" + addZeros.apply(Dia));
    
    public static TryFunction<Integer, Integer, Integer, Integer> Calcular = 
            (Año, Mes, Dia) -> Period.between(
            Convertir_Fecha.apply (Año, Mes, Dia), LocalDate.now()).getYears();
            
@FunctionalInterface
public interface  TryFunction<T, U, V, R>{
    R apply(T t, U u, V v);
}       
}
