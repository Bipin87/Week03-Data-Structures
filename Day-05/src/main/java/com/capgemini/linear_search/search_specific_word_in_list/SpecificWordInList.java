package com.capgemini.linear_search.search_specific_word_in_list;

public class SpecificWordInList {
    public static String searchWord(String[] arr, String word){
        int n = arr.length;
        for (String str : arr) {
            if (str.contains(word)){
                return str;
            }
        }
        return "Not found";
    }
}
