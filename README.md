# 🛒 SuperMarketManager 🛒

**SuperMarketManager** is a simple Java application designed to simulate inventory management for a supermarket.

## 🏛 Database Architecture 🏛

The core strength of this project lies in its database design, which solves common errors by splitting entities:

1.  **Product:** Represents the catalog data (Barcode, Name, Price, Category).
2.  **Inventory:** Represents a specific batch of products located in the warehouse (Quantity, Expiration Date).

### SQL Setup Script
To run this project, create a database named `supermarket_db` and execute the following SQL script:

```sql

-- 1. Product Catalog Table
CREATE TABLE IF NOT EXISTS product (
    barcode VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    category VARCHAR(50) NOT NULL
);
