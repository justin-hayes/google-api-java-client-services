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

package com.google.api.services.spanner.v1.model;

/**
 * The response for ListInstanceConfigs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListInstanceConfigsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of requested instance configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceConfig> instanceConfigs;

  /**
   * `next_page_token` can be sent in a subsequent ListInstanceConfigs call to fetch more of the
   * matching instance configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of requested instance configurations.
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceConfig> getInstanceConfigs() {
    return instanceConfigs;
  }

  /**
   * The list of requested instance configurations.
   * @param instanceConfigs instanceConfigs or {@code null} for none
   */
  public ListInstanceConfigsResponse setInstanceConfigs(java.util.List<InstanceConfig> instanceConfigs) {
    this.instanceConfigs = instanceConfigs;
    return this;
  }

  /**
   * `next_page_token` can be sent in a subsequent ListInstanceConfigs call to fetch more of the
   * matching instance configurations.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * `next_page_token` can be sent in a subsequent ListInstanceConfigs call to fetch more of the
   * matching instance configurations.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListInstanceConfigsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListInstanceConfigsResponse set(String fieldName, Object value) {
    return (ListInstanceConfigsResponse) super.set(fieldName, value);
  }

  @Override
  public ListInstanceConfigsResponse clone() {
    return (ListInstanceConfigsResponse) super.clone();
  }

}
