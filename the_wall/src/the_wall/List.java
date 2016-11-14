/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_wall;

/**
 *
 * @author admin
 */
public class List {
    
    Node head;

    public List(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "List{" + "head=" + head + '}';
    }
    
    
}
