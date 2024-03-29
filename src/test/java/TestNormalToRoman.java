import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestNormalToRoman {
    @Test
    public void test_WhenInputIs_1_ShouldBeReturn_I() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "I";
        String actual = normalToRoman.convert(1);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_2_ShouldBeReturn_II() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "II";
        String actual = normalToRoman.convert(2);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_3_ShouldBeReturn_III() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "III";
        String actual = normalToRoman.convert(3);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_4_ShouldBeReturn_IV() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "IV";
        String actual = normalToRoman.convert(4);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_5_ShouldBeReturn_V() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "V";
        String actual = normalToRoman.convert(5);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_6_ShouldBeReturn_VI() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "VI";
        String actual = normalToRoman.convert(6);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_9_ShouldBeReturn_IX() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "IX";
        String actual = normalToRoman.convert(9);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_10_ShouldBeReturn_X() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "X";
        String actual = normalToRoman.convert(10);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_21_ShouldBeReturn_XXI() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "XXI";
        String actual = normalToRoman.convert(21);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_40_ShouldBeReturn_XL() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "XL";
        String actual = normalToRoman.convert(40);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_50_ShouldBeReturn_L() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "L";
        String actual = normalToRoman.convert(50);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_90_ShouldBeReturn_XC() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "XC";
        String actual = normalToRoman.convert(90);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_100_ShouldBeReturn_C() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "C";
        String actual = normalToRoman.convert(100);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_400_ShouldBeReturn_CD() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "CD";
        String actual = normalToRoman.convert(400);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_500_ShouldBeReturn_D() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "D";
        String actual = normalToRoman.convert(500);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_900_ShouldBeReturn_CM() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "CM";
        String actual = normalToRoman.convert(900);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_999_ShouldBeReturn_CMXCIX() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "CMXCIX";
        String actual = normalToRoman.convert(999);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_1000_ShouldBeReturn_M() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "M";
        String actual = normalToRoman.convert(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void test_WhenInputIs_2999_ShouldBeReturn_MMCMXCIX() {
        NormalToRoman normalToRoman = new NormalToRoman();

        String expected = "MMCMXCIX";
        String actual = normalToRoman.convert(2999);

        assertEquals(expected, actual);
    }
}

