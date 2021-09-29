package exercism

import spock.lang.Specification
import spock.lang.Title

@Title("Isogram Checker Specifications")
class IsogramCheckerSpec extends Specification {
    def 'should return #isogram for #description'() {

        given: "an instance of Isogram Checker class"
        def iso = new IsogramChecker()

        expect: "the phrase is correctly evaluated"
        iso.isIsogram(phrase) == isIsogram

        where: "input phrase and expected evaluation"
        phrase                    | isIsogram | description
        ""                        | true      | "empty string"
        "isogram"                 | true      | "lowercase isogram"
        "eleven"                  | false     | "not isogram"
        "zzyzx"                   | false     | "duplicate end alphabet"
        "subdermatoglyphic"       | true      | "medium long isogram"
        "Alphabet"                | false     | "case insensitive"
        "alphAbet"                | false     | "duplicat mixed case"
        "thumbscrew-japingly"     | true      | "isogram with hyphen"
        "thumbscrew-jappingly"    | false     | "isogram with duplicated char after hyphen"
        "six-year-old"            | true      | "isogram with duplicated hyphen"
        "Emily Jung Schwartzkopf" | true      | "made up name that is an isogram"
        "accentor"                | false     | "duplicated character in the middle is not isogram"
        "angola"                  | false     | "same first and last"
    }

}
