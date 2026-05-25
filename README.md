# SpringOauth2

Spring Boot OAuth2 Login (Google + GitHub + LinkedIn)

This project demonstrates OAuth2 Social Login using Spring Boot with:

Google Login
GitHub Login
LinkedIn Login

🚀 Features
OAuth2 Login with multiple providers
Spring Security authentication
Custom LinkedIn OAuth2 configuration
Secure session-based login

🧰 Tech Stack
Java
Spring Boot
Spring Security
OAuth2 Client
Maven

🔐 OAuth2 Providers Setup
1. Google Login Setup
Go to Google Cloud Console
Create OAuth credentials
Add redirect URI:
http://localhost:8080/login/oauth2/code/google

3. GitHub Login Setup
Go to GitHub Developer Settings
Create OAuth App
Add callback URL:
http://localhost:8080/login/oauth2/code/github

5. LinkedIn Login Setup
Go to LinkedIn Developer Portal
👉 https://www.linkedin.com/developers/apps/
Create an app and enable:
"Sign In with LinkedIn using OpenID Connect"
Add redirect URL:
http://localhost:8080/login/oauth2/code/linkedin
Copy:
Client ID
Client Secret

⚙️ application.properties
# Google
spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET

# GitHub
spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_CLIENT_SECRET

# LinkedIn
spring.security.oauth2.client.registration.linkedin.provider=linkedin
spring.security.oauth2.client.registration.linkedin.client-id=YOUR_LINKEDIN_CLIENT_ID
spring.security.oauth2.client.registration.linkedin.client-secret=YOUR_LINKEDIN_CLIENT_SECRET
spring.security.oauth2.client.registration.linkedin.scope=openid,profile,email
spring.security.oauth2.client.registration.linkedin.authorization-grant-type=authorization_code
spring.security.oauth2.client.registration.linkedin.redirect-uri=http://localhost:8080/login/oauth2/code/linkedin
spring.security.oauth2.client.registration.linkedin.client-name=LinkedIn

spring.security.oauth2.client.provider.linkedin.authorization-uri=https://www.linkedin.com/oauth/v2/authorization
spring.security.oauth2.client.provider.linkedin.token-uri=https://www.linkedin.com/oauth/v2/accessToken
spring.security.oauth2.client.provider.linkedin.user-info-uri=https://api.linkedin.com/v2/userinfo
spring.security.oauth2.client.provider.linkedin.user-name-attribute=sub
spring.security.oauth2.client.provider.linkedin.jwk-set-uri=https://www.linkedin.com/oauth/openid/jwks
