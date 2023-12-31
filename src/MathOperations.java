public class MathOperations {
    public static void main(String[] args){
        System.out.println("Mathematis operations");
        double x=2.1;
        double y=3;

        //devuelve un entero hacía arriba
        System.out.println(Math.ceil(x));

        //Devuelve un entero hacía abajo
        System.out.println(Math.floor(x));

        //Devuelve un numero elevado a otro
        System.out.println(Math.pow(x,y));

        //Devuelve el numero mayor
        System.out.println(Math.max(x,y));

        //Devuvle la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Are de un circulo
        //Pi * r2
        System.out.println(Math.PI*Math.pow(y,2));

        //Area de una esfera
        //4PI * r2
        System.out.println(4*Math.PI*Math.pow(y,2));

        //Volumen de una esfera
        // (4/3) * PI * r3
        System.out.println((4/3)*Math.PI*Math.pow(y,3));
    }
}
