public class Studentmarks{

    static int totalMarks(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static void main(String[] args) {

        int total = totalMarks(80, 90, 85);

        System.out.println("Total Marks = " + total);
    }
}