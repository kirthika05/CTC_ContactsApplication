package com.kirthika;

import java.util.*;

public class Main {

    static HashMap<String,Integer> contacts;

    public Main(){
        contacts=new HashMap<>();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Main m = new Main();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equalsIgnoreCase("add")){
                m.addContact(contact.toLowerCase());
            }else if(op.equalsIgnoreCase ("find")){
                System.out.println(m.findContact(contact.toLowerCase()));
            }
        }
    }

    private static void addContact(String Contact){
        for(int i=0;i<Contact.length();i++){
            String subString = Contact.substring(0,i+1);
            if(contacts.containsKey(subString)){
                int count = contacts.get(subString)+1;
                contacts.put(subString,count);
            }else{
                contacts.put(subString,1);
            }
        }
    }

    private static int findContact(String Contact){
        if(contacts.containsKey(Contact)){
            return contacts.get(Contact);
        }else{
            return 0;
        }
    }

}
