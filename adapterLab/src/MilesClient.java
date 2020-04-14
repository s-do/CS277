public class MilesClient {

    public double distance(double mph,double hours){
        //create a new MtoKAdapter instance
        //call its distance method
        // distance = speed * time
        MtoKAdapter adapter = new MtoKAdapter();
        return adapter.distanceM(mph, hours);
    }
}
