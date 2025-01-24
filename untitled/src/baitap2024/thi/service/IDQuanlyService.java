package baitap2024.thi.service;

import baitap2024.thi.mod.QuanLy;

import java.io.IOException;
import java.util.List;

public interface IDQuanlyService {
    List<QuanLy> show();
    boolean delete();
    boolean add();
    boolean update() throws IOException;
void tim();
void readfile() throws IOException;
void savefile() throws IOException;
}
