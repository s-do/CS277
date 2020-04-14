public class MtoKAdapter extends KilometersAdaptee{

    //KilometersAdaptee kiloObj;
    //MilesClient mileObj;

    @Override
    public double distancek(double mph, double hours) {
        //convert mph to kph
        double kph = mph * 1.6;
        //calculate distance travel using kph method
        double resultDistanceK = super.distancek(kph, hours);
        return (resultDistanceK / 1.6);
    }

    public double distanceM(double mph, double hours) {
        //convert mph to kph
        double kph = mph * 1.6;
        //calculate distance travel using kph method
        double resultDistanceK = super.distancek(kph, hours);
        return (resultDistanceK / 1.6);
    }
}
