/*
 * Observer.java
 *
 * Name: Selina Do and Long Nguyen
 * Date: 04/21/2020
 * Purpose: Observers implement this interface so that
 *          their update() method is called by the subject
 *          when the state of the subject changes.
 * Input: None
 * Output: None
 */
public interface Observer {
    /**
     * This method is called when the state of the subject
     *      * changes.
     * @param newState - the new state of the subject
     */
    public void update(Object newState);
}
