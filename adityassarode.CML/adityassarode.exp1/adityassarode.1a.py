#Aditya Sarode

'''1a. Write a Python script to explain the concepts of supervised and
unsupervised learning using a sample dataset.'''



import matplotlib.pyplot as plt, seaborn as sns
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, confusion_matrix
from sklearn.cluster import KMeans

X, y = load_iris(return_X_y=True)


X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3, random_state=42)
y_pred = DecisionTreeClassifier().fit(X_train, y_train).predict(X_test)

print("Supervised Learning - Classification Accuracy:",
      round(accuracy_score(y_test, y_pred), 2))

sns.heatmap(confusion_matrix(y_test, y_pred), annot=True, fmt="d", cmap="Blues")
plt.title("Confusion Matrix")
plt.show()


kmeans = KMeans(n_clusters=3, random_state=42, n_init=10).fit(X[:, :2])
plt.scatter(X[:,0], X[:,1], c=kmeans.labels_, cmap="viridis")
plt.title("Unsupervised Learning - KMeans Clustering")
plt.xlabel("Feature 1")
plt.ylabel("Feature 2")
plt.show()
