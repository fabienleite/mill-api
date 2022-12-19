# Mill API

Our company produces multiple flours from cereal.

To be performant, we are building a system to planify all the tasks in our Mill.
For the moment, we want to manage our farmers and the cereal sold by them.

## Development

Our architect has enforced us to use Springboot 2.7.6 with Java 17.
We also have to design our API first (contract first).


If you want, you can run the app locally using a container with PostreSQL:
```shell
docker compose up -d
```
To execute the Rest api you can launch this line:
```shell
./mvnw springboot:run
```

A swagger user interface is available: http://localhost:8080/swagger-ui/index.html
![img](./docs/swagger-ui.png)

## Existing Features

### Farmers

Given i am a farm and the Mill does not know me
When i provide my information to the system
Then i receive reference in the Mill

Given i am a farm and the Mill already knows me
When i provide my information to the system
Then my request is rejected because the Mill knows me

Each farmer has a unique email and only him can use it.
Farmer has to provide the following information:
- First name
- Last name
- Email
- Phone Number

## Your job

Now, we are able to persist farmer information.
We need to persist now the Cereal that a farm provides to us.

### Cereals
Given i am a farmer and the Mill knows me
When i come to provide my cereal
Then the system persists the information about the cereal


What does the Mill need to know about the cereal transaction ?
- A farmer can provide only one kind of Cereal per day
- A farmer cannot provide a cereal transaction if the Mill does not know him
- For a transaction, the mill requires the following information:
  - The farmer email 
  - The year of the harvest
  - The cereal provided
  - The amount in tons (Between 1 and 8.5 tons max)
  - The year of the harvest


### Farmer

If you have enough time and energy.
We would like to be able to get a Farmer with all his information and the cereal transactions realised by him during the current year.




