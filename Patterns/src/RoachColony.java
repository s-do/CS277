public class RoachColony {
    private String name;
    private double initPopulation;
    private double growthRate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitPopulation() {
        return initPopulation;
    }

    public void setInitPopulation(double initPopulation) {
        this.initPopulation = initPopulation;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    @Override
    public String toString() {
        return "Roach Colony Name:" + name + '\'' + ", Initial Population: "
                + initPopulation + ", Growth Rate: " + growthRate;
    }
}
