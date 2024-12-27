package baitap2024.baitap_quan_ly_khach_hang.service;

import baitap2024.baitap_quan_ly_khach_hang.model.Student;


public interface IStudentService {
    Student[] findAll();
    void save(Student student);
    boolean up(int id,String name);
boolean delete(int id);
}
