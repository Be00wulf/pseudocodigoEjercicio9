//EjercicioRepositorio9
import java.util.Scanner;
public class EjercicioRepositorio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura1, temperatura2, promedio;

        System.out.println("Promedio de 2 temperaturas, ingrese valores o si desea salir ingrese la primera temperatura como 0");
        do {                

          System.out.println("Ingrese la temperatura 1");
          temperatura1 = entrada.nextDouble();
          
            if (temperatura1 != 0) {
                System.out.println("Ingrese la temperatura 2");
                temperatura2 = entrada.nextDouble();
                 
                    if (temperatura1 >= 5 && temperatura1 <= 15 && temperatura2 >= 5 && temperatura2 <= 15) {
                        promedio = (temperatura1 + temperatura2)/2;
                        System.out.println("El promedio de ambas temperaturas es de: " + promedio);
                        //break;

                    }
            
            }
            
        } while (temperatura1 != 0);
 
        System.out.println("Adios");
    }
}