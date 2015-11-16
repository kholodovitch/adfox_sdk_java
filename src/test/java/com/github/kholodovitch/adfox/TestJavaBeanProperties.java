package com.github.kholodovitch.adfox;

import java.beans.IntrospectionException;

import org.junit.Test;

public class TestJavaBeanProperties {

	@Test
	public void testAdvertiser() throws IntrospectionException {
		JavaBeanTester.test(Advertiser.class);
	}

	@Test
	public void testBanner() throws IntrospectionException {
		JavaBeanTester.test(Banner.class);
	}

	@Test
	public void testBannerPlace() throws IntrospectionException {
		JavaBeanTester.test(BannerPlace.class);
	}

	@Test
	public void testBannerPlacements() throws IntrospectionException {
		JavaBeanTester.test(BannerPlacements.class);
	}

	@Test
	public void testCampaign() throws IntrospectionException {
		JavaBeanTester.test(Campaign.class);
	}

}
