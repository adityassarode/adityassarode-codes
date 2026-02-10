#Aditya Sarode

'''4a. Develop a Python script that utilizes NumPy for matrix operations,
highlighting its role in numerical computing.'''




import numpy as np

A = np.array([[1,2,3],
              [4,5,6],
              [7,8,9]])

B = np.array([[9,8,7],
              [6,5,4],
              [3,2,1]])

print("Matrix A:\n", A)
print("Matrix B:\n", B)
print("Matrix Addition (A + B):\n", A + B)
print("Matrix Subtraction (A - B):\n", A - B)
print("Matrix Multiplication (A @ B):\n", A @ B)
print("Determinant of Matrix A:\n", np.linalg.det(A))
print("Transpose of Matrix A:\n", A.T)

C = np.array([[1,2],
              [3,4]])

print("Matrix C:\n", C)
print("Inverse of Matrix C:\n", np.linalg.inv(C))
