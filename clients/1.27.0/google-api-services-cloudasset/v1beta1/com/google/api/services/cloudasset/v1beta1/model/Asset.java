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

package com.google.api.services.cloudasset.v1beta1.model;

/**
 * Cloud asset. This includes all Google Cloud Platform resources, Cloud IAM policies, and other
 * non-GCP assets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Asset extends com.google.api.client.json.GenericJson {

  /**
   * Type of the asset. Example: "google.compute.disk".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assetType;

  /**
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each resource, there
   * must be at most one Cloud IAM policy set on it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Policy iamPolicy;

  /**
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Representation of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resource resource;

  /**
   * Type of the asset. Example: "google.compute.disk".
   * @return value or {@code null} for none
   */
  public java.lang.String getAssetType() {
    return assetType;
  }

  /**
   * Type of the asset. Example: "google.compute.disk".
   * @param assetType assetType or {@code null} for none
   */
  public Asset setAssetType(java.lang.String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each resource, there
   * must be at most one Cloud IAM policy set on it.
   * @return value or {@code null} for none
   */
  public Policy getIamPolicy() {
    return iamPolicy;
  }

  /**
   * Representation of the actual Cloud IAM policy set on a cloud resource. For each resource, there
   * must be at most one Cloud IAM policy set on it.
   * @param iamPolicy iamPolicy or {@code null} for none
   */
  public Asset setIamPolicy(Policy iamPolicy) {
    this.iamPolicy = iamPolicy;
    return this;
  }

  /**
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The full name of the asset. For example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`. See
   * [Resource Names](https://cloud.google.com/apis/design/resource_names#full_resource_name) for
   * more information.
   * @param name name or {@code null} for none
   */
  public Asset setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Representation of the resource.
   * @return value or {@code null} for none
   */
  public Resource getResource() {
    return resource;
  }

  /**
   * Representation of the resource.
   * @param resource resource or {@code null} for none
   */
  public Asset setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public Asset set(String fieldName, Object value) {
    return (Asset) super.set(fieldName, value);
  }

  @Override
  public Asset clone() {
    return (Asset) super.clone();
  }

}
