/**
 * SkyscannerApiClient
 * Java api client for skyscanner API
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.mallorcasoftware.skyscannerapiclient.api;

import com.mallorcasoftware.skyscannerapiclient.ApiException;
import com.mallorcasoftware.skyscannerapiclient.model.BrowseDatesResponseDto;
import com.mallorcasoftware.skyscannerapiclient.model.BrowseQuotesResponseDto;
import com.mallorcasoftware.skyscannerapiclient.model.BrowseRoutesResponseDto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FlightsBrowsePricesApi
 */
public class FlightsBrowsePricesApiTest {

    private final FlightsBrowsePricesApi api = new FlightsBrowsePricesApi();

    
    /**
     * 
     *
     * Retrieve the cheapest dates for a given route from our cache. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void browseDatesTest() throws ApiException {
        String country = null;
        String currency = null;
        String locale = null;
        String originPlace = null;
        String destinationPlace = null;
        String outboundPartialDate = null;
        String inboundPartialDate = null;
        // BrowseDatesResponseDto response = api.browseDates(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve the cheapest quotes from our cache prices. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void browseQuotesTest() throws ApiException {
        String country = null;
        String currency = null;
        String locale = null;
        String originPlace = null;
        String destinationPlace = null;
        String outboundPartialDate = null;
        String inboundPartialDate = null;
        // BrowseQuotesResponseDto response = api.browseQuotes(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve the cheapest routes from our cache prices. Similar to the Browse Quotes API but with the routes built for you from the individual quotes. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void browseRoutesTest() throws ApiException {
        String country = null;
        String currency = null;
        String locale = null;
        String originPlace = null;
        String destinationPlace = null;
        String outboundPartialDate = null;
        String inboundPartialDate = null;
        // BrowseRoutesResponseDto response = api.browseRoutes(country, currency, locale, originPlace, destinationPlace, outboundPartialDate, inboundPartialDate);

        // TODO: test validations
    }
    
}
