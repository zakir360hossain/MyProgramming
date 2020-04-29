library(ggplot2)

#qplot():
# a plot function from ggplot2 that is analogous to base plot() of R, but has additional features.
# It's an option when not a lot customization is needed.


str(mpg) # An automobile dataframe from ggplot2. 
# "Hello world plot"
qplot(displ, hwy, data=mpg) #(x, y, df) displacement and highway
qplot(displ, hwy, data=mpg, col= drv) #auto legend placement (each level of drive factor is assigned with a color)
# 4 (four-wheel drive)->red, f (front-wheel drive)->green, r (rea-wheel drive) -> blue

#Adding geom.
qplot(displ, hwy, data=mpg, col=drv, geom = c("point", "smooth"))

# Histograms by group
qplot(hwy, data=mpg, fill=drv) # highway vs. its frquency

# With facet. Not just coloring different level of a factor, but separating thos indiviual portion of color
# into each own little sub-graph
qplot(displ, hwy, data=mpg, col=drv, facets =.~ drv)
qplot(hwy, data=mpg, facets =.~ drv, fill=drv, binwidth=2) # for histogram


df <- read.csv('data/murders.csv')
df
qplot(murders, data=df, fill=region) # group by hist
qplot(murders, data=df, geom = "density", col = region) # Density smooth
qplot(PopulationDensity, murders, data = df, shape=region, col=region) # size is for plot size, like cex.
# separating with both shape and color (not necessary but for practice)




# ggplot():




