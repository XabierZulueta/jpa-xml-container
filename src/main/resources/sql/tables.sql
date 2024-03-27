CREATE TABLE portfolio (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           initial_date DATE,
                           final_date DATE,
                           society VARCHAR(255),
                           amount DECIMAL(10, 2)
);

CREATE TABLE commercial_structure (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      parent_id INT,
                      name VARCHAR(255),
                      FOREIGN KEY (parent_id) REFERENCES commercial_structure(id)
);