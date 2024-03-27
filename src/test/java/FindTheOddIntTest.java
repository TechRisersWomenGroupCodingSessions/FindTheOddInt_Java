import org.example.FindTheOddInt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheOddIntTest {
    @Test void Returns7() {
        FindTheOddInt findtheoddint = new FindTheOddInt();
        int[] OddArray = {7};
        assertEquals(findtheoddint.findTheOddInt(OddArray), 7);
    }

    @Test void Returns0() {
        FindTheOddInt findtheoddint = new FindTheOddInt();
        int[] OddArray = {0};
        assertEquals(findtheoddint.findTheOddInt(OddArray), 0);
    }

    @Test void Returns2() {
        FindTheOddInt findtheoddint = new FindTheOddInt();
        int[] OddArray = {1,1,2};
        assertEquals(findtheoddint.findTheOddInt(OddArray), 2);
    }

    @Test void Returns0ForList() {
        FindTheOddInt findtheoddint = new FindTheOddInt();
        int[] OddArray = {0,1,0,1,0};
        assertEquals(findtheoddint.findTheOddInt(OddArray), 0);
    }

    @Test void Returns4ForList() {
        FindTheOddInt findtheoddint = new FindTheOddInt();
        int[] OddArray = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        assertEquals(findtheoddint.findTheOddInt(OddArray), 4);
    }


}
