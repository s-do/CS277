/*
 * Subject.java
 *
 * Name: Selina Do and Long Nguyen
 * Date: 04/21/2020
 * Purpose: Objects implementing this interface allow observers
 *          to register with it. When this object changes state,
 *          it notifies all registered observers.
 * Input: None
 * Output: None
 */

/** Parameter for methods are change to type trader instead of Observer */
public interface Subject {

    /** allows an observer to register with the subject
     * @param o the observer object to be added
     */
    public void addObserver( Observer o );

    /** removes an observer
     * @param o the observer to be removed
     */
    public void removeObserver( Observer o);

    /** notifies all registered observers when its state change */
    public void notifyObservers();
}
