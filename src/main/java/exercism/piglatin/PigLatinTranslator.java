package exercism.piglatin;

import java.util.regex.Pattern;

public final class PigLatinTranslator {
    private static final String CONSONANTS = "" +
            "(?<consonants>" + // define named capture group
            "(?!xr|yt)" + // consonants should not start with "xr" or "yt"
            "y?((qu)|[\\w&&[^aeiouy]])*" + // the main definition of consonant group
            ")?"; // The consonants group is optional. It is empty if word starts with vowel

    private static final String BASE = "(?<base>\\w+)";

    private static final Pattern PATTERN = Pattern.compile(CONSONANTS + BASE);
    private static final String TEMPLATE = "${base}${consonants}ay";

    public String translate(String sentence) {
        return PATTERN.matcher(sentence).replaceAll(TEMPLATE);
    }
}