package baitap2024.thi.service;

import java.io.IOException;

public interface IDQuanlyservice {
    void showxe();
    boolean delete();
    boolean add();
    boolean update() throws IOException;
void tim();
void readfile() throws IOException;
void savefile() throws IOException;
}
