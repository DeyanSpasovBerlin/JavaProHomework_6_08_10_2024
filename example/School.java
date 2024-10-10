package org.example;

public class School {
    public static void main(String[] args) {
        Subject subject1 = Subject.QUONTUM_FIELD_THEORY;
        Subject subject2 = Subject.VARIATIONAL_CALCULATION;
        Student stud1 =new Student("Tom", new  boolean[]{false, false, false, false, false, false, false, false, false,
                false});
        Student stud2 =new Student("John", new  boolean[]{false, false, false, false, false, false, false, false, false,
                false});
        Student stud3 =new Student("Ben", new  boolean[]{false, false, false, false, false, false, false, false, false,
                false});
        Student stud4 =new Student("Jorg", new  boolean[]{false, false, false, false, false, false, false, false, false,
                false});
        Student[] klas ={stud1,stud2,stud3,stud4};
        int[] QUONTUM_FIELD_THEORY_PRESENT = {90,140,160,80};
        int[] VARIATIONAL_CALCULATION_PRESENT = {60,20,50,30};
        Subject[] sub = {subject1,subject2};
        Teacher teach1 = new Teacher("Feyman",subject1);
        Teacher teach2 = new Teacher("Hilbert",subject2);

//        teach1.teach(stud1,90);// 1 учитель учит 1 студент
//        stud1.knows(subject1);//добавляем результат для студента 1 в Array subject1
//        stud1.whatIsResult(subject1);// печатаем результат для 1 студента subject1
//
//        teach2.teach(stud1,60);//2 учитель учит 1 студент
//        stud1.knows(subject2);//добавляем результат для студента 1 в Array subject2
//        stud1.whatIsResult(subject2);//пдобавляем результат для студента 1 в Array subject2
//        stud1.whatIsResult(sub);//печатаем результат для 1 студента subject1+subject2

        teach1.teach(klas,QUONTUM_FIELD_THEORY_PRESENT);//учитель 1 учит 4 студента по 1 предмет
        teach2.teach(klas,VARIATIONAL_CALCULATION_PRESENT);//учитель 2 учит 4 студента по 1 предмет
         stud1.whatIsResult(klas,sub);//печатаем результат для 4 студента по 2 предмета




    }
}