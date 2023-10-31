package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
class Tag {
    protected String tagName;

    protected Map<String, String> attributes;

    public Tag(String tagName, Map attributes) {
        this.tagName = tagName;
        this.attributes = attributes;
    }


    public String getTagName() {
        return tagName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

}
// END
