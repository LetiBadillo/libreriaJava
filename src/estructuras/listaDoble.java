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
            node.setNext(first);
            //node.next=first; //el apuntador sigiuente de nuestro nodo, apunta al primer nodo de la lista.
            first.setPrev(node);
            //first.prev=node;//el apuntador anterior del primer nodo de la lista apunta al nuevo nodo.
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
            last.setNext(node);
            //last.next=node; //da la última posición al nodo
            node.setPrev(last);
            //node.prev=last; //Marca el otro nodo como previo del nuevo
            last=node; //El apuntador first (que es atributo de la lista) apunta al nuevo nodo.
        }
    }
    public boolean isEmpty(){
        return first==null && last==null;
    }
     private nodeDL searchNode(T data) {
        nodeDL aux;
        if (isEmpty()) {
            return null; 
        } else { //Si contiene elementos
            aux = first; //se inicia auz
            
            try {
                while (aux.getData() != data /*&& aux != null*/) { //
                    aux = aux.getNext();
                }
            } catch (NullPointerException e) {
                return null;
            }
            if (aux.getData() == data) { 
                return aux;
            }
        }
        
        return null;
    }
    
public boolean eNode(T data) {
        nodeDL aux = searchNode(data);
        if (aux == null) {
            System.out.println("No encontrado");
            return false;
        } else if (aux == first) {
            eNodeFirst();
        } else if (aux == last) {
            eNodeLast();
        } else {
            aux.getNext().setPrev(aux.getPrev());
            aux.getPrev().setNext(aux.getNext());
        }
        return true;
    }

public void eNodeFirst(){
    //se mueve el apuntador first al siguiente
    //first=first.next;
    
    first= first.getNext();
    //marcamos el previo como nulo
    first.setPrev(null);
    //first.prev=null;
}

public void eNodeLast(){
    //se mueve el apuntador final al previo
    //last=last.getPrev();
    
    last= last.getPrev();
    //se marca el siguiente como nulo
    last.setNext(null);
    
    //last.next=null;
}
//insert last, showList, showReverse,
public void showList(){
     if(!isEmpty()){
           nodeDL aux;
           aux=first;
           while (aux!= null){
               System.out.println(aux.getData());
               aux= aux.getNext();
                //aux= aux.next;
               
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
               System.out.println(aux.getData());
               aux = aux.getPrev();
               //aux= aux.prev;
               
               
           }
            
        }else{
            System.out.println("La lista está vacía.");
        }
}

}
