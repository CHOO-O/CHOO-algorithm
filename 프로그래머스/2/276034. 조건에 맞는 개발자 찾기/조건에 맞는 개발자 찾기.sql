SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT CODE
                     FROM SKILLCODES
                     WHERE NAME = 'Python') != 0 OR
      SKILL_CODE & (SELECT CODE
                     FROM SKILLCODES
                     WHERE NAME = 'C#') != 0
ORDER BY ID
;



# 비트연산
# 110 과 
# 010 비교했을 때
# AND연산하면 같은게 있을 때만 0이 아니게 됨