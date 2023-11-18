
package rvt;

// defining custom class
public class Student extends Person {
    public String group;
    public String name;
    public String surname;
    public String email;

    public Student() {

    }

    public Student(String name,String surname, String group, String email) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
