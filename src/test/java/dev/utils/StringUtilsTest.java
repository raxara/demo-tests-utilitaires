package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {
		assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));
		assertEquals(3, StringUtils.levenshteinDistance("un grand chat", "un gros chat"));
		assertEquals(2, StringUtils.levenshteinDistance("ungrandchat", "un grand chat"));
	}
	
	@Test
	public void testLevenshteinDistanceEmpty() {
		assertEquals(4, StringUtils.levenshteinDistance("", "chat"));
		assertEquals(4, StringUtils.levenshteinDistance("chat", ""));
		assertEquals(0, StringUtils.levenshteinDistance("", ""));
	}
	
	@Test
	public void testLevenshteinDistanceSameString() {
		assertEquals(0, StringUtils.levenshteinDistance("chat", "chat"));
	}
	
	@Test
	public void testLevenshteinDistanceNull() {
		assertEquals(-1, StringUtils.levenshteinDistance("chat", null));
		assertEquals(-1, StringUtils.levenshteinDistance(null, "chat"));
		assertEquals(-1, StringUtils.levenshteinDistance(null, null));
	}

}
