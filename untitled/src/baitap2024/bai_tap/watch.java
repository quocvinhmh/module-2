package baitap2024.bai_tap;
public class watch {
    int timestard;
    int timestop;

    public watch(int timestard, int timestop) {
        this.timestard = timestard;
        this.timestop = timestop;
    }

    public int getTimestard() {
        return timestard;
    }

    public void setTimestard(int timestard) {
        this.timestard = timestard;
    }

    public int getTimestop() {
        return timestop;
    }

    public void setTimestop(int timestop) {
        this.timestop = timestop;
    }
    public String toString() {
        System.out.println("thời gian bắt đầu: "+ getTimestard());
        for (int i = 0; i < getTimestop(); i++) {
            System.out.println(i+"s");
        }
        System.out.println("thời gian kết thúc: ");
        return "timestard: " + getTimestard() + ", timestop: " + getTimestop();
    }
}


