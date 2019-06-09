public class Reformatory {
    private int mittaus;

    public int weight(Person person) {
        // return the weight of the person
        this.mittaus++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int paino = person.getWeight();
        paino++;
        person.setWeight(paino);
    }
    
    public int totalWeightsMeasured() {
        return this.mittaus;
    }

}
