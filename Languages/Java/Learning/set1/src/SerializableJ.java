/*
Java initially had DataOutPutStream, which serializes data
but Java also provided ObjectOutPutStream, to specifically serialize objects.
 */

import java.io.*;
import java.lang.Exception;

public class SerializableJ {
    public static void main(String[] args) throws Exception {

        CovidStatus patient1 = new CovidStatus(12, true, "USA");

        //Serializing
        File f = new File("Covid_Data.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(patient1);

        //Deserialize
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        CovidStatus patient1Data = (CovidStatus) ois.readObject(); // need to cast
        System.out.println(patient1Data.isSymptomatic);
    }
}


class CovidStatus implements Serializable {
    int daysInfected;

    public CovidStatus(int daysInfected, boolean isSymptomatic, String country) {
        this.daysInfected = daysInfected;
        this.isSymptomatic = isSymptomatic;
        this.country = country;
    }

    boolean isSymptomatic;
    String country;

}