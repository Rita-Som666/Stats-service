import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
@Test
    public void shouldFindMinDayBetweenEnds (){
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expectedMonth = 9;
    long actualMonth = service.getMinMonth(sales);
    Assertions.assertEquals(expectedMonth, actualMonth);


}
}
