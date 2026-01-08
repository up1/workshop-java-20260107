package com.example.demo4.gateway;

public record Headers(
	String secChUa,
	String accept,
	String priority,
	String secChUaPlatform,
	String userAgent,
	String secFetchDest,
	String secFetchSite,
	String host,
	String acceptEncoding,
	String xAmznTraceId,
	String secFetchMode,
	String upgradeInsecureRequests,
	String secFetchUser,
	String acceptLanguage,
	String secChUaMobile
) {
}
