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

package com.google.servicenetworking.v1beta;

/**
 * Service definition for ServiceNetworking (v1beta).
 *
 * <p>
 * The Service Networking API provides automatic management of network configurations necessary for certain services.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/service-infrastructure/docs/service-networking/reference/rest/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ServiceNetworkingRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ServiceNetworking extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.26.0-SNAPSHOT of the Service Networking API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://servicenetworking.googleapis.com/";

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
  public ServiceNetworking(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  ServiceNetworking(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Operations collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code ServiceNetworking servicenetworking = new ServiceNetworking(...);}
   *   {@code ServiceNetworking.Operations.List request = servicenetworking.operations().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Operations operations() {
    return new Operations();
  }

  /**
   * The "operations" collection of methods.
   */
  public class Operations {

    /**
     * Gets the latest state of a long-running operation.  Clients can use this method to poll the
     * operation result at intervals as recommended by the API service.
     *
     * Create a request for the method "operations.get".
     *
     * This request holds the parameters needed by the servicenetworking server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param name The name of the operation resource.
     * @return the request
     */
    public Get get(java.lang.String name) throws java.io.IOException {
      Get result = new Get(name);
      initialize(result);
      return result;
    }

    public class Get extends ServiceNetworkingRequest<com.google.servicenetworking.v1beta.model.Operation> {

      private static final String REST_PATH = "v1beta/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^operations/[^/]+$");

      /**
       * Gets the latest state of a long-running operation.  Clients can use this method to poll the
       * operation result at intervals as recommended by the API service.
       *
       * Create a request for the method "operations.get".
       *
       * This request holds the parameters needed by the the servicenetworking server.  After setting
       * any optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
       * <p> {@link
       * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
       * called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name The name of the operation resource.
       * @since 1.13
       */
      protected Get(java.lang.String name) {
        super(ServiceNetworking.this, "GET", REST_PATH, null, com.google.servicenetworking.v1beta.model.Operation.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations/[^/]+$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get set$Xgafv(java.lang.String $Xgafv) {
        return (Get) super.set$Xgafv($Xgafv);
      }

      @Override
      public Get setAccessToken(java.lang.String accessToken) {
        return (Get) super.setAccessToken(accessToken);
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setCallback(java.lang.String callback) {
        return (Get) super.setCallback(callback);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUploadType(java.lang.String uploadType) {
        return (Get) super.setUploadType(uploadType);
      }

      @Override
      public Get setUploadProtocol(java.lang.String uploadProtocol) {
        return (Get) super.setUploadProtocol(uploadProtocol);
      }

      /** The name of the operation resource. */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** The name of the operation resource.
       */
      public java.lang.String getName() {
        return name;
      }

      /** The name of the operation resource. */
      public Get setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^operations/[^/]+$");
        }
        this.name = name;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Services collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code ServiceNetworking servicenetworking = new ServiceNetworking(...);}
   *   {@code ServiceNetworking.Services.List request = servicenetworking.services().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Services services() {
    return new Services();
  }

  /**
   * The "services" collection of methods.
   */
  public class Services {

    /**
     * Service producers use this method to provision a new subnet in peered service shared VPC network.
     * It will validate previously provided allocated ranges, find non-conflicting sub-range of
     * requested size (expressed in number of leading bits of ipv4 network mask, as in CIDR range
     * notation). It will then create a subnetwork in the request region. The subsequent call will try
     * to reuse the subnetwork previously created if subnetwork name, region and prefix length of the IP
     * range match. Operation
     *
     * Create a request for the method "services.addSubnetwork".
     *
     * This request holds the parameters needed by the servicenetworking server.  After setting any
     * optional parameters, call the {@link AddSubnetwork#execute()} method to invoke the remote
     * operation.
     *
     * @param parent Required. This is a 'tenant' project in the service producer organization.
    services/{service
     *        }/{collection-id}/{resource-id}
    {collection id} is the cloud resource collection type
     *        representing the
    tenant project. Only 'projects' are currently supported.
    {resource id} is
     *        the tenant project numeric id: '123456'.
    {service} the name of the peering service, for
     *        example
    'service-peering.example.com'. This service must be activated.
    in the consumer
     *        project.
     * @param content the {@link com.google.servicenetworking.v1beta.model.AddSubnetworkRequest}
     * @return the request
     */
    public AddSubnetwork addSubnetwork(java.lang.String parent, com.google.servicenetworking.v1beta.model.AddSubnetworkRequest content) throws java.io.IOException {
      AddSubnetwork result = new AddSubnetwork(parent, content);
      initialize(result);
      return result;
    }

    public class AddSubnetwork extends ServiceNetworkingRequest<com.google.servicenetworking.v1beta.model.Operation> {

      private static final String REST_PATH = "v1beta/{+parent}:addSubnetwork";

      private final java.util.regex.Pattern PARENT_PATTERN =
          java.util.regex.Pattern.compile("^services/[^/]+/[^/]+/[^/]+$");

      /**
       * Service producers use this method to provision a new subnet in peered service shared VPC
       * network. It will validate previously provided allocated ranges, find non-conflicting sub-range
       * of requested size (expressed in number of leading bits of ipv4 network mask, as in CIDR range
       * notation). It will then create a subnetwork in the request region. The subsequent call will try
       * to reuse the subnetwork previously created if subnetwork name, region and prefix length of the
       * IP range match. Operation
       *
       * Create a request for the method "services.addSubnetwork".
       *
       * This request holds the parameters needed by the the servicenetworking server.  After setting
       * any optional parameters, call the {@link AddSubnetwork#execute()} method to invoke the remote
       * operation. <p> {@link AddSubnetwork#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param parent Required. This is a 'tenant' project in the service producer organization.
    services/{service
     *        }/{collection-id}/{resource-id}
    {collection id} is the cloud resource collection type
     *        representing the
    tenant project. Only 'projects' are currently supported.
    {resource id} is
     *        the tenant project numeric id: '123456'.
    {service} the name of the peering service, for
     *        example
    'service-peering.example.com'. This service must be activated.
    in the consumer
     *        project.
       * @param content the {@link com.google.servicenetworking.v1beta.model.AddSubnetworkRequest}
       * @since 1.13
       */
      protected AddSubnetwork(java.lang.String parent, com.google.servicenetworking.v1beta.model.AddSubnetworkRequest content) {
        super(ServiceNetworking.this, "POST", REST_PATH, content, com.google.servicenetworking.v1beta.model.Operation.class);
        this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
              "^services/[^/]+/[^/]+/[^/]+$");
        }
      }

      @Override
      public AddSubnetwork set$Xgafv(java.lang.String $Xgafv) {
        return (AddSubnetwork) super.set$Xgafv($Xgafv);
      }

      @Override
      public AddSubnetwork setAccessToken(java.lang.String accessToken) {
        return (AddSubnetwork) super.setAccessToken(accessToken);
      }

      @Override
      public AddSubnetwork setAlt(java.lang.String alt) {
        return (AddSubnetwork) super.setAlt(alt);
      }

      @Override
      public AddSubnetwork setCallback(java.lang.String callback) {
        return (AddSubnetwork) super.setCallback(callback);
      }

      @Override
      public AddSubnetwork setFields(java.lang.String fields) {
        return (AddSubnetwork) super.setFields(fields);
      }

      @Override
      public AddSubnetwork setKey(java.lang.String key) {
        return (AddSubnetwork) super.setKey(key);
      }

      @Override
      public AddSubnetwork setOauthToken(java.lang.String oauthToken) {
        return (AddSubnetwork) super.setOauthToken(oauthToken);
      }

      @Override
      public AddSubnetwork setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AddSubnetwork) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AddSubnetwork setQuotaUser(java.lang.String quotaUser) {
        return (AddSubnetwork) super.setQuotaUser(quotaUser);
      }

      @Override
      public AddSubnetwork setUploadType(java.lang.String uploadType) {
        return (AddSubnetwork) super.setUploadType(uploadType);
      }

      @Override
      public AddSubnetwork setUploadProtocol(java.lang.String uploadProtocol) {
        return (AddSubnetwork) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. This is a 'tenant' project in the service producer organization.
       * services/{service}/{collection-id}/{resource-id} {collection id} is the cloud resource
       * collection type representing the tenant project. Only 'projects' are currently supported.
       * {resource id} is the tenant project numeric id: '123456'. {service} the name of the peering
       * service, for example 'service-peering.example.com'. This service must be activated. in the
       * consumer project.
       */
      @com.google.api.client.util.Key
      private java.lang.String parent;

      /** Required. This is a 'tenant' project in the service producer organization. services/{service
     }/{collection-id}/{resource-id} {collection id} is the cloud resource collection type representing
     the tenant project. Only 'projects' are currently supported. {resource id} is the tenant project
     numeric id: '123456'. {service} the name of the peering service, for example 'service-
     peering.example.com'. This service must be activated. in the consumer project.
       */
      public java.lang.String getParent() {
        return parent;
      }

      /**
       * Required. This is a 'tenant' project in the service producer organization.
       * services/{service}/{collection-id}/{resource-id} {collection id} is the cloud resource
       * collection type representing the tenant project. Only 'projects' are currently supported.
       * {resource id} is the tenant project numeric id: '123456'. {service} the name of the peering
       * service, for example 'service-peering.example.com'. This service must be activated. in the
       * consumer project.
       */
      public AddSubnetwork setParent(java.lang.String parent) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
              "^services/[^/]+/[^/]+/[^/]+$");
        }
        this.parent = parent;
        return this;
      }

      @Override
      public AddSubnetwork set(String parameterName, Object value) {
        return (AddSubnetwork) super.set(parameterName, value);
      }
    }

    /**
     * An accessor for creating requests from the Connections collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code ServiceNetworking servicenetworking = new ServiceNetworking(...);}
     *   {@code ServiceNetworking.Connections.List request = servicenetworking.connections().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Connections connections() {
      return new Connections();
    }

    /**
     * The "connections" collection of methods.
     */
    public class Connections {

      /**
       * To connect service to a VPC network peering connection must be established prior to service
       * provisioning. This method must be invoked by the consumer VPC network administrator It will
       * establish a permanent peering connection with a shared network created in the service producer
       * organization and register a allocated IP range(s) to be used for service subnetwork provisioning.
       * This connection will be used for all supported services in the service producer organization, so
       * it only needs to be invoked once. Operation.
       *
       * Create a request for the method "connections.create".
       *
       * This request holds the parameters needed by the servicenetworking server.  After setting any
       * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
       *
       * @param parent Provider peering service that is managing peering connectivity for a
      service provider organization.
       *        For Google services that support this functionality it is
       *        'services/servicenetworking.googleapis.com'.
       * @param content the {@link com.google.servicenetworking.v1beta.model.Connection}
       * @return the request
       */
      public Create create(java.lang.String parent, com.google.servicenetworking.v1beta.model.Connection content) throws java.io.IOException {
        Create result = new Create(parent, content);
        initialize(result);
        return result;
      }

      public class Create extends ServiceNetworkingRequest<com.google.servicenetworking.v1beta.model.Operation> {

        private static final String REST_PATH = "v1beta/{+parent}/connections";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^services/[^/]+$");

        /**
         * To connect service to a VPC network peering connection must be established prior to service
         * provisioning. This method must be invoked by the consumer VPC network administrator It will
         * establish a permanent peering connection with a shared network created in the service producer
         * organization and register a allocated IP range(s) to be used for service subnetwork
         * provisioning. This connection will be used for all supported services in the service producer
         * organization, so it only needs to be invoked once. Operation.
         *
         * Create a request for the method "connections.create".
         *
         * This request holds the parameters needed by the the servicenetworking server.  After setting
         * any optional parameters, call the {@link Create#execute()} method to invoke the remote
         * operation. <p> {@link
         * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Provider peering service that is managing peering connectivity for a
      service provider organization.
       *        For Google services that support this functionality it is
       *        'services/servicenetworking.googleapis.com'.
         * @param content the {@link com.google.servicenetworking.v1beta.model.Connection}
         * @since 1.13
         */
        protected Create(java.lang.String parent, com.google.servicenetworking.v1beta.model.Connection content) {
          super(ServiceNetworking.this, "POST", REST_PATH, content, com.google.servicenetworking.v1beta.model.Operation.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^services/[^/]+$");
          }
        }

        @Override
        public Create set$Xgafv(java.lang.String $Xgafv) {
          return (Create) super.set$Xgafv($Xgafv);
        }

        @Override
        public Create setAccessToken(java.lang.String accessToken) {
          return (Create) super.setAccessToken(accessToken);
        }

        @Override
        public Create setAlt(java.lang.String alt) {
          return (Create) super.setAlt(alt);
        }

        @Override
        public Create setCallback(java.lang.String callback) {
          return (Create) super.setCallback(callback);
        }

        @Override
        public Create setFields(java.lang.String fields) {
          return (Create) super.setFields(fields);
        }

        @Override
        public Create setKey(java.lang.String key) {
          return (Create) super.setKey(key);
        }

        @Override
        public Create setOauthToken(java.lang.String oauthToken) {
          return (Create) super.setOauthToken(oauthToken);
        }

        @Override
        public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Create) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Create setQuotaUser(java.lang.String quotaUser) {
          return (Create) super.setQuotaUser(quotaUser);
        }

        @Override
        public Create setUploadType(java.lang.String uploadType) {
          return (Create) super.setUploadType(uploadType);
        }

        @Override
        public Create setUploadProtocol(java.lang.String uploadProtocol) {
          return (Create) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Provider peering service that is managing peering connectivity for a service provider
         * organization. For Google services that support this functionality it is
         * 'services/servicenetworking.googleapis.com'.
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Provider peering service that is managing peering connectivity for a service provider organization.
       For Google services that support this functionality it is
       'services/servicenetworking.googleapis.com'.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Provider peering service that is managing peering connectivity for a service provider
         * organization. For Google services that support this functionality it is
         * 'services/servicenetworking.googleapis.com'.
         */
        public Create setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^services/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Create set(String parameterName, Object value) {
          return (Create) super.set(parameterName, value);
        }
      }
      /**
       * Service consumers use this method to list configured peering connection for the given service and
       * consumer network.
       *
       * Create a request for the method "connections.list".
       *
       * This request holds the parameters needed by the servicenetworking server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation.
       *
       * @param parent Provider peering service that is managing peering connectivity for a
      service provider organization.
       *        For Google services that support this functionality it is
       *        'services/servicenetworking.googleapis.com'.
       * @return the request
       */
      public List list(java.lang.String parent) throws java.io.IOException {
        List result = new List(parent);
        initialize(result);
        return result;
      }

      public class List extends ServiceNetworkingRequest<com.google.servicenetworking.v1beta.model.ListConnectionsResponse> {

        private static final String REST_PATH = "v1beta/{+parent}/connections";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^services/[^/]+$");

        /**
         * Service consumers use this method to list configured peering connection for the given service
         * and consumer network.
         *
         * Create a request for the method "connections.list".
         *
         * This request holds the parameters needed by the the servicenetworking server.  After setting
         * any optional parameters, call the {@link List#execute()} method to invoke the remote operation.
         * <p> {@link
         * List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
         * called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Provider peering service that is managing peering connectivity for a
      service provider organization.
       *        For Google services that support this functionality it is
       *        'services/servicenetworking.googleapis.com'.
         * @since 1.13
         */
        protected List(java.lang.String parent) {
          super(ServiceNetworking.this, "GET", REST_PATH, null, com.google.servicenetworking.v1beta.model.ListConnectionsResponse.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^services/[^/]+$");
          }
        }

        @Override
        public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
          return super.executeUsingHead();
        }

        @Override
        public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
          return super.buildHttpRequestUsingHead();
        }

        @Override
        public List set$Xgafv(java.lang.String $Xgafv) {
          return (List) super.set$Xgafv($Xgafv);
        }

        @Override
        public List setAccessToken(java.lang.String accessToken) {
          return (List) super.setAccessToken(accessToken);
        }

        @Override
        public List setAlt(java.lang.String alt) {
          return (List) super.setAlt(alt);
        }

        @Override
        public List setCallback(java.lang.String callback) {
          return (List) super.setCallback(callback);
        }

        @Override
        public List setFields(java.lang.String fields) {
          return (List) super.setFields(fields);
        }

        @Override
        public List setKey(java.lang.String key) {
          return (List) super.setKey(key);
        }

        @Override
        public List setOauthToken(java.lang.String oauthToken) {
          return (List) super.setOauthToken(oauthToken);
        }

        @Override
        public List setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (List) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public List setQuotaUser(java.lang.String quotaUser) {
          return (List) super.setQuotaUser(quotaUser);
        }

        @Override
        public List setUploadType(java.lang.String uploadType) {
          return (List) super.setUploadType(uploadType);
        }

        @Override
        public List setUploadProtocol(java.lang.String uploadProtocol) {
          return (List) super.setUploadProtocol(uploadProtocol);
        }

        /**
         * Provider peering service that is managing peering connectivity for a service provider
         * organization. For Google services that support this functionality it is
         * 'services/servicenetworking.googleapis.com'.
         */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Provider peering service that is managing peering connectivity for a service provider organization.
       For Google services that support this functionality it is
       'services/servicenetworking.googleapis.com'.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /**
         * Provider peering service that is managing peering connectivity for a service provider
         * organization. For Google services that support this functionality it is
         * 'services/servicenetworking.googleapis.com'.
         */
        public List setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^services/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        /**
         * Network name in the consumer project.   This network must have been already peered with a
         * shared VPC network using CreateConnection method. Must be in a form
         * 'projects/{project}/global/networks/{network}'. {project} is a project number, as in
         * '12345' {network} is network name.
         */
        @com.google.api.client.util.Key
        private java.lang.String network;

        /** Network name in the consumer project.   This network must have been already peered with a shared
       VPC network using CreateConnection method. Must be in a form
       'projects/{project}/global/networks/{network}'. {project} is a project number, as in '12345'
       {network} is network name.
         */
        public java.lang.String getNetwork() {
          return network;
        }

        /**
         * Network name in the consumer project.   This network must have been already peered with a
         * shared VPC network using CreateConnection method. Must be in a form
         * 'projects/{project}/global/networks/{network}'. {project} is a project number, as in
         * '12345' {network} is network name.
         */
        public List setNetwork(java.lang.String network) {
          this.network = network;
          return this;
        }

        @Override
        public List set(String parameterName, Object value) {
          return (List) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link ServiceNetworking}.
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

    /** Builds a new instance of {@link ServiceNetworking}. */
    @Override
    public ServiceNetworking build() {
      return new ServiceNetworking(this);
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
     * Set the {@link ServiceNetworkingRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setServiceNetworkingRequestInitializer(
        ServiceNetworkingRequestInitializer servicenetworkingRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(servicenetworkingRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}