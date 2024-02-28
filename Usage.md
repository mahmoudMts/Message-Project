
## General Notes about version 1.0.5
A set of common features for London Market developers are used from foundation service repo ( DXC.LM.SDK.Java.services-foundation-new ).

Example:
* Auth functions
* Utility functions
* Validation
* SecretReader
* LoggingInterceptor
* MVC Config

A standard listener (SQS) components are used from StandardListener repo ( DXC.LM.SDK.Java.StandardListener-new ).

A event publisher (SNS) components are used from awssnslibrary repo ( DXC.LM.SDK.Java.awssnslibrary-new ).

## Secrets need to be added to create new microservice
* Keycloak
* KeycloakUser
* AccessKey
* SecretKey
* SQSEventsQueue
* SNSArnEvents
* logLevel
* Env
