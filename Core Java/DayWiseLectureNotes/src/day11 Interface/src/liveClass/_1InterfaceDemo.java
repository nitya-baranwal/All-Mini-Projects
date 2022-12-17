package liveClass;


interface Shape{

}


interface MasaiStudentContract{
    //by default, all the interface variables are public static final
    double fee = 0;
}

class StudentOfMasai implements MasaiStudentContract{
    // a class can implement an interface


}
public class _1InterfaceDemo {
    public static void main(String[] args) {
        StudentOfMasai student = new StudentOfMasai();
        System.out.println(MasaiStudentContract.fee);
    }

}
