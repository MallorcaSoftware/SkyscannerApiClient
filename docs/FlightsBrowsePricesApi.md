# FlightsBrowsePricesApi

All URIs are relative to *http://partners.api.skyscanner.net/apiservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**browseDates**](FlightsBrowsePricesApi.md#browseDates) | **GET** /browsedates/v1.0/{country}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate} | 
[**browseQuotes**](FlightsBrowsePricesApi.md#browseQuotes) | **GET** /browsequotes/v1.0/{country}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate} | 
[**browseRoutes**](FlightsBrowsePricesApi.md#browseRoutes) | **GET** /browseroutes/v1.0/{country}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate} | 


<a name="browseDates"></a>
# **browseDates**
> BrowseDatesResponseDto browseDates(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate)



Retrieve the cheapest dates for a given route from our cache. 

### Example
```java
// Import classes:
//import com.mallorcasoftware.skyscannerapiclient.ApiClient;
//import com.mallorcasoftware.skyscannerapiclient.ApiException;
//import com.mallorcasoftware.skyscannerapiclient.Configuration;
//import com.mallorcasoftware.skyscannerapiclient.auth.*;
//import com.mallorcasoftware.skyscannerapiclient.api.FlightsBrowsePricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: UserSecurity
ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//UserSecurity.setApiKeyPrefix("Token");

FlightsBrowsePricesApi apiInstance = new FlightsBrowsePricesApi();
String country = "country_example"; // String | The market country your user is in
String currency = "currency_example"; // String | The currency you want the prices in
String locale = "locale_example"; // String | The locale you want the results in (ISO locale)
String originPlace = "originPlace_example"; // String | The origin place (see places)
String destinationPlace = "destinationPlace_example"; // String | The destination place (see places)
String outboundPartialDate = "outboundPartialDate_example"; // String | The outbound date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”.
String inboundPartialDate = "inboundPartialDate_example"; // String | The return date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. Use empty string for oneway trip.
try {
    BrowseDatesResponseDto result = apiInstance.browseDates(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlightsBrowsePricesApi#browseDates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| The market country your user is in |
 **currency** | **String**| The currency you want the prices in |
 **locale** | **String**| The locale you want the results in (ISO locale) |
 **originPlace** | **String**| The origin place (see places) |
 **destinationPlace** | **String**| The destination place (see places) |
 **outboundPartialDate** | **String**| The outbound date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. |
 **inboundPartialDate** | **String**| The return date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. Use empty string for oneway trip. |

### Return type

[**BrowseDatesResponseDto**](BrowseDatesResponseDto.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseQuotes"></a>
# **browseQuotes**
> BrowseQuotesResponseDto browseQuotes(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate)



Retrieve the cheapest quotes from our cache prices. 

### Example
```java
// Import classes:
//import com.mallorcasoftware.skyscannerapiclient.ApiClient;
//import com.mallorcasoftware.skyscannerapiclient.ApiException;
//import com.mallorcasoftware.skyscannerapiclient.Configuration;
//import com.mallorcasoftware.skyscannerapiclient.auth.*;
//import com.mallorcasoftware.skyscannerapiclient.api.FlightsBrowsePricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: UserSecurity
ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//UserSecurity.setApiKeyPrefix("Token");

FlightsBrowsePricesApi apiInstance = new FlightsBrowsePricesApi();
String country = "country_example"; // String | The market country your user is in
String currency = "currency_example"; // String | The currency you want the prices in
String locale = "locale_example"; // String | The locale you want the results in (ISO locale)
String originPlace = "originPlace_example"; // String | The origin place (see places)
String destinationPlace = "destinationPlace_example"; // String | The destination place (see places)
String outboundPartialDate = "outboundPartialDate_example"; // String | The outbound date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”.
String inboundPartialDate = "inboundPartialDate_example"; // String | The return date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. Use empty string for oneway trip.
try {
    BrowseQuotesResponseDto result = apiInstance.browseQuotes(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlightsBrowsePricesApi#browseQuotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| The market country your user is in |
 **currency** | **String**| The currency you want the prices in |
 **locale** | **String**| The locale you want the results in (ISO locale) |
 **originPlace** | **String**| The origin place (see places) |
 **destinationPlace** | **String**| The destination place (see places) |
 **outboundPartialDate** | **String**| The outbound date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. |
 **inboundPartialDate** | **String**| The return date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. Use empty string for oneway trip. |

### Return type

[**BrowseQuotesResponseDto**](BrowseQuotesResponseDto.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="browseRoutes"></a>
# **browseRoutes**
> BrowseRoutesResponseDto browseRoutes(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate)



Retrieve the cheapest routes from our cache prices. Similar to the Browse Quotes API but with the routes built for you from the individual quotes. 

### Example
```java
// Import classes:
//import com.mallorcasoftware.skyscannerapiclient.ApiClient;
//import com.mallorcasoftware.skyscannerapiclient.ApiException;
//import com.mallorcasoftware.skyscannerapiclient.Configuration;
//import com.mallorcasoftware.skyscannerapiclient.auth.*;
//import com.mallorcasoftware.skyscannerapiclient.api.FlightsBrowsePricesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: UserSecurity
ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//UserSecurity.setApiKeyPrefix("Token");

FlightsBrowsePricesApi apiInstance = new FlightsBrowsePricesApi();
String country = "country_example"; // String | The market country your user is in
String currency = "currency_example"; // String | The currency you want the prices in
String locale = "locale_example"; // String | The locale you want the results in (ISO locale)
String originPlace = "originPlace_example"; // String | The origin place (see places)
String destinationPlace = "destinationPlace_example"; // String | The destination place (see places)
String outboundPartialDate = "outboundPartialDate_example"; // String | The outbound date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”.
String inboundPartialDate = "inboundPartialDate_example"; // String | The return date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. Use empty string for oneway trip.
try {
    BrowseRoutesResponseDto result = apiInstance.browseRoutes(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlightsBrowsePricesApi#browseRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| The market country your user is in |
 **currency** | **String**| The currency you want the prices in |
 **locale** | **String**| The locale you want the results in (ISO locale) |
 **originPlace** | **String**| The origin place (see places) |
 **destinationPlace** | **String**| The destination place (see places) |
 **outboundPartialDate** | **String**| The outbound date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. |
 **inboundPartialDate** | **String**| The return date. Format “yyyy-mm-dd”, “yyyy-mm” or “anytime”. Use empty string for oneway trip. |

### Return type

[**BrowseRoutesResponseDto**](BrowseRoutesResponseDto.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

