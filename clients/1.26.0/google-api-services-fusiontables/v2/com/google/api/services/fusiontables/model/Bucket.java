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

package com.google.api.services.fusiontables.model;

/**
 * Specifies the minimum and maximum values, the color, opacity, icon and weight of a bucket within
 * a StyleSetting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Bucket extends com.google.api.client.json.GenericJson {

  /**
   * Color of line or the interior of a polygon in #RRGGBB format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String color;

  /**
   * Icon name used for a point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String icon;

  /**
   * Maximum value in the selected column for a row to be styled according to the bucket color,
   * opacity, icon, or weight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double max;

  /**
   * Minimum value in the selected column for a row to be styled according to the bucket color,
   * opacity, icon, or weight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double min;

  /**
   * Opacity of the color: 0.0 (transparent) to 1.0 (opaque).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double opacity;

  /**
   * Width of a line (in pixels).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer weight;

  /**
   * Color of line or the interior of a polygon in #RRGGBB format.
   * @return value or {@code null} for none
   */
  public java.lang.String getColor() {
    return color;
  }

  /**
   * Color of line or the interior of a polygon in #RRGGBB format.
   * @param color color or {@code null} for none
   */
  public Bucket setColor(java.lang.String color) {
    this.color = color;
    return this;
  }

  /**
   * Icon name used for a point.
   * @return value or {@code null} for none
   */
  public java.lang.String getIcon() {
    return icon;
  }

  /**
   * Icon name used for a point.
   * @param icon icon or {@code null} for none
   */
  public Bucket setIcon(java.lang.String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Maximum value in the selected column for a row to be styled according to the bucket color,
   * opacity, icon, or weight.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMax() {
    return max;
  }

  /**
   * Maximum value in the selected column for a row to be styled according to the bucket color,
   * opacity, icon, or weight.
   * @param max max or {@code null} for none
   */
  public Bucket setMax(java.lang.Double max) {
    this.max = max;
    return this;
  }

  /**
   * Minimum value in the selected column for a row to be styled according to the bucket color,
   * opacity, icon, or weight.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMin() {
    return min;
  }

  /**
   * Minimum value in the selected column for a row to be styled according to the bucket color,
   * opacity, icon, or weight.
   * @param min min or {@code null} for none
   */
  public Bucket setMin(java.lang.Double min) {
    this.min = min;
    return this;
  }

  /**
   * Opacity of the color: 0.0 (transparent) to 1.0 (opaque).
   * @return value or {@code null} for none
   */
  public java.lang.Double getOpacity() {
    return opacity;
  }

  /**
   * Opacity of the color: 0.0 (transparent) to 1.0 (opaque).
   * @param opacity opacity or {@code null} for none
   */
  public Bucket setOpacity(java.lang.Double opacity) {
    this.opacity = opacity;
    return this;
  }

  /**
   * Width of a line (in pixels).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWeight() {
    return weight;
  }

  /**
   * Width of a line (in pixels).
   * @param weight weight or {@code null} for none
   */
  public Bucket setWeight(java.lang.Integer weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public Bucket set(String fieldName, Object value) {
    return (Bucket) super.set(fieldName, value);
  }

  @Override
  public Bucket clone() {
    return (Bucket) super.clone();
  }

}
