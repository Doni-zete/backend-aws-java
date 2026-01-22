package br.com.jogo.model;

public class Space {

    private Integer actual;
    private final int expected;
    private final Boolean fixed;

    public Space(final int expected, final boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;
        if (fixed) {
            actual = expected;
        }
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(final Integer actual) {
        if (Boolean.TRUE.equals(fixed)) return;
        this.actual = actual;
    }

    public void clearSpace() {
        setActual(null);
    }

    public int getExpected() {
        return expected;
    }

    public boolean getFixed() {
        return fixed;
    }

    public boolean isFixed() {
        return fixed;
    }
}

