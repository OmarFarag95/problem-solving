import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    
    sorted_df = employee.drop_duplicates(subset=['salary'])

    sorted_df = sorted_df.sort_values(by = 'salary', ascending = False)

    if len(sorted_df) <2:
        return pd.DataFrame({'SecondHighestSalary': [None]})
    
    second_salary = sorted_df.iloc[1]['salary']

    return pd.DataFrame({'SecondHighestSalary': [second_salary]})

    

