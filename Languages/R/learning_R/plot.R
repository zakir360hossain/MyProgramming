library(dplyr)
df <- read.csv('data/murders.csv')
df
df_sub <- select(df, state, population, murders)

# Scatter plot
plot(
  df_sub$population,
  df_sub$murders,
  xlab = 'Population',
  ylab = 'Murders',
  main = 'Population vs. Murders',
  col = 'red',
  pch = 20
) # R has some pre-defined signifiers for pch (plot charater).

# Line graph
plot(
  df_sub$murders,
  type = 'l',
  xlab = 'States',
  ylab = 'Murders',
  main = 'States vs Murders',
  col = 'blue'
)
