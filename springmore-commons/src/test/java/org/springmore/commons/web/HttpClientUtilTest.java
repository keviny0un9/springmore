package org.springmore.commons.web;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;

public class HttpClientUtilTest {

	@Test
	public void testDoGetStringString() throws Exception {
		String doGet = HttpClientUtil.get("http://localhost:8888/login/");
		System.out.println(doGet);
	}

	@Test
	public void testDoPost() throws Exception {
		 List <NameValuePair> nvps = new ArrayList <NameValuePair>();
         nvps.add(new BasicNameValuePair("user.userName", "哈哈"));
        // nvps.add(new BasicNameValuePair("password", "secret"));
		String doGet = HttpClientUtil.post("http://localhost:8888/login/login!login.ac",nvps);
		System.out.println(doGet);
	}

	@Test
	public void testGetSSL() throws Exception {
		String doGet = HttpClientUtil.getSSL("https://www.baidu.com", "utf-8");
		List <NameValuePair> nvps = new ArrayList <NameValuePair>();
        nvps.add(new BasicNameValuePair("user.userName", "哈哈"));
		String post = HttpClientUtil.postSSL("https://www.baidu.com", nvps,"utf-8");
		System.out.println(post);
	}
	
}
