package baitap2024.bai_tap;

public class Fan {
    int slow = 1;
    int fast = 2;
    boolean on = false;

    public Fan() {
    }
    public Fan(int slow, int fast) {
        this.slow = slow;
        this.fast = fast;
    }
    public int getSlow() {
        return slow;
    }
    public void setSlow(int slow) {
        this.slow = slow;
    }
    public int getFast() {
        return fast;
    }
    public void setFast(int fast) {
        this.fast = fast;
    }
    public boolean isOn() {
        return on;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public String toString() {
        if(this.isOn()){
            return "Fan{" + "slow=" + slow + ", fast=" + fast + '}';
        }else{
            return "Fan{" + "slow=" + slow + ", fast=" + fast + '}';
        }
    }
}
