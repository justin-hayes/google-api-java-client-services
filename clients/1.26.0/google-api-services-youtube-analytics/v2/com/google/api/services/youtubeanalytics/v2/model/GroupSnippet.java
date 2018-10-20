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

package com.google.api.services.youtubeanalytics.v2.model;

/**
 * A group snippet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Analytics API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The date and time that the group was created. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String publishedAt;

  /**
   * The group name. The value must be a non-empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The date and time that the group was created. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public String getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time that the group was created. The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public GroupSnippet setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The group name. The value must be a non-empty string.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The group name. The value must be a non-empty string.
   * @param title title or {@code null} for none
   */
  public GroupSnippet setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GroupSnippet set(String fieldName, Object value) {
    return (GroupSnippet) super.set(fieldName, value);
  }

  @Override
  public GroupSnippet clone() {
    return (GroupSnippet) super.clone();
  }

}