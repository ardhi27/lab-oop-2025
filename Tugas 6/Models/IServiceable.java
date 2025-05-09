package Models;
import java.util.Date;

public interface IServiceable {
    public void checkCondition(boolean condition);
    public void doService();
    public Date getNextService();
    public void calculateServicePrice(double servicePrice);
}
