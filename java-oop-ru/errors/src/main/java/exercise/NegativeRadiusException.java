package exercise;

// BEGIN
class NegativeRadiusException extends Exception {
    String exceptionName;

    public NegativeRadiusException() {
    }
    public NegativeRadiusException(String exceptionName) {
        this.exceptionName = exceptionName;
    }
}
// END
