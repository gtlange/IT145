# System Specification Document
## About Our Company
Grazioso Salvare is a rescue animal training company that was established in 1965. We have
locations in Chile, Greece, Japan, Madagascar, Singapore, South Korea, Turkey, the United
Kingdom, and the United States. We have trained thousands of dogs as rescue animals and are
starting to train monkeys as well.
## Our Process
We obtain dogs from local breeders and animal shelters. Each dog goes through a six- to ninemonth training regimen before they are put into service. Grazioso Salvare uses the term “service” to indicate that an animal has been provided to a client. Once put into service, the
animals are considered rescue animals. A rescue animal, sometimes referred to as a search and
rescue animal, is trained to rescue other animals or humans from difficult (or even lifethreatening) situations. Part of our process is to record and track several data points about the rescue animals.

Dogs are given the status of “intake” before training starts. Once in training, they move through
a set of five rigorous phases: Phase I, Phase II, Phase III, Phase IV, and Phase V. While in
training, a dog is given the status of its current training phase (e.g., “Phase I”). When a dog
graduates from training, it is given the status of “in service” and is eligible for use by clients. If a
dog does not successfully make it through training, it is given the status of “farm,” indicating
that it will live a life of leisure on a Grazioso Salvare farm. We currently have a farm at each of
our training facilities, so there is no need to relocate animals.
## Our Vision
In recent years, law enforcement agencies from several countries have expressed an interest in
obtaining and training rescue animals that are more capable than a traditional rescue dog.
Though dogs have proven very capable, recent research indicates that primates have higher
levels of attention and greater potential to perform rescue functions. To support this demand,
we started training monkeys to become rescue animals. We currently have 19 monkeys of
various species in the training pipeline. To date, no monkeys have been put into service as
rescue animals.
## The Animals
Through years of experience, we have narrowed the list of dog breeds eligible for rescue
training to the following:
* • American pit bull terrier
* • Beagle
* • Belgian Malinois
* • Border collie
* • Bloodhound
* • Coonhound
* • English springer spaniel
* • German shepherd
* • German shorthaired pointer
* • Golden retriever
* • Labrador retriever
* • Nova Scotia duck tolling retriever
* • Rough collie
* • Smooth collie
When we acquire a dog, we record the breed, gender, age, weight, date, and the location
where we obtained them. There is usually a short lag time between when we acquire a dog and
when they start training, which we document as well. Additionally, we track graduation dates,
dates dogs are placed into “service,” and details about the dogs’ in-service placement (agency,
city, country, and name, email address, phone number, and mailing address for the agency’s
point of contact).
### Special Note on Monkeys
As we explore the use of monkeys as service animals, we want our system to support monkey
tracking as well as dog tracking. We have identified the following monkey species that are
eligible for our program:
* • Capuchin
* • Guenon
* • Macaque
* • Marmoset
* • Squirrel monkey
* • Tamarin
There are important data elements for monkeys in addition to what we use for dogs. These
include tail length, height, body length, species, and measurements for torso, skull, and neck.
## Software Requirements
We desire a software application that will help us track the animals we are currently training
and the animals that have been placed into service. Here are some specifics:
* • Ability to process requests for a rescue animal: In this case, we would receive the type
of animal the customer wants and the country where the customer resides. If we have
an animal in training in their country, we can reserve that animal for the customer.
* • Ability to update any information we have on our animals
* • Ability to see what animals we have in each phase at each location, including “intake”
and “farm”
* • Ability to add animals (intake)
* • Ability to transfer service animals to the farm or place in-service
* • Ability to view which animals are in-service
* • Ability to process and receive reports from in-service agencies on the retirement or
death of their rescue animal
