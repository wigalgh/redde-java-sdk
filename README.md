![Redde](https://www.reddeonline.com/assets/img/reddes-logo.png)
# redde-java-sdk (Beta)
A Java SDK built around the Redde REST API that allows merchants to receive, send, check transaction status, and perform lots of payment transactions.
[![GitHub version](https://d25lcipzij17d.cloudfront.net/badge.svg?id=gh&type=6&v=1.0&x2=0)](https://github.com/wigalsolutionsltd/redde-java-sdk)
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)]()
[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/wigalsolutionsltd/redde-java-sdk)
[![ForTheBadge built-by-developers](http://ForTheBadge.com/images/badges/built-by-developers.svg)](https://reddeonline.com)

Before you can have access to APIs you need to register and create an [Account](https://app.reddeonline.com/register). Header for all request should have {"apikey": "string"}: and this API key will be sent to merchant when their app configuration is setup for them by Wigal.

For more information on documentation go to [developers.reddeonline.com](https://developers.reddeonline.com/rest-api.html)

 * [Installation](#installation)
 * [Usage](#usage)
 * [Examples](#examples)
 
Installation
------------

To use this library you'll need to have [created a Redde account](https://app.reddeonline.com/register). 


Usage
-----

maven and gradle repository will be ready soon


Create an api object with your API key and App ID which will be provided to you by the Redde Team:

```java
ReddeApiClient api = new ReddeApiClient(apikey, appid);
```

Create an object for the ReddePay class so that you can access the methods like receiveMoney and sendMoney

```java
ReddePay pay = new ReddePay();
```        
    
Examples
--------
### Receiving money from Customer or Client
To use the API to recieve money from a customer, the receiveMoney() method will be used
using a simple array of parameters, the keys match the parameters of the API.

```java

```

### Sending money to Customer or Client
To use the API to send money to a customer, the sendMoney() method will be used
using a simple array of parameters, the keys match the parameters of the API.

```java

```

### Callbacks
Most APIs implement callbacks for easy tracking of api transactions so we've spun something
simple for you to use. Check it out

```java

```

# License
This library is released under the MIT License