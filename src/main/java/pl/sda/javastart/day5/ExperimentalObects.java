package pl.sda.javastart.day5;

public class ExperimentalObects {
    private Integer notFinalImutable;
    private final Integer finalImutable;            //NIE MOŻNA ZMIENIC REFERENCJI BO JEST FINAL !!!
    private final TestPerson finalMutable;

    public ExperimentalObects(Integer notFinalImutable, Integer finalImutable, TestPerson finalMutable) {
        this.notFinalImutable = notFinalImutable;
        this.finalImutable = finalImutable;
        this.finalMutable = finalMutable;
    }

    public TestPerson getFinalMutable() {
        return finalMutable;
    }

    public Integer getNotFinalImutable() {
        return notFinalImutable;
    }

    public void setNotFinalImutable(Integer notFinalImutable) {
        this.notFinalImutable = notFinalImutable;
    }

    public Integer getFinalImutable() {
        return finalImutable;
    }
}



