package org.example;

public enum Subject {
    LINEAR_ALGEBRA("description 1",120),
    MATHEMATIACAL_ANALIS("description 2",140),
    DIFERENTIAL_GEOMETRY("description 3",120),
    MATHEMATICAL_METHOD_OF_PHYSICS("description 4",160),
    TENSOR_CALCULATION("description 5",60),
    FUNCTIONAL_ANALYS("description 6",60),
    THEORY_GROUP_LI("description 7",60),
    VARIATIONAL_CALCULATION("description 8",60),
    QUONTUM_FIELD_THEORY("description 9",160),
    GENERAL_RELATIVITY("description 10",80);





    private String name;
    private int horarium;

    Subject(String name, int horarium) {
        this.name = name;
        this.horarium = horarium;
    }

    public String getName() {
        return name;
    }

    public int getHorarium() {
        return horarium;
    }

    public boolean passedOrFailed(int present){
        if(this.getHorarium() <= present ){
            return true;
        }else {
            return false;
        }
    }
}
