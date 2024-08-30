![Java Logo](https://www.oracle.com/a/tech/img/cb88-java-logo-001.jpg)

# Gestion d'une Bibliothèque

## Sujet
Ce projet consiste à créer une application Java pour gérer une bibliothèque de livres. L'application permet d'ajouter des livres, de rechercher des livres, et de filtrer les livres selon divers critères. Le projet met en pratique les concepts de Programmation Orientée Objet (POO) ainsi que l'utilisation des Streams, Collectors, et Optional en Java.

## Classes et Méthodes

### Classe `Book`
- **Attributs :**
  - `String title` : Le titre du livre.
  - `String author` : L'auteur du livre.
  - `int publicationYear` : L'année de publication du livre.
  - `String genre` : Le genre du livre.
  - `double price` : Le prix du livre.

- **Méthodes :**
  - `public Book(String title, String author, int publicationYear, String genre, double price)` : Constructeur pour initialiser un livre.
  - `public String getTitle()` : Retourne le titre du livre.
  - `public String getAuthor()` : Retourne l'auteur du livre.
  - `public int getPublicationYear()` : Retourne l'année de publication du livre.
  - `public String getGenre()` : Retourne le genre du livre.
  - `public double getPrice()` : Retourne le prix du livre.
  - `public void setTitle(String title)` : Définit le titre du livre.
  - `public void setAuthor(String author)` : Définit l'auteur du livre.
  - `public void setPublicationYear(int year)` : Définit l'année de publication du livre.
  - `public void setGenre(String genre)` : Définit le genre du livre.
  - `public void setPrice(double price)` : Définit le prix du livre.
  - `public String toString()` : Retourne une chaîne de caractères représentant le livre.

### Classe `Library`
- **Attribut :**
  - `List<Book> books` : Liste des livres présents dans la bibliothèque.

- **Méthodes :**
  - `public void addBook(Book book)` : Ajoute un livre à la bibliothèque.
  - `public Optional<Book> findBookByTitle(String title)` : Recherche un livre par son titre et retourne un `Optional<Book>`.
  - `public List<Book> getBooksByAuthor(String author)` : Retourne une liste de livres écrits par un auteur spécifique.
  - `public List<Book> getBooksByGenre(String genre)` : Retourne une liste de livres d'un genre spécifique.
  - `public List<Book> getBooksPublishedAfter(int year)` : Retourne une liste de livres publiés après une certaine année.
  - `public double getAveragePriceOfBooks()` : Retourne le prix moyen des livres dans la bibliothèque.
  - `public Map<String, List<Book>> getBooksGroupedByGenre()` : Retourne une map regroupant les livres par genre.
  - `public Map<String, Long> countBooksByAuthor()` : Retourne une map indiquant le nombre de livres par auteur.

---
