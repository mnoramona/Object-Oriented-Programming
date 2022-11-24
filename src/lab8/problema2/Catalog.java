package lab8.problema2;

import java.util.Comparator;
import java.util.TreeSet;

public class Catalog extends TreeSet<Catalog.Student> {
    private Catalog.Student s;

    public class Student implements Comparable{
        String name;
        Double media;
        int clazz;

        public Student(String name, double media, int clazz){
            this.clazz = clazz;
            this.media = media;
            this.name = name;
        }
        public String toString() {
            return "Studentul: " + name + "are media: " + media + " si e in clasa:" + clazz;
        }

    }
    Comparator comparator;
    public Catalog(Comparator comparator) {
        this.comparator = comparator;
    }

    public Catalog() {

    }
    public void addStudent(String name, double media, int clazz) {
        this.add(new Student(name, media, clazz));
    }

    public Student getStudent(String name) {
        for(Student s : this){
            if(s.name.equals(name)){

            }
        }
        return Student;
    }

    public void removeStudent(String name) {

    }

    public Catalog byClass(int clazz) {
        return null;
    }
}

