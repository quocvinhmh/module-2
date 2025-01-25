package baitap2024.thi.service;

import java.io.IOException;

public interface ContactService {
    void show();
    boolean delete() throws IOException;
    boolean add() throws IOException;
    boolean update() throws IOException;
void tim();
void readfile() throws IOException;
void savefile() throws IOException;
}
