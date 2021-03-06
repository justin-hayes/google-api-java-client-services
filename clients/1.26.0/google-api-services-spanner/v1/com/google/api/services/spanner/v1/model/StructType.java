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

package com.google.api.services.spanner.v1.model;

/**
 * `StructType` defines the fields of a STRUCT type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StructType extends com.google.api.client.json.GenericJson {

  /**
   * The list of fields that make up this struct. Order is significant, because values of this
   * struct type are represented as lists, where the order of field values matches the order of
   * fields in the StructType. In turn, the order of fields matches the order of columns in a read
   * request, or the order of fields in the `SELECT` clause of a query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Field> fields;

  /**
   * The list of fields that make up this struct. Order is significant, because values of this
   * struct type are represented as lists, where the order of field values matches the order of
   * fields in the StructType. In turn, the order of fields matches the order of columns in a read
   * request, or the order of fields in the `SELECT` clause of a query.
   * @return value or {@code null} for none
   */
  public java.util.List<Field> getFields() {
    return fields;
  }

  /**
   * The list of fields that make up this struct. Order is significant, because values of this
   * struct type are represented as lists, where the order of field values matches the order of
   * fields in the StructType. In turn, the order of fields matches the order of columns in a read
   * request, or the order of fields in the `SELECT` clause of a query.
   * @param fields fields or {@code null} for none
   */
  public StructType setFields(java.util.List<Field> fields) {
    this.fields = fields;
    return this;
  }

  @Override
  public StructType set(String fieldName, Object value) {
    return (StructType) super.set(fieldName, value);
  }

  @Override
  public StructType clone() {
    return (StructType) super.clone();
  }

}
