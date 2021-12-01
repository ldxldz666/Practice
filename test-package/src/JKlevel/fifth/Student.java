package JKlevel.fifth;

public class  Student <T> {
    private T height;

    public Student() {
    }

    public Student(T height) {
        this.height = height;
    }



    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }
}
