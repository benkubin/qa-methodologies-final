import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CanDriveTest
{

    @Test
    void TestMin() {
        assertThrows(IllegalArgumentException.class, () -> CanDrive.canDrive(Integer.MIN_VALUE));
    }

    @Test
    void TestMin1()
    {
        assertThrows(IllegalArgumentException.class, () -> CanDrive.canDrive(Integer.MIN_VALUE + 1));
    }

    @Test
    void TestNeg1()
    {
        assertThrows(IllegalArgumentException.class, () -> CanDrive.canDrive(-1));
    }

    @Test
    void Test0 ()
    {
        assertTrue(CanDrive.canDrive(0));
    }

    @Test
    void Test1()
    {
        assertFalse(CanDrive.canDrive(1));
    }

    @Test
    void Test15()
    {
        assertFalse(CanDrive.canDrive(15));
    }

    @Test
    void Test16()
    {
        assertTrue(CanDrive.canDrive(16));
    }

    @Test
    void Test19()
    {
        assertTrue(CanDrive.canDrive(17));
    }

    @Test
    void Test100()
    {
        assertTrue(CanDrive.canDrive(100));
    }

    @Test
    void TestMax1()
    {
        assertThrows(IllegalArgumentException.class, () -> CanDrive.canDrive(Integer.MAX_VALUE - 1));
    }

    @Test
    void TestMax()
    {
        assertThrows(IllegalArgumentException.class, () -> CanDrive.canDrive(Integer.MAX_VALUE));
    }


}