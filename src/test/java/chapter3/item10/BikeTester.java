package chapter3.item10;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BikeTester {

    @Test
    public void testBikeEquality() {
        Bike bikeOne = new Bike("giant", "trance", 27);
        Bike bikeTwo = new Bike("Giant", "Trance", 18);
        Bike bikeThree = new Bike("giant", "anthem", 27);

        assertTrue(bikeOne.equals(bikeTwo));
        assertTrue(bikeTwo.equals(bikeOne));
        assertTrue(bikeOne.hashCode() == bikeTwo.hashCode());

        assertFalse(bikeOne.equals(bikeThree));
        assertFalse(bikeOne.hashCode() == bikeThree.hashCode());

        Set<Bike> bikes = new HashSet<>();
        bikes.add(bikeOne);
        assertFalse(bikes.add(bikeTwo));
        assertTrue(bikes.add(bikeThree));
    }

}
