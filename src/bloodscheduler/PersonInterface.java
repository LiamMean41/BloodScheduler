/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author mossotron
 */
public interface PersonInterface {
    public void push(Object newPerson);
    public Object remove();
    public Object add();
    public Object get();
    public String getIndex(int firstInList);
    public String diplayStack();
    
}
