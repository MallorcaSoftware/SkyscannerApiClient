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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * PlaceDto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T14:32:54.673+02:00")
public class PlaceDto   {
  @SerializedName("PlaceId")
  private Integer placeId = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("SkyscannerCode")
  private String skyscannerCode = null;

  public PlaceDto placeId(Integer placeId) {
    this.placeId = placeId;
    return this;
  }

   /**
   * Get placeId
   * @return placeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPlaceId() {
    return placeId;
  }

  public void setPlaceId(Integer placeId) {
    this.placeId = placeId;
  }

  public PlaceDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlaceDto type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PlaceDto skyscannerCode(String skyscannerCode) {
    this.skyscannerCode = skyscannerCode;
    return this;
  }

   /**
   * Get skyscannerCode
   * @return skyscannerCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSkyscannerCode() {
    return skyscannerCode;
  }

  public void setSkyscannerCode(String skyscannerCode) {
    this.skyscannerCode = skyscannerCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceDto placeDto = (PlaceDto) o;
    return Objects.equals(this.placeId, placeDto.placeId) &&
        Objects.equals(this.name, placeDto.name) &&
        Objects.equals(this.type, placeDto.type) &&
        Objects.equals(this.skyscannerCode, placeDto.skyscannerCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeId, name, type, skyscannerCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceDto {\n");
    
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    skyscannerCode: ").append(toIndentedString(skyscannerCode)).append("\n");
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

