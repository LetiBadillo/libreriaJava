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
    
    public void insertFirst(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            nodeClass next = node.getNext();
            next=first;
            first=node;
        }
    }
     
    public void insertLast(T n){
        nodeClass node = new nodeClass(n);
        if(isEmpty()){
            first = node;
            last = node;
        }else{
            nodeClass next= last.getNext();
            next=node;
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
            } else { 
                nodeClass n =prevNode.getNext(); 
                        n= aux.getNext();
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
    nodeClass a = actual.getNext();
    a = null;
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

