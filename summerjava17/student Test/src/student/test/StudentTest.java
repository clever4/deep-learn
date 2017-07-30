
package student.test;

public class StudentTest {
    public StudentTest(){
        

}
    public boolean teststudentconstroctor(){
    Student Ali=new Student("Ali",80,false);
    if (Ali.tostring == "Ali80male")
        return true;
    return false;
    // OR return (Ali.tostring()=="Ali80male")
    }
    
}
