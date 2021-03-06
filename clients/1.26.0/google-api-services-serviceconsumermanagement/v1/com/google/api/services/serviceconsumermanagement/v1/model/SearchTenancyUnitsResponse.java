/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.serviceconsumermanagement.v1.model;

/**
 * Response for the search query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchTenancyUnitsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Pagination token for large results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Tenancy Units matching the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TenancyUnit> tenancyUnits;

  /**
   * Pagination token for large results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Pagination token for large results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public SearchTenancyUnitsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Tenancy Units matching the request.
   * @return value or {@code null} for none
   */
  public java.util.List<TenancyUnit> getTenancyUnits() {
    return tenancyUnits;
  }

  /**
   * Tenancy Units matching the request.
   * @param tenancyUnits tenancyUnits or {@code null} for none
   */
  public SearchTenancyUnitsResponse setTenancyUnits(java.util.List<TenancyUnit> tenancyUnits) {
    this.tenancyUnits = tenancyUnits;
    return this;
  }

  @Override
  public SearchTenancyUnitsResponse set(String fieldName, Object value) {
    return (SearchTenancyUnitsResponse) super.set(fieldName, value);
  }

  @Override
  public SearchTenancyUnitsResponse clone() {
    return (SearchTenancyUnitsResponse) super.clone();
  }

}
