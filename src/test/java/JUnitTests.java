import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class JUnitTests
{
    @Mock
    private Database db = new Database();

    @Test
    void serviceTest()
    {
        Service s = new Service(db);
        assertFalse(s.query("EmployeeID"));
        assertEquals("Using database with id: 42", s.getDatabaseID());
    }

    @Test
    void databaseTest()
    {
        assertFalse(db.isAvailable());
        assertEquals(42, db.getUniqueId());
    }
}
