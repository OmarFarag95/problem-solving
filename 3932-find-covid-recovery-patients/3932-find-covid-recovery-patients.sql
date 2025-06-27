WITH FirstPosTest AS (
    SELECT 
        patient_id, 
        MIN(test_date) AS first_positive_date
    FROM covid_tests
    WHERE result = 'Positive'
    GROUP BY patient_id
),
FirstNegAfterPos AS (
    SELECT 
        covid_tests.patient_id,
        MIN(covid_tests.test_date) AS first_negative_after_positive
    FROM covid_tests
    JOIN FirstPosTest ON covid_tests.patient_id = FirstPosTest.patient_id
    WHERE covid_tests.result = 'Negative'
      AND covid_tests.test_date > FirstPosTest.first_positive_date
    GROUP BY covid_tests.patient_id
)

SELECT 
    FirstPosTest.patient_id, 
    patients.patient_name, 
    patients.age,
    DATEDIFF(day, FirstPosTest.first_positive_date, FirstNegAfterPos.first_negative_after_positive) AS recovery_time
FROM FirstPosTest
JOIN FirstNegAfterPos ON FirstPosTest.patient_id = FirstNegAfterPos.patient_id
JOIN patients ON FirstPosTest.patient_id = patients.patient_id
ORDER by recovery_time, patient_name 