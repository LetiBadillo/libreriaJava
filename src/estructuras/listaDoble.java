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
public class listaDoble<T> {
    nodeDL first;
    nodeDL last;
    
    
    public void insertFirst(T data){
        nodeDL node= new nodeDL(data);
        //Si la lista està vacìa
        if(isEmpty()){
            this.first=node;
            this.last=node;
        }else{ //Si la lista tiene elementos
            node.next=first; //el apuntador sigiuente de nuestro nodo, apunta al primer nodo de la lista.
            first.prev=node;//el apuntador anterior del primer nodo de la lista apunta al nuevo nodo.
            first=node; //El apuntador first (que es atributo de la lista) apunta al nuevo nodo.
        }
    }
     public void insertLast(T data){
        nodeDL node= new nodeDL(data);
        //Si la lista està vacìa
        if(isEmpty()){
            this.first=node;
            this.last=node;
        }else{ //Si la lista tiene elementos
            last.next=node; //da la última posición al nodo
            node.prev=last; //Marca el otro nodo como previo del nuevo
            last=node; //El apuntador first (que es atributo de la lista) apunta al nuevo nodo.
        }
    }
    public boolean isEmpty(){
        return first==null && last==null;
    }
    
    public nodeDL searchNode(T data){ //busca node
        nodeDL aux;
        if(isEmpty()){
            return null; //si està vacìa regresa falso
        } else{ //si contiene elementos
            aux=first; //colocamos auxiliar al inicio de la lista
            while(aux.data!=data && aux!=last){ //mientras que no encuentre el dato o no llegue al final de la lista
                aux=aux.next; //recorrer la lista
            } 
                return aux;//Teoría Montiel
            }
    }


public boolean eNode(T data){
    nodeDL aux= searchNode(data);
    if(aux==null){
    System.out.println("No se encontró el nodo");
    return false;
}else{ 
        if(aux==first){
            eNodeFirst();
            return true;
        } 
        if(aux==last){
            eNodeLast();
        }else{
            aux.prev.next=aux.next;
            aux.next.prev=aux.prev;
        }
            return true;
        }
    
}

public void eNodeFirst(){
    //se mueve el apuntador first al siguiente
    first=first.next;
    //marcamos el previo como nulo
    first.prev=null;
}

public void eNodeLast(){
    //se mueve el apuntador final al previo
    last=last.prev;
    //se marca el siguiente como nulo
    last.next=null;
}
//insert last, showList, showReverse,
public void showList(){
     if(!isEmpty()){
           nodeDL aux;
           aux=first;
           while (aux!= null){
               System.out.println(aux.data);
               aux= aux.next;
               
           }
            
        }else{
            System.out.println("La lista está vacía.");
        }
    
}

public void showReverse(){
 if(!isEmpty()){
           nodeDL aux;
           aux=last;
           while (aux!= null){
               System.out.println(aux.data);
               aux= aux.prev;
               
           }
            
        }else{
            System.out.println("La lista está vacía.");
        }
}

}
