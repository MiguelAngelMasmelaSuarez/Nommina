
//import java.util.Scanner;

public class reto1 {
    public static double liquidarPrestaciones(int salario, int comision, int auxilioTransporte){
        int totalDevengado = salario + comision +auxilioTransporte;
        double primasCesantias = totalDevengado * 8.33/100;
        double interesesCesantias = primasCesantias * 12/100;
        double vacaciones = salario *4.16/100;
        double prestacionSocial = primasCesantias + primasCesantias + interesesCesantias + vacaciones;

        return prestacionSocial;    
      }
    public static void main(String[] args) {
       //  Scanner leer = new Scanner(System.in);
        
        // System.out.println("Ingrese el salario: ");
        //int salario = leer.nextInt();

        //System.out.println("Ingrese la comision: ");
        //int comision = leer.nextInt();

        //System.out.println("Ingrese el auxilio de transporte: ");
        //int auxilioTransporte = leer.nextInt();

        //System.out.println("Valor: " + (int) Math.round(liquidarPrestaciones(salario, comision, auxilioTransporte)));

    }

}
