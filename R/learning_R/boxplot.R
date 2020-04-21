library(dplyr)
df <- read.csv('data/murders.csv')

df_sub <- select(df, state, population, murders, region)
boxplot(
  df_sub$murders ~ df_sub$region,
  # grouping the number of murders according to region.
  xlab = 'Region',
  ylab = 'Murders',
  main = 'Region vs. Murders',
  col = 'red',
  border = 'blue',
  notch = TRUE #
) 

