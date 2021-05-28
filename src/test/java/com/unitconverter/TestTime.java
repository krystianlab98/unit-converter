package com.unitconverter;

import com.unitconverter.models.Time;
import com.unitconverter.services.TimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestTime {

    private TimeService timeService;
    private double nanosecond, microsecond, millisecond, second, minute, hour;
    private double expectedNanosecond, expectedMicrosecond, expectedMillisecond, expectedSecond, expectedMinute, expectedHour;

    @Autowired
    public TestTime(TimeService timeService) {
        this.timeService = timeService;
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testDefaultTimeUnit(){
        ResponseEntity<Time> time = (ResponseEntity<Time>) timeService.convertTime("hour");

        nanosecond = time.getBody().getNanosecond();
        microsecond = time.getBody().getMicrosecond();
        millisecond = time.getBody().getMillisecond();
        second = time.getBody().getSecond();
        minute = time.getBody().getMinute();
        hour = time.getBody().getHour();

        expectedNanosecond = 3600000000000.0;
        expectedMicrosecond = 3600000000.0;
        expectedMillisecond = 3600000.0;
        expectedSecond = 3600.0;
        expectedMinute = 60.0;
        expectedHour = 1.0;

        assertEquals(expectedNanosecond, nanosecond);
        assertEquals(expectedMicrosecond, microsecond);
        assertEquals(expectedMillisecond, millisecond);
        assertEquals(expectedSecond, second);
        assertEquals(expectedMinute, minute);
        assertEquals(expectedHour, hour);

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testHour(){
        ResponseEntity<Time> time = (ResponseEntity<Time>) timeService.convertTime("hour", 1.0);

        nanosecond = time.getBody().getNanosecond();
        microsecond = time.getBody().getMicrosecond();
        millisecond = time.getBody().getMillisecond();
        second = time.getBody().getSecond();
        minute = time.getBody().getMinute();
        hour = time.getBody().getHour();

        expectedNanosecond = 3600000000000.0;
        expectedMicrosecond = 3600000000.0;
        expectedMillisecond = 3600000.0;
        expectedSecond = 3600.0;
        expectedMinute = 60.0;
        expectedHour = 1.0;

        assertEquals(expectedNanosecond, nanosecond);
        assertEquals(expectedMicrosecond, microsecond);
        assertEquals(expectedMillisecond, millisecond);
        assertEquals(expectedSecond, second);
        assertEquals(expectedMinute, minute);
        assertEquals(expectedHour, hour);

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testMinute(){
        ResponseEntity<Time> time = (ResponseEntity<Time>) timeService.convertTime("minute", 1.0);

        nanosecond = time.getBody().getNanosecond();
        microsecond = time.getBody().getMicrosecond();
        millisecond = time.getBody().getMillisecond();
        second = time.getBody().getSecond();
        minute = time.getBody().getMinute();
        hour = time.getBody().getHour();

        expectedNanosecond = 60000000000.0;
        expectedMicrosecond = 60000000.0;
        expectedMillisecond = 60000.0;
        expectedSecond = 60.0;
        expectedMinute = 1.0;
        expectedHour = 0.016667;

        assertEquals(expectedNanosecond, nanosecond);
        assertEquals(expectedMicrosecond, microsecond);
        assertEquals(expectedMillisecond, millisecond);
        assertEquals(expectedSecond, second);
        assertEquals(expectedMinute, minute);
        assertEquals(expectedHour, hour);

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testSecond(){
        ResponseEntity<Time> time = (ResponseEntity<Time>) timeService.convertTime("second", 1.0);

        nanosecond = time.getBody().getNanosecond();
        microsecond = time.getBody().getMicrosecond();
        millisecond = time.getBody().getMillisecond();
        second = time.getBody().getSecond();
        minute = time.getBody().getMinute();
        hour = time.getBody().getHour();

        expectedNanosecond = 1000000000.0;
        expectedMicrosecond = 1000000.0;
        expectedMillisecond = 1000.0;
        expectedSecond = 1.0;
        expectedMinute = 0.016667;
        expectedHour = 0.000278;

        assertEquals(expectedNanosecond, nanosecond);
        assertEquals(expectedMicrosecond, microsecond);
        assertEquals(expectedMillisecond, millisecond);
        assertEquals(expectedSecond, second);
        assertEquals(expectedMinute, minute);
        assertEquals(expectedHour, hour);

    }
    @Test
    @SuppressWarnings("unchecked")
    public void testMillisecond(){
        ResponseEntity<Time> time = (ResponseEntity<Time>) timeService.convertTime("millisecond", 1.0);

        nanosecond = time.getBody().getNanosecond();
        microsecond = time.getBody().getMicrosecond();
        millisecond = time.getBody().getMillisecond();
        second = time.getBody().getSecond();
        minute = time.getBody().getMinute();
        hour = time.getBody().getHour();

        expectedNanosecond = 1000000.0;
        expectedMicrosecond = 1000.0;
        expectedMillisecond = 1.0;
        expectedSecond = 0.001;
        expectedMinute = 0.000017;
        expectedHour = 2.777778e-7;

        assertEquals(expectedNanosecond, nanosecond);
        assertEquals(expectedMicrosecond, microsecond);
        assertEquals(expectedMillisecond, millisecond);
        assertEquals(expectedSecond, second);
        assertEquals(expectedMinute, minute);
        assertEquals(expectedHour, hour);

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testMicrosecond(){
        ResponseEntity<Time> time = (ResponseEntity<Time>) timeService.convertTime("microsecond", 1.0);

        nanosecond = time.getBody().getNanosecond();
        microsecond = time.getBody().getMicrosecond();
        millisecond = time.getBody().getMillisecond();
        second = time.getBody().getSecond();
        minute = time.getBody().getMinute();
        hour = time.getBody().getHour();

        expectedNanosecond = 1000.0;
        expectedMicrosecond = 1.0;
        expectedMillisecond = 0.0001;
        expectedSecond = 0.000001;
        expectedMinute = 1.666667e-8;
        expectedHour = 2.777778e-10;

        assertEquals(expectedNanosecond, nanosecond);
        assertEquals(expectedMicrosecond, microsecond);
        assertEquals(expectedMillisecond, millisecond);
        assertEquals(expectedSecond, second);
        assertEquals(expectedMinute, minute);
        assertEquals(expectedHour, hour);

    }

    @Test
    @SuppressWarnings("unchecked")
    public void testNanosecond(){
        ResponseEntity<Time> time = (ResponseEntity<Time>) timeService.convertTime("nanosecond", 1.0);

        nanosecond = time.getBody().getNanosecond();
        microsecond = time.getBody().getMicrosecond();
        millisecond = time.getBody().getMillisecond();
        second = time.getBody().getSecond();
        minute = time.getBody().getMinute();
        hour = time.getBody().getHour();

        expectedNanosecond = 1.0;
        expectedMicrosecond = 0.001;
        expectedMillisecond = 0.000001;
        expectedSecond = 1e-9;
        expectedMinute = 1.666667e-11;
        expectedHour = 2.777778e-13;

        assertEquals(expectedNanosecond, nanosecond);
        assertEquals(expectedMicrosecond, microsecond);
        assertEquals(expectedMillisecond, millisecond);
        assertEquals(expectedSecond, second);
        assertEquals(expectedMinute, minute);
        assertEquals(expectedHour, hour);

    }




}
