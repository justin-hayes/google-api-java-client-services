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

package com.google.api.services.language.v1.model;

/**
 * Represents a phrase in the text that is a known entity, such as a person, an organization, or
 * location. The API associates information, such as salience and mentions, with entities.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Entity extends com.google.api.client.json.GenericJson {

  /**
   * The mentions of this entity in the input document. The API currently supports proper noun
   * mentions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntityMention> mentions;

  /**
   * Metadata associated with the entity.
   *
   * Currently, Wikipedia URLs and Knowledge Graph MIDs are provided, if available. The associated
   * keys are "wikipedia_url" and "mid", respectively.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * The representative name for the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The salience score associated with the entity in the [0, 1.0] range.
   *
   * The salience score for an entity provides information about the importance or centrality of
   * that entity to the entire document text. Scores closer to 0 are less salient, while scores
   * closer to 1.0 are highly salient.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float salience;

  /**
   * For calls to AnalyzeEntitySentiment or if AnnotateTextRequest.Features.extract_entity_sentiment
   * is set to true, this field will contain the aggregate sentiment expressed for this entity in
   * the provided document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Sentiment sentiment;

  /**
   * The entity type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The mentions of this entity in the input document. The API currently supports proper noun
   * mentions.
   * @return value or {@code null} for none
   */
  public java.util.List<EntityMention> getMentions() {
    return mentions;
  }

  /**
   * The mentions of this entity in the input document. The API currently supports proper noun
   * mentions.
   * @param mentions mentions or {@code null} for none
   */
  public Entity setMentions(java.util.List<EntityMention> mentions) {
    this.mentions = mentions;
    return this;
  }

  /**
   * Metadata associated with the entity.
   *
   * Currently, Wikipedia URLs and Knowledge Graph MIDs are provided, if available. The associated
   * keys are "wikipedia_url" and "mid", respectively.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Metadata associated with the entity.
   *
   * Currently, Wikipedia URLs and Knowledge Graph MIDs are provided, if available. The associated
   * keys are "wikipedia_url" and "mid", respectively.
   * @param metadata metadata or {@code null} for none
   */
  public Entity setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The representative name for the entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The representative name for the entity.
   * @param name name or {@code null} for none
   */
  public Entity setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The salience score associated with the entity in the [0, 1.0] range.
   *
   * The salience score for an entity provides information about the importance or centrality of
   * that entity to the entire document text. Scores closer to 0 are less salient, while scores
   * closer to 1.0 are highly salient.
   * @return value or {@code null} for none
   */
  public java.lang.Float getSalience() {
    return salience;
  }

  /**
   * The salience score associated with the entity in the [0, 1.0] range.
   *
   * The salience score for an entity provides information about the importance or centrality of
   * that entity to the entire document text. Scores closer to 0 are less salient, while scores
   * closer to 1.0 are highly salient.
   * @param salience salience or {@code null} for none
   */
  public Entity setSalience(java.lang.Float salience) {
    this.salience = salience;
    return this;
  }

  /**
   * For calls to AnalyzeEntitySentiment or if AnnotateTextRequest.Features.extract_entity_sentiment
   * is set to true, this field will contain the aggregate sentiment expressed for this entity in
   * the provided document.
   * @return value or {@code null} for none
   */
  public Sentiment getSentiment() {
    return sentiment;
  }

  /**
   * For calls to AnalyzeEntitySentiment or if AnnotateTextRequest.Features.extract_entity_sentiment
   * is set to true, this field will contain the aggregate sentiment expressed for this entity in
   * the provided document.
   * @param sentiment sentiment or {@code null} for none
   */
  public Entity setSentiment(Sentiment sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  /**
   * The entity type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The entity type.
   * @param type type or {@code null} for none
   */
  public Entity setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Entity set(String fieldName, Object value) {
    return (Entity) super.set(fieldName, value);
  }

  @Override
  public Entity clone() {
    return (Entity) super.clone();
  }

}
