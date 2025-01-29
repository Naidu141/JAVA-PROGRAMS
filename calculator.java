public class calculator {
    
    void Add(int a, int b ){
     System.out.println(a+b);

}
    void Add(int a, int b, int c  ){
    System.out.println(a+b+c);

}
void Add(double a, double b ,int c){
System.out.println(a+b+c);
}
 void Add(String a, double b,int c){
 System.out.println(a);
 System.out.println(b);
 System.out.println(c);
}

public static void main(String[] args) {
    
calculator obj = new calculator();
obj.Add(565006, 565006);
obj.Add(565017, 565017);
}
}