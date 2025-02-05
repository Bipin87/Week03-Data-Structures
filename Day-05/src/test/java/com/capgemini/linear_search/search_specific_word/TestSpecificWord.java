package com.capgemini.linear_search.search_specific_word;

import org.junit.jupiter.api.Test;

import static com.capgemini.linear_search.search_specific_word_in_list.SpecificWordInList.searchWord;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSpecificWord {
    @Test
    void searchWordTestOne(){
        assertEquals("12", searchWord(new String[] {"45","3","4","6","12"},"1"));
    }

}
