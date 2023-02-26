import java.util.Arrays;

public class Company {
    private String adress;
    private String ownerName;
    private Java[] javas;
    private Android[] androids;
    private Go[] gos;

    public Company(String adress, String ownerName,
                   Java[] javas, Android[] androids, Go[] gos) {
        this.adress = adress;
        this.ownerName = ownerName;
        this.javas = javas;
        this.androids = androids;
        this.gos = gos;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Java[] getJavas() {
        return javas;
    }

    public void setJavas(Java[] javas) {
        this.javas = javas;
    }

    public Android[] getAndroids() {
        return androids;
    }

    public void setAndroids(Android[] androids) {
        this.androids = androids;
    }

    public Go[] getGos() {
        return gos;
    }

    public void setGos(Go[] gos) {
        this.gos = gos;
    }

    @Override
    public String toString() {
        return "Company{" +
                "adress='" + adress + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", javas=" + Arrays.toString(javas) +
                ", androids=" + Arrays.toString(androids) +
                ", gos=" + Arrays.toString(gos) +
                '}';
    }
}
