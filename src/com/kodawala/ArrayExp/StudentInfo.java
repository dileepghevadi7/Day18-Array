package com.kodawala.ArrayExp;

class Studentinfo {

    public void StudentDetail() {

        String Students[] = new String[5];

        Students[0] = "Dileep";
        Students[1] = "Karan";
        Students[2] = "Tanaji";
        Students[3] = "Manju";
        Students[4] = "Shrinivas";

        // Accessing a specific element
        String element = Students[3];
        System.out.println("Student at index 3: " + element);

        System.out.println("\nAll Students:");

        // Loop to print all students
        for (int index = 0; index < Students.length; index++) {
            String currentStudent = Students[index];
            System.out.println(currentStudent);
        }
    }
}

 class Student {

    public static void main(String[] args) {

        Studentinfo st = new Studentinfo();
        st.StudentDetail();
    }
}