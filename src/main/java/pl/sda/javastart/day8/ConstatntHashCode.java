package pl.sda.javastart.day8;

import java.util.Objects;

public class ConstatntHashCode {
    private String value;

    public ConstatntHashCode(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConstatntHashCode that = (ConstatntHashCode) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return 5;
    }
}
