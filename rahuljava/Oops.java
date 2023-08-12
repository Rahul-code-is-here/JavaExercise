public class Oops {
    public static void main(String[] args){
        pen p1= new pen(); // new heap ma space rokva and pen() constructor
                           // created pen object called p1
        p1.setColour("blue");
        System.out.println(p1.colour);   
        p1.setTip(5);
        System.out.println(p1.tip);    
        //p1.setColour("Yellow");
        p1.colour="yellow";
        System.out.println(p1.colour);
        
        BankAccount account1= new BankAccount();
        account1.username="Rahul";
        // account1.password="abcdef"; error
        account1.setpassword("abcdf");


    }
}

class BankAccount{
   public String username;
   private String password;
   public void setpassword(String newpassword) {
    password=newpassword;
}

class pen{
    int tip; 
    String colour;

    void setColour(String newcolour) {
        colour=newcolour;
    }

        void setTip(int newtip){
            tip= newtip;
        }
    }

    class Student{
        int age;
        String name;
        float percentage;

        void calculatePercentage(int phy, int chem, int math){
            percentage= (phy+chem+math)/3;
        }
    }
