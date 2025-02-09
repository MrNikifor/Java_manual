package patterns.generating.builder;

public class PersonDirector {
    private Person.PersonBuilder builder;

    public PersonDirector(Person.PersonBuilder builder) {
        this.builder = builder;
    }

    public Person createYoungPerson(String name, String company) {
        return builder.setName(name)
                .setCompany(company)
                .setHasCar(false)
                .setHasBike(true)
                .setAge(20)
                .build();
    }

    public Person createSeniorPerson(String name, String company) {
        return builder.setName(name)
                .setCompany(company)
                .setHasCar(true)
                .setHasBike(false)
                .setAge(60)
                .build();
    }
}
