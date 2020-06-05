package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.After;
import org.junit.Before;
/**
* Tests for {@link Main}.
*/
@RunWith(JUnit4.class)
public class CheckTriangleTest {
    CheckTriangle triangle;

    @Before
    public void setUp() {
        System.out.println("@Before - Set up");
        triangle = new CheckTriangle();
    }

    @After
    public void tearDown() {
        System.out.println("@After - Tear down");
        triangle = null;
    }

    @Test(timeout = 50)
    public void acute() {
        assertEquals("銳角三角形", triangle.getTriangleType(7, 21, 22));
        assertEquals("銳角三角形", triangle.getTriangleType(22, 7, 21));
        assertEquals("銳角三角形", triangle.getTriangleType(21, 22, 7));
    }

    @Test(timeout = 50)
    public void obtuse() {
        assertEquals("鈍角三角形", triangle.getTriangleType(2, 3, 4));
        assertEquals("鈍角三角形", triangle.getTriangleType(3, 4, 2));
        assertEquals("鈍角三角形", triangle.getTriangleType(4, 2, 3));
    }

    @Test(timeout = 50)
    public void regular() {
        assertEquals("正三角形", triangle.getTriangleType(11, 11, 11));
        assertEquals("正三角形", triangle.getTriangleType(1, 1, 1));
        assertEquals("正三角形", triangle.getTriangleType(6, 6, 6));
    }

    @Test(timeout = 50)
    public void isosceles() {
        assertEquals("等腰三角形", triangle.getTriangleType(9, 9, 12));
        assertEquals("等腰三角形", triangle.getTriangleType(9, 12, 9));
        assertEquals("等腰三角形", triangle.getTriangleType(12, 9, 9));
        assertEquals("等腰三角形", triangle.getTriangleType(7, 7, 12));
    }

    @Test(timeout = 50)
    public void rightAngle() {
        assertEquals("直角三角形", triangle.getTriangleType(3, 4, 5));
        assertEquals("直角三角形", triangle.getTriangleType(5, 4, 3));
        assertEquals("直角三角形", triangle.getTriangleType(4, 5, 3));
    }
    
    @Test(timeout = 50)
    public void notTriangle() {
        assertEquals("不能構成三角形", triangle.getTriangleType(2, 2, 6));
        assertEquals("不能構成三角形", triangle.getTriangleType(6, 2, 2));
        assertEquals("不能構成三角形", triangle.getTriangleType(2, 6, 2));
    }
}