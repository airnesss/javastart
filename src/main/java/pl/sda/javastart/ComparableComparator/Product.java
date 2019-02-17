package pl.sda.javastart.ComparableComparator;

import java.util.Comparator;

class Product implements Comparable<Product> {
    private String Producer;
    private String Name;
    private String Category;

    public Product(String producer, String name, String category) {
        Producer = producer;
        Name = name;
        Category = category;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    @Override
    public String toString() {
        return "Product [category = " + getCategory() + " producer = " + getProducer() + " name = " + getName() + "]";
    }

    @Override
    public int compareTo(Product p) {
        int categoryCompare = Category.compareTo(p.getCategory());
        if (categoryCompare != 0) {
            return categoryCompare;
        }
        int producerCompare = Producer.compareTo(getProducer());
        if (producerCompare != 0) {
            return categoryCompare;
        }
        return Name.compareTo(getName());
    }

    //zagnieżdzona klasa wewnetrzna
    public static class ProductNameComparator implements Comparator<Product> {
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }

    }
}

