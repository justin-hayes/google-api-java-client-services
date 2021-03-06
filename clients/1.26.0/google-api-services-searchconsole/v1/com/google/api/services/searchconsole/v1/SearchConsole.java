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

package com.google.api.services.searchconsole.v1;

/**
 * Service definition for SearchConsole (v1).
 *
 * <p>
 * Provides tools for running validation tests against single URLs
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/webmaster-tools/search-console-api/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link SearchConsoleRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class SearchConsole extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.26.0 of the Google Search Console URL Testing Tools API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://searchconsole.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public SearchConsole(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  SearchConsole(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the UrlTestingTools collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code SearchConsole searchconsole = new SearchConsole(...);}
   *   {@code SearchConsole.UrlTestingTools.List request = searchconsole.urlTestingTools().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public UrlTestingTools urlTestingTools() {
    return new UrlTestingTools();
  }

  /**
   * The "urlTestingTools" collection of methods.
   */
  public class UrlTestingTools {

    /**
     * An accessor for creating requests from the MobileFriendlyTest collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code SearchConsole searchconsole = new SearchConsole(...);}
     *   {@code SearchConsole.MobileFriendlyTest.List request = searchconsole.mobileFriendlyTest().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public MobileFriendlyTest mobileFriendlyTest() {
      return new MobileFriendlyTest();
    }

    /**
     * The "mobileFriendlyTest" collection of methods.
     */
    public class MobileFriendlyTest {

      /**
       * Runs Mobile-Friendly Test for a given URL.
       *
       * Create a request for the method "mobileFriendlyTest.run".
       *
       * This request holds the parameters needed by the searchconsole server.  After setting any optional
       * parameters, call the {@link Run#execute()} method to invoke the remote operation.
       *
       * @param content the {@link com.google.api.services.searchconsole.v1.model.RunMobileFriendlyTestRequest}
       * @return the request
       */
      public Run run(com.google.api.services.searchconsole.v1.model.RunMobileFriendlyTestRequest content) throws java.io.IOException {
        Run result = new Run(content);
        initialize(result);
        return result;
      }

      public class Run extends SearchConsoleRequest<com.google.api.services.searchconsole.v1.model.RunMobileFriendlyTestResponse> {

        private static final String REST_PATH = "v1/urlTestingTools/mobileFriendlyTest:run";

        /**
         * Runs Mobile-Friendly Test for a given URL.
         *
         * Create a request for the method "mobileFriendlyTest.run".
         *
         * This request holds the parameters needed by the the searchconsole server.  After setting any
         * optional parameters, call the {@link Run#execute()} method to invoke the remote operation. <p>
         * {@link Run#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.google.api.services.searchconsole.v1.model.RunMobileFriendlyTestRequest}
         * @since 1.13
         */
        protected Run(com.google.api.services.searchconsole.v1.model.RunMobileFriendlyTestRequest content) {
          super(SearchConsole.this, "POST", REST_PATH, content, com.google.api.services.searchconsole.v1.model.RunMobileFriendlyTestResponse.class);
        }

        @Override
        public Run set$Xgafv(java.lang.String $Xgafv) {
          return (Run) super.set$Xgafv($Xgafv);
        }

        @Override
        public Run setAccessToken(java.lang.String accessToken) {
          return (Run) super.setAccessToken(accessToken);
        }

        @Override
        public Run setAlt(java.lang.String alt) {
          return (Run) super.setAlt(alt);
        }

        @Override
        public Run setCallback(java.lang.String callback) {
          return (Run) super.setCallback(callback);
        }

        @Override
        public Run setFields(java.lang.String fields) {
          return (Run) super.setFields(fields);
        }

        @Override
        public Run setKey(java.lang.String key) {
          return (Run) super.setKey(key);
        }

        @Override
        public Run setOauthToken(java.lang.String oauthToken) {
          return (Run) super.setOauthToken(oauthToken);
        }

        @Override
        public Run setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Run) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Run setQuotaUser(java.lang.String quotaUser) {
          return (Run) super.setQuotaUser(quotaUser);
        }

        @Override
        public Run setUploadType(java.lang.String uploadType) {
          return (Run) super.setUploadType(uploadType);
        }

        @Override
        public Run setUploadProtocol(java.lang.String uploadProtocol) {
          return (Run) super.setUploadProtocol(uploadProtocol);
        }

        @Override
        public Run set(String parameterName, Object value) {
          return (Run) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link SearchConsole}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link SearchConsole}. */
    @Override
    public SearchConsole build() {
      return new SearchConsole(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link SearchConsoleRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setSearchConsoleRequestInitializer(
        SearchConsoleRequestInitializer searchconsoleRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(searchconsoleRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
