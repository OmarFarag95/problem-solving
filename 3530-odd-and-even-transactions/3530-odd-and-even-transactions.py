import pandas as pd

def sum_daily_odd_even(transactions: pd.DataFrame) -> pd.DataFrame:
    odd_df = transactions[transactions['amount'] % 2 !=0]
    even_df = transactions[transactions['amount'] % 2 == 0]


    odd_df = odd_df.groupby('transaction_date').agg({
        'amount':'sum'
    }).reset_index()
    
    even_df = even_df.groupby('transaction_date').agg({
        'amount':'sum'
    }).reset_index()

    odd_df.rename(columns={'amount':'odd_sum'}, inplace=True)
    even_df.rename(columns={'amount':'even_sum'}, inplace=True)

    grouped_df = pd.merge(odd_df, even_df,on='transaction_date', how='outer').fillna(0)

    return grouped_df.sort_values(by='transaction_date', ascending=True)
