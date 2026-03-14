# Retail Inventory Hibernate CRUD

Simple Maven-based Hibernate CRUD example for a retail inventory system.

Files added:

- `pom.xml` — Maven config with Hibernate and MySQL dependencies
- `src/main/resources/hibernate.cfg.xml` — Hibernate configuration
- `src/main/java/com/inventory/entity/Product.java` — JPA entity
- `src/main/java/com/inventory/util/HibernateUtil.java` — SessionFactory helper
- `src/main/java/com/inventory/dao/ProductDAO.java` — CRUD DAO
- `src/main/java/com/inventory/main/MainApp.java` — Simple runner

Setup:

1. Update the DB connection in `src/main/resources/hibernate.cfg.xml` to match your MySQL credentials and database name (`inventory_db`).
2. Create the database if it doesn't exist: `CREATE DATABASE inventory_db;`
3. Build and run:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.inventory.main.MainApp"
```

Notes:

- Hibernate `hbm2ddl.auto=update` will create/update tables automatically.
- Change `@GeneratedValue` strategy in `Product` if using a different DB.
