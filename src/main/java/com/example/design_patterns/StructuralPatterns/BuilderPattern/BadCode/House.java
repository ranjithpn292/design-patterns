package com.example.design_patterns.StructuralPatterns.BuilderPattern.BadCode;

public class House {

    private String foundation;

    private String structure;

    private String roof;

    private boolean hasGarage;

    private boolean hasSwimmingPool;

    private boolean hasGarden;

    House(String foundation,String structure, String roof, boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden){
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
