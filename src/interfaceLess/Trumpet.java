package interfaceLess;

public class Trumpet implements MusicTool{
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба, с диаметром: " + getDiameter() + "мм");
    }
}
