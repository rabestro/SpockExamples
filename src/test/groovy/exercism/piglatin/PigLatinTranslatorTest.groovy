package exercism.piglatin


import spock.lang.Specification

class PigLatinTranslatorTest extends Specification {
    def "Translate"() {
        given: "an instance of PigLatinTranslator"
        def translator = new PigLatinTranslator()

        expect: "the phrase is correctly evaluated"
        translator.translate(phrase) == pigLatin

        where:
        phrase   | pigLatin   | comment
        'apple'  | 'appleay'  | ''
        'ear'    | 'earay'    | ''
        'igloo'  | 'iglooay'  | 'word beginning with i'
        'object' | 'objectay' | 'word beginning with o'
        'under'  | 'underay'  | 'word beginning with u'
    }
}

/*
    public void testWordBeginningWithVowelAndFollowedByQu() {
        assertEquals("equalay", pigLatinTranslator.translate("equal"));
    }

    @Test
    public void testWordBeginningWithP() {
        assertEquals("igpay", pigLatinTranslator.translate("pig"));
    }

    @Test
    public void testWordBeginningWithK() {
        assertEquals("oalakay", pigLatinTranslator.translate("koala"));
    }

    @Test
    public void testWordBeginningWithX() {
        assertEquals("enonxay", pigLatinTranslator.translate("xenon"));
    }

    @Test
    public void testWordBeginningWithQWithoutAFollowingU() {
        assertEquals("atqay", pigLatinTranslator.translate("qat"));
    }

    @Test
    public void testChTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("airchay", pigLatinTranslator.translate("chair"));
    }

    @Test
    public void testQuTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("eenquay", pigLatinTranslator.translate("queen"));
    }

    @Test
    public void testQuAndAPrecedingConsonantTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("aresquay", pigLatinTranslator.translate("square"));
    }

    @Test
    public void testThTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("erapythay", pigLatinTranslator.translate("therapy"));
    }

    @Test
    public void testThrTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("ushthray", pigLatinTranslator.translate("thrush"));
    }

    @Test
    public void testSchTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("oolschay", pigLatinTranslator.translate("school"));
    }

    @Test
    public void testYtTreatedLikeAVowelAtTheBeginningOfAWord() {
        assertEquals("yttriaay", pigLatinTranslator.translate("yttria"));
    }

    @Test
    public void testXrTreatedLikeAVowelAtTheBeginningOfAWord() {
        assertEquals("xrayay", pigLatinTranslator.translate("xray"));
    }

    @Test
    public void testYTreatedLikeAConsonantAtTheBeginningOfAWord() {
        assertEquals("ellowyay", pigLatinTranslator.translate("yellow"));
    }

    @Test
    public void testYTreatedLikeAVowelAtTheEndOfAConsonantCluster() {
        assertEquals("ythmrhay", pigLatinTranslator.translate("rhythm"));
    }

    @Test
    public void testYAsSecondLetterInTwoLetterWord() {
        assertEquals("ymay", pigLatinTranslator.translate("my"));
    }

    @Test
    public void testAWholePhrase() {
        assertEquals("ickquay astfay unray", pigLatinTranslator.translate("quick fast run"));
    }
 */