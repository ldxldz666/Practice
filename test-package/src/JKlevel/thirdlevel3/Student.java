package JKlevel.thirdlevel3;

public class Student {
    int sNO;
    String sName;
    String sSex;
    int sAge;
    int sjava;

    public Student() {
    }

    public Student(int sNO, String sName, String sSex, int sAge, int sjava) {
        this.sNO = sNO;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sjava = sjava;
    }

    public int getsNO() {
        return sNO;
    }

    public void setsNO(int sNO) {
        this.sNO = sNO;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public int getSjava() {
        return sjava;
    }

    public void setSjava(int sjava) {
        this.sjava = sjava;
    }
}
