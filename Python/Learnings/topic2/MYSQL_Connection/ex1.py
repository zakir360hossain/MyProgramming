from mysql import connector

user = connector.connect(
    host="localhost",
    user="root",
    password="123Principia890",
    database="hhs"
)

# Initialize cursor - this is the one that communicates with MYSQL
cursor = user.cursor()
cursor.execute("CREATE DATABASE if not exists hhs")
cursor.execute("show databases")

for db in cursor:
    print(db)

# Creating tables
cursor.execute(
    "CREATE TABLE IF NOT EXISTS students (first_name VARCHAR (100), last_name VARCHAR (100), age INTEGER (10))")

print("\n")
cursor.execute("show tables")
for tb in cursor:
    print(tb)
