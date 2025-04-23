package Controllers;

import Models.Book;

public class BookController {
    // Método para ordenar libros por nombre en orden descendente
public void sortByName(Book[] libros) {
    // Implementación pendientes
    for (int i = 0; i < libros.length - 1; i++) {
        for (int j = 0; j < libros.length - 1 - i; j++) {
            if (libros[j].getName().compareTo(libros[j + 1].getName()) < 0) {
                Book temp = libros[j];
                libros[j] = libros[j + 1];
                libros[j + 1] = temp;
            }
        }
    }
}
// Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
public Book searchByName(Book[] libros, String name) {
    // Implementación pendiente
    for (Book libro : libros) {
        if (libro.getName().equalsIgnoreCase(name)) {
            return libro;
        }
    }
    return null;
}
    
}
