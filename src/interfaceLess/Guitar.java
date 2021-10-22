package interfaceLess;

public class Guitar implements MusicTool{
    private int quantityOfStrings;

    public Guitar(int quantityOfStrings) {
        this.quantityOfStrings = quantityOfStrings;
    }

    public int getQuantityOfStrings() {
        return quantityOfStrings;
    }

    public void setQuantityOfStrings(int quantityOfStrings) {
        this.quantityOfStrings = quantityOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, с количеством струн: " + getQuantityOfStrings());
    }
}
