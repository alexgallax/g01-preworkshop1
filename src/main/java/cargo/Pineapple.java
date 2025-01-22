package cargo;

import java.time.LocalDateTime;

public class Pineapple {

    private LocalDateTime expirationDate;

    private int weight;

    public Pineapple(int weight) {
        this.weight = weight;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public int getWeight() {
        return weight;
    }
}
