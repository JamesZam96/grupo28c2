public class App {

    private String nombre;
    private int edad;
    private double estatura;
    private float peso;
    private char inicial;
    private String direccionVivienda;

    public static void main(String[] args) throws Exception {
        /**System.out.println("Hello, World!");**/

        //Operadores aritmeticos
        int resultado = 5 + 4;
        double resultado2 = 5 / 4;
        double resultado3 = 12 % 4;
        resultado++;
        resultado = resultado + 1;
        resultado--;
        resultado = -resultado;
        resultado = +resultado;

        //Operadores logicos
        boolean respuesta = 5 > 4;
        respuesta = 25 != 12;
        respuesta = true;
        respuesta = 15 > 12 && 5 < 2;
        respuesta = 15 > 12 || 5 < 2;

        //Operadores bit a bit
        //&
        //^
        //|
        //-----------------------------

        //Estructuras de control
        //condicionales
        if (respuesta) {
            //resultado si se cumple la condicion
        }
        if (respuesta) {
            //resultado si se cumple la condicion
        } else {
            //resultado si no se cumple la condicion
        }

        //------------------------------
        int valor = 3;
        switch (valor) {
            case 1:
                //Bloque de codigo
                break;
            case 2:
                //Bloque de codigo
                break;
            case 3:
                //Bloque de codigo
                break;
            default:
                break;
        }
        //------------------------------
        //ciclos o bucles
        while (valor!=3) {
            //Bloque de codigo
        }

        do {
            //Bloque de codigo
        } while (valor!=3);

        for (String string : args) {
            //Bloque de codigo
        }

        for (int i = 0; i < args.length; i++) {
            
        }
        //for infinito -> for(;;){}
    }
}
