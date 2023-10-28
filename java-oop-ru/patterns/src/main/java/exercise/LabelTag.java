package exercise;

// BEGIN
class LabelTag implements TagInterface {
    private String labelText;
    private TagInterface someTag;

    public LabelTag (String labelText, TagInterface someTag) {
         this.labelText = labelText;
         this.someTag = someTag;
    }


    public String render () {
        StringBuilder result = new StringBuilder();

        result.append("<label>")
                .append(labelText)
                .append(someTag.render())
                .append("</label>");

        return result.toString();
    }
}
// END
