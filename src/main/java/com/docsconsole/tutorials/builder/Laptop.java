package com.docsconsole.tutorials.builder;


public class Laptop {

    private final String processor;
    private final Integer ram;
    private final String storage;
    private final Integer capacity;

    public Laptop(LaptopBuilder laptopBuilder) {
        this.processor = laptopBuilder.processor;
        this.ram = laptopBuilder.ram;
        this.storage = laptopBuilder.storage;
        this.capacity = laptopBuilder.capacity;
    }

    //getters

    public final static class LaptopBuilder {

        private String processor;
        private Integer ram;
        private String storage;
        private Integer capacity;


        public LaptopBuilder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public LaptopBuilder ram(Integer ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public LaptopBuilder capacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +"GB"+
                ", storage='" + storage + "\'" +
                ", capacity=" + capacity +"GB"+
                '}';
    }
}
