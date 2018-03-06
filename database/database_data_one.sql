USE evolved;

INSERT INTO role (role) VALUES ('ROLE_USER'), ('ROLE_ADMIN'), ('ROLE_COMPANY'), ('ROLE_CUSTOMER'), ('ROLE_ASSESSOR');
INSERT INTO account (email_address, password_salt, password, date_created) VALUES ('admin@gmail.com', '123', 'password', now());
INSERT INTO account_role (fk_account, fk_role) VALUES (1, 2), (1, 3);

SELECT r.role FROM account a INNER JOIN account_role ar ON a.id = ar.fk_account JOIN role r ON r.id = ar.fk_role WHERE a.id = 1; 
SELECT * FROM role;

SELECT * FROM account;
SELECT * FROM account_role;