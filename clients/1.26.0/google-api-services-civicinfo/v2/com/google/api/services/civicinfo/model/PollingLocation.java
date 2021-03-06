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

package com.google.api.services.civicinfo.model;

/**
 * A location where a voter can vote. This may be an early vote site, an election day voting
 * location, or a drop off location for a completed ballot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PollingLocation extends com.google.api.client.json.GenericJson {

  /**
   * The address of the location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SimpleAddressType address;

  /**
   * The last date that this early vote site or drop off location may be used. This field is not
   * populated for polling locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * An ID for this object. IDs may change in future requests and should not be cached. Access to
   * this field requires special access that can be requested from the Request more link on the
   * Quotas page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Latitude of the location, in degrees north of the equator. Only some locations -- generally,
   * ballot drop boxes for vote-by-mail elections -- will have this set; for others, use a geocoding
   * service like the Google Maps API to resolve the address to a geographic point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double latitude;

  /**
   * Longitude of the location, in degrees east of the Prime Meridian. Only some locations --
   * generally, ballot drop boxes for vote-by-mail elections -- will have this set; for others, use
   * a geocoding service like the Google Maps API to resolve the address to a geographic point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double longitude;

  /**
   * The name of the early vote site or drop off location. This field is not populated for polling
   * locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Notes about this location (e.g. accessibility ramp or entrance to use).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notes;

  /**
   * A description of when this location is open.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pollingHours;

  /**
   * A list of sources for this location. If multiple sources are listed the data has been
   * aggregated from those sources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Source> sources;

  /**
   * The first date that this early vote site or drop off location may be used. This field is not
   * populated for polling locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * The services provided by this early vote site or drop off location. This field is not populated
   * for polling locations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String voterServices;

  /**
   * The address of the location.
   * @return value or {@code null} for none
   */
  public SimpleAddressType getAddress() {
    return address;
  }

  /**
   * The address of the location.
   * @param address address or {@code null} for none
   */
  public PollingLocation setAddress(SimpleAddressType address) {
    this.address = address;
    return this;
  }

  /**
   * The last date that this early vote site or drop off location may be used. This field is not
   * populated for polling locations.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * The last date that this early vote site or drop off location may be used. This field is not
   * populated for polling locations.
   * @param endDate endDate or {@code null} for none
   */
  public PollingLocation setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * An ID for this object. IDs may change in future requests and should not be cached. Access to
   * this field requires special access that can be requested from the Request more link on the
   * Quotas page.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * An ID for this object. IDs may change in future requests and should not be cached. Access to
   * this field requires special access that can be requested from the Request more link on the
   * Quotas page.
   * @param id id or {@code null} for none
   */
  public PollingLocation setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Latitude of the location, in degrees north of the equator. Only some locations -- generally,
   * ballot drop boxes for vote-by-mail elections -- will have this set; for others, use a geocoding
   * service like the Google Maps API to resolve the address to a geographic point.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * Latitude of the location, in degrees north of the equator. Only some locations -- generally,
   * ballot drop boxes for vote-by-mail elections -- will have this set; for others, use a geocoding
   * service like the Google Maps API to resolve the address to a geographic point.
   * @param latitude latitude or {@code null} for none
   */
  public PollingLocation setLatitude(java.lang.Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Longitude of the location, in degrees east of the Prime Meridian. Only some locations --
   * generally, ballot drop boxes for vote-by-mail elections -- will have this set; for others, use
   * a geocoding service like the Google Maps API to resolve the address to a geographic point.
   * @return value or {@code null} for none
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * Longitude of the location, in degrees east of the Prime Meridian. Only some locations --
   * generally, ballot drop boxes for vote-by-mail elections -- will have this set; for others, use
   * a geocoding service like the Google Maps API to resolve the address to a geographic point.
   * @param longitude longitude or {@code null} for none
   */
  public PollingLocation setLongitude(java.lang.Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * The name of the early vote site or drop off location. This field is not populated for polling
   * locations.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the early vote site or drop off location. This field is not populated for polling
   * locations.
   * @param name name or {@code null} for none
   */
  public PollingLocation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Notes about this location (e.g. accessibility ramp or entrance to use).
   * @return value or {@code null} for none
   */
  public java.lang.String getNotes() {
    return notes;
  }

  /**
   * Notes about this location (e.g. accessibility ramp or entrance to use).
   * @param notes notes or {@code null} for none
   */
  public PollingLocation setNotes(java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * A description of when this location is open.
   * @return value or {@code null} for none
   */
  public java.lang.String getPollingHours() {
    return pollingHours;
  }

  /**
   * A description of when this location is open.
   * @param pollingHours pollingHours or {@code null} for none
   */
  public PollingLocation setPollingHours(java.lang.String pollingHours) {
    this.pollingHours = pollingHours;
    return this;
  }

  /**
   * A list of sources for this location. If multiple sources are listed the data has been
   * aggregated from those sources.
   * @return value or {@code null} for none
   */
  public java.util.List<Source> getSources() {
    return sources;
  }

  /**
   * A list of sources for this location. If multiple sources are listed the data has been
   * aggregated from those sources.
   * @param sources sources or {@code null} for none
   */
  public PollingLocation setSources(java.util.List<Source> sources) {
    this.sources = sources;
    return this;
  }

  /**
   * The first date that this early vote site or drop off location may be used. This field is not
   * populated for polling locations.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * The first date that this early vote site or drop off location may be used. This field is not
   * populated for polling locations.
   * @param startDate startDate or {@code null} for none
   */
  public PollingLocation setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The services provided by this early vote site or drop off location. This field is not populated
   * for polling locations.
   * @return value or {@code null} for none
   */
  public java.lang.String getVoterServices() {
    return voterServices;
  }

  /**
   * The services provided by this early vote site or drop off location. This field is not populated
   * for polling locations.
   * @param voterServices voterServices or {@code null} for none
   */
  public PollingLocation setVoterServices(java.lang.String voterServices) {
    this.voterServices = voterServices;
    return this;
  }

  @Override
  public PollingLocation set(String fieldName, Object value) {
    return (PollingLocation) super.set(fieldName, value);
  }

  @Override
  public PollingLocation clone() {
    return (PollingLocation) super.clone();
  }

}
