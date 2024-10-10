package org.example;

public class Teacher {
    private String name;
    Subject subject;

    public Teacher(String name,Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void    teach(Student student, int present) {
        double v = this.subject.getHorarium() * 0.8;
        if (present >= (int) v * 0.8) {
            student.setSubjectsStudied(this.subject, true);
        } else {
            student.setSubjectsStudied(this.subject, false);
        }
    }

    public void teach(Student[] students,int[] presents){
        for (int i = 0; i < students.length ; i++) {
            teach(students[i],presents[i]);
        }
    }
}


