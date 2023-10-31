package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {
    public SingleTag(String tagName, Map attributes) {
        super(tagName, attributes);
    }

    public String toString () {
        StringBuilder result = new StringBuilder();

        result.append("<" + super.getTagName() + " ");

        for (Map.Entry<String, String> entry : super.getAttributes().entrySet()) {
            result.append(entry.getKey() + "=\"" + entry.getValue() + "\" ");
        }

        return result.toString().trim() + ">";
    }
}
// END
