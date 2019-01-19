package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Studnet extends Person implements NameHolder{
    private Integer indexNo;
    private BigDecimal scholarship;

    public Studnet(String firstName, String lastName, Integer identity, Integer age, Integer indexNo, BigDecimal scholarship) {
        super(firstName, lastName, identity, age);
        this.indexNo = indexNo;
        this.scholarship = scholarship;
    }
    public void introductionInner(){
        super.introduction();
        System.out.println("ale też studentem ");
    }

    @Override
    public String showYourName() {
        return  getFirstName() + " " + super.getLastName();
    }

    @Override
    public BigDecimal showMeIncome(){
        return scholarship;
    }


    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public BigDecimal getScholarship() {
        return scholarship;
    }

    public void setScholarship(BigDecimal scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "indexNo=" + indexNo +
                ", scholarship=" + scholarship +
                "} " + super.toString();
    }
}
