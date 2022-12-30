package id.ac.uinsgd.kelompok2.tugasgologin;

public class Catatan {
    private String key;

    private String nama;

    private String catatan;

    public Catatan(){
    }

    public Catatan(String nama, String catatan) {
        this.nama = nama;
        this.catatan = catatan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }
}
