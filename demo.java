class Student{
    private String name;
    private int id;

public String getName(){
    return name;
}
    public void setName(String name){
    this.name = name;
 }
public int getId (){
    return id;
}
    public void setId(int id){
        this.id = id;
    }

}


  

  public class demo {

    public static void main(String[] args) {
      Student std = new Student();
      std.setId(33);
      std.setName("Venu");
      System.out.println("ID:"+(std.getId()));
      System.out.println("Name"+(std.getName()));
    }
  }