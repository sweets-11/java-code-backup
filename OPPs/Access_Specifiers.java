public class Access_Specifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(); // creating new object

        myAcc.username = "AniketJain";
        System.out.println(myAcc.username);
        myAcc.setPassword("aniketjain11");// we can not access it outside the class but we can change ti

        
        // myAcc.password = "sfsf"; // can't access as it was defined as private object.
    }
}


class BankAccount{
public String username;
private String password;
public void setPassword(String pwd) { // we can change it but can't access
    password = pwd;
}
}
