package Assignment_Lab;

import java.io.FileNotFoundException;

public interface Salary {
    void allData() throws FileNotFoundException;
    void lowest() throws FileNotFoundException;
    void highest() throws FileNotFoundException;
    void average(int n) throws FileNotFoundException;

}
