import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo Castrillón
 *
 */

public class Cola {
    int [] Cola;
    int Frente;
    int Final;
    int max;
    
    /**
     * Constructor por defecto
     */
    
    public Cola(){
        Frente=-1;
        Final=-1;
        max=-1;
    }

    /**
     * Constructor con parametros
     * Recibe el tamaño de la cola.
     * @param num
     */
    
    public Cola(int espacio){
        Cola = new int[espacio];
        max=Cola.length-1;
        Frente=-1;
        Final=-1;        
    }
    
    /**
     * Averiguamos si la cola esta vacía
     * @return
     */
    public boolean ColaVacia(){
        if(Final==-1)
            return true;
        else
            return false;
    }
    
    /**
     * Averiguamos si la cola esta llena
     * @return
     */

    public boolean ColaLLena(){
        if(Final==max)
            return true;
        else
            return false;
    }
        
    /**
     * Ingresar un elemento a la cola.
     */
    public void Encolar(){
        if(!ColaLLena()){
            if(ColaVacia()){
                Frente++;
                Final++;
            }
            else {
                Final++;
            }
            try {
                Cola[Final]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            }catch(Exception e){}
        }
        else
            System.out.println("No es pósible ingresar mas elementos");        
    }
    /**
     * Eliminar un elemento a la cola.
     */
    public void Desencolar(){
        if(ColaVacia())
            System.out.println("No hay Elementos");
	else{
            for(int i=Frente;i<Final;i++){
                Cola[i]=Cola[i+1];
            }
            Cola[Final]=0;
            Final--;
       }
    }

    /**
     * Muestra los elementos actuales de la cola.
     */
    public void MostrarCola(){
        if(!ColaVacia()){
          for (int i=Frente;i<=Final;i++)
              System.out.print("["+Cola[i]+"]");
          System.out.println();
        }
    }    
}