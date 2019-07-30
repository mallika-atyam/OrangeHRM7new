package Parallal;

import java.util.concurrent.atomic.AtomicInteger;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClassA {
    private static AtomicInteger instanceCount = new AtomicInteger(0);

    public TestClassA() {
        instanceCount.incrementAndGet();
        log("A new instance of TestClassA created");
    }

    @AfterSuite
    public void printNumberOfInstances() {
        log("Number of instances of TestClassA = " + instanceCount.get());
    }

    @Test
    public void testA1() throws Exception {
        log("testA1 of TestInstance " + this);
    }

    @Test(dependsOnMethods = "testA1")
    public void testB1() {
        log("testB1 of TestInstance " + this);
    }

    @Test(dataProvider = "integerProvider")
    public void testDataProvider(int number) throws Exception {
        log("testDataProvider : number = " + number + " testInstance = " + this);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{
                {1},
                {2}
        };
    }

    private void log(String message) {
        String threadName = Thread.currentThread().getName();
        synchronized (System.out) {
            System.out.println(String.format("Thread %s : %s ", threadName, message));
        }
    }
}