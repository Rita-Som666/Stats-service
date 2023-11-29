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
@Test
    public void shouldCalculateTotalAmount () {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expectedAmount = 180;
    long actualAmount = service.calculateTotalAmount(sales);
    Assertions.assertEquals(expectedAmount, actualAmount);
}
@Test
    public void shouldCalculateAverageAmount () {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    long expectedAmount = 15;
    double actualAmount = service.calculateAverageAmount(sales);
    Assertions.assertEquals(expectedAmount, actualAmount);
}
@Test
    public void shouldFindMaxMonth() {
    StatsService service = new StatsService();
    int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int [] maxMonth = service.getMaxMonth(sales);
    int [] expectedMonths = {6, 8};
    int [] actualMonths = service.getMaxMonth(sales);
    boolean resultEquals = compareArrays(expectedMonths, actualMonths);

}
}
