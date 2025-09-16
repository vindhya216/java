public class NestedIfExample {
    public static void main(String[] args) {
        int marks=85;
        if(marks>=50){
            System.out.println("you are passed the exam");
            if(marks>=90){
                System.out.println("Grade A+");
            } else if(marks>=75){
                System.out.println("Grade A");
            }
        else {
            System.out.println("Gade B");
        }
        
    }else{
        System.out.println("you are failed the exam");
    }
}
}