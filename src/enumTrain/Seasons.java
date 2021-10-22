package enumTrain;

public enum Seasons {
    WINTER(-3), SPRING(10), SUMMER(28){
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(7);

    private double averageTemp;

    Seasons(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }
    public String getDescription(){
        return "Холодное время года";
    }
}
