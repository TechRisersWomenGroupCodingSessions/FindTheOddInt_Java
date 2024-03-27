import org.example.FindTheOddInt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheOddIntTest {
    @Test void Returns7() {
        FindTheOddInt findtheoddint = new FindTheOddInt();
        assertEquals(findtheoddint.findTheOddInt(7), 7);
    }
}
