
/**
 * _1071_Leetcode_GreatestCommonDivisorOfStrings
 * <p>
 * Version 1.0
 * <p>
 * Date: 3/13/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/13/2025    VANQUOCBUI    Create
 */


SELECT v.customer_id, COUNT(*) AS count_no_trans
FROM Visits v
         LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.transaction_id IS NULL
GROUP BY v.customer_id;
