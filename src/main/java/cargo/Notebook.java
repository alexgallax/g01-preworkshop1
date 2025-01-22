package cargo;

public class Notebook {

    private int coresCount;

    private double cpuFreq;

    private int memory;

    private int weight;

    public Notebook(int weight) {
        this.weight = weight;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public double getCpuFreq() {
        return cpuFreq;
    }

    public int getMemory() {
        return memory;
    }

    public int getWeight() {
        return weight;
    }
}
