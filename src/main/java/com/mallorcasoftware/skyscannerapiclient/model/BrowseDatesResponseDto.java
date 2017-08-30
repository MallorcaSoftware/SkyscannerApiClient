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


package com.mallorcasoftware.skyscannerapiclient.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.mallorcasoftware.skyscannerapiclient.model.CarrierDto;
import com.mallorcasoftware.skyscannerapiclient.model.CurrencyDto;
import com.mallorcasoftware.skyscannerapiclient.model.DateDto;
import com.mallorcasoftware.skyscannerapiclient.model.PlaceDto;
import com.mallorcasoftware.skyscannerapiclient.model.QuoteDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * BrowseDatesResponseDto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T14:30:56.539+02:00")
public class BrowseDatesResponseDto   {
  @SerializedName("Dates")
  private List<DateDto> dates = new ArrayList<DateDto>();

  @SerializedName("Quotes")
  private List<QuoteDto> quotes = new ArrayList<QuoteDto>();

  @SerializedName("Places")
  private List<PlaceDto> places = new ArrayList<PlaceDto>();

  @SerializedName("Carriers")
  private List<CarrierDto> carriers = new ArrayList<CarrierDto>();

  @SerializedName("Currencies")
  private List<CurrencyDto> currencies = new ArrayList<CurrencyDto>();

  public BrowseDatesResponseDto dates(List<DateDto> dates) {
    this.dates = dates;
    return this;
  }

  public BrowseDatesResponseDto addDatesItem(DateDto datesItem) {
    this.dates.add(datesItem);
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DateDto> getDates() {
    return dates;
  }

  public void setDates(List<DateDto> dates) {
    this.dates = dates;
  }

  public BrowseDatesResponseDto quotes(List<QuoteDto> quotes) {
    this.quotes = quotes;
    return this;
  }

  public BrowseDatesResponseDto addQuotesItem(QuoteDto quotesItem) {
    this.quotes.add(quotesItem);
    return this;
  }

   /**
   * Get quotes
   * @return quotes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<QuoteDto> getQuotes() {
    return quotes;
  }

  public void setQuotes(List<QuoteDto> quotes) {
    this.quotes = quotes;
  }

  public BrowseDatesResponseDto places(List<PlaceDto> places) {
    this.places = places;
    return this;
  }

  public BrowseDatesResponseDto addPlacesItem(PlaceDto placesItem) {
    this.places.add(placesItem);
    return this;
  }

   /**
   * Get places
   * @return places
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PlaceDto> getPlaces() {
    return places;
  }

  public void setPlaces(List<PlaceDto> places) {
    this.places = places;
  }

  public BrowseDatesResponseDto carriers(List<CarrierDto> carriers) {
    this.carriers = carriers;
    return this;
  }

  public BrowseDatesResponseDto addCarriersItem(CarrierDto carriersItem) {
    this.carriers.add(carriersItem);
    return this;
  }

   /**
   * Get carriers
   * @return carriers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CarrierDto> getCarriers() {
    return carriers;
  }

  public void setCarriers(List<CarrierDto> carriers) {
    this.carriers = carriers;
  }

  public BrowseDatesResponseDto currencies(List<CurrencyDto> currencies) {
    this.currencies = currencies;
    return this;
  }

  public BrowseDatesResponseDto addCurrenciesItem(CurrencyDto currenciesItem) {
    this.currencies.add(currenciesItem);
    return this;
  }

   /**
   * Get currencies
   * @return currencies
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CurrencyDto> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(List<CurrencyDto> currencies) {
    this.currencies = currencies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowseDatesResponseDto browseDatesResponseDto = (BrowseDatesResponseDto) o;
    return Objects.equals(this.dates, browseDatesResponseDto.dates) &&
        Objects.equals(this.quotes, browseDatesResponseDto.quotes) &&
        Objects.equals(this.places, browseDatesResponseDto.places) &&
        Objects.equals(this.carriers, browseDatesResponseDto.carriers) &&
        Objects.equals(this.currencies, browseDatesResponseDto.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates, quotes, places, carriers, currencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowseDatesResponseDto {\n");
    
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    quotes: ").append(toIndentedString(quotes)).append("\n");
    sb.append("    places: ").append(toIndentedString(places)).append("\n");
    sb.append("    carriers: ").append(toIndentedString(carriers)).append("\n");
    sb.append("    currencies: ").append(toIndentedString(currencies)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
