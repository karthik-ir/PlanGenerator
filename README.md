# PlanGenerator

To run this application, use the following command:

`mvn spring-boot:run`

API:
use `POST` `/plan` api with data sample 

```
{	
	"loanAmount":	"5000",	
	"nominalRate":	"5.0",	
	"duration":	24,	
	"startDate":	"2018-01-01T00:00:01Z"	
}	
```
to generate the plan. 
