package interfaceLess;

public class Drum implements MusicTool {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан, с размером: " + getSize() + "мм");
    }

}
