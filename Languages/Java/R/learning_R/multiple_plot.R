par(mfrow = c(2, 2)) #Dividing the plot area into nrow and col
#(ncol areas for every row)

library(dplyr)

df <- read.csv('data/murdersmini.csv')
df <- mutate(df, ppt = population / 10000)
names(df)
df <- df[c(1, 3, 4)]

barplot(
  df$ppt,
  xlab = 'States',
  ylab = 'Population',
  main = 'States vs. Population',
  col = 'blue',
  names.arg = df$state
)

barplot(
  df$murders,
  xlab = 'States',
  ylab = 'Murders',
  main = 'States vs Murders',
  col = 'blue',
  names.arg = df$state
)

plot(
  df$ppt,
  df$murders,
  xlab = 'Population',
  ylab = 'Murders',
  main = 'Population vs Murders',
  col = 'red',
  pch = 16
)
