/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author mossotron
 */
public class person {
    
    private String name;
    private int age;
    private enum priority{ URGENT, MEDIUM, LOW};
    private String gpdetails;
    private boolean arrived;

    public person(String name, int age, String gpdetails, boolean arrived) {
        this.name = name;
        this.age = age;
        this.gpdetails = gpdetails;
        this.arrived = arrived;
    }

    public person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGpdetails() {
        return gpdetails;
    }

    public void setGpdetails(String gpdetails) {
        this.gpdetails = gpdetails;
    }

    public boolean isArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    @Override
    public String toString() {
        return "person{" + "name=" + name + ", age=" + age + ", gpdetails=" + gpdetails + ", arrived=" + arrived + '}';
    }
    
    
}
