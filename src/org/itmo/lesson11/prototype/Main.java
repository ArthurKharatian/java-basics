package org.itmo.lesson11.prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Long> namesAndNums = new HashMap<>();
        namesAndNums.put("John", 12367132L);
        namesAndNums.put("Anna", 12367132L);
        namesAndNums.put("Katie", 12367132L);
        namesAndNums.put("Bob", 12367132L);

        Phonebook phonebook = new Phonebook(namesAndNums);
        System.out.println(phonebook);

        PhonebookFactory phonebookFactory = new PhonebookFactory(phonebook);
        Phonebook phonebookCopy = phonebookFactory.clonePhonebook();
        System.out.println(phonebookCopy);

        try {
            Phonebook clone = (Phonebook)phonebook.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            System.err.println(e.getMessage());
        }
    }
}
