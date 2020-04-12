import java.util.ArrayList;

public class Zoo implements ZooSubject {
    private ArrayList<AnimalAddedListener> observerList;
    private Animal newAnimal;

    public Zoo() {
        observerList = new ArrayList<>();
    }
    @Override
    public void addObserver(AnimalAddedListener o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(AnimalAddedListener o) {
        observerList.remove(o);
    }

    public void addAnimal(Animal animal) {
        newAnimal = animal;
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            AnimalAddedListener element = observerList.get(i);
            element.update(newAnimal);
        }
    }
}
