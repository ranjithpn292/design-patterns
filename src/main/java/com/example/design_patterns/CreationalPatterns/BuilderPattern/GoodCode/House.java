package com.example.design_patterns.CreationalPatterns.BuilderPattern.GoodCode;

public class House {

    private String foundation;

    private String structure;

    private String roof;

    private boolean hasGarage;

    private boolean hasSwimmingPool;

    private boolean hasGarden;

    private House(HouseBuilder houseBuilder){
        this.foundation = houseBuilder.foundation;
        this.structure = houseBuilder.structure;
        this.roof = houseBuilder.roof;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasGarden = houseBuilder.hasGarden;
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
    public static class HouseBuilder {

        private String foundation;

        private String structure;

        private String roof;

        private boolean hasGarage;

        private boolean hasSwimmingPool;

        private boolean hasGarden;

        HouseBuilder(String foundation, String structure, String roof){
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        public HouseBuilder setHasGarage(boolean hasGarage){
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool){
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden){
            this.hasGarage = hasGarden;
            return this;
        }

        public House build(){
            return new House(this);
        }


    }
}
