/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef
 */
public class TNode {
    private Avaliability data;
    private TNode left;
    private TNode right ;

    public TNode(){
        
    }

    public TNode(Avaliability data) {
        this.data = data;
    }
    
    public TNode(Avaliability data, TNode left, TNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void setData(Avaliability data) {
        this.data = data;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public void setRight(TNode right) {
        this.right = right;
    }

    public Avaliability getData() {
        return data;
    }

    public TNode getLeft() {
        return left;
    }

    public TNode getRight() {
        return right;
    }
    
    
    
}
