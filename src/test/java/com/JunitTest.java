package com;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JunitTest {

	 @Test
	    public void testB() {

	        assertThat(1 + 1, is(2));

	    }

	    @Test
	    public void test1() {

	        assertThat(1 + 1, is(2));

	    }

	    @Test
	    public void testA() {

	        assertThat(1 + 1, is(2));

	    }

	    @Test
	    public void test2() {

	        assertThat(1 + 1, is(2));

	    }

	    @Test
	    public void testC() {

	        assertThat(1 + 1, is(2));

	    }

	}
