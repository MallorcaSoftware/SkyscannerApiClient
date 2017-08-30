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
import com.mallorcasoftware.skyscannerapiclient.model.CurrencyDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CurrenciesResponseDto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T14:30:56.539+02:00")
public class CurrenciesResponseDto   {
  @SerializedName("Currencies")
  private List<CurrencyDto> currencies = new ArrayList<CurrencyDto>();

  public CurrenciesResponseDto currencies(List<CurrencyDto> currencies) {
    this.currencies = currencies;
    return this;
  }

  public CurrenciesResponseDto addCurrenciesItem(CurrencyDto currenciesItem) {
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
    CurrenciesResponseDto currenciesResponseDto = (CurrenciesResponseDto) o;
    return Objects.equals(this.currencies, currenciesResponseDto.currencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrenciesResponseDto {\n");
    
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
