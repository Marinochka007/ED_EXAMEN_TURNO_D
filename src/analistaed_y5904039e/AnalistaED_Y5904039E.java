
package analistaed_y5904039e;
import java.util.*;
/**EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
*@author Marina Smirnova NIE Y5904039E
*version 1.0
*/
public class AnalistaED_Y5904039E {
/**
*Constructor con tres parametros
*/
static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
/**
*@param nombreCompleto nombre completo en mayúsculas
*@param dni documento nacional de identidad con letra y sin espacios
*/
private double salarioBasePorHora = 10.56;
public AnalistaED_Y5904039E(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}
public double getSalarioEsteMes(int horasExtra) {
/**
*@param Calcula el salario bruto mensual en función del salario base por hora y
las horas extras.
*@param El precio por hora de la hora extra se determina con la constante FACTOR_HORA_EXTRA
*@param horasExtra número de horas extra dedicadas redondeado a la baja (entero)
*/
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
return salarioFinal;
/*@return devuelve el salario bruto mensual en euros con dos decimales
*/
}
// Este método no lo comentaremos con JavaDoc
public static void main(String[] args) {
AnalistaED_Y5904039E emp = new AnalistaED_Y5904039E("MARINA SMIRNOVA",
"Y5904039E");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)+ " euros, al hacer " + horasExtra + " horas extra.");
}
}