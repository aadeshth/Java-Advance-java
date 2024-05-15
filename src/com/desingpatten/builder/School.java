package com.desingpatten.builder;


public class School {
    String name;
    String address;
    String type;

    private School(Builder builder)
    {
        this.name = builder.name;
        this.type = builder.type;
        this.address = builder.address;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public static class Builder {
        String name;
        String address;
        String type;

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }
        public School build(){
            return new School(this);
        }

    }

}
