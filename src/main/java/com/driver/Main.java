package com.driver;

public class Main {
    class Product {
        public int product(int x, int y) {
            System.out.print("x->" + x + " & " + "y->" + y);
        }

        public int product(int x, int y, int z) {
            System.out.print("x->" + x + " & " + "y->" + y + "z->" + z);
        }

        public double product(double x, double y) {
            System.out.print("x->" + x + " & " + "y->" + y);
        }

    }

    public void main(String[] args) {
        Product p = new Product();
        p.product(10, 20);
        p.product(10, 20, 30);
        p.product(10.123, 20.321);

    }

}
