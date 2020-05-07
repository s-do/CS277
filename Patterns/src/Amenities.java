/** This is an abstract class to implement the decorator patterns
 * all amenities will extends this class**/

public abstract class Amenities extends Room {
    /**
     * Gets the description of the amenities
     * @return description of the ice cream
     */
    public abstract String getDescription();

    //Fixme: idk if this is right cuz its not rlly just amenities
    // i got it from the generator thing
    /**
     * String representation of amenities
     * @return string description of amenities
     */
    @Override
    public String toString() {
        return "Description of Amenities: " + description;
    }
}
