package pl.sda.javastart.day6;

import java.math.BigDecimal;

public class Student extends Person implements NameHolder {
    private Integer indexNo;
    private BigDecimal scolarship;

    public Student(String firstName, String lastName, Integer identity, Integer age, Integer indexNo, BigDecimal scolarship) {
        super(firstName, lastName, identity, age);
        this.indexNo = indexNo;
        this.scolarship = scolarship;
    }

    public void introduceInner() {
        super.introduction();
        System.out.println(" Oraz jestem studentem");
    }

    @Override
    public String showYourName() {
        return getFirstName() + " " + getLastName(); // nie trzeba pisac super
    }

    @Override
    public BigDecimal showIncome() {
        return scolarship;
    }


    public Integer getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(Integer indexNo) {
        this.indexNo = indexNo;
    }

    public BigDecimal getScolarship() {
        return scolarship;
    }

    public void setScolarship(BigDecimal scolarship) {
        this.scolarship = scolarship;
    }
}
