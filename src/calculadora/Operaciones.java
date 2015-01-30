package calculadora;

public class Operaciones { //comienzo clase operaciones
 
    public void numero(String uno,String dos) throws NumberFormatException {//metodo para validar si se ha ingresado un numero, recibe una cadena de texto
        Integer n1;
        n1 = Integer.parseInt(uno);
        Integer n2;
        n2 = Integer.parseInt(dos);
        if (n1.toString().isEmpty() && n2.toString().isEmpty())
            throw new NumberFormatException();

    }

    public void divide(int n1, int n2) throws ArithmeticException {
        if (n2 == 0) 
            throw new ArithmeticException();
    }
       public void raiz (int numero1)throws ArithmeticException{
       if(numero1<0)
           throw new ArithmeticException();
    }

    public int Division(int n1, int n2) {//metodo para sumar, recibe dos numeros
        int op; //variable que almacena la respuesta
        op = n1 + n2; //operacion
        return op; //devuelve el valor de la operacion
    } //fin metodo suma

    public int resta(int n1, int n2) { //metodo para restar, recibe dos numeros
        int op; //variable que almacena la respuesta
        op = n1 - n2; //operacion
        return op; //devuelve el valor de la operacion
    }// fin metodo resta

    public int multiplicacion(int n1, int n2) { 
        int op; 
        op = n1 * n2; 
        return op; 
    } 


}