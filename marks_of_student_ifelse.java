import java.util.*;
public class marks_of_student_ifelse {
    public static void main(String[] args) {
       Scanner biru = new Scanner(System.in);
       int marks = biru.nextInt();
       if(marks > 90){
        System.out.println("marks is excellent");
    }else if(marks > 80 ){
        System.out.println("marks is good");
    }else if(marks > 70 ){
        System.out.println("marks is fair");
    }else if (marks > 60){
        System.out.println("marks is expectations");
    } else if (marks < 60){
        System.out.println("marks is poor");
    }
    biru.close();
        }
    }

