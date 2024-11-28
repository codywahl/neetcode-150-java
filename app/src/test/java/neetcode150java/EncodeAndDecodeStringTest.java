package neetcode150java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

// @cspell:ignore neet
public class EncodeAndDecodeStringTest {
    EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();

    @Test
    void example1ShouldEncodeAndDecode() {
        List<String> input = List.of("neet", "code", "love", "you");

        String encoded = encodeAndDecodeStrings.encode(input);
        List<String> decoded = encodeAndDecodeStrings.decode(encoded);

        assertEquals(input, decoded);
    }

    @Test
    void example2ShouldEncodeAndDecode() {
        List<String> input = List.of("we", "say", "yes");

        String encoded = encodeAndDecodeStrings.encode(input);
        List<String> decoded = encodeAndDecodeStrings.decode(encoded);

        assertEquals(input, decoded);
    }

    // ["we","say",":","yes","!@#$%^&*()"]
    @Test
    void example3ShouldEncodeAndDecode() {
        List<String> input = List.of("we", "say", ":", "yes", "!@#$%^&*()");

        String encoded = encodeAndDecodeStrings.encode(input);
        List<String> decoded = encodeAndDecodeStrings.decode(encoded);

        assertEquals(input, decoded);
    }

    // [""]
    @Test
    void example4ShouldEncodeAndDecode() {
        List<String> input = List.of("");

        String encoded = encodeAndDecodeStrings.encode(input);
        List<String> decoded = encodeAndDecodeStrings.decode(encoded);

        assertEquals(input, decoded);
    }

    // ["neet", ""]
    @Test
    void example5ShouldEncodeAndDecode() {
        List<String> input = List.of("neet", "");

        String encoded = encodeAndDecodeStrings.encode(input);
        List<String> decoded = encodeAndDecodeStrings.decode(encoded);

        assertEquals(input, decoded);
    }
}
