package co.edu.um.taller6;

/**
 * Created with IntelliJ IDEA.
 * User: danielavargas
 * Date: 29/07/13
 * Time: 9:05
 * To change this template use File | Settings | File Templates.
 */
public class operacionesMatematicas {

    /**Este metodo realiza la adicion de dos numeros enteros
     *
     * @param valor1  primer parametro de tipo entero
     * @param valor2  segundo parametro de tipo entero
     * @return
     */


    public int suma(int valor1, int valor2 )
    {

       return valor1 + valor2;
    }

    /**
     * Este metodo realiza la sustraccion  de dos numeros enteros
     * @param valor1
     * @param valor2
     * @return
     */

    public int resta(int valor1, int valor2 )
    {

        return valor1 - valor2;
    }

    /**
     * Este metodo realiza la multuplicacion de dos numeros enteros
     * @param valor1
     * @param valor2
     * @return
     */
    public int multiplicacion(int valor1, int valor2 )
    {

        return valor1 * valor2;
    }

    /**
     * Este metodo realiza la division de dos numeros enteros
     * @param valor1
     * @param valor2
     * @return
     */

    public double division(int valor1, int valor2 )  throws ArithmeticException
    {

        if (valor2 != 0)
        {
            return valor1/valor2;
        } else
        {
            throw new ArithmeticException("Se ha producido una division entre cero");

        }

    }



}
