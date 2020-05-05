# This package provides some inttuitive functionalities to manage data frame
# It does not bring any new functionalities to R, but simplifies the existing R functionalitites.

# Importing package
library(dplyr)

#select function. Used to subset the data with specific rows
df <- read.csv('data/murders.csv')
df
str(df) # with str is a compact way to display an R object
dim(df)
names(df) #Names of the columns
str(df) # The structure of the dataframe
head(df) # returns first 6 rows by default. Can specify row numbers
tail(df) #returns last 6 rows by default. Can specify row numbers

# 'state[c(state, population)]' The columns are said to be not found. So, the select function is needed.

select(df, abb:population) # individual columns can also be passed
select(df,-(abb:population)) # With parenthesis, multiple columns can be excluded.


#filter function. filter(df, condition, ...)
filter(df, murders>100) # Returns the observations that meets the condition. Can have complex condition.


#arrange function. This orders data with the given column.
arrange(df, murders) # sorted in ascending with murders number
arrange(df, desc(murders)) # In descending

#rename function. Used to rename column name
rename(df, abbreviation=abb) # renames 'abb' to 'abbreviation'. Can rename multiple. 


#mutate function. Used to add columns (can be derived from exising) or change existing ones. 
mutate(df, murder_to_pop_ratio=murders/population)

transmute(df, murder_to_pop_ratio=murders/population) # Similar to mutate, but this drops all other cols
#except the newly created one. 

#group_by function. returns the group (all the distinct values) of a column
group_by(df, region)  # region = 4: south, north, west, east.


# summarize. Often used in conjunction with the group_by
summarize((group_by(df, region)), sum(murders)) # sum of murders from all states in each region.
# mean, median, max, min, etc., can be in the place of sum


#Pipeline operator (%>%). Handy when applying sequence of operations on dataframe. Pass the result from one
#function to another. Works from left to right. The result from left is the dataframe argument for the right.
arrange(df, murders) %>% select(state, murders) # the 'state' in select() is not the df; it come from the left.
# Here select picks up the state and murders columns.
arrange(df, desc(murders)) %>% select(state, murders) %>% head(3) # Top 3 states with heighest murders.


