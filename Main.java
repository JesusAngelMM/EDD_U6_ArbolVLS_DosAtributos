//Funciona :3

public class Main {
    public static void main(String[] args) {
        ArbolBalanceado arbol = new ArbolBalanceado();
        //Insertar elementos
        arbol.insertar(10, 123);
        arbol.insertar(1, 124);
        arbol.insertar(5, 125);
        arbol.insertar(15, 135);
        arbol.insertar(12, 136);
        arbol.insertar(2, 126);
        arbol.insertar(11, 128);
        arbol.insertar(9, 158);
        arbol.insertar(7, 258);

        //Recuperar elementos
        System.out.println(arbol.buscar(10).getPosicion());
        System.out.println(arbol.buscar(2).getPosicion());
        System.out.println(arbol.buscar(11).getPosicion());
        System.out.println(arbol.buscar(7).getPosicion());
        System.out.println(arbol.buscar(12).getPosicion());
    }
}
