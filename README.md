### Demo application to verify validation

This is a demo application to verify the behaviour 
of validation with @RabbitListener

It seems that a component need to be class-annotated wiht
@Validated like in the [DemoConsumer.java](src%2Fmain%2Fjava%2Fse%2Fdunemark%2Frabbitvalidation%2FDemoConsumer.java)

This demo can be started from the [TestApp.java](src%2Ftest%2Fjava%2Fse%2Fdunemark%2Frabbitvalidation%2FTestApp.java)
that will bring up rabbitmq with testcontainers in docker

The application will create 2 rest endpoints
POST /pass
POST /failed

That will post an message with payload that will pass or fail validation.