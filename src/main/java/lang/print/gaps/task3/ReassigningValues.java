package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first =1,second=10,third=100;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        int linkToFirst = first =15;
        int linkToSecond = second =6;
        int linkToThird = third=4;
        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
