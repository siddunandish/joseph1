class Student{
   int id;
   String name;
}
class TestStudent3{
 public static void main(String[]args){
 //creating objects
 Student s1=new Student();
 Student s2=new Student();
 //initializing object
 s1.id=101;
 s1.name="sonoo";
 s2.id=102;
 s2.name="amith";
 //printing data
 System.out.println(s1.id+" "+s1.name);
 System.out.println(s2.id+" "+s2.name);
 }
}