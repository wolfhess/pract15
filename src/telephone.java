public class telephone {
    private String number;
    private String code;
    private String operator;
    private String three;
    private String four;
    public void setNumber(String number) {
        this.number = number;
    }
    public void decode(){
        StringBuffer stringBuffer = new StringBuffer(number);
        if (stringBuffer.substring(0,1).equals("8")){
            code = "+7";
            operator = stringBuffer.substring(1,4);
            three = stringBuffer.substring(4,7);
            four = stringBuffer.substring(7,11);
        }
        else {
            code = stringBuffer.substring(0,2);
        operator = stringBuffer.substring(2,5);
        three = stringBuffer.substring(5,8);
        four = stringBuffer.substring(8,12);
    }}
        @Override
        public String toString(){
        return (code+operator+"-"+three+"-"+four);
        }


}
