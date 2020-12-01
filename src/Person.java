public class Person {
    private String surname="";
    private String lastname="";
    private String patronymic="";

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getfio(){
        if (lastname.equals("") && patronymic.equals(""))
            return (surname);
        else
        return (lastname + surname + patronymic);
    }


}
