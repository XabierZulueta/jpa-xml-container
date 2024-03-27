CREATE TABLE mydatabase.commercial_structure (
                                      id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                                      parent_id BIGINT,
                                      name VARCHAR(255)
);
CREATE TABLE mydatabase.portfolio (
                           id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                           initial_date datetime(6),
                           final_date datetime(6),
                           society VARCHAR(255),
                           amount DECIMAL(10, 2)
);

INSERT INTO portfolio(initial_date, final_date, society, amount)
VALUES('2021-01-01','2023-01-01','SOCIETY',2.56);
INSERT INTO portfolio(initial_date, final_date, society, amount)
VALUES('2021-12-01','2023-01-01','SOCIETY 2',0.10);
INSERT INTO portfolio(initial_date, final_date, society, amount)
VALUES('2021-01-01','2023-01-01','SOCIETY',1.23);
