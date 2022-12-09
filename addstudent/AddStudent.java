package com.masai.addstudent;

import java.util.*;

public class AddStudent {

    private static HashMap<String, Students> studentsHashMap = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter 1 for add student");
            System.out.println("Enter 2 for print student");
            System.out.println("Enter 3 for remove student");
            System.out.println("Enter 0 for exit program");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    printStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 0:
                    System.out.println("Thanks for using my software");
                    System.exit(0);
                    break;
                default:
                    System.out.println("print default");

            }
        }
    }

    private static void removeStudent() {
        System.out.println("Enter name of student to remove");
        Scanner nameOfStudentToRemoveScanner = new Scanner(System.in);
        String nameOfStudentToRemove = nameOfStudentToRemoveScanner.nextLine();

        if (studentsHashMap.containsKey(nameOfStudentToRemove)) {
            studentsHashMap.remove(nameOfStudentToRemove);
            System.out.println("Student details after remove");
            printStudent();
        } else {
            System.out.println("Student name is not present");
        }

    }

    private static void printStudent() {
        //System.out.println("");
        Set<String> keys = studentsHashMap.keySet();
        for (String key : keys) {
            Students s = studentsHashMap.get(key);
            System.out.println(" ===================== Student details =====================");
            System.out.println(" Name " + s.getName());
            System.out.println(" RollNo " + s.getRollNo());
            System.out.println(" MobileNo " + s.getMobileNo());
            System.out.println(" Subjects " + s.getSubject());
            System.out.println();
        }

    }

    private static void addStudent() {
        boolean moreStudentsRequired = false;
        do {
            System.out.println("enter name,rollNo,mobileNo");
            Scanner sc = new Scanner(System.in);
            String stuDetails = sc.nextLine();
            String[] in = stuDetails.split(" ");
            String name = in[0];
            int rollNo = Integer.parseInt(in[1]);
            String mobileNo = in[2];
            System.out.println("enter Subjects");
            Scanner ss = new Scanner(System.in);
            String subjects = ss.nextLine();
            String[] inputSubject = subjects.split(" ");

            Students s = new Students();
            s.setName(name);
            s.setRollNo(rollNo);
            s.setMobileNo(mobileNo);
            
            //convert String array to ArrayList
            ArrayList<String> subjectsList = new ArrayList<>(Arrays.asList(inputSubject));
            s.setSubject(subjectsList);
            studentsHashMap.put(name, s);

            System.out.println("Do you want to add more students, if yes press yes if no press no");
            Scanner moreStudentsScanner = new Scanner(System.in);
            String moreStudents = moreStudentsScanner.nextLine();
            if ("yes".equalsIgnoreCase(moreStudents)) {
                moreStudentsRequired = true;
            } else {
                moreStudentsRequired = false;
            }

        } while (moreStudentsRequired);
    }
}

