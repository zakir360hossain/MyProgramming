library(dplyr)

df <- read.csv('data/murders.csv')
df
#barplot function. argument is numberical vector
barplot(
        select(df, state, population)$population,
        # Selected state and population from df. Plotting vs. population
        xlab = 'abb',
        ylab = 'population',
        main = 'States vs. Population',
        names.arg = df$state,
        # names for each bar
        col = 'brown',
        border = 'blue'
)
# To make the graph horizontal (bars are horizontal instead of vertical) pass the 'horiz' argument
# to be true; false by default.



# Stacked barplot. If the df is matrix, then it will create stacked bargraph
df2 <- read.csv('data/murdersmini.csv')
df2 <-
        mutate(df2, ppt = population / 10000) # Population per ten thousand. Just for convenience.
df2 <-
        df2[c(1, 3, 4)] # state, murder, and the new population measure.
df2_matrix <-
        data.matrix(df2) # converting df2 to a matrix. State names are now numeric values, since
# matrix can only have numeric values
df2_trans <- t(df2_matrix)
df2_trans
barplot(
        df2_trans,
        xlab = "States",
        main = "Population Vs. Murders",
        col = c('blue', 'red'),
        names.arg = df2$state
) # df2 still has the names of the states

legend("topleft", c("Population", "Murders"), fill = c("blue", 'red'))


# Another example of stacked bargraph
# Create the matrix of the values.
revenue <-
        matrix(
                c(2, 9, 3, 11, 9, 4, 8, 7, 3, 12, 5, 2, 8, 10, 11),
                nrow = 3,
                ncol = 5,
                byrow = TRUE
        )
revenue

# chart file name
png(file = "stacked_barchart.png")

# the input vectors.
colors = c("green", "orange", "brown")
months <- c("Mar", "Apr", "May", "Jun", "Jul")
regions <- c("UK", "USA", "India")

barplot(
        revenue,
        main = "Total Annual Revenue of IBM",
        names.arg = months,
        xlab = "month",
        ylab = "Revenue (Billion)",
        col = colors
)
legend("topleft", regions, cex = 1, fill = colors) # cex is the size of the legend.
# Save the file
dev.off()
