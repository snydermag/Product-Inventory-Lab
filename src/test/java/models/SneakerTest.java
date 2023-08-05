package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerTest {

    Sneaker testSneaker = new Sneaker();
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Adidas";

        // when (2)
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }

    @Test
    public void setIdTest() {
        // given (1)
        Integer expected = 1;

        // when (2)
        testSneaker.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Tennis";

        // when (2)
        testSneaker.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 10;

        // when (2)
        testSneaker.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 20;

        // when (2)
        testSneaker.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 84.99F;

        // when (2)
        testSneaker.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedSize, testSneaker.getSize());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());

    }

}