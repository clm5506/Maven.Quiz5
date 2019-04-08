package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimiter;
    String string;
    public StringAssembler(Character delimeter) {
        this.delimiter = delimeter;
        this.string = "";
    }

    public StringAssembler append(String str) {

        this.string += str + delimiter;
        return this;
    }

    public String assemble() {
        return string.substring(0,string.length()-1);
    }
}
