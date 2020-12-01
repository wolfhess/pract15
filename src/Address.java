import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String home;
    private String house_building;
    private String flat;
    private String input;

// ввод строки
    public void setInput(String input) {
        this.input = input;
    }
  //Первый метод через split
    public void meth1(){
        String[] stiput = input.split(",");
        country = stiput[0];
        region = stiput[1];
        city = stiput[2];
        street = stiput[3];
        home = stiput[4];
        house_building = stiput[5];
        flat = stiput[6];

    }
    // Второй метод через StringTokenizer
public void meth2(){
 StringTokenizer stringTokenizer = new StringTokenizer(input, ",.;=");
    country = stringTokenizer.nextToken();
    region = stringTokenizer.nextToken();
    city = stringTokenizer.nextToken();
    street = stringTokenizer.nextToken();
    home = stringTokenizer.nextToken();
    house_building = stringTokenizer.nextToken();
    flat = stringTokenizer.nextToken();
      }




// Метод вывода полей
    public void out(){
        System.out.println(country);
        System.out.println(region);
        System.out.println(city);
        System.out.println(street);
        System.out.println(home);
        System.out.println(house_building);
        System.out.println(flat);
    }




}
