package CDIO1;

public class Dice {
    private final int Max = 6;//terning får 6 sider
    private int facevalue;

    public Dice(int value) {
        facevalue = value;
    }

    public Dice() {

    }

    //kast terning
    public int roll()
    {
        //vis en tilfældig værdi

        facevalue = (int)(Math.random()*Max)+1;
        //+1 for at terningen viser også viser 6

        return facevalue;
    }
    public void setFacevalue(int value) {
        facevalue = value;

    }
    //hent værdien
    public int getFacevalue(){
        return facevalue;
    }

    public String toString() {
        String result = "valus:" + facevalue;
        return result;
    }
}
