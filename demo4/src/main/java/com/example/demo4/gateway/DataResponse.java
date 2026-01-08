package com.example.demo4.gateway;

public record DataResponse(
	Headers headers,
	String data,
	String origin,
	String url
) {
}
