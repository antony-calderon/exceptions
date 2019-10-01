
package exceptions;


public class PruebaExcepcion {

    public static void main(String args[]) {
        aritmetico();
        desborde();
        formatoNumero();
    }

//excepción sin tratar 
    public static void formatoNumero() {

        int numero;
        String cadena = "  1";
        try {
            numero = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {
            System.out.println("No es un numero, es una cadena de texto. " + ex.getMessage());
        }

    }

    public static void desborde() {

        int v[] = new int[3];
        try {
            for (int i = 0; i < 5; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("El numero de elementos excede el numero de elementos en el vactor " + ex.getMessage());
        }
    }

    public static void aritmetico() {   /////alt shit f para tabular el codigo

        int numero = 5, resultado;
        try{
        resultado = numero / 0;
        }catch(ArithmeticException ar){
            System.out.println("No es posible hacer una division entre 0" +ar.getMessage());
        }
    }

}
