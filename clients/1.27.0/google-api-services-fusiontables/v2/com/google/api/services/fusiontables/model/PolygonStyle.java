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
 * Represents a PolygonStyle within a StyleSetting
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PolygonStyle extends com.google.api.client.json.GenericJson {

  /**
   * Color of the interior of the polygon in #RRGGBB format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fillColor;

  /**
   * Column-value, gradient, or bucket styler that is used to determine the interior color and
   * opacity of the polygon.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StyleFunction fillColorStyler;

  /**
   * Opacity of the interior of the polygon: 0.0 (transparent) to 1.0 (opaque).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double fillOpacity;

  /**
   * Color of the polygon border in #RRGGBB format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String strokeColor;

  /**
   * Column-value, gradient or buckets styler that is used to determine the border color and
   * opacity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StyleFunction strokeColorStyler;

  /**
   * Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double strokeOpacity;

  /**
   * Width of the polyon border in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer strokeWeight;

  /**
   * Column-value or bucket styler that is used to determine the width of the polygon border.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StyleFunction strokeWeightStyler;

  /**
   * Color of the interior of the polygon in #RRGGBB format.
   * @return value or {@code null} for none
   */
  public java.lang.String getFillColor() {
    return fillColor;
  }

  /**
   * Color of the interior of the polygon in #RRGGBB format.
   * @param fillColor fillColor or {@code null} for none
   */
  public PolygonStyle setFillColor(java.lang.String fillColor) {
    this.fillColor = fillColor;
    return this;
  }

  /**
   * Column-value, gradient, or bucket styler that is used to determine the interior color and
   * opacity of the polygon.
   * @return value or {@code null} for none
   */
  public StyleFunction getFillColorStyler() {
    return fillColorStyler;
  }

  /**
   * Column-value, gradient, or bucket styler that is used to determine the interior color and
   * opacity of the polygon.
   * @param fillColorStyler fillColorStyler or {@code null} for none
   */
  public PolygonStyle setFillColorStyler(StyleFunction fillColorStyler) {
    this.fillColorStyler = fillColorStyler;
    return this;
  }

  /**
   * Opacity of the interior of the polygon: 0.0 (transparent) to 1.0 (opaque).
   * @return value or {@code null} for none
   */
  public java.lang.Double getFillOpacity() {
    return fillOpacity;
  }

  /**
   * Opacity of the interior of the polygon: 0.0 (transparent) to 1.0 (opaque).
   * @param fillOpacity fillOpacity or {@code null} for none
   */
  public PolygonStyle setFillOpacity(java.lang.Double fillOpacity) {
    this.fillOpacity = fillOpacity;
    return this;
  }

  /**
   * Color of the polygon border in #RRGGBB format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStrokeColor() {
    return strokeColor;
  }

  /**
   * Color of the polygon border in #RRGGBB format.
   * @param strokeColor strokeColor or {@code null} for none
   */
  public PolygonStyle setStrokeColor(java.lang.String strokeColor) {
    this.strokeColor = strokeColor;
    return this;
  }

  /**
   * Column-value, gradient or buckets styler that is used to determine the border color and
   * opacity.
   * @return value or {@code null} for none
   */
  public StyleFunction getStrokeColorStyler() {
    return strokeColorStyler;
  }

  /**
   * Column-value, gradient or buckets styler that is used to determine the border color and
   * opacity.
   * @param strokeColorStyler strokeColorStyler or {@code null} for none
   */
  public PolygonStyle setStrokeColorStyler(StyleFunction strokeColorStyler) {
    this.strokeColorStyler = strokeColorStyler;
    return this;
  }

  /**
   * Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque).
   * @return value or {@code null} for none
   */
  public java.lang.Double getStrokeOpacity() {
    return strokeOpacity;
  }

  /**
   * Opacity of the polygon border: 0.0 (transparent) to 1.0 (opaque).
   * @param strokeOpacity strokeOpacity or {@code null} for none
   */
  public PolygonStyle setStrokeOpacity(java.lang.Double strokeOpacity) {
    this.strokeOpacity = strokeOpacity;
    return this;
  }

  /**
   * Width of the polyon border in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStrokeWeight() {
    return strokeWeight;
  }

  /**
   * Width of the polyon border in pixels.
   * @param strokeWeight strokeWeight or {@code null} for none
   */
  public PolygonStyle setStrokeWeight(java.lang.Integer strokeWeight) {
    this.strokeWeight = strokeWeight;
    return this;
  }

  /**
   * Column-value or bucket styler that is used to determine the width of the polygon border.
   * @return value or {@code null} for none
   */
  public StyleFunction getStrokeWeightStyler() {
    return strokeWeightStyler;
  }

  /**
   * Column-value or bucket styler that is used to determine the width of the polygon border.
   * @param strokeWeightStyler strokeWeightStyler or {@code null} for none
   */
  public PolygonStyle setStrokeWeightStyler(StyleFunction strokeWeightStyler) {
    this.strokeWeightStyler = strokeWeightStyler;
    return this;
  }

  @Override
  public PolygonStyle set(String fieldName, Object value) {
    return (PolygonStyle) super.set(fieldName, value);
  }

  @Override
  public PolygonStyle clone() {
    return (PolygonStyle) super.clone();
  }

}
