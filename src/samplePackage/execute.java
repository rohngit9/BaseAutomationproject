package samplePackage;

public class execute {
    public static void main(String[] args) {
        sampleJavaClass exe = new sampleJavaClass();

        int resultOfAdd = exe.addTwoNumbers(20,30);
        int resultOfSub = exe.subtractTwoNumbers(50,10);
        exe.divideTwoNumbers();
        exe.multiplyTwoNumbers(resultOfAdd,resultOfSub);
    }



}
