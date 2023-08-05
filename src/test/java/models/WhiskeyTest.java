package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyTest {
    Whiskey testWhiskey = new Whiskey();
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "Original";

        // when (2)
        testWhiskey.setName(expected);

        // then (3)
        assertEquals(expected, testWhiskey.getName());
    }

    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Jameson";

        // when (2)
        testWhiskey.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }

    @Test
    public void setIdTest() {
        // given (1)
        Integer expected = 1;

        // when (2)
        testWhiskey.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    public void setLocationTest() {
        // given (1)
        String expected = "Ireland";

        // when (2)
        testWhiskey.setLocation(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getLocation());
    }

    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 750;

        // when (2)
        testWhiskey.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getSize());
    }

    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 20;

        // when (2)
        testWhiskey.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 27.99F;

        // when (2)
        testWhiskey.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Black";
        String expectedBrand = "Johnnie Walker";
        String expectedLocation = "Scotland";
        int expectedSize = 750;
        int expectedQty = 10;
        float expectedPrice = 47.99f;

        // (3)
        Whiskey testWhiskey = new Whiskey(expectedId, expectedName, expectedBrand,
                expectedLocation, expectedSize, expectedQty,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testWhiskey.getId());
        Assertions.assertEquals(expectedName, testWhiskey.getName());
        Assertions.assertEquals(expectedBrand, testWhiskey.getBrand());
        Assertions.assertEquals(expectedLocation, testWhiskey.getLocation());
        Assertions.assertEquals(expectedSize, testWhiskey.getSize());
        Assertions.assertEquals(expectedQty, testWhiskey.getQty());
        Assertions.assertEquals(expectedPrice, testWhiskey.getPrice());

    }

}