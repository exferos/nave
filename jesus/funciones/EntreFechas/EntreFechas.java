/* programa que calcula diferencia entre fechas
 * esto calcula dias minutos segundo y milisegubdos
 * https://es.answers.yahoo.com/question/index?qid=20110212110600AAHsRza
 */



package EntreFechas;

import java.util.Calendar; 

public class EntreFechas 
{ 
public static void main(String[] args) 
{ 
// Se crean dos instancias de fechas 
Calendar cal1 = Calendar.getInstance(); 
Calendar cal2 = Calendar.getInstance(); 

// Inicializar cada una de las instancias con la fecha requerida 
cal1.set(2010, 10, 25); 
cal2.set(2011, 2, 12); 

// se obtiene el valor de la fecha en milisegundos 
long milis1 = cal1.getTimeInMillis(); 
long milis2 = cal2.getTimeInMillis(); 

// se calcula la diferencia de milisegundos entre ambas fechas 
long diff = milis2 - milis1; 

// Para calcular la diferencia en segundos 
long diffSeconds = diff / 1000; 

// Para calcular la diferencia en minutos 
long diffMinutes = diff / (60 * 1000); 

// Para calcular la diferencia en horas 
long diffHours = diff / (60 * 60 * 1000); 

// Para calcular la diferencia en dias 
long diffDays = diff / (24 * 60 * 60 * 1000); 

System.out.println("Milisegundos: " + diff ); 
System.out.println("Segundos: " + diffSeconds); 
System.out.println("Minutos: " + diffMinutes); 
System.out.println("Horas: " + diffHours); 
System.out.println("Dias: " + diffDays); 
} 
}