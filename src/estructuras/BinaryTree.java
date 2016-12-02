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
public class BinaryTree <T>{

    nodeT root;
    int elements;
    
    //Constructor
    public BinaryTree(){
        this.root=null;
        this.elements=0;
    }
    public nodeT getRoot(){
    return this.root;
}
    public int getElements(){
        return elements;
    }
    public boolean rootEmpty(){ 
        return this.root == null;
    }
    public void insertNode(int data, nodeT raiz) {
        nodeT nodo = new nodeT(data);
        if (rootEmpty()) {
            this.root = nodo;
            elements++;
        } else {
            if ((int) nodo.data >= (int) raiz.data) {
                if (raiz.left == null) {
                    raiz.left = nodo;
                    elements++;
                } else {
                    insertNode(data, raiz.left);
                }
            } else {
                if (raiz.right == null) {
                    raiz.right = nodo;
                    elements++;
                } else {
                    insertNode(data, raiz.right);
                }
            }
        }
    }
    public boolean searchNode(int dato, nodeT raiz) {
        if (raiz == null) {return false;}
        if ((int)raiz.data==(dato)) {return true;}
        if ((int)raiz.data<dato) {return searchNode(dato, raiz.left);}
        if ((int)raiz.data>dato) {return searchNode(dato, raiz.right);}
        return searchNode(dato, raiz);

    }
    
    public boolean roots(nodeT n, int dato){
        if (n==null) {return false;}
        if (n.right==null && n.left==null) {
            return false;}
        if (n.left==null) {
            return (int) n.right.data != dato;}
        if (n.right==null) {return (int) n.left.data != dato;}
        return (int) n.left.data != dato && (int) n.right.data != dato;
    }
    
    public boolean compare(nodeT node, int dato){
         if (node!=null) {
             return node.data.equals(dato);
        }else{
             return false;
         }
    }
    public void eNode(int dato, nodeT raiz, int i) {
        if (searchNode(dato, raiz)) {
            while (roots (raiz, dato)) {
                if (dato > (int) raiz.data) {
                    raiz = raiz.left;
                }else{
                if (dato < (int) raiz.data) {
                    raiz = raiz.right;
                }
                }
            }
            if (compare(raiz.left, dato)) {
                if (getHijos(raiz.left)) {
                    raiz.left = null;
                }
                if (Hijos(raiz.left)) {
                    nodeT aux = enLugar(raiz.left);
                    eNode((int)aux.data, raiz.left,0);
                    raiz.left.data = aux.data; 
                }
            }
            if (compare(raiz.right, dato)) {
                if (getHijos(raiz.right)) {
                    raiz.right = null;
                }
                if (Hijos(raiz.right)) {// tiene subarbol
                   nodeT aux = enLugar(raiz.right);
                    eNode((int)aux.data, raiz.right,0);
                    raiz.right.data = aux.data;
                }
            }
            elements=elements+i;
        } else {
            System.out.println("No se encontró el elemento");
        }
    }
    public int getHeight(nodeT node){
        if (node != null) {
            return 1+Math.max(getHeight(node.left), getHeight(node.right));
        }else{
            return -1;
        }
    }
   
    public boolean getHijos(nodeT node) {
        if (node!=null) {
        return node.left == null && node.right == null;
        }else{
         return false;   
        }
    }
    public boolean Hijos(nodeT n) {
        if (n==null) {
            return false;
        }
        if (n.left==null && n.right==null) {
            return false;
        }
        if (n.left==null && n.right!=null) {
            return true;
        }
        if (n.right==null && n.left!=null) {
            return true;
        }
        return n.left != null || n.right != null;
    }
    
    
    public nodeT enLugar(nodeT node) {
        if (node.left == null) {
            return node.right;
        } else {
            if (node.left.right == null) {
                return node.left;
            } else {
                node = node.left.right;
                while (node.right != null) {
                    node = node.right;
                }
                return node;
            }
        }
    }
    
    
    public void preOrder(nodeT raiz, boolean right, boolean left) {
        System.out.print("[" + raiz.data + "] ");
        while (right == false && raiz.right != null) {
            preOrder(raiz.right, right, false);
            right = true;
        }
        while (raiz.left != null && left == false) {
            preOrder(raiz.left, false, left);
            left = true;
        }
    }
    
    public void postOrder(nodeT raiz, boolean right, boolean left) {
        while (right == false && raiz.right != null) {
            postOrder(raiz.right, right, false);
            right = true;
        }
        while (raiz.left != null && left == false) {
            postOrder(raiz.left, false, left);
            left = true;
        }
        System.out.print("[" + raiz.data + "] ");
    }
    
    public void inOrder(nodeT raiz, boolean right, boolean left) {
        while (right == false && raiz.right != null) {
            inOrder(raiz.right, right, false);
            right = true;
        }
        System.out.print("[" + raiz.data + "] ");
        while (raiz.left != null && left == false) {
            inOrder(raiz.left, false, left);
            left = true;
        }
    }
    

}
