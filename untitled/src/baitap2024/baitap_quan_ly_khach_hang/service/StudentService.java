package baitap2024.baitap_quan_ly_khach_hang.service;

import baitap2024.baitap_quan_ly_khach_hang.model.Student;


public class StudentService implements IStudentService {
    public static Object delete;
    private static Student[] students = new Student[10] ;

static {
    students[0] = new Student(1,"vinh0");
    students[3] = new Student(4,"vinh3");
    students[2] = new Student(3,"vinh2");
    students[4] = new Student(5,"vinh4");
    students[1] = new Student(2,"vinh1");
}



    @Override
    public Student[] findAll() {
                return students;
    }
    @Override
    public void save(Student student) {
           for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public boolean up(int id, String name) {
    for (int i = 0; i < students.length; i++) {
        if (students[i].getId() == id) {
            if (students[i].getName().equals(name)) {
                students[i].setName(name);
            }
            return true;
        }
    }
        return false;
    }

    @Override
    public boolean delete(int id) {
    for (int i = 0; i < students.length; i++) {
        if (students[i].getId() == id && students[i] != null) {
            students[i] = null;
            return true;
        }
    }
        return false;
    }
}

