
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    public int multiplicaciones(int a, int b)
    {
        int resultado = 0;
        int index = 0;
        int incremento = a;
        while (index < b - 1)
        {
            index = index + 1;
            a = a + incremento;
            resultado = a;
        }
        return resultado;

    }

}
