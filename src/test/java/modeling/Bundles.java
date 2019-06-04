package modeling;

import utilities.EnvironmentVariables;

import java.util.ArrayList;

public class Bundles {
//    public static void add(Bundle bundle) {
//        ArrayList<Bundle> runTimeBundles = new ArrayList<>();
//        if (Serenity.sessionVariableCalled(EnvironmentVariables.BUNDLES) == null) {
//            runTimeBundles.add(bundle);
//        } else {
//            runTimeBundles = Serenity.sessionVariableCalled(EnvironmentVariables.BUNDLES);
//            runTimeBundles.add(bundle);
//        }
//        Serenity.setSessionVariable(EnvironmentVariables.BUNDLES).to(runTimeBundles);
//    }
//
//    public static Bundle getCurrent() {
//        Bundle bundle;
//        if (Serenity.sessionVariableCalled(EnvironmentVariables.BUNDLES) == null) {
//            throw new RuntimeException("Bundles list is empty!");
//        } else {
//            ArrayList listOfBundles = Serenity.sessionVariableCalled(EnvironmentVariables.BUNDLES);
//            bundle = (Bundle) listOfBundles.get(listOfBundles.size() - 1);
//        }
//        return bundle;
//    }
//
//    public static void save(Bundle bundle) {
//        ArrayList listOfBundles = Serenity.sessionVariableCalled(EnvironmentVariables.BUNDLES);
//        if (listOfBundles == null) {
//            throw new RuntimeException("Bundles list is empty!");
//        } else {
//            listOfBundles.set(listOfBundles.size() - 1, bundle);
//            Serenity.setSessionVariable(EnvironmentVariables.BUNDLES).to(listOfBundles);
//        }
//    }
}
