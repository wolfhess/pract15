import java.util.Arrays;
import java.util.StringTokenizer;

public class Shirt {
    private String[] shirts = {"S001,Black Polo Shirt,Black,XL",
            "S002,BlackPolo Shirt,Black,L",
            "S003,Blue Polo Shirt,Blue,XL",
            "S004,Blue Polo Shirt,Blue,M",
            "S005,Tan Polo Shirt,Tan,XL",
            "S006,Black T-Shirt,Black,XL",
            "S007,White T-Shirt,White,XL",
            "S008,White T-Shirt,White,L",
            "S009,Green T-Shirt,Green,S",
            "S010,Orange T-Shirt,Orange,S",
            "S011,Maroon Polo Shirt,Maroon,S" };
    private Shirt[] array = new Shirt[11];
    private String number;
    private String model;
    private String color;
    private String size;

    public Shirt(String number, String model, String color, String size){
        this.number = number;
        this.model = model;
        this.color = color;
        this.size = size;
    }

    public Shirt(){}



    public void toarr(){
        for (int i =0; i<shirts.length; i++){
        StringTokenizer stringTokenizer = new StringTokenizer(shirts[i], ",");
        array[i] = new Shirt(stringTokenizer.nextToken(), stringTokenizer.nextToken(), stringTokenizer.nextToken(), stringTokenizer.nextToken());
    }}

    @Override
    public String toString(){
           String[] arr = new String[11];
        for ( int i =0; i<array.length; i++) {
            arr[i] = "Number : "+array[i].number +" Model : "+array[i].model+" Color : "+array[i].color+" Size : "+ array[i].size+"\n";
        }
        return Arrays.toString(arr);
    }




}