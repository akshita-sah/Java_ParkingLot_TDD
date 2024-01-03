import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ParkingLotTest {
    /* UC - 1, given car park it and return true  */
    @Test
    public void givenCar_ParkTheCar_ReturnTrue(){
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(true,parkingLot.parkCar("1"));
    }
    @Test
    /* UC - 2, unpark car */
    public void givenParkNumber_RemoveCar_ReturnTrue(){
        ParkingLot parkingLot = new ParkingLot();
        Assert.assertEquals(true,parkingLot.parkCar("123"));
        Assert.assertEquals(true,parkingLot.removeCar("123"));
    }
    
}
