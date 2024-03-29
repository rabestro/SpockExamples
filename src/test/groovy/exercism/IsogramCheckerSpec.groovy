package exercism

import spock.lang.Issue
import spock.lang.Narrative
import spock.lang.See
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title
import spock.lang.Unroll

@Title("Isogram Checker")
@Narrative("""
An isogram (also known as a "non-pattern word") is a word or phrase without a repeating letter, 
however spaces and hyphens are allowed to appear multiple times.
""")
@See("https://exercism.org/tracks/java/exercises/isogram")
@Subject(IsogramChecker)
class IsogramCheckerSpec extends Specification
{
    @Unroll('should return #isIsogram for #description')
    def 'should determines if the text is an isogram'()
    {
        given: 'an instance of Isogram Checker class'
        def isogramChecker = new IsogramChecker()

        expect: 'the phrase is correctly evaluated'
        isogramChecker.isIsogram(phrase) == isIsogram

        where: "input phrase and expected evaluation"
        phrase                    | isIsogram | description
        ''                        | true      | 'empty string'
        'isogram'                 | true      | 'lowercase isogram'
        'eleven'                  | false     | 'not isogram'
        'zzyzx'                   | false     | 'duplicate end alphabet'
        'subdermatoglyphic'       | true      | 'medium long isogram'
        'Alphabet'                | false     | 'case insensitive'
        'alphAbet'                | false     | 'duplicate mixed case'
        'thumbscrew-japingly'     | true      | 'isogram with hyphen'
        'thumbscrew-jappingly'    | false     | 'isogram with duplicated char after hyphen'
        'six-year-old'            | true      | 'isogram with duplicated hyphen'
        'Emily Jung Schwartzkopf' | true      | 'made up name that is an isogram'
        'accentor'                | false     | 'duplicated character in the middle is not isogram'
        'angola'                  | false     | 'same first and last'
    }
}

