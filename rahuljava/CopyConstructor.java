

public class CopyConsructor {
  public static void main(String[] args){
      Student4 s1 =new Student4();
      s1.name="Rahul";
      s1.roll=25;
      s1.setpassword("abcde");
      System.out.println(s1.getpassword());
      s1.marks[0]=100;
      s1.marks[1]=90;
      s1.marks[2]=80;
      for(int i=0; i<3; i++){
          System.out.println(s1.marks[i]);
      }

      Student4 s2= new Student4(s1);
      s2.setpassword("xyz");
      System.out.println(s2.getpassword());
      for(int i=0; i<3; i++){
          System.out.println(s2.marks[i]);
      }
  }
}
class Student4{
    int roll;
    String name;
   private String password;
    int marks[];

   Student4(Student4 s1){  // copy constructor
        marks= new int[3];
       this.name=s1.name;
       this.roll= s1.roll;
       this.marks=s1.marks;
    }

  String getpassword(){
       return this.password;
   }
   void setpassword(String password){
       this.password= password;
   }

    Student4(){
        System.out.println("Constructor is called!!");
    }
    Student4(String name){
       marks = new int[3];
       this.name=name;
    }
    Student4(int roll){
        marks = new int[3];
        this.roll=roll;
    }

}