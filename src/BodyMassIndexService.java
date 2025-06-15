public class BodyMassIndexService {

    public double calculate(double bodyMass, double height) {
        double heightmm = height * 10;
        double index = bodyMass / (heightmm * heightmm);
        return index;
    }
}
