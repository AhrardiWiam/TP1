# TP 1 : Insertion et Récupération des Données avec JDBC

## Objectif

Le **TP 1 : Insertion et Récupération des Données avec JDBC** a pour objectif de maîtriser l’insertion et la récupération de données dans une base de données MySQL en utilisant le langage Java et l’API JDBC. Ce projet nous permet de manipuler les objets `Connection`, `Statement`, `ResultSet`, et de gérer les erreurs potentielles lors de l'interaction avec une base de données. 

## Structure du Projet

Le projet est structuré de la manière suivante :

  - **Site.java** : Classe modèle représentant les enregistrements de la table `site`.
  - **Test.java** : Contient les méthodes pour insérer et récupérer les données, ainsi que la méthode `main` pour exécuter le programme.
  - **lib/** : Contient le driver JDBC MySQL nécessaire pour la connexion à la base de données.


## Fonctionnalités du Programme

 **1. Établir la Connexion avec la Base de Données** :
Le programme utilise l'API JDBC pour établir une connexion avec une base de données MySQL. 

 **2. Insérer des Données dans la Base de Données avec la Méthode `save()`** :
La méthode `save(Site s)` permet d’insérer un nouvel enregistrement dans la table `site`. 

 **3. Récupérer des Données de la Base de Données avec la Méthode `load()`** :
La méthode `load()` permet de récupérer et d’afficher les données stockées dans la table site.


## Démonstration de l'insertion des données

https://github.com/user-attachments/assets/e9d35c95-0b97-433f-bce6-67a5c4566d92


## Démonstration de la Récupération des données

[demo2.webm](https://github.com/user-attachments/assets/55ae6de0-b18b-4909-b784-4dbcbb646e29)


