/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

/**
 *h
 * @author ASUS
 */
public class BinaryTree {
nodeT root;    
int height;
int elements;

public BinaryTree(){
    this.root= null;
    this.height=-1;
    this.elements=0;
}

public boolean isEmpty(){
    return this.root==null;
}

public void insert(int data, nodeT root){
    nodeT node = new nodeT(data);
    if(isEmpty()){
        this.root= node;
        this.height++;
    }else{ ///si no está vacía
        //si el nodo es mayor que raíz
        if(this.root.data <= node.data){
            if(root.left==null){ //caso  base
                    root.left= node;
                    this.height++;
                }else{
                    //buscará por la izquierda
                    insert(data, root.left);
                } 
            
        }if(this.root.data >= node.data){ //si no es mayor que la raíz
            if (root.right==null){ //Caso base
                root.right= node;
                this.height++;
            }else{ //si tiene un elemento a la derecha buscará por la derecha hasta encontrar un espacillo
                insert(data, root.right);
            }
        }
    }
        this.elements++;
    
    
}

public boolean searchNode(nodeT root, int data){
    nodeT search = new nodeT(data);
    nodeT r= new nodeT(root.data);
    if(!isEmpty()){
     if(r.data==search.data) return true;   
     if(r.left != null && r.data<search.data) //si el nodo a buscar es menor que la raíz y la izquierda de la raíz no es null 
        searchNode(r.left, search.data);
     if(r.right != null && r.data > search.data) //si el nodo es mayor que la raíz y la derecha no es null
        searchNode(r.right, search.data);
    }
    return false;
}
public nodeT getRoot(){
    return this.root;
}

public void deleteNode(int data){
    if(!isEmpty()){
        
    }

}
public void postOrder(nodeT root) {  
  if(root !=  null) {  
   postOrder(root.left);  
   postOrder(root.right);  
   System.out.printf("%d ",root.data);  
  }  
 }
//commit
public void inOrder(nodeT root) {  
  if(root !=  null) {  
   inOrder(root.left);  
   System.out.printf("%d ",root.data);  
   inOrder(root.right);  
  }  
 }
public void preorder(nodeT root) {  
    if(root !=  null) {  
   //Visit the node by Printing the node data    
      System.out.printf("%d ",root.data);  
      preorder(root.left);  
      preorder(root.right);  
    }}
    
    
    public int getHeight(){
        return this.height;
    }
  
    public int getElements(){
      return this.elements;  
    }


}
