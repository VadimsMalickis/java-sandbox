
// defining custom class
public class Student {
    
    // class can contain properties (variables)
    private int age;
    private String name;
    private String color;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // class also can contain methods (some actions aka functions)
    public String getColor() {
        return this.color;
    }

    public void setColor(String colorArgument) {
        this.color = colorArgument;
    }

}
