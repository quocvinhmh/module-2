package baitap2024.thuc_hanh.Framework.service;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager implements IDManager {
private List<mod> idManagers = new ArrayList<>();
    @Override
    public void add(mod idManager) {
        idManagers.add(idManager);
    }

    @Override
    public boolean remove(int id) {
        for (mod idManager : idManagers) {
            if (idManager.getId() == id ) {
                idManagers.remove(idManager);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean update(int id, String name, double price) {
        for (mod idManager : idManagers) {
            if(idManager.getId() == id) {
                idManager.setName(name);
                idManager.setPrice(price);
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
for (mod idManager : idManagers) {
    System.out.println(idManager);
}
    }

    @Override
    public boolean search(String name) {
        for (mod idManager : idManagers) {
            if(idManager.getName().equals(name)) {
                System.out.println(idManager);
                return true;
            }
        }
        return false;
    }

    @Override
    public void tangdan() {
       idManagers.sort(Comparator.comparingDouble(mod::getPrice));
    }

    @Override
    public void giamdan() {
idManagers.sort(Comparator.comparingDouble(mod::getPrice).reversed());
    }
}
