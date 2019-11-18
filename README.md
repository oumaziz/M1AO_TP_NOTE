# TD Noté

Pour réaliser ce TD noté vous devez corriger le code source qui vous est donné afin que les 5 tests passent.
Les sources du programmes (les .java) doivent ensuite être envoyées à moumaziz@labri.fr sans délai avant la fin de la séance de TD noté.

## Contexte

Le code donné (répertoire main) correspond à une application permettant de gérer les passagers d'un train. Le métier de cette application (package domain) est constitué des classes suivantes:

* Passenger: Cette classe représente le passager d'un train.
* Train: Cette classe représente un train transportant des passagers d'une source à une destination fixe avec une capacité définie de passagers.
* SeatPool: Cette classe représente l'ensemble des sièges passagers d'un train.
* Trip: Cette classe représente un voyage prévu dans des horaires donnés pour un train (avec ses sièges).

* TripRepository: Cette interface représente le dépôt des voyages de notre application (**pour ce TP Noté, pas besoin de DTO**).

Les classes: Passenger, Train, Trip et TripInMemoryRepository disposent chacune d'une classe de test qui contient le ou les tests unitaire pour la classe.

## La classe PassengerTest (1 Test)

Cette classe contient un test unitaires pour la clase Passenger.

Le test **passengersShouldBeEqual** vérifie qu'une passager est bien une Value Object.

## La classe TrainTest (1 Test)

Cette classe contient un test unitaire pour la classe Train.

Le test **sourceAndDestinationShouldBeDifferent** vérifie qu'il y a bien une vérification qui est faite permettant de s'assurer que le lieu source et la distination ne sont pas identiques.

## La classe TripTest (2 Tests)

Cette classe contient deux tests unitaire pour la classe Trip.

Le test **shouldNotBookTripTwice** vérifie qu'il n'est pas possible pour un passager de réserver deux sièges durant un même voyage.

Le test **encapsulationShouldBePreserved** vérifie que l'encapsulation des données de la classe Trip est bien préservée (impossible de les modifier de l'exterieur sans passer par la classe Trip).

## La classe TripInMemoryRepositoryTest (1 Test)

Cette classe contient un test unitaire pour la classe TripInMemoryRepository.

Le test **shouldSaveATrip** vérifie qu'il est possible à travers le repository de sauvegarder un voyage en mémoire (**pour ce TP Noté, pas besoin de DTO**).

## Consignes

Pour exécuter les tests vous devez utiliser la commande gradle :

    gradle test

Gradle construira le rapport de résultat montrant que les 5 tests ont tous échoué.

Charge à vous de corriger le code pour que ces tests passent.

Vous ne devez pas toucher au code des tests.
