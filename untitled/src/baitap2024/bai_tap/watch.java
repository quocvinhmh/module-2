package baitap2024.bai_tap;
import java.time.Duration;
import java.time.Instant;
public class watch {
    Instant start;
    Instant end;
    public watch() {
        this.start = Instant.now();
    }
    public Instant getStart() {
        return start;
    }
    public void setStart(Instant start) {
        this.start = start;
    }
    public Instant getEnd() {
        return end;
    }
    public void setEnd(Instant end) {
        this.end = end;
    }
}

