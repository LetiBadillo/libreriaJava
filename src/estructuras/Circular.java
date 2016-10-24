/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *
 * @author ASUS
 */
public class Circular <T> {
    nodeClass pivote;
    int numberOfElements = 0;
    int index = 0;
    
    public boolean isEmpty() {
        return (numberOfElements == 0);
    }
    
     public void insert(T data) {
        if (!(isEmpty())) {
            index++;
        }
        nodeClass listNode = new nodeClass(data);
        pivote = listNode;
        numberOfElements++;
    }
     public void mostrarLista(){
        if(!isEmpty()){
           nodeClass aux;
           aux=pivote;
           while (aux!= null){
               System.out.println(aux.getData());
               aux= aux.getNext();
               
           }
            
        }else{
            System.out.println("La lista está vacía.");
        }
    }
     
     public nodeClass search (T data){
     nodeClass aux = pivote;
     while (aux !=null && aux.getData()!= data){
         aux= aux.getNext();
     }
     return aux;
     }
     
     public nodeClass eliminar(T data){
         nodeClass n = search(data);
         nodeClass aux = pivote;
         if (aux ==null){
             System.out.println("Lista vacía");
             return null;
         }
         else if(aux == n){
             aux = aux.getNext();
             aux=n.getNext();
             return n;
         }else{
             while (aux.getNext() != n){
                 aux= aux.getNext();
             }
             aux = aux.getNext();
             aux=n.getNext();
             return n;
         }
     }
    
}
