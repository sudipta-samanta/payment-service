# payment-service
Payment service component of a microservice. It's a spring boot project. 
The goal is to communicate with other services using microservice architecture. Here Payment Service works with [Order Service](https://github.com/sudipta-samanta/order-service) to place an order, handles payment related data.

## Dependencies

Here are list of dependencies used for this project :
- spring-boot-starter-web
- spring-boot-starter-data-jpa
- h2

Used H2 in memory database for storing data, for project purpose. Access H2 database console using browser link -> http://<span></span>localhost:port_number/h2-console/ (replace with your application port number)

## API Usage

- __To place an order__ : localhost:port_number/payment/doPayment
- method : __POST__
- Here is the request body:
```json
{
  "amount":4000,
  "orderId": 125
}
```

- Here is the response body:
```json
{
  "status": "payment success",
  "amount": 2500.0,
  "transactionId": "0fc20d65-3ca0-4adf-86c4-414d2a063209",
  "orderId": 2
}
```

- __To get a payment detail__ : localhost:port_number/payment/{paymentId}
- method : __GET__
- Here is the response body:
```json
{
  "amount": 0.0,
  "transactionId": "0fc20d65-3ca0-4adf-86c4-414d2a063209",
  "orderId": 2
}
```

### Credits
Want to do a shout out to [Java Techie](https://www.youtube.com/c/JavaTechie) for share this knowledge. Followed the awesome microservice playlist on YouTube. Check it out!