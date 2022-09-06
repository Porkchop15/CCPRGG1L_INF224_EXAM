public class Student {

    String surname;
    String firstname;
    char middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void sayMySurname(){
        System.out.println("My Surname is " + surname);
    }

    public void sayMyFirstname(){
        System.out.println("My Firstname is " + firstname);
    }

    public void sayMyMiddleInitial(){
        System.out.println("My Middle Initial is " + middleInitial);
    }

    public void sayMyDateOfBirth(){
        System.out.println("My Date of Birth is " + dateOfBirth);
    }

    public void sayMyStudentNumber(){
        System.out.println("My Student Number is " + studentNumber);
    }

    public void sayMyStudentEmailAddress(){
        System.out.println("My Student Email Address is " + studentEmailAddress);
    }

    public void sayMyIAmAwesome(){
        System.out.println("I am awesome " + iAmAwesome);
    }

}
