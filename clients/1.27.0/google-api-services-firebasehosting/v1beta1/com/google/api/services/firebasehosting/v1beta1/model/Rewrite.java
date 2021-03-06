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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * A `Rewrite` represents an internal content rewrite on the version. If the pattern matches, the
 * request will be handled as if it were to the destination path specified in the configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Rewrite extends com.google.api.client.json.GenericJson {

  /**
   * The request will be forwarded to Firebase Dynamic Links.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dynamicLinks;

  /**
   * The function to proxy requests to. Must match the exported function name exactly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String function;

  /**
   * Required. The user-supplied [glob pattern](/docs/hosting/full-config#section-glob) to match
   * against the request URL path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String glob;

  /**
   * The URL path to rewrite the request to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The request will be forwarded to Firebase Dynamic Links.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDynamicLinks() {
    return dynamicLinks;
  }

  /**
   * The request will be forwarded to Firebase Dynamic Links.
   * @param dynamicLinks dynamicLinks or {@code null} for none
   */
  public Rewrite setDynamicLinks(java.lang.Boolean dynamicLinks) {
    this.dynamicLinks = dynamicLinks;
    return this;
  }

  /**
   * The function to proxy requests to. Must match the exported function name exactly.
   * @return value or {@code null} for none
   */
  public java.lang.String getFunction() {
    return function;
  }

  /**
   * The function to proxy requests to. Must match the exported function name exactly.
   * @param function function or {@code null} for none
   */
  public Rewrite setFunction(java.lang.String function) {
    this.function = function;
    return this;
  }

  /**
   * Required. The user-supplied [glob pattern](/docs/hosting/full-config#section-glob) to match
   * against the request URL path.
   * @return value or {@code null} for none
   */
  public java.lang.String getGlob() {
    return glob;
  }

  /**
   * Required. The user-supplied [glob pattern](/docs/hosting/full-config#section-glob) to match
   * against the request URL path.
   * @param glob glob or {@code null} for none
   */
  public Rewrite setGlob(java.lang.String glob) {
    this.glob = glob;
    return this;
  }

  /**
   * The URL path to rewrite the request to.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The URL path to rewrite the request to.
   * @param path path or {@code null} for none
   */
  public Rewrite setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public Rewrite set(String fieldName, Object value) {
    return (Rewrite) super.set(fieldName, value);
  }

  @Override
  public Rewrite clone() {
    return (Rewrite) super.clone();
  }

}
