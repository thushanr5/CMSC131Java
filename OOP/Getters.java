public class SettersData {
    private String name;
    private int age;

    public static void main(String[]args){
        SettersData data = new SettersData();
        data.setName("Juan");
        data.setAge(20);
        data.displayDetails();
        System.out.println(data.getName());
        System.out.println(data.getAge());
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void displayDetails(){
        System.out.println(name + " " + age);
    }
}
