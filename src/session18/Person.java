package session18;

public class Person {

    private String name;
    private String id;


    public Person(String name, String id){
        this.name=name;
        this.id=id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getid(){
        return id;
    }

    public void performDuties(){
        System.out.println("This person performs some normal duties.");
    }
}
