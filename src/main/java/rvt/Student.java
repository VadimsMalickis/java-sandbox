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


    public void setName(String name) {
        this.name = name;
    }

    public String toJsonString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", this.name);
        jsonObject.put("surname", this.surname);
        jsonObject.put("group", this.group);
        jsonObject.put("email", this.email);
        return jsonObject.toString();
    }


}
