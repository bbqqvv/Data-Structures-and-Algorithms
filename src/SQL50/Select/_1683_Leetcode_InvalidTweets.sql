/**
 * _01_Leetcode75_MergeStringAlternately
 * <p>
 * Version 1.0
 * <p>
 * Date: 3/12/2025
 * <p>
 * Copyright
 * <p>
 * Modification Logs:
 * DATE        AUTHOR        DESCRIPTION
 * --------------------------------------
 * 3/12/2025    VANQUOCBUI    Create
 */

SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;

-- CHAR_LENGTH(content): Đếm số ký tự trong chuỗi (tốt hơn nếu có Unicode).
-- LENGTH(content): Đếm số byte (có thể khác nếu chuỗi chứa ký tự đa byte).
-- C2:
-- SELECT tweet_id
-- FROM Tweets
-- WHERE LENGTH(content) > 15;
