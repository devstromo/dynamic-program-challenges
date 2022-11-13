package com.devstromo.tabulation.all_construct;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class AllConstructTest {
    private final AllConstruct allConstruct =  new AllConstruct();
    @Test
    public void testAllConstruct() {
        var list = Arrays.asList(List.of("purp", "le"), List.of("p", "ur", "p", "le"));
        assertEquals(list, allConstruct.solve("purple", new String[] { "purp", "p", "ur", "le", "purpl" }));
        list = Arrays.asList(List.of("abc", "def"), List.of("ab", "c", "def"), List.of("abcd", "ef"), List.of("ab", "cd", "ef"));
        assertEquals(list, allConstruct.solve("abcdef", new String[] { "ab", "abc", "cd", "def", "abcd", "ef", "c" }));
        assertEquals(Collections.emptyList(), allConstruct.solve("skateboard", new String[] { "bo", "rd", "ate", "t", "ska", "sk", "boar" }));
        assertEquals(Collections.emptyList(),
            allConstruct.solve("aaaaaaaaaaaaaaz", new String[] { "a", "aa", "aaa", "aaaa", "aaaaa" }));
    }
}