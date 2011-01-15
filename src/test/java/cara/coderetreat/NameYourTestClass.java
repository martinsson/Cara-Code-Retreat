package cara.coderetreat;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class NameYourTestClass {
    @Test
    public void junitAndHamcretsWorks() throws Exception {
        assertThat(false, not(equalTo(true)));
        assertThat("Hello world", endsWith("world"));
    }

}
