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

package com.google.dialogflow.v2beta1.model;

/**
 * Represents a phone number order. Orders can assign phone numbers to projects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2beta1PhoneNumberOrder extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time this order was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A description of the order, limit is 1024 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. The current status of the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lifecycleState;

  /**
   * Required. The unique identifier of this order. Format: `projects//phoneNumberOrders/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Order is for new numbers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2beta1PhoneNumberSpec phoneNumberSpec;

  /**
   * Output only. A map of ordered numbers filled so far, keyed by their resource name. Key format:
   * `projects//phoneNumbers/`. Value format: E.164 phone number. Output only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> phoneNumbers;

  /**
   * Output only. The time this order was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time this order was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time this order was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A description of the order, limit is 1024 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description of the order, limit is 1024 bytes.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. The current status of the order.
   * @return value or {@code null} for none
   */
  public java.lang.String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Output only. The current status of the order.
   * @param lifecycleState lifecycleState or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder setLifecycleState(java.lang.String lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
  }

  /**
   * Required. The unique identifier of this order. Format: `projects//phoneNumberOrders/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The unique identifier of this order. Format: `projects//phoneNumberOrders/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Order is for new numbers.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberSpec getPhoneNumberSpec() {
    return phoneNumberSpec;
  }

  /**
   * Order is for new numbers.
   * @param phoneNumberSpec phoneNumberSpec or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder setPhoneNumberSpec(GoogleCloudDialogflowV2beta1PhoneNumberSpec phoneNumberSpec) {
    this.phoneNumberSpec = phoneNumberSpec;
    return this;
  }

  /**
   * Output only. A map of ordered numbers filled so far, keyed by their resource name. Key format:
   * `projects//phoneNumbers/`. Value format: E.164 phone number. Output only.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getPhoneNumbers() {
    return phoneNumbers;
  }

  /**
   * Output only. A map of ordered numbers filled so far, keyed by their resource name. Key format:
   * `projects//phoneNumbers/`. Value format: E.164 phone number. Output only.
   * @param phoneNumbers phoneNumbers or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder setPhoneNumbers(java.util.Map<String, java.lang.String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  /**
   * Output only. The time this order was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time this order was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2beta1PhoneNumberOrder) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2beta1PhoneNumberOrder clone() {
    return (GoogleCloudDialogflowV2beta1PhoneNumberOrder) super.clone();
  }

}