package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        Iterator<Book> bookIterator = bookList.iterator();

        while (bookIterator.hasNext()) {
            Pattern pattern = Pattern.compile("Gra");
            Matcher matcher = pattern.matcher(bookIterator.next().getTitle());
            if (!matcher.find()) {
                bookIterator.remove();
            }
        }
        return bookList;
    }
}
