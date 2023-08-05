package services;

import models.Sneaker;
import models.Whiskey;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyServiceTest {

    @Test
    public void createTest(){

        // Given
        int expectedId = 6;
        String expectedName = "Black";
        String expectedBrand = "Johnnie Walker";
        String expectedLocation = "Scotland";
        int expectedSize = 750;
        int expectedQty = 10;
        float expectedPrice = 47.99f;

        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey testWhiskey = whiskeyService.create(expectedName, expectedBrand,
                expectedLocation, expectedSize, expectedQty, expectedPrice);

        // When
        int actualId = testWhiskey.getId();
        String actualName = testWhiskey.getName();
        String actualBrand = testWhiskey.getBrand();
        String actualSport = testWhiskey.getLocation();
        int actualSize = testWhiskey.getSize();
        int actualQty = testWhiskey.getQty();
        float actualPrice = testWhiskey.getPrice();

        // Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedLocation, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    void findSneakerTest() {
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey expected = whiskeyService.create("Blue", "Johnnie Walker",
                "Scotland", 750, 10, 47.99f);

        Whiskey actual = whiskeyService.findWhiskey(expected.getId());

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findSneakerTest2() {
        WhiskeyService w = new WhiskeyService();
        Whiskey whiskey1 = w.create("Blue", "Johnnie Walker",
                "Scotland", 750, 10, 47.99f);
        Whiskey whiskey2 = w.create("Original", "Jameson",
                "Ireland", 1000, 20, 32.99f);
        Whiskey whiskey3 = w.create("Straight", "Jim Beam",
                "Kentucky", 1500, 5, 38.99f);

        Whiskey actual = w.findWhiskey(whiskey2.getId());

        Assertions.assertEquals(whiskey2, actual);

    }

    @Test
    void findAllTest() {

    }

    @Test
    void deleteTest() {
        WhiskeyService w = new WhiskeyService();
        Whiskey whiskey1 = w.create("Blue", "Johnnie Walker",
                "Scotland", 750, 10, 47.99f);
        Whiskey whiskey2 = w.create("Original", "Jameson",
                "Ireland", 1000, 20, 32.99f);
        Whiskey whiskey3 = w.create("Straight", "Jim Beam",
                "Kentucky", 1500, 5, 38.99f);

        int expected = 2;
        boolean test = w.delete(whiskey1.getId());

        int actual = w.getInventory().size();

        Assertions.assertEquals(true, test);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void deleteTest2() {
        WhiskeyService w = new WhiskeyService();
        Whiskey whiskey1 = w.create("Blue", "Johnnie Walker",
                "Scotland", 750, 10, 47.99f);
        Whiskey whiskey2 = w.create("Original", "Jameson",
                "Ireland", 1000, 20, 32.99f);


        int expected = 1;
        boolean test = w.delete(whiskey2.getId());

        int actual = w.getInventory().size();

        Assertions.assertEquals(true, test);
        Assertions.assertEquals(expected, actual);

    }

}