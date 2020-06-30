public class CountObjectCreation {

    public static void main(String[] args) {
        Plants willow = new Plants();
        Plants hickory = new Plants();
        Plants palm = new Plants();

        System.out.println(Plants.c_objects());
        System.out.println(willow.objIndex());
        System.out.println(hickory.objIndex());
        System.out.println(palm.objIndex());

    }
}


class Plants {
    static int objectCounter=0;
    int objectIndex = 0;

    public Plants(){
        objectCounter++;
        objectIndex = objectCounter;
    }
    public static int c_objects(){
        return objectCounter;
    }
    public int objIndex(){
        return objectIndex;
    }
}
