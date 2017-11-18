package pl.javastart.exercise.streams;

import java.util.*;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) { // zrobione

        Iterator<Integer> integerIterator = numberList.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() % 2 != 0) {
                integerIterator.remove();
            }
        }

        return numberList;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) { // zrobione

        Iterator<Integer> integerIterator = numberList.iterator();
        while (integerIterator.hasNext()) {
            if (integerIterator.next() < 20) {
                integerIterator.remove();
            }
        }
        return numberList;
    }

    public List<Book> convertToBooks(List<String> titles) {

        List<Book> bookList = new ArrayList<>();

        for (String title : titles) {
            bookList.add(new Book(title));
        }
        return bookList;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<Book> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) { //zrobione

        List<Book> bookList = new ArrayList<>();
        for (String title : titles) {
            bookList.add(new Book(title));
        }

        List<Book> tempBookList = new ArrayList<>();
        for (Book books:bookList) {
            if (books.getTitle().substring(0, 3).equals("Gra")) {
                tempBookList.add(books);
            }
        }
        return tempBookList;
    }
}
