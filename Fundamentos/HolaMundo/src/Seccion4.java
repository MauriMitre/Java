
public class Seccion4 {

    public static void main(String[] args) {
        //Operadores aritmeticos
//        int a = 3, b = 3;
//        var resultado = a + b;
//        System.out.println("resultado suma = " + resultado);
//        resultado = a-b;
//        System.out.println("resultado resta = " + resultado);
//        resultado = a*b;
//        System.out.println("resultado producto = " + resultado);
//        resultado = a/2;
//        System.out.println("resultado division = " + resultado );
//        resultado = a%b;//Modulo, devuelve el resto
//        System.out.println("resultado modulo = " + resultado);

        //Operadores de asignacion
//        int a = 3, b = 2;
//        int c = a + 5 - b;
//        a++;//Es lo mismo que a=a+1; o a+=1; Esto solo funciona si solo se quiere sumar o restar 1, si se quiere otro numero se utiliza +=
//        a--;//Es lo mismo que a = a-1 o a-=1;


        //operadores unarios
//        int a = 3;
//        var b = -a;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        
//        var c = true;
//        var d = !c;
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
        
        //incremento
        //1.preincremento (simbolo antes de la variable)
//        var e = 3;
//        var f = ++e;//primero se incrementa la varible y despues se usa su valor
//        System.out.println("e = " + e);
//        System.out.println("f = " + f);
        //2.postincremento ( simobolo dsp de la varible)
//        var g = 5;
//        var h = g++;
//        System.out.println("g = " + g);
//        System.out.println("h = " + h);
        
        //Decremento
        //1.predecremento
//        var i = 4;
//        var j = --i;
//        System.out.println("i = " + i);
//        System.out.println("j = " + j);
        //2.postdrecemento
//        var k = 4;
//        var l = k--;
//        System.out.println("k = " + k);
//        System.out.println("l = " + l);

        //Igualdad y relacionales
         var a = 3;
         var b = 3;
         var c = (a == b);
         System.out.println("c = " + c);
         
         var d = (a!=b);
         System.out.println("d = " + d);
         
         var cadena = "Hola";
         var cadena2 = "Adios";
         var cadena3 = "Hola";
         
         var f = cadena.equals(cadena2);
         var h = cadena.equals(cadena3);
         System.out.println("f = " + f);
         System.out.println("h = " + h);
         
         var g = a >= b;// <, >, >=, <=
         System.out.println("g = " + g);
         
    }

}
