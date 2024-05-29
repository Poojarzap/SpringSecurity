Spring Security (YOUTUBE : https://www.youtube.com/watch?v=GH7L4D8Q_ak&t=6997s)<br/>
-> Use the dependencies such as spring web, and spring security for running the program<br/>
-> Use @Configuration and @EnableWebSecurity annotations to custom use the in-built security form.(Code taken from SpringBootWebSecurityConfiguration.class)<br/>
-> Using the postman to run the same application.<br/>
-> Using in-memory user management (for multiple users), hardcoded. (Using InMemoryUserDetailsManager, which requires UserDetails)<br/>
-> Roles based authentication using Spring security.(@PreAuthorize to endpoints)<br/>
-> H2 databases for spring security. //http://localhost:8080/h2-console<br/>
->Tables are created by taking content from github springsecurity, USER.ddl file
->Encoding password using BCryptPasswordEncoder() of type "PasswordEncoder"<br/>
->Jwt(JSON web tokens)
1) JwtUtils class(helper class) = methods for generating, parsing and validating JWTs.<br/> Include generating a token from username, validating JWT and extracting username from token. <br/>
2) AuthTokenFilter class = Filters incoming requests to check for a valid JWT in the header, setting authentication context if the token is valid.
3) AuthEntryPointJwt = custom handling for unauthorized requests.
4) SecurityConfig class = sets up the security filter chain, permitting or denying access based on paths and roles. Also configures session management to stateless, which is crucial for JWT usage.<br/>
-> Copy the dependencies for JWT from JWT github->(installation->maven)
