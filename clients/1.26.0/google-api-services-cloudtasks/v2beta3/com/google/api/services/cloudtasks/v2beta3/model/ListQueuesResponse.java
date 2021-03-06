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

package com.google.api.services.cloudtasks.v2beta3.model;

/**
 * Response message for ListQueues.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tasks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListQueuesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call ListQueues with this value as the page_token.
   *
   * If the next_page_token is empty, there are no more results.
   *
   * The page token is valid for only 2 hours.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of queues.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Queue> queues;

  static {
    // hack to force ProGuard to consider Queue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Queue.class);
  }

  /**
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call ListQueues with this value as the page_token.
   *
   * If the next_page_token is empty, there are no more results.
   *
   * The page token is valid for only 2 hours.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token to retrieve next page of results.
   *
   * To return the next page of results, call ListQueues with this value as the page_token.
   *
   * If the next_page_token is empty, there are no more results.
   *
   * The page token is valid for only 2 hours.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListQueuesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of queues.
   * @return value or {@code null} for none
   */
  public java.util.List<Queue> getQueues() {
    return queues;
  }

  /**
   * The list of queues.
   * @param queues queues or {@code null} for none
   */
  public ListQueuesResponse setQueues(java.util.List<Queue> queues) {
    this.queues = queues;
    return this;
  }

  @Override
  public ListQueuesResponse set(String fieldName, Object value) {
    return (ListQueuesResponse) super.set(fieldName, value);
  }

  @Override
  public ListQueuesResponse clone() {
    return (ListQueuesResponse) super.clone();
  }

}
