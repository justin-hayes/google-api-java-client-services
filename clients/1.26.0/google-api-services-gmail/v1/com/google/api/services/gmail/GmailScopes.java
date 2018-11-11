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

package com.google.api.services.gmail;

/**
 * Available OAuth 2.0 scopes for use with the Gmail API.
 *
 * @since 1.4
 */
public class GmailScopes {

  /** Read, compose, send, and permanently delete all your email from Gmail. */
  public static final String MAIL_GOOGLE_COM = "https://mail.google.com/";

  /** Manage drafts and send emails. */
  public static final String GMAIL_COMPOSE = "https://www.googleapis.com/auth/gmail.compose";

  /** Insert mail into your mailbox. */
  public static final String GMAIL_INSERT = "https://www.googleapis.com/auth/gmail.insert";

  /** Manage mailbox labels. */
  public static final String GMAIL_LABELS = "https://www.googleapis.com/auth/gmail.labels";

  /** View your email message metadata such as labels and headers, but not the email body. */
  public static final String GMAIL_METADATA = "https://www.googleapis.com/auth/gmail.metadata";

  /** View and modify but not delete your email. */
  public static final String GMAIL_MODIFY = "https://www.googleapis.com/auth/gmail.modify";

  /** View your email messages and settings. */
  public static final String GMAIL_READONLY = "https://www.googleapis.com/auth/gmail.readonly";

  /** Send email on your behalf. */
  public static final String GMAIL_SEND = "https://www.googleapis.com/auth/gmail.send";

  /** Manage your basic mail settings. */
  public static final String GMAIL_SETTINGS_BASIC = "https://www.googleapis.com/auth/gmail.settings.basic";

  /** Manage your sensitive mail settings, including who can manage your mail. */
  public static final String GMAIL_SETTINGS_SHARING = "https://www.googleapis.com/auth/gmail.settings.sharing";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(MAIL_GOOGLE_COM);
    set.add(GMAIL_COMPOSE);
    set.add(GMAIL_INSERT);
    set.add(GMAIL_LABELS);
    set.add(GMAIL_METADATA);
    set.add(GMAIL_MODIFY);
    set.add(GMAIL_READONLY);
    set.add(GMAIL_SEND);
    set.add(GMAIL_SETTINGS_BASIC);
    set.add(GMAIL_SETTINGS_SHARING);
    return java.util.Collections.unmodifiableSet(set);
  }

  private GmailScopes() {
  }
}
