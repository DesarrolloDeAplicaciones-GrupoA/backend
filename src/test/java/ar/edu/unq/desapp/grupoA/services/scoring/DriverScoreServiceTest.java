package ar.edu.unq.desapp.grupoA.services.scoring;

import ar.edu.unq.desapp.grupoA.models.Score;
import ar.edu.unq.desapp.grupoA.models.UserModel;
import ar.edu.unq.desapp.grupoA.repositories.UserModelRepository;
import ar.edu.unq.desapp.grupoA.testUtis.factories.UserModelTestFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DriverScoreServiceTest extends BaseScoreServiceTest<UserModel> {

    private UserModel scoringModel;

    @Autowired
    private DriverScoreService driverScoreService;

    @Override
    protected int getUserPoints() {
        return this.getScoringModel().getPoints();
    }

    @Override
    protected void createScoringModel() {
        this.scoringModel = this.getUser();
    }

    @Override
    protected Set<Score> getScoringModelScores() {
        return this.getScoringModel().getDriverScores();
    }

    @Test
    public void hasOneMoreDriverScoreInRepository() {
        assertEquals(0, this.scoreRepository.count());
        getService().createScore(this.getScoringModel(), travel, true);
        assertEquals(1, this.scoreRepository.count());
    }

    public UserModel getScoringModel() {
        return this.scoringModel;
    }

    public DriverScoreService getService() {
        return this.driverScoreService;
    }
}
