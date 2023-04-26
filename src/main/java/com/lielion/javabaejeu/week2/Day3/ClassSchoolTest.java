package com.lielion.javabaejeu.week2.Day3;

public class ClassSchoolTest {
    public static void main(String[] args) {
            ClassInSchool classInSchool = new ClassInSchool();
            classInSchool.no = 1;
            String teachername = classInSchool.teacherName = "김경록";
            System.out.println(classInSchool.no);
            System.out.println(teachername);

            classInSchool.students = new Student[2];
            classInSchool.students[0] = new Student();
            classInSchool.students[0].name = "귀염이3";
            System.out.println(classInSchool.students[0].name);

            Student[] students1 = new Student[2];
            students1[0] = new Student();
            students1[1] = new Student();
            String studntsname = students1[0].name = "귀염이";
            String studntsname2 = students1[1].name = "귀염이2";
            int studentsage = students1[0].age = 3;
            System.out.println(studntsname);
            System.out.println(studntsname2);
            System.out.println(studentsage);



    }
}
