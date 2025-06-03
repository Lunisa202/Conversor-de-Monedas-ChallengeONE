package com.converter.http;

import java.io.IOException;

public abstract class HttpService {
    public abstract String doRequest(String url) throws IOException, InterruptedException;


}
