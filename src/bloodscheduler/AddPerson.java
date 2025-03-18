/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author mossotron
 */
public class AddPerson implements PersonInterface{
    
    private ArrayList<Person> queue;
    private ArrayList<Person> stack;
    private ArrayList<Person> priorityQueue;
    
    public AddPerson() {
        queue = new ArrayList<>();
        stack = new ArrayList<>();
        priorityQueue = new ArrayList<>();
    }
    
    @Override
    public void enqueue(Person p) {
        queue.add(p);
    }
    
    @Override
    public Person dequeue() {
        if(queue.isEmpty()) return null;
        return queue.remove(0);
    }
    
    @Override
    public Person peekQueue() {
        if(queue.isEmpty()) return null;
        return queue.get(0);
    }
    
    @Override
    public String displayQueue() {
        StringBuilder sb = new StringBuilder();
        for(Person p : queue) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public void push(Person p) {
        stack.add(p);
    }
    
    @Override
    public Person pop() {
        if(stack.isEmpty()) return null;
        return stack.remove(stack.size()-1);
    }
    
    @Override
    public Person peekStack() {
        if(stack.isEmpty()) return null;
        return stack.get(stack.size()-1);
    }
    
    @Override
    public String displayStack() {
        StringBuilder sb = new StringBuilder();
        for(Person p : stack) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
    
    @Override
    public void insertPriority(Person p) {
        priorityQueue.add(p);
        Collections.sort(priorityQueue, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int prioComparison = comparePriority(p1, p2);
                if(prioComparison != 0) return prioComparison;
                int ageComparison = Integer.compare(p2.getAge(), p1.getAge());
                if(ageComparison != 0) return ageComparison;
                return Boolean.compare(p2.isFromWard(), p1.isFromWard());
            }
        });
    }
    
    @Override
    public Person removePriority() {
        if(priorityQueue.isEmpty()) return null;
        return priorityQueue.remove(0);
    }
    
    @Override
    public Person peekPriority() {
        if(priorityQueue.isEmpty()) return null;
        return priorityQueue.get(0);
    }
    
    @Override
    public String displayPriority() {
        StringBuilder sb = new StringBuilder();
        for(Person p : priorityQueue) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
   
    private int comparePriority(Person p1, Person p2) {
        int value1 = getPriorityValue(p1.getPriority());
        int value2 = getPriorityValue(p2.getPriority());
        return Integer.compare(value1, value2); 
    }
    
    private int getPriorityValue(String prio) {
        if(prio.equalsIgnoreCase("URGENT"))
            return 1;
        else if(prio.equalsIgnoreCase("MEDIUM"))
            return 2;
        else if(prio.equalsIgnoreCase("LOW"))
            return 3;
        else
            return 4;
    }
}
