library(dplyr)

df <- read.csv('data/GEStock.csv')
df_sub <- select(df, Date, Price)
hist(
  df_sub$Price,
  xlab = 'Stock Price',
  main = 'Stocks Data',
  col = 'orange',
  border = 'brown',
  breaks = 20
) # To specify the number of bins
