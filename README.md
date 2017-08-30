# skyscannerapiclient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.mallorcasoftware</groupId>
    <artifactId>skyscannerapiclient</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mallorcasoftware:skyscannerapiclient:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/skyscannerapiclient-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mallorcasoftware.skyscannerapiclient.*;
import com.mallorcasoftware.skyscannerapiclient.auth.*;
import com.mallorcasoftware.skyscannerapiclient.model.*;
import com.mallorcasoftware.skyscannerapiclient.api.FlightsBrowsePricesApi;

import java.io.File;
import java.util.*;

public class FlightsBrowsePricesApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://partners.api.skyscanner.net/apiservices*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FlightsBrowsePricesApi* | [**browseDates**](docs/FlightsBrowsePricesApi.md#browseDates) | **GET** /browsedates/v1.0/{country}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate} | 
*FlightsBrowsePricesApi* | [**browseQuotes**](docs/FlightsBrowsePricesApi.md#browseQuotes) | **GET** /browsequotes/v1.0/{country}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate} | 
*FlightsBrowsePricesApi* | [**browseRoutes**](docs/FlightsBrowsePricesApi.md#browseRoutes) | **GET** /browseroutes/v1.0/{country}/{currency}/{locale}/{originPlace}/{destinationPlace}/{outboundPartialDate}/{inboundPartialDate} | 
*GeneralApi* | [**currencies**](docs/GeneralApi.md#currencies) | **GET** /reference/v1.0/currencies | 
*GeneralApi* | [**locales**](docs/GeneralApi.md#locales) | **GET** /reference/v1.0/locales | 
*PlacesApi* | [**autosuggest**](docs/PlacesApi.md#autosuggest) | **GET** /autosuggest/v1.0/{country}/{currency}/{locale} | 


## Documentation for Models

 - [AutosuggestPlaceDto](docs/AutosuggestPlaceDto.md)
 - [AutosuggestResponseDto](docs/AutosuggestResponseDto.md)
 - [BrowseDatesResponseDto](docs/BrowseDatesResponseDto.md)
 - [BrowseQuotesResponseDto](docs/BrowseQuotesResponseDto.md)
 - [BrowseRoutesResponseDto](docs/BrowseRoutesResponseDto.md)
 - [CarrierDto](docs/CarrierDto.md)
 - [CurrenciesResponseDto](docs/CurrenciesResponseDto.md)
 - [CurrencyDto](docs/CurrencyDto.md)
 - [DateDto](docs/DateDto.md)
 - [LegDto](docs/LegDto.md)
 - [LocaleDto](docs/LocaleDto.md)
 - [LocalesResponseDto](docs/LocalesResponseDto.md)
 - [PlaceDto](docs/PlaceDto.md)
 - [QuoteDto](docs/QuoteDto.md)
 - [RouteDto](docs/RouteDto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### UserSecurity

- **Type**: API key
- **API key parameter name**: apiKey
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



