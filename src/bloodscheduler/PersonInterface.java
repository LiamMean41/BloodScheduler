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
    public void enqueue(Person p);
    public Person dequeue();
    public Person peekQueue();
    public String displayQueue();
    public void push(Person p);
    public Person pop();
    public Person peekStack();
    public String displayStack();
    public void insertPriority(Person p);
    public Person removePriority();
    public Person peekPriority();
    public String displayPriority();
    
}
