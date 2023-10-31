package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {

    private final String body;
    private final List<Tag> children;
    public PairedTag(String tagName, Map<String, String> attributes, String body, List<Tag> children) {
        super(tagName, attributes);
        this.body = body;
        this.children = children;
    }

    public String toString() {
        StringBuilder pairedTag = new StringBuilder();
        String result;
        String closedBracket = "</" + super.getTagName() + ">";

        pairedTag.append("<" + super.getTagName() + " ");

        for(Map.Entry<String, String> entry : super.getAttributes().entrySet()) {
            pairedTag.append(entry.getKey() + "=\"" + entry.getValue() + "\" ");
        }

        result = pairedTag.toString().trim() + ">";

        StringBuilder attributes = new StringBuilder();

        for(Tag child : children) {
            attributes.append(child);
        }

        result += attributes.toString();
        return result + body + closedBracket;
    }
}
// END
