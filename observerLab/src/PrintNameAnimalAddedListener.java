public class PrintNameAnimalAddedListener implements AnimalAddedListener{
    private String name;

    public PrintNameAnimalAddedListener() {
        name = "John Doe";
    }

    public PrintNameAnimalAddedListener(String Name) {
        name = Name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Object newState) {
            Animal newAnimal = (Animal) newState;
            display(newAnimal);
    }

    public void display(Animal newAnimal) {
        System.out.println(name + " was notified that a " + newAnimal.getName() + "was added.");
    }
}
