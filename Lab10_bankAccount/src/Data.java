import java.util.ArrayList;

public class Data implements Measurable {
    /**
     Computes the average of the measures of the given objects.
     @param objects an array of Measurable objects
     @return the average of the measures
     */
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0) { return sum / objects.length; }
        else { return 0; }
    }

    @Override
    public double getMeasure() {
        return 0;
    }

    public static Measurable smallestAge(ArrayList<Measurable> personList){
        Measurable youngest = personList.get(0);
        for (int i = 0; i < personList.size(); i++) {
            if (youngest.getMeasure() > personList.get(i).getMeasure()) {
                youngest = personList.get(i);
            }
        }
        return youngest;
    }
}
