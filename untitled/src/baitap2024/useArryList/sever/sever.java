package baitap2024.useArryList.sever;

import java.util.ArrayList;

public class sever implements severID {
    public static final ArrayList<dk> studens = new ArrayList<>();
static {
studens.add(new dk(1, "vinh0"));
studens.add(new dk(2, "vinh1"));
studens.add(new dk(3, "vinh2"));
studens.add(new dk(4, "vinh3"));
studens.add(new dk(5, "vinh4"));
studens.add(new dk(6, "vinh5"));
}
    @Override
    public ArrayList<dk> getStudents() {
        return studens;
    }

    @Override
    public ArrayList<dk> addStudent(dk student) {
  studens.add(student);
            return studens;
        }

    @Override
    public ArrayList<dk> ud(int id, String name) {
    for (int i = 0; i < studens.size(); i++) {
        if (studens.get(i).getId() == id) {
            studens.get(i).setName(name);
            return studens;
        }
    }
    return null;
    }

    @Override
    public ArrayList<dk> del(int id) {
    for (int i = 0; i < studens.size(); i++) {
        if (studens.get(i).getId() == id) {
            studens.remove(i);
            return studens;
        }
    }
    return null;
    }
}
