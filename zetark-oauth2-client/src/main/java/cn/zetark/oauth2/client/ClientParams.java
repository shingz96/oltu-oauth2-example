package cn.zetark.oauth2.client;

/**
 * OAuth Server constants
 */
public class ClientParams {

	public static final String CLIENT_ID = "c1ebe466-1cdc-4bd3-ab69-77c3561b9dee"; //  CLIENT_ID

    public static final String CLIENT_SECRET = "d8346ea2-6017-43ed-ad68-19c0f971738b"; // CLIENT_SECRET
	
	public static final String USERNAME = "admin"; // username

	public static final String PASSWORD = "123456"; // password

	public static final String OAUTH_SERVER_URL =  "http://localhost:8080/zetark-oauth2-server/authorize"; // oauth2 authorization server url

	public static final String OAUTH_SERVER_TOKEN_URL =  "http://localhost:8080/zetark-oauth2-server/accessToken"; // access token url

    public static final String OAUTH_SERVER_REDIRECT_URI =  "http://localhost:8080/zetark-oauth2-server/authCode"; // redirect url

    public static final String OAUTH_SERVICE_API =  "http://localhost:8080/zetark-oauth2-server/v1/openapi/userInfo"; // service testing api

}
