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
public class linealListClass<T> {
    nodeClass first;
    nodeClass last;
    //Mètodos
    
    /*  public void insertFirst(T data){
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
    }*/
    public void insertFirst(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            node.setNext(first);
            first=node;
        }
    }
     
    public void insertLast(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            last.setNext(node);
            last=node;            
        }
    }
    public boolean delete(T searchValue) {
    nodeClass aux = first;
    nodeClass prevNode = null;
    boolean d = false;
     while (aux != null) {
        if (aux.getData() == searchValue) {
            
            if (aux == first) {
                first = first.getNext();
            } else if(aux==last) { 
                prevNode.setNext(aux);
            }
            
            d = true;
         } else {
            
             prevNode = aux;
         }
         aux = aux.getNext();
    }

    return d;
}
 public void deleteFirst() {
    nodeClass aux = first;
        if (aux != null) {
            first = first.getNext();
        }
}   
  
 public void deleteLast() {
    nodeClass actual = null;
    
    for (actual = this.first; actual.getNext().getNext() != null;actual = actual.getNext()) {
    }
    
   actual.setNext(null);
   last= actual;
}
 
    public boolean isEmpty(){
        return first==null;
    }
    
    public void showList(){
        if(!isEmpty()){
           nodeClass aux;
           aux=first;
           while (aux!= null){
               System.out.println(aux.getData());
               aux= aux.getNext();
               
           }
            
        }else{
            System.out.println("La lista está vacía.");
        }
    }
}

