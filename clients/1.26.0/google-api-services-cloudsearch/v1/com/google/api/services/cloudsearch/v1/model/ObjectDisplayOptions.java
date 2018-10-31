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
 * The display options for an object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObjectDisplayOptions extends com.google.api.client.json.GenericJson {

  /**
   * Defines the properties that will be displayed in the metalines of the search results. The
   * property values will be displayed in the order given here. If a property holds multiple values,
   * all of the values will be diplayed before the next properties. For this reason, it is a good
   * practice to specify singular properties before repeated properties in this list. All of the
   * properties must set is_returnable to true. The maximum number of elements is 3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metaline> metalines;

  /**
   * The user friendly label to display in the search result to inidicate the type of the item. This
   * is OPTIONAL; if not given, an object label will not be displayed on the context line of the
   * search results. The maximum length is 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String objectDisplayLabel;

  /**
   * Defines the properties that will be displayed in the metalines of the search results. The
   * property values will be displayed in the order given here. If a property holds multiple values,
   * all of the values will be diplayed before the next properties. For this reason, it is a good
   * practice to specify singular properties before repeated properties in this list. All of the
   * properties must set is_returnable to true. The maximum number of elements is 3.
   * @return value or {@code null} for none
   */
  public java.util.List<Metaline> getMetalines() {
    return metalines;
  }

  /**
   * Defines the properties that will be displayed in the metalines of the search results. The
   * property values will be displayed in the order given here. If a property holds multiple values,
   * all of the values will be diplayed before the next properties. For this reason, it is a good
   * practice to specify singular properties before repeated properties in this list. All of the
   * properties must set is_returnable to true. The maximum number of elements is 3.
   * @param metalines metalines or {@code null} for none
   */
  public ObjectDisplayOptions setMetalines(java.util.List<Metaline> metalines) {
    this.metalines = metalines;
    return this;
  }

  /**
   * The user friendly label to display in the search result to inidicate the type of the item. This
   * is OPTIONAL; if not given, an object label will not be displayed on the context line of the
   * search results. The maximum length is 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getObjectDisplayLabel() {
    return objectDisplayLabel;
  }

  /**
   * The user friendly label to display in the search result to inidicate the type of the item. This
   * is OPTIONAL; if not given, an object label will not be displayed on the context line of the
   * search results. The maximum length is 32 characters.
   * @param objectDisplayLabel objectDisplayLabel or {@code null} for none
   */
  public ObjectDisplayOptions setObjectDisplayLabel(java.lang.String objectDisplayLabel) {
    this.objectDisplayLabel = objectDisplayLabel;
    return this;
  }

  @Override
  public ObjectDisplayOptions set(String fieldName, Object value) {
    return (ObjectDisplayOptions) super.set(fieldName, value);
  }

  @Override
  public ObjectDisplayOptions clone() {
    return (ObjectDisplayOptions) super.clone();
  }

}