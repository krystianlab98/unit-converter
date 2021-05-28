package com.unitconverter;

import com.unitconverter.models.Velocity;
import com.unitconverter.services.VelocityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestVelocity {

    private VelocityService velocityService;

    private double kilometersPerHour;
    private double milesPerHours;
    private double kilometersPerSecond;
    private double milesPerSecond;
    private double metersPerSecond;
    private double footPerSecond;

    private double expectedKilometersPerHour;
    private double expectedMilesPerHours;
    private double expectedKilometersPerSecond;
    private double expectedMilesPerSecond;
    private double expectedMetersPerSecond;
    private double expectedFootPerSecond;

    @Autowired
    public TestVelocity(VelocityService velocityService) {
        this.velocityService = velocityService;
    }

    @Test
    @SuppressWarnings("checked")
    public void testDefaultUnit(){
        ResponseEntity<Velocity> velocity = (ResponseEntity<Velocity>) velocityService.convertVelocity("kilometersPerHour");
        kilometersPerHour = velocity.getBody().getKilometersPerHour();
        milesPerHours = velocity.getBody().getMilesPerHours();
        kilometersPerSecond = velocity.getBody().getKilometersPerSecond();
        milesPerSecond = velocity.getBody().getMilesPerSecond();
        metersPerSecond = velocity.getBody().getMeterPerSecond();
        footPerSecond = velocity.getBody().getFootPerSecond();

        expectedKilometersPerHour = 1.0;
        expectedMilesPerHours = 0.6214;
        expectedKilometersPerSecond = 0.0003;
        expectedMilesPerSecond = 0.0002;
        expectedMetersPerSecond = 0.2778;
        expectedFootPerSecond = 0.9114;

        assertEquals(expectedKilometersPerHour,kilometersPerHour);
        assertEquals(expectedMilesPerHours,milesPerHours);
        assertEquals(expectedKilometersPerSecond,kilometersPerSecond);
        assertEquals(expectedMilesPerSecond,milesPerSecond);
        assertEquals(expectedMetersPerSecond,metersPerSecond);
        assertEquals(expectedFootPerSecond,footPerSecond);
    }

    @Test
    @SuppressWarnings("checked")
    public void testKilometersPerHour(){
        ResponseEntity<Velocity> velocity = (ResponseEntity<Velocity>) velocityService.convertVelocity("kilometersPerHour", 1.0);
        kilometersPerHour = velocity.getBody().getKilometersPerHour();
        milesPerHours = velocity.getBody().getMilesPerHours();
        kilometersPerSecond = velocity.getBody().getKilometersPerSecond();
        milesPerSecond = velocity.getBody().getMilesPerSecond();
        metersPerSecond = velocity.getBody().getMeterPerSecond();
        footPerSecond = velocity.getBody().getFootPerSecond();

        expectedKilometersPerHour = 1.0;
        expectedMilesPerHours = 0.6214;
        expectedKilometersPerSecond = 0.0003;
        expectedMilesPerSecond = 0.0002;
        expectedMetersPerSecond = 0.2778;
        expectedFootPerSecond = 0.9114;

        assertEquals(expectedKilometersPerHour,kilometersPerHour);
        assertEquals(expectedMilesPerHours,milesPerHours);
        assertEquals(expectedKilometersPerSecond,kilometersPerSecond);
        assertEquals(expectedMilesPerSecond,milesPerSecond);
        assertEquals(expectedMetersPerSecond,metersPerSecond);
        assertEquals(expectedFootPerSecond,footPerSecond);
    }

    @Test
    @SuppressWarnings("checked")
    public void testMilePerHour(){
        ResponseEntity<Velocity> velocity = (ResponseEntity<Velocity>) velocityService.convertVelocity("milesPerHours", 1.0);
        kilometersPerHour = velocity.getBody().getKilometersPerHour();
        milesPerHours = velocity.getBody().getMilesPerHours();
        kilometersPerSecond = velocity.getBody().getKilometersPerSecond();
        milesPerSecond = velocity.getBody().getMilesPerSecond();
        metersPerSecond = velocity.getBody().getMeterPerSecond();
        footPerSecond = velocity.getBody().getFootPerSecond();

        expectedKilometersPerHour = 1.6093;
        expectedMilesPerHours = 1.0;
        expectedKilometersPerSecond = 0.0004;
        expectedMilesPerSecond = 0.0003;
        expectedMetersPerSecond = 0.447;
        expectedFootPerSecond = 1.4667;

        assertEquals(expectedKilometersPerHour,kilometersPerHour);
        assertEquals(expectedMilesPerHours,milesPerHours);
        assertEquals(expectedKilometersPerSecond,kilometersPerSecond);
        assertEquals(expectedMilesPerSecond,milesPerSecond);
        assertEquals(expectedMetersPerSecond,metersPerSecond);
        assertEquals(expectedFootPerSecond,footPerSecond);
    }

    @Test
    @SuppressWarnings("checked")
    public void testKilometersPerSecond(){
        ResponseEntity<Velocity> velocity = (ResponseEntity<Velocity>) velocityService.convertVelocity("kilometersPerSecond", 1.0);
        kilometersPerHour = velocity.getBody().getKilometersPerHour();
        milesPerHours = velocity.getBody().getMilesPerHours();
        kilometersPerSecond = velocity.getBody().getKilometersPerSecond();
        milesPerSecond = velocity.getBody().getMilesPerSecond();
        metersPerSecond = velocity.getBody().getMeterPerSecond();
        footPerSecond = velocity.getBody().getFootPerSecond();

        expectedKilometersPerHour = 3600.0;
        expectedMilesPerHours = 2236.9363;
        expectedKilometersPerSecond =1.0;
        expectedMilesPerSecond = 0.6214;
        expectedMetersPerSecond = 1000.0;
        expectedFootPerSecond = 3280.8399;

        assertEquals(expectedKilometersPerHour,kilometersPerHour);
        assertEquals(expectedMilesPerHours,milesPerHours);
        assertEquals(expectedKilometersPerSecond,kilometersPerSecond);
        assertEquals(expectedMilesPerSecond,milesPerSecond);
        assertEquals(expectedMetersPerSecond,metersPerSecond);
        assertEquals(expectedFootPerSecond,footPerSecond);
    }

    @Test
    @SuppressWarnings("checked")
    public void testMilesPerSecond(){
        ResponseEntity<Velocity> velocity = (ResponseEntity<Velocity>) velocityService.convertVelocity("milesPerSecond", 1.0);
        kilometersPerHour = velocity.getBody().getKilometersPerHour();
        milesPerHours = velocity.getBody().getMilesPerHours();
        kilometersPerSecond = velocity.getBody().getKilometersPerSecond();
        milesPerSecond = velocity.getBody().getMilesPerSecond();
        metersPerSecond = velocity.getBody().getMeterPerSecond();
        footPerSecond = velocity.getBody().getFootPerSecond();

        expectedKilometersPerHour = 5793.6384;
        expectedMilesPerHours = 3600.0;
        expectedKilometersPerSecond = 1.6093;
        expectedMilesPerSecond = 1.0;
        expectedMetersPerSecond = 1609.344;
        expectedFootPerSecond = 5280.0;

        assertEquals(expectedKilometersPerHour,kilometersPerHour);
        assertEquals(expectedMilesPerHours,milesPerHours);
        assertEquals(expectedKilometersPerSecond,kilometersPerSecond);
        assertEquals(expectedMilesPerSecond,milesPerSecond);
        assertEquals(expectedMetersPerSecond,metersPerSecond);
        assertEquals(expectedFootPerSecond,footPerSecond);
    }

    @Test
    @SuppressWarnings("checked")
    public void testMetersPerSecond(){
        ResponseEntity<Velocity> velocity = (ResponseEntity<Velocity>) velocityService.convertVelocity("metersPerSecond", 1.0);
        kilometersPerHour = velocity.getBody().getKilometersPerHour();
        milesPerHours = velocity.getBody().getMilesPerHours();
        kilometersPerSecond = velocity.getBody().getKilometersPerSecond();
        milesPerSecond = velocity.getBody().getMilesPerSecond();
        metersPerSecond = velocity.getBody().getMeterPerSecond();
        footPerSecond = velocity.getBody().getFootPerSecond();

        expectedKilometersPerHour = 3.6;
        expectedMilesPerHours = 2.2369;
        expectedKilometersPerSecond = 0.001;
        expectedMilesPerSecond = 0.0006;
        expectedMetersPerSecond = 1.0;
        expectedFootPerSecond = 3.2808;

        assertEquals(expectedKilometersPerHour,kilometersPerHour);
        assertEquals(expectedMilesPerHours,milesPerHours);
        assertEquals(expectedKilometersPerSecond,kilometersPerSecond);
        assertEquals(expectedMilesPerSecond,milesPerSecond);
        assertEquals(expectedMetersPerSecond,metersPerSecond);
        assertEquals(expectedFootPerSecond,footPerSecond);
    }

    @Test
    @SuppressWarnings("checked")
    public void testFootPerSecond(){
        ResponseEntity<Velocity> velocity = (ResponseEntity<Velocity>) velocityService.convertVelocity("footPerSecond", 1.0);
        kilometersPerHour = velocity.getBody().getKilometersPerHour();
        milesPerHours = velocity.getBody().getMilesPerHours();
        kilometersPerSecond = velocity.getBody().getKilometersPerSecond();
        milesPerSecond = velocity.getBody().getMilesPerSecond();
        metersPerSecond = velocity.getBody().getMeterPerSecond();
        footPerSecond = velocity.getBody().getFootPerSecond();

        expectedKilometersPerHour = 1.0973;
        expectedMilesPerHours = 0.6818;
        expectedKilometersPerSecond = 0.0003;
        expectedMilesPerSecond = 0.0002;
        expectedMetersPerSecond = 0.3048;
        expectedFootPerSecond = 1.0;

        assertEquals(expectedKilometersPerHour,kilometersPerHour);
        assertEquals(expectedMilesPerHours,milesPerHours);
        assertEquals(expectedKilometersPerSecond,kilometersPerSecond);
        assertEquals(expectedMilesPerSecond,milesPerSecond);
        assertEquals(expectedMetersPerSecond,metersPerSecond);
        assertEquals(expectedFootPerSecond,footPerSecond);
    }


}
