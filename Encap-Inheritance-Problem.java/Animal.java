public class Animal{
    private String name;
    private int age;

    Animal() {}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getDetails(){
        return "Name: "+ name + "Age: "+age;
    }
    public String toString(){
        return getDetails();
    }
}


