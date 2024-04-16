package com.neww;

import java.util.*;
import java.util.StringTokenizer;

class Contact {
    String name;
    String birthdate;
    List<String> phones;
    int lastUpdatedTime;

    public Contact(String name, String birthdate, List<String> phones, int lastUpdatedTime) {
        this.name = name;
        this.birthdate = birthdate;
        this.phones = phones;
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public String toString() {
        return name + "\n" + birthdate + "\n" + String.join(" ", phones) + "\n" + lastUpdatedTime;
    }
}

public class MergeContacts {
    public static void main(String[] args) {
        String input = "3\n" +
                "alice\n" +
                "05-06-2000\n" +
                "3\n" +
                "12345678 empty (022) 2456-7890\n" +
                "Bob Parson\n" +
                "empty\n" +
                "+9156728192\n" +
                "10\n" +
                "Alice Weasley empty\n" +
                "2\n" +
                "12345678 98765432\n" +
                "20";

        StringTokenizer tokenizer = new StringTokenizer(input);

        int N = Integer.parseInt(tokenizer.nextToken());
        List<Contact> contacts = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = tokenizer.nextToken();
            String birthdate = tokenizer.nextToken();
            List<String> phones = new ArrayList<>();
            int phoneCount = Integer.parseInt(tokenizer.nextToken());

            for (int j = 0; j < phoneCount; j++) {
                String phone = tokenizer.nextToken();
                phones.add(phone);
            }

            int lastUpdatedTime = Integer.parseInt(tokenizer.nextToken());

            Contact contact = new Contact(name, birthdate, phones, lastUpdatedTime);
            contacts.add(contact);
        }

        // Sort the contacts by name in ascending order
        contacts.sort(Comparator.comparing(contact -> contact.name));

        Map<String, Contact> mergedContacts = new HashMap<>();

        for (Contact contact : contacts) {
            Contact existingContact = mergedContacts.get(contact.name);
            if (existingContact == null || contact.lastUpdatedTime > existingContact.lastUpdatedTime) {
                mergedContacts.put(contact.name, contact);
            }
        }

        // Print the merged contacts
        for (Contact contact : mergedContacts.values()) {
            System.out.println(contact);
        }
    }
}
