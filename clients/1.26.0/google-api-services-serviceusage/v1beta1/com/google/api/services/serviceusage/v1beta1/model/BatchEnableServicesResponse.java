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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * Response message for the `BatchEnableServices` method. This response message is assigned to the
 * `response` field of the returned Operation when that operation is done.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchEnableServicesResponse extends com.google.api.client.json.GenericJson {

  /**
   * If allow_partial_success is true, and one or more services could not be enabled, this field
   * contains the details about each failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnableFailure> failures;

  static {
    // hack to force ProGuard to consider EnableFailure used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EnableFailure.class);
  }

  /**
   * The new state of the services after enabling.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleApiServiceusageV1Service> services;

  static {
    // hack to force ProGuard to consider GoogleApiServiceusageV1Service used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleApiServiceusageV1Service.class);
  }

  /**
   * If allow_partial_success is true, and one or more services could not be enabled, this field
   * contains the details about each failure.
   * @return value or {@code null} for none
   */
  public java.util.List<EnableFailure> getFailures() {
    return failures;
  }

  /**
   * If allow_partial_success is true, and one or more services could not be enabled, this field
   * contains the details about each failure.
   * @param failures failures or {@code null} for none
   */
  public BatchEnableServicesResponse setFailures(java.util.List<EnableFailure> failures) {
    this.failures = failures;
    return this;
  }

  /**
   * The new state of the services after enabling.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleApiServiceusageV1Service> getServices() {
    return services;
  }

  /**
   * The new state of the services after enabling.
   * @param services services or {@code null} for none
   */
  public BatchEnableServicesResponse setServices(java.util.List<GoogleApiServiceusageV1Service> services) {
    this.services = services;
    return this;
  }

  @Override
  public BatchEnableServicesResponse set(String fieldName, Object value) {
    return (BatchEnableServicesResponse) super.set(fieldName, value);
  }

  @Override
  public BatchEnableServicesResponse clone() {
    return (BatchEnableServicesResponse) super.clone();
  }

}
