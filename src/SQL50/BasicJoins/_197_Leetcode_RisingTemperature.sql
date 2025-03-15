

/**
 * _197_Leetcode_RisingTemperature
 * <p>
 * Version 1.0
 * <p>
 * Date: 3/15/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/15/2025    VANQUOCBUI    Create
 */

SELECT w1.id
FROM Weather w1
         JOIN Weather w2
              ON DATEDIFF(w1.recordDate, w2.recordDate) = 1
WHERE w1.temperature > w2.temperature;
