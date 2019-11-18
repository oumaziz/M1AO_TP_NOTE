package ao.domain.model;

import fr.ubordeaux.ao.domain.exception.LocationException;
import fr.ubordeaux.ao.domain.model.Train;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TrainTest {

    @Test
    public void sourceAndDestinationShouldBeDifferent() {
        try {
            Train train = new Train("TR1014", "Bordeaux", "Bordeaux", 100);

            fail("should not be able to create a Train with identical source and destination.");
        }catch (LocationException e) {

        }

    }
}
