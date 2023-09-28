package org.example;

import java.net.URI;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.cookie.BasicCookieStore;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class MyRequest {

  private CloseableHttpClient httpClient;
  private URI requestURI;

  public void executeRequest() throws Exception {
    HttpGet request = new HttpGet(requestURI);
    HttpClientContext localContext = HttpClientContext.create();
    localContext.setCookieStore(new BasicCookieStore());
    httpClient.execute(
      request,
      localContext,
      (ClassicHttpResponse _response) ->
        localContext
    );
  }
}
