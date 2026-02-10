#Aditya Sarode

'''5a. Write a Python function to handle missing data in a dataset, employing
strategies like mean imputation.'''




import pandas as pd
import numpy as np

data = pd.DataFrame({
    'Feature1': [1, 2, np.nan, 4, 5],
    'Feature2': [10, np.nan, 30, 40, 50]
})

print("Missing values before:")
print(data.isna().sum())

data.fillna(data.mean(), inplace=True)

print("\nData after filling missing values:")
print(data)
