package exercism.piglatin


import spock.lang.Specification
import spock.lang.Unroll

class PigLatinTranslatorTest extends Specification {

    def "test #comment"() {
        given: "an instance of PigLatinTranslator"
        def translator = new PigLatinTranslator()

        expect: "the phrase is correctly evaluated"
        translator.translate(phrase) == pigLatin

        where:
        phrase           | pigLatin               | comment
        'apple'          | 'appleay'              | 'word beginning with a'
        'ear'            | 'earay'                | 'word beginning with e'
        'igloo'          | 'iglooay'              | 'word beginning with i'
        'object'         | 'objectay'             | 'word beginning with o'
        'under'          | 'underay'              | 'word beginning with u'
        'equal'          | 'equalay'              | 'word beginning with vowel and followed by qu'
        'pig'            | 'igpay'                | 'word beginning with p'
        'koala'          | 'oalakay'              | 'word beginning with k'
        'xenon'          | 'enonxay'              | 'word beginning with x'
        'qat'            | 'atqay'                | 'word beginning with q without a following u'
        'chair'          | 'airchay'              | 'ch treated like a consonant at the beginning of a word'
        'queen'          | 'eenquay'              | 'qu treated like a consonant at the beginning of a word'
        'square'         | 'aresquay'             | 'qu and a preceding consonant treated like a consonant at the beginning of a word'
        'therapy'        | 'erapythay'            | 'th treated like a consonant at the beginning of a word'
        'thrush'         | 'ushthray'             | 'thr treated like a consonant at the beginning of a word'
        'school'         | 'oolschay'             | 'sch treated like a consonant at the beginning of a word'
        'yttria'         | 'yttriaay'             | 'yt treated like a vowel at the beginning of a word'
        'xray'           | 'xrayay'               | 'xr treated like a vowel at the beginning of a word'
        'yellow'         | 'ellowyay'             | 'y treated like a consonant at the beginning of a word'
        'rhythm'         | 'ythmrhay'             | 'y treated like a vowel at the end of a consonant cluster'
        'my'             | 'ymay'                 | 'y as second letter in two letter word'
        'quick fast run' | 'ickquay astfay unray' | 'a whole phrase'
    }
}
