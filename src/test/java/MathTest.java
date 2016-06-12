import com.google.common.truth.Truth;
import org.junit.Test;

public class MathTest {

    @Test
    public void testPlus() throws Exception {
        Truth.assertThat(Math.plus(1, 2)).isSameAs(3);
    }

}
