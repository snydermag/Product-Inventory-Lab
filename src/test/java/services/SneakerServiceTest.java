package services;

import models.Sneaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerServiceTest {
    @Test
    public void createTest(){

        // Given
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // When
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        int actualSize = testSneaker.getSize();
        int actualQty = testSneaker.getQty();
        float actualPrice = testSneaker.getPrice();

        // Then
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }

    @Test
    void findSneakerTest() {
        SneakerService sneakerService = new SneakerService();
        Sneaker expected = sneakerService.create("Stan Smith", "Adidas",
                "Tennis", 10, 10, 80.00f);

        Sneaker actual = sneakerService.findSneaker(expected.getId());

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void findSneakerTest2() {
        SneakerService s = new SneakerService();
        Sneaker sneaker1 = s.create("Stan Smith", "Adidas",
                "Tennis", 10, 10, 80.00f);
        Sneaker sneaker2 = s.create("Gao Go", "Nike",
                "Running", 7, 20, 90.00f);
        Sneaker sneaker3 = s.create("Dad Shoe", "New Balance",
                "Basketball", 9, 5, 100.00f);

        Sneaker actual = s.findSneaker(sneaker2.getId());

        Assertions.assertEquals(sneaker2, actual);

    }

    @Test
    void findAllTest() {

    }

    @Test
    void deleteTest() {
        SneakerService s = new SneakerService();
        Sneaker sneaker1 = s.create("Stan Smith", "Adidas",
                "Tennis", 10, 10, 80.00f);
        Sneaker sneaker2 = s.create("Gao Go", "Nike",
                "Running", 7, 20, 90.00f);
        Sneaker sneaker3 = s.create("Dad Shoe", "New Balance",
                "Basketball", 9, 5, 100.00f);

        int expected = 2;
        boolean test = s.delete(sneaker1.getId());

        int actual = s.getInventory().size();

        Assertions.assertEquals(true, test);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void deleteTest2() {
        SneakerService s = new SneakerService();
        Sneaker sneaker1 = s.create("Stan Smith", "Adidas",
                "Tennis", 10, 10, 80.00f);
        Sneaker sneaker2 = s.create("Gao Go", "Nike",
                "Running", 7, 20, 90.00f);

        int expected = 1;
        boolean test = s.delete(sneaker2.getId());

        int actual = s.getInventory().size();

        Assertions.assertEquals(true, test);
        Assertions.assertEquals(expected, actual);

    }
}