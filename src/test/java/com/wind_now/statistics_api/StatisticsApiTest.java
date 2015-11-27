package com.wind_now.statistics_api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.wind_now.statistics_api.Latest;
import com.wind_now.statistics_api.beans.LatestResponse;
import com.wind_now.statistics_api.util.OnoLogger;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ono
 */
public class StatisticsApiTest {

    static final Logger logger = OnoLogger.getLogger();

    public StatisticsApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void latest() throws Exception {
        logger.info("latest");
        String title = "吹奏楽";
        Latest search = new Latest();
        LatestResponse res = search.latest(title);
        String actual = res.getTitle();
        String expected = title;
        assertThat(actual, is(actual));
        logger.info(res.toString());
    }

}
