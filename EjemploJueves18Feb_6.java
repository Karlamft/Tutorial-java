
package ejemplo.jueves.pkg18feb_6;

/**
 *
 * @author karlamon
 */
public class EjemploJueves18Feb_6 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int i=0; i<=100; i++)
        {
            if((i % 2) !=0)
            {
               System.out.println(i);
            }
        }
        
        int x =1;
        int anterior = 0;
        int temp;
        while(true)
        {
            System.out.println(x);
            temp = x;
            x = x + anterior;
            anterior = temp;
            
            if(x > 30)
                break;
        }
    }
    
}
