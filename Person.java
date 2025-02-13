// Implementing Comparable for sorting by name
class Person implements Comparable<Person> {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
    
    @Override
    public String toString() {
        return "- " + name;
    }
}