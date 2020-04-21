# Importing data: read.table(), read.csv()
#read.table args:
  # file -> name of the file (mandatory)
  # header -> logical value (default=false) indicating if the file has header
  # sep -> separator (default=space), takes a string. If text are separated by anything else ($, *, etc.) then specify
  # indicating how columns are separated
  # nrows -> number of rows (default=entire file) to indicate how many rows to read
  # skip -> number of rows to skip when reading the file (deafult=0)

#read.csv: very much same as table, but the default value for sep arg is comma. And header is by default TRUE

# With read.table. 
state_df <- read.table('data/state.txt', header = TRUE) # Dummy data. This data isalready separated.
state_df
complete.cases(state_df)


# With read.csv
ethnicity <- read.csv('data/ethnicity.csv')
ethnicity


# Read data with RDS (R Data Single) files
# This is R's own binary forma and very efficient. But this type of files cannot be loaded to other kind of programs
# Converting the csv dataframe to rds format
saveRDS(ethnicity, file = 'data/ethnicity_RDS.rds') # creates a rds file in cwd
readRDS('data/ethnicity_RDS.rds')

# Reading from internet
url.show('http://softlect.in/datasets/sbuxPrices.csv') # Showing if it exist
prices <- read.table('http://softlect.in/datasets/sbuxPrices.csv', sep=',', header = TRUE)
prices


# Reading from clipboard
state_df2 <- read.table('clipboard') # I have copied the content of state.txt on my clickboard with cmd + C
state_df2
# This is not working for now on the machine.

