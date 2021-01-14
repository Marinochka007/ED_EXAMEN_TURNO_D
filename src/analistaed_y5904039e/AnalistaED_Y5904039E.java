
package analistaed_y5904039e;
import java.util.*;
public class AnalistaED_Y5904039E {
static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
private double salarioBasePorHora = 10.56;
public AnalistaED_Y5904039E(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}
public double getSalarioEsteMes(int horasExtra) {
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
return salarioFinal;
}
// Este método no lo comentaremos con JavaDoc
public static void main(String[] args) {
AnalistaED_Y5904039E emp = new AnalistaED_Y5904039E("MARINA SMIRNOVA",
"Y5904039E");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)+ " euros, al hacer " + horasExtra + " horas extra.");
}
}