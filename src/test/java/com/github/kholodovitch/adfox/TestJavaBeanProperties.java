package com.github.kholodovitch.adfox;

import java.beans.IntrospectionException;

import org.junit.Test;

import com.github.kholodovitch.adfox.objects.Advertiser;
import com.github.kholodovitch.adfox.objects.Banner;
import com.github.kholodovitch.adfox.objects.BannerPlace;
import com.github.kholodovitch.adfox.objects.BannerPlacements;
import com.github.kholodovitch.adfox.objects.Campaign;
import com.github.kholodovitch.adfox.objects.WebSite;

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

	@Test
	public void testWebsite() throws IntrospectionException {
		JavaBeanTester.test(WebSite.class);
	}

}
