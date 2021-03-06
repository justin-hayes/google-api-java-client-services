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

package com.google.api.services.sheets.v4.model;

/**
 * Allows you to manually organize the values in a source data column into buckets with names of
 * your choosing. For example, a pivot table that aggregates population by state:
 *
 *     +-------+-------------------+     | State | SUM of Population |
 * +-------+-------------------+     | AK    |               0.7 |     | AL    |               4.8 |
 * | AR    |               2.9 |     ...     +-------+-------------------+ could be turned into a
 * pivot table that aggregates population by time zone by providing a list of groups (for example,
 * groupName = 'Central', items = ['AL', 'AR', 'IA', ...]) to a manual group rule. Note that a
 * similar effect could be achieved by adding a time zone column to the source data and adjusting
 * the pivot table.
 *
 *     +-----------+-------------------+     | Time Zone | SUM of Population |
 * +-----------+-------------------+     | Central   |             106.3 |     | Eastern   |
 * 151.9 |     | Mountain  |              17.4 |     ...     +-----------+-------------------+
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManualRule extends com.google.api.client.json.GenericJson {

  /**
   * The list of group names and the corresponding items from the source data that map to each group
   * name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ManualRuleGroup> groups;

  static {
    // hack to force ProGuard to consider ManualRuleGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ManualRuleGroup.class);
  }

  /**
   * The list of group names and the corresponding items from the source data that map to each group
   * name.
   * @return value or {@code null} for none
   */
  public java.util.List<ManualRuleGroup> getGroups() {
    return groups;
  }

  /**
   * The list of group names and the corresponding items from the source data that map to each group
   * name.
   * @param groups groups or {@code null} for none
   */
  public ManualRule setGroups(java.util.List<ManualRuleGroup> groups) {
    this.groups = groups;
    return this;
  }

  @Override
  public ManualRule set(String fieldName, Object value) {
    return (ManualRule) super.set(fieldName, value);
  }

  @Override
  public ManualRule clone() {
    return (ManualRule) super.clone();
  }

}
