-- Exercise 1: Control Structures

-- Scenario 1:
-- Apply a 1% discount to loan interest rates
-- for customers above 60 years old.

BEGIN
    FOR cust IN (
        SELECT CustomerID, Age
        FROM Customers
        WHERE Age > 60
    )
    LOOP
        UPDATE Loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cust.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('1% interest discount applied successfully.');
END;
/

----------------------------------------------------------------

-- Scenario 2:
-- Promote customers with balance greater than 10000 to VIP.

BEGIN
    FOR cust IN (
        SELECT CustomerID, Balance
        FROM Customers
        WHERE Balance > 10000
    )
    LOOP
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = cust.CustomerID;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/

----------------------------------------------------------------

-- Scenario 3:
-- Print reminders for loans due within the next 30 days.

BEGIN
    FOR loan_rec IN (
        SELECT c.CustomerName,
               l.LoanID,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' ||
            loan_rec.CustomerName ||
            ', Loan ID ' ||
            loan_rec.LoanID ||
            ' is due on ' ||
            TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/