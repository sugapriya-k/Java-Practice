
   public class Elephant extends Animal{
    private double trunkLength;
    public Elephant(String name, int age, double trunkLength){
        setName(name);
        setAge(age);
        this.trunkLength=trunkLength;            
    }
    public String getDetails(){
        return super.getDetails() + " trunk length " + trunkLength;
    }
}

