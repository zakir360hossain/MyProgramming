# Handling the missing data in vector or dataframe. Missing data are represented as NA


#Vector
A <- c(10, 4, NA, 7, 15)
is.na(A) # Returns a vector of logical. TRUE in the index where data is missing (NA or NaN. NA does not have a class
is.nan(A) # Also returns a vector of logical. Has class. None are TRUE in here because there is no NaN
A <- c(10, 4, NA, 7, NaN)
is.nan(A)
is.na(A) # Two indices will have TRUE values

# Remove missing values from vector
grade <- c(100, 99, 100, NA, 89, NaN, 97, NaN, NA, 70)
empty <- is.na(grade)
grade[!empty] # All the NA and NaN are excluded by negating the TRUE.


# Dataframe
id <- c(101, 102, 103, 104, 105)
temperature <- c(28.8, 34.2, NA, 27.4, 20.5)
wind <- c(78, 59, 63, 40, 68)
humidity <- c(25, 45, 85, NA, 61)
weather <- data.frame(id, temperature, wind, humidity)
weather
is.na(weather) # Returns as a dataframe with logical. TRUE in whichever slot the data is missing
NA_cases <- complete.cases(weather) # Returns a vector of logical. FALSE in whichever row there is data missing
NA_cases
weather[NA_cases, ] # rows without missing data are returned; whenever elem in NA_cases is TRUE.

