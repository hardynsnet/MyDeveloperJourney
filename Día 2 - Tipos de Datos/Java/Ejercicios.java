public class Ejercicios {
    public static void main(String[] args) {
        
        // Tipos de datos
        byte n1 = 100;
        short n2 = 1000;
        int n3 = 100000;
        long n4 = 1000000000000000L;
        float n5 = 3.14f;
        double n6 = 3.14159;
        char letra = 'Z';
        boolean valor = true;

        System.out.println("Tipos de dato byte: " + n1);
        System.out.println("Tipos de dato short: " + n2);
        System.out.println("Tipos de dato int: " + n3);
        System.out.println("Tipos de dato long: " + n4);
        System.out.println("Tipos de dato float: " + n5);
        System.out.println("Tipos de dato double: " + n6);
        System.out.println("Tipos de dato char: " + letra);
        System.out.println("Tipos de dato boolean: " + valor);

        // 1. Realiza un programa que defina una variable de tipo entero de cualquier valor y lo muestre en pantalla
        int valorEntero = 5;
        System.out.println("El valor es: " + valorEntero);

        //2. Realiza un programa que defina una variable tipo entero con el valor de 2 y lo muestre en pantalla, después asignar el valor de 5 y lo muestre en pantalla 
        byte valor1 = 2;
        System.out.println("El primer valor es: " + valor1);
        valor1 = 5;
        System.out.println("El valor ahora es: " + valor1);

        // 3. Realiza un programa que defina un tipo entero con punto decimal de cualquier valor y lo muestre en pantalla
        float numeroFlotante = 4.61f;
        System.out.println("El numero flotante es: " + numeroFlotante);

        // 4. Realiza un programa que defina un tipo caracter de cualquier valor y lo muestre en pantalla
        char valorCaracter = 'N'; // también se puede añadir valores númericos pero saldran en código ascii
        System.out.println("El valor caracter es: " + valorCaracter);

        // 5. Realiza un programa que defina un tipo caracter de cualquier valor y muestre su valor numerico en pantalla
        char valorCaracterNumerico = '@';
        byte vcn = (byte) valorCaracterNumerico;
        System.out.println("El valor caracter a número es: " + vcn);

        // 6. Realiza un programa que defina un tipo booleano de cualquier valor y lo muestre en pantalla
        boolean celularEncendido = true;
        System.out.println("El móvil está encendido: " + celularEncendido);

        // 7. Realiza un programa que defina un tipo de dato cadena de caracteres de cualquier valor y lo muestre en pantalla.
        String cadena = "Hola Mundo";
        System.out.println("La cadena es: " + cadena);
    }
}
