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

package com.google.api.services.dataproc.model;

/**
 * The list of all clusters in a project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListClustersResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The clusters in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Cluster> clusters;

  static {
    // hack to force ProGuard to consider Cluster used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Cluster.class);
  }

  /**
   * Output only. This token is included in the response if there are more results to fetch. To
   * fetch additional results, provide this value as the page_token in a subsequent
   * ListClustersRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. The clusters in the project.
   * @return value or {@code null} for none
   */
  public java.util.List<Cluster> getClusters() {
    return clusters;
  }

  /**
   * Output only. The clusters in the project.
   * @param clusters clusters or {@code null} for none
   */
  public ListClustersResponse setClusters(java.util.List<Cluster> clusters) {
    this.clusters = clusters;
    return this;
  }

  /**
   * Output only. This token is included in the response if there are more results to fetch. To
   * fetch additional results, provide this value as the page_token in a subsequent
   * ListClustersRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. This token is included in the response if there are more results to fetch. To
   * fetch additional results, provide this value as the page_token in a subsequent
   * ListClustersRequest.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListClustersResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListClustersResponse set(String fieldName, Object value) {
    return (ListClustersResponse) super.set(fieldName, value);
  }

  @Override
  public ListClustersResponse clone() {
    return (ListClustersResponse) super.clone();
  }

}
