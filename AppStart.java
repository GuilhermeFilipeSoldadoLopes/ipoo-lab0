
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
        switch(size){
            case SMALL : System.out.println("Name: " + "SMALL" + "\ntoString(): " + size + "\nOrdem: " + i + "\nValor minimo: " + size.getMinValue() + "\nValor maximo: " + size.getMaxValue() + "\nCódigo: " + size.getCode());
            break;
            case MEDIUM : System.out.println("Name: " + "MEDIUM" + "\ntoString(): " + size + "\nOrdem: " + i + "\nValor minimo: " + size.getMinValue() + "\nValor maximo: " + size.getMaxValue() + "\nCódigo: " + size.getCode());
            break;
            case LARGE : System.out.println("Name: " + "LARGE" + "\ntoString(): " + size + "\nOrdem: " + i + "\nValor minimo: " + size.getMinValue() + "\nValor maximo: " + size.getMaxValue() + "\nCódigo: " + size.getCode());
            break;
        }
    }
}
