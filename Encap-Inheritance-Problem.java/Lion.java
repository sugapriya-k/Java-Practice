
public class Lion extends Animal{
    private boolean isAlpha;
    public Lion(String name , int age, boolean isAlpha){
    setName(name);
    setAge(age);
    this.isAlpha=isAlpha;
    }
    public String getDetails(){
        return super.getDetails() +", Is Alpha : "+ isAlpha;
    }
    

}
