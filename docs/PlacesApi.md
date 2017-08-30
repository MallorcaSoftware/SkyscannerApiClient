# PlacesApi

All URIs are relative to *http://partners.api.skyscanner.net/apiservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autosuggest**](PlacesApi.md#autosuggest) | **GET** /autosuggest/v1.0/{country}/{currency}/{locale} | 


<a name="autosuggest"></a>
# **autosuggest**
> AutosuggestResponseDto autosuggest(country, currency, locale)



Get a list of places that match a query string. 

### Example
```java
// Import classes:
//import com.mallorcasoftware.skyscannerapiclient.ApiClient;
//import com.mallorcasoftware.skyscannerapiclient.ApiException;
//import com.mallorcasoftware.skyscannerapiclient.Configuration;
//import com.mallorcasoftware.skyscannerapiclient.auth.*;
//import com.mallorcasoftware.skyscannerapiclient.api.PlacesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: UserSecurity
ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//UserSecurity.setApiKeyPrefix("Token");

PlacesApi apiInstance = new PlacesApi();
String country = "country_example"; // String | The market country your user is in
String currency = "currency_example"; // String | The currency you want the prices in
String locale = "locale_example"; // String | The locale you want the results in (ISO locale)
try {
    AutosuggestResponseDto result = apiInstance.autosuggest(country, currency, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlacesApi#autosuggest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| The market country your user is in |
 **currency** | **String**| The currency you want the prices in |
 **locale** | **String**| The locale you want the results in (ISO locale) |

### Return type

[**AutosuggestResponseDto**](AutosuggestResponseDto.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

