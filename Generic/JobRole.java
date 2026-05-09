abstract class JobRole {
}

class SoftwareEngineer extends JobRole {
}

class DataScientist extends JobRole {
}

class ProductManager extends JobRole {
}

class Resume<T extends JobRole> {

    T role;

    Resume(T role) {
        this.role = role;
    }

    static void process(java.util.List<? extends JobRole> roles) {

        for (JobRole r : roles) {
            System.out.println(r);
        }
    }
}

class Main16 {

    public static void main(String[] args) {

        java.util.List<SoftwareEngineer> list =
                java.util.Arrays.asList(new SoftwareEngineer());

        Resume.process(list);
    }
}