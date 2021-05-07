package lab7;

public class Telefon {
    private String model;
    private String marka;
    private String rokProdukcji;

    public Telefon(String model, String marka, String rokProdukcji){
        this.model = model;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }
    public java.lang.String getModel() {
        return model;
    }

    public java.lang.String getMarka() {
        return marka;
    }

    public java.lang.String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public void setMarka(java.lang.String marka) {
        this.marka = marka;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
}
