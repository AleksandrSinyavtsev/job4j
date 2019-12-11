package ru.job4j.oop;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 462);
        Book thinkingInJava = new Book("Thinking in java", 1168);
        Book headFirstJava = new Book("Head first Java", 720);
        Book kolobok = new Book("Kolobok", 10);

        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = thinkingInJava;
        books[2] = headFirstJava;
        books[3] = kolobok;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " : " + b.getPageCount() + " pages");
        }

        Book a = books[0];
        books[0] = books[3];
        books[3] = a;
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " : " + b.getPageCount() + " pages");
        }

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            if (b.getName().equals("Clean code")) {
                System.out.println(b.getName() + " : " + b.getPageCount() + " pages");
            }
        }
    }
}
