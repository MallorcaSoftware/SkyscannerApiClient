# GeneralApi

All URIs are relative to *http://partners.api.skyscanner.net/apiservices*

Method | HTTP request | Description
------------- | ------------- | -------------
[**currencies**](GeneralApi.md#currencies) | **GET** /reference/v1.0/currencies | 
[**locales**](GeneralApi.md#locales) | **GET** /reference/v1.0/locales | 


<a name="currencies"></a>
# **currencies**
> CurrenciesResponseDto currencies()



Retrieve the currencies that we support. 

### Example
```java
// Import classes:
//import com.mallorcasoftware.skyscannerapiclient.ApiClient;
//import com.mallorcasoftware.skyscannerapiclient.ApiException;
//import com.mallorcasoftware.skyscannerapiclient.Configuration;
//import com.mallorcasoftware.skyscannerapiclient.auth.*;
//import com.mallorcasoftware.skyscannerapiclient.api.GeneralApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: UserSecurity
ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//UserSecurity.setApiKeyPrefix("Token");

GeneralApi apiInstance = new GeneralApi();
try {
    CurrenciesResponseDto result = apiInstance.currencies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralApi#currencies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrenciesResponseDto**](CurrenciesResponseDto.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="locales"></a>
# **locales**
> LocalesResponseDto locales()



Retrieve the locales that we support to translate your content. 

### Example
```java
// Import classes:
//import com.mallorcasoftware.skyscannerapiclient.ApiClient;
//import com.mallorcasoftware.skyscannerapiclient.ApiException;
//import com.mallorcasoftware.skyscannerapiclient.Configuration;
//import com.mallorcasoftware.skyscannerapiclient.auth.*;
//import com.mallorcasoftware.skyscannerapiclient.api.GeneralApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: UserSecurity
ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//UserSecurity.setApiKeyPrefix("Token");

GeneralApi apiInstance = new GeneralApi();
try {
    LocalesResponseDto result = apiInstance.locales();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GeneralApi#locales");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LocalesResponseDto**](LocalesResponseDto.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

