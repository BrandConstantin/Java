import java.util.Collections;
import java.util.List;

public class ResourceManager {
    public ResourceManager() {
    }

    public static void main(String[] args) {
        PrintSpooler spooler = new PrintSpooler();
        List<PrintSpooler> spoolers = Collections.singletonList(spooler);
        processResources(spoolers);

        PrintSpooler spooler2 = new PrintSpooler();
        spoolers.add(spooler2);
    }

    /**
     * A method that takes a list of printers as a parameter
     */
    public static <Type> void processResources(List<Type> list) {
        for (Type p : list) {
            //Code to process resources
        }
    }
}
