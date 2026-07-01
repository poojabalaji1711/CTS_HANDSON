CREATE TABLE department (
    dp_id INT AUTO_INCREMENT PRIMARY KEY,
    dp_name VARCHAR(45) NOT NULL
);

CREATE TABLE employee (
    em_id INT AUTO_INCREMENT PRIMARY KEY,
    em_name VARCHAR(45) NOT NULL,
    em_salary DOUBLE NOT NULL,
    em_permanent BOOLEAN NOT NULL,
    em_date_of_birth DATE NOT NULL
);

CREATE TABLE skill (
    sk_id INT AUTO_INCREMENT PRIMARY KEY,
    sk_name VARCHAR(45) NOT NULL
);
