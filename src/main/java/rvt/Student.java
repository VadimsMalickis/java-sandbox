package rvt;

import org.json.JSONObject;

// defining custom class
public class Student {
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
    public String getSurname() {
        return this.surname;
    }
    public String getEmail() {
        return this.email;
    }
    public String getGroup() {
        return this.group;
    }

    public String toString() {
        return String.format("{%s, %s, %s, %s}", this.name, this.surname, this.email, this.group);
    }

    public String toJsonString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", this.name);
        jsonObject.put("surname", this.surname);
        jsonObject.put("group", this.group);
        jsonObject.put("email", this.email);
        return jsonObject.toString();
    }

    public String[] toArray() {
        return new String[] {
            this.name,
            this.surname,
            this.email,
            this.group
        };
    }

}
