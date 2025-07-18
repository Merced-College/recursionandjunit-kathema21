package com.kath.recursion;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Junit {

    // count 8 //

    @Test //1
    public void testCount_one8() {
        assertEquals(1, Recursive.count8(8));
    }

    @Test //2
    public void testCount8_no8() {
        assertEquals(0, Recursive.count8(1234567));
    }

    @Test //3
    public void testCount8_separated8() {
        assertEquals(3, Recursive.count8(81818));
    }

    @Test //4
    public void testCount8_adjacent8() {
        assertEquals(4, Recursive.count8(8818111));
    }

    @Test //5
    public void testCount8_zero() {
        assertEquals(0, Recursive.count8(0));
    }

    @Test //6
    public void testCount8_manyNo8() {
        assertEquals(0, Recursive.count8(293944142));
    }

    @Test //7
    public void testCount8_many8() {
        assertEquals(15, Recursive.count8(88888888));
    }

    @Test //8
    public void testCount8_doubleNSingle() {
        assertEquals(5, Recursive.count8(58808081));
    }

    @Test //9
    public void testCount8_manyZeroes() {
        assertEquals(0, Recursive.count8(0000000000));
    }

    @Test //10
    public void testCount8_atEnd() {
        assertEquals(3, Recursive.count8(134223288));
    }

    // countHi //

    @Test //1
    public void testCountHi_oneHi() {
        assertEquals(1, Recursive.countHi("hi"));
    }

    @Test //2
    public void testCountHi_noHi() {
        assertEquals(0, Recursive.countHi("hello"));
    }

    @Test //3
    public void testCountHi_multipleHi() {
        assertEquals(3, Recursive.countHi("hihihi"));
    }

    @Test //4
    public void testCountHi_twoHi() {
        assertEquals(2, Recursive.countHi("hihi")); // 'hi' at [0–1] and [2–3]
    }

    @Test //5
    public void testCountHi_spacedHi() {
        assertEquals(2, Recursive.countHi("hi------hi"));
    }

    @Test //6
    public void testCountHi_end() {
        assertEquals(1, Recursive.countHi("abcdehi"));
    }

    @Test //7
    public void testCountHi_start() {
        assertEquals(1, Recursive.countHi("hibyelol"));
    }

    @Test //8
    public void testCountHi_empty() {
        assertEquals(0, Recursive.countHi(""));
    }

    @Test //9
    public void testCountHi_Char() {
        assertEquals(0, Recursive.countHi("h"));
    }

    @Test //10
    public void testCountHi_hiRand() {
        assertEquals(4, Recursive.countHi("hi&21;'hi--hi**hi"));
    }

    // countHi2 //

    @Test //1
    public void testCountHi2_one() {
        assertEquals(1, Recursive.countHi2("hi"));
    }

    @Test //2
    public void testCountHi2_skip() {
        assertEquals(0, Recursive.countHi2("xhi"));
    }

    @Test //3
    public void testCountHi2_mixed() {
        assertEquals(1, Recursive.countHi2("xhixhihi"));
    }

    @Test //4
    public void testCountHi2_none() {
        assertEquals(0, Recursive.countHi2("howdy"));
    }

    @Test //5
    public void testCountHi2_xhiAtEnd() {
        assertEquals(1, Recursive.countHi2("hixhi"));  // skips "xhi", counts the first
    }

    @Test //6
    public void testCountHi2_xhiAtStart() {
        assertEquals(1, Recursive.countHi2("xhiblahhi"));
    }

    @Test //7
    public void testCountHi2_manyHi() {
        assertEquals(3, Recursive.countHi2("hihihi"));
    }

    @Test //8
    public void testCountHi2_allXhi() {
        assertEquals(0, Recursive.countHi2("xhixhixhi"));
    }

    @Test //9
    public void testCountHi2_char() {
        assertEquals(0, Recursive.countHi2("x"));
    }

    @Test //10
    public void testCountHi2_empty() {
        assertEquals(0, Recursive.countHi2(""));
    }

    // strCount //

    @Test //1
    public void testStrCount_basic() {
        assertEquals(2, Recursive.strCount("catcowcat", "cat"));
    }

    @Test //2
    public void testStrCount_middle() {
        assertEquals(1, Recursive.strCount("catcowcat", "cow"));
    }

    @Test //3
    public void testStrCount_none() {
        assertEquals(0, Recursive.strCount("catcowcat", "dog"));
    }

    @Test //4
    public void testStrCount_adjacent() {
        assertEquals(2, Recursive.strCount("catcat", "cat"));
    }

    @Test //5
    public void testStrCount_nested() {
        assertEquals(1, Recursive.strCount("aaaaa", "aaa"));
    }

    @Test //6
    public void testStrCount_full() {
        assertEquals(1, Recursive.strCount("hello", "hello"));
    }

    @Test //7
    public void testStrCount_start() {
        assertEquals(0, Recursive.strCount("he", "hello"));
    }

    @Test //8
    public void testStrCount_emptySub() {
        assertEquals(0, Recursive.strCount("hello", ""));
    }

    @Test //9
    public void testStrCount_emptyStr() {
        assertEquals(0, Recursive.strCount("", "hi"));
    }

    @Test //10
    public void testStrCount_repeatLetters() {
        assertEquals(3, Recursive.strCount("aaaaaaa", "aa"));
    }

}