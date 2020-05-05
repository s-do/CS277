public class RoachColony {
    private String name;
    private double initPopulation;
    private double growthRate;
    private Room room;

    public RoachColony(){
        name = "Snow";
        initPopulation = 100;
        growthRate = 0.5;
    }

    public RoachColony(String roachName, double population, double rate){
        name = roachName;
        initPopulation = population;
        growthRate = rate;
    }
}
