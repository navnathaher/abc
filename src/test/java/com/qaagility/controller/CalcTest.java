package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.*;

    @Test
    Public void testcal() {

Calcmul testcalmul = new Calcmul();
Calculator testcaladd= new Calculator();

		assertEquals(testcalmul.mul(),18);
		assertEquals(testcaladd.add(),9);
} 

