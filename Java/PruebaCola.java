/**
 * 
 * @author Juan Pablo Castrillón
 *
 */
public class PruebaCola {
    public static void main(String [] args){
        System.out.println("Creamos una cola de 9 posiciones.");
        Cola temp1= new Cola(9);        
        temp1.Encolar();
        temp1.MostrarCola();
        temp1.Encolar();
        temp1.MostrarCola();
        temp1.Encolar();
        temp1.MostrarCola();
        System.out.println("Terminemos de llenar.");
        Llenar(temp1);
        temp1.MostrarCola();
        System.out.println("Agreguemos uno mas.");
        temp1.Encolar();
        System.out.println("Eliminemos de la cola");
        temp1.Desencolar();
        temp1.MostrarCola();
        System.out.println("Eliminemos 4 de la cola");
        temp1.Desencolar();
        temp1.Desencolar();
        temp1.Desencolar();
        temp1.Desencolar();
        temp1.MostrarCola();
        System.out.println("Eliminemos otros 4 de la cola");
        temp1.Desencolar();
        temp1.Desencolar();
        temp1.Desencolar();
        temp1.Desencolar();
        temp1.MostrarCola();
        System.out.println("Eliminemos uno mas");
        temp1.Desencolar();
    }
    public static void Llenar(Cola cola){
        while(!cola.ColaLLena()){
            cola.Encolar();
        }
        System.out.println("Cola llena.");
    }
}
