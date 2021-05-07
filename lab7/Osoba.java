package lab7;

public class Osoba {
    private String name;
    private String surname;

    public Osoba(String name, String surname){
        this.name=name;
        this.surname=surname;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getSurname() {
        return surname;
    }
}
