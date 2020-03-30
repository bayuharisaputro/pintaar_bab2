package id.pintaar.bab3;

public class CarModel {
    String warna, merk, type, bahanBakar;

    public CarModel() {
    }

    public CarModel(String warna, String merk, String type, String bahanBakar) {
        this.warna = warna;
        this.merk = merk;
        this.type = type;
        this.bahanBakar = bahanBakar;
    }


    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
}
