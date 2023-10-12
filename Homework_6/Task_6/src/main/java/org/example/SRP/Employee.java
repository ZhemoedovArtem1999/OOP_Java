package org.example.SRP;

public class Employee {
    // данный класс отвечает только за работника, тем самым добиваемся
    // принципа единственной ответственности (каждый класс отвечает только за одну операцию)
    // этот класс представляет работника
    private String name;
    private String dol;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }

    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }
}
