package baitap2024.thuc_hanh.Framework.service;

public interface IDManager {
    void add(mod idManager);
    boolean remove(int id);
    boolean update(int id, String name, double price);
    void display();
    boolean search(String name);
void tangdan();
    void giamdan();
}
