package fr.unilim.iut;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestDoublures {

    @Test
    public void test_UnPremierStub() {

        User user = mock(User.class);
        when(user.getLogin()).thenReturn("alice");

        System.out.println(user.getLogin());
        assertEquals(user.getLogin(), "alice");
        //assertEquals(user.getLogin(), "bob");
    }
}
