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

package com.google.videointelligence.v1p1beta1.model;

/**
 * Config for SPEECH_TRANSCRIPTION.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig extends com.google.api.client.json.GenericJson {

  /**
   * *Optional* For file formats, such as MXF or MKV, supporting multiple audio tracks, specify up
   * to two tracks. Default: track 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> audioTracks;

  /**
   * *Optional* If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. NOTE: "This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature."
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAutomaticPunctuation;

  /**
   * *Optional* If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean filterProfanity;

  /**
   * *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language
   * Support](https://cloud.google.com/speech/docs/languages) for a list of the currently supported
   * language codes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * *Optional* Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechRecognitionResult`. The
   * server may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or
   * `1` will return a maximum of one. If omitted, will return a maximum of one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxAlternatives;

  /**
   * *Optional* A means to provide context to assist the speech recognition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1SpeechContext> speechContexts;

  /**
   * *Optional* For file formats, such as MXF or MKV, supporting multiple audio tracks, specify up
   * to two tracks. Default: track 0.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getAudioTracks() {
    return audioTracks;
  }

  /**
   * *Optional* For file formats, such as MXF or MKV, supporting multiple audio tracks, specify up
   * to two tracks. Default: track 0.
   * @param audioTracks audioTracks or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig setAudioTracks(java.util.List<java.lang.Integer> audioTracks) {
    this.audioTracks = audioTracks;
    return this;
  }

  /**
   * *Optional* If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. NOTE: "This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature."
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAutomaticPunctuation() {
    return enableAutomaticPunctuation;
  }

  /**
   * *Optional* If 'true', adds punctuation to recognition result hypotheses. This feature is only
   * available in select languages. Setting this for requests in other languages has no effect at
   * all. The default 'false' value does not add punctuation to result hypotheses. NOTE: "This is
   * currently offered as an experimental service, complimentary to all users. In the future this
   * may be exclusively available as a premium feature."
   * @param enableAutomaticPunctuation enableAutomaticPunctuation or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig setEnableAutomaticPunctuation(java.lang.Boolean enableAutomaticPunctuation) {
    this.enableAutomaticPunctuation = enableAutomaticPunctuation;
    return this;
  }

  /**
   * *Optional* If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFilterProfanity() {
    return filterProfanity;
  }

  /**
   * *Optional* If set to `true`, the server will attempt to filter out profanities, replacing all
   * but the initial character in each filtered word with asterisks, e.g. "f***". If set to `false`
   * or omitted, profanities won't be filtered out.
   * @param filterProfanity filterProfanity or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig setFilterProfanity(java.lang.Boolean filterProfanity) {
    this.filterProfanity = filterProfanity;
    return this;
  }

  /**
   * *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language
   * Support](https://cloud.google.com/speech/docs/languages) for a list of the currently supported
   * language codes.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * *Required* The language of the supplied audio as a [BCP-47](https://www.rfc-
   * editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US". See [Language
   * Support](https://cloud.google.com/speech/docs/languages) for a list of the currently supported
   * language codes.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * *Optional* Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechRecognitionResult`. The
   * server may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or
   * `1` will return a maximum of one. If omitted, will return a maximum of one.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxAlternatives() {
    return maxAlternatives;
  }

  /**
   * *Optional* Maximum number of recognition hypotheses to be returned. Specifically, the maximum
   * number of `SpeechRecognitionAlternative` messages within each `SpeechRecognitionResult`. The
   * server may return fewer than `max_alternatives`. Valid values are `0`-`30`. A value of `0` or
   * `1` will return a maximum of one. If omitted, will return a maximum of one.
   * @param maxAlternatives maxAlternatives or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig setMaxAlternatives(java.lang.Integer maxAlternatives) {
    this.maxAlternatives = maxAlternatives;
    return this;
  }

  /**
   * *Optional* A means to provide context to assist the speech recognition.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1SpeechContext> getSpeechContexts() {
    return speechContexts;
  }

  /**
   * *Optional* A means to provide context to assist the speech recognition.
   * @param speechContexts speechContexts or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig setSpeechContexts(java.util.List<GoogleCloudVideointelligenceV1p1beta1SpeechContext> speechContexts) {
    this.speechContexts = speechContexts;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig clone() {
    return (GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig) super.clone();
  }

}