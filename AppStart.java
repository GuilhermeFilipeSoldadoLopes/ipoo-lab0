
/**
 * AppStart
 *
 * @author Guilherme Lopes
 * @version 4/3/2021
 */

public class AppStart
{
    private static Size size;
    
    public static void main(String [] args){
        size = Size.MEDIUM;
        int i=0;
        i++;
        System.out.println("Name: " + size.name() + "\ntoString(): " + size + "\nOrdem: " + i + "\nValor minimo: " + size.getMinValue() + "\nValor maximo: " + size.getMaxValue() + "\nCódigo: " + size.getCode());
    }
}
