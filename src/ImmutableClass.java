public final class ImmutableClass {
    private final MutableClass data;

    public ImmutableClass(MutableClass data) {
        this.data = new MutableClass(data.getValue());
    }

    public MutableClass getData() {
        return new MutableClass(this.data.getValue());
    }
}
