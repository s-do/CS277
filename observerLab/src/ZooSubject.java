import java.util.ArrayList;
public interface ZooSubject {
    /* allows an observer to register with the subject */
    public void addObserver( AnimalAddedListener o );

    /* removes an observer */
    public void removeObserver( AnimalAddedListener o );

    /* notifies all registered observers when its state changes */
    public void notifyObservers();
}
