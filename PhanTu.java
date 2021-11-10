
import java.io.DataInputStream;
import java.io.FileInputStream;
public class PhanTu<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T isGreaterThan(T a) {

        if (t.compareTo(a) < 0) {
            return a;
        } else return t;
    }

    FileInputStream inputStream = new FileInputStream(new_file);
    DataInputStream dataInputStream = new DataInputStream(inputStream);

    while (DataInputStream) {
        dataInputStream.readInt();
    }
}
