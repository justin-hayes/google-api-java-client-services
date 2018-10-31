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

package com.google.api.services.cloudsearch.v1.model;

/**
 * List of date values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateValues extends com.google.api.client.json.GenericJson {

  /**
   * The maximum number of elements is 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Date> values;

  static {
    // hack to force ProGuard to consider Date used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Date.class);
  }

  /**
   * The maximum number of elements is 100.
   * @return value or {@code null} for none
   */
  public java.util.List<Date> getValues() {
    return values;
  }

  /**
   * The maximum number of elements is 100.
   * @param values values or {@code null} for none
   */
  public DateValues setValues(java.util.List<Date> values) {
    this.values = values;
    return this;
  }

  @Override
  public DateValues set(String fieldName, Object value) {
    return (DateValues) super.set(fieldName, value);
  }

  @Override
  public DateValues clone() {
    return (DateValues) super.clone();
  }

}