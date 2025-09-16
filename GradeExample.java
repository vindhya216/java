public class GradeExample {
    public static void main(String[] args) {
        int marks=100;
        String grade=(marks>=90)?"A":
                     (marks>=80)?"B":
                     (marks>=70)?"C":
                     (marks>=60)?"D":"F";
                     System.out.println("grade="+grade);
    }
}