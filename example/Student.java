package org.example;

public class Student {
  private String name;
  private   boolean[] subjectsStudied = new boolean[10];

  public Student(String name,boolean[] subjectsStudied) {
    this.name = name;
    this.subjectsStudied = subjectsStudied;
  }

  public boolean[] getSubjectsStudied() {
    return subjectsStudied;
  }

  public String getName() {
    return name;
  }

  public void setSubjectsStudied(Subject subject, boolean flag) {
    for( Subject sub: Subject.values()){
      if(sub.name() ==subject.name() ){
        subjectsStudied[sub.ordinal()] = flag;
      }
    }
  }
  public boolean knows(Subject subject){
    int index = subject.ordinal();
    if(this.getSubjectsStudied()[index] == true){
      return true;
    }else {
      return false;
    }
  }
  public void whatIsResult(Subject subject){
    if(knows(subject)){
      System.out.println("The stident "+this.name+" passed subject "+subject.name());
    }else {
      System.out.println("The stident "+this.name+" failed subject "+subject.name());
    }
    System.out.println("*********");
  }
  public void whatIsResult(Subject[] subjects){
    for( Subject sub: subjects){
      whatIsResult(sub);
    }
  }
  public void whatIsResult(Student[] students, Subject[] subjects){
    for (Student stud : students){
      stud.whatIsResult(subjects);
    }
  }

}
