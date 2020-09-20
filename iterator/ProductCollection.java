package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public class ListIterator implements Iterator {
    private ProductCollection collection;
    private int count;

    public ListIterator(ProductCollection collection) {
      this.collection = collection;
    }

    public boolean hasNext() {
      return count < collection.products.size();
    }
    public String currentUrl() {
        return collection.get(count);
    }
    public void next() {
      count++;
    }
  }

}
