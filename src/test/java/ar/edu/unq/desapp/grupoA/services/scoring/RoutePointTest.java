package ar.edu.unq.desapp.grupoA.services.scoring;

import ar.edu.unq.desapp.grupoA.models.Route;
import ar.edu.unq.desapp.grupoA.models.utils.Point;
import ar.edu.unq.desapp.grupoA.services.AbstractServiceTest;
import ar.edu.unq.desapp.grupoA.testUtis.factories.RouteTestFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class RoutePointTest extends AbstractServiceTest {

    private Route route;
    @Autowired
    private RouteTestFactory routeTestFactory;

    @Before
    public void setUp() {
        this.route = this.routeTestFactory.fromConstitucionToCorrientes();
    }

    @Test
    public void dosPuntosSonIguales() {
        Point p = new Point(-34.627712, -58.379718);
        Assert.assertEquals(p.getLongitude(), route.getStart().getLongitude(), 10);
        Assert.assertEquals(p.getLatitude(), route.getStart().getLatitude(), 10);
    }

}
