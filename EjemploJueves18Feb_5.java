
package ejemplo.jueves.pkg18feb_5;

/**
 *
 * @author karlamon
 */
public class EjemploJueves18Feb_5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<=10; i++)
        {
            System.out.println("Aun estas en el ciclo");
            if(i == 4)
            {
            continue;
            }
            System.out.println("El valor de i es: "+i);
        }
        System.out.println("Has dejado el ciclo for");
    }
    
}
