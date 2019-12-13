import datetime
import time

print(datetime.MAXYEAR)
print(datetime.MINYEAR)
print(datetime.date.min, "\n")  # Earliest possible date. Also has 'max.'

print(time.time())  # fromtimestamp function
print(datetime.datetime.fromtimestamp(time.time() + 9999), "\n")

date = datetime.date(2017, 3, 30)  # Date object
time = datetime.time(22, 27, 7)  # Time object
dateTime = datetime.datetime(2017, 3, 30, 22, 27, 7, 45968)  # Datetime object
print(dateTime)
print(dateTime.isocalendar())
print(date.isoformat())
print(dateTime.ctime())
print(dateTime.strftime("%A, %B %d, %Y"), "\n")  # date in word. 'A' => 'a' is Saturday => Sat

print(dateTime.year)
print(dateTime.month)
print(dateTime.day)
print(dateTime.hour)
print(dateTime.minute)
dateTime = dateTime.replace(second=37, microsecond=32400)
print(dateTime.second)
print(dateTime.microsecond)
print(dateTime.timetuple())
print(dateTime.weekday(), "\n")  # Monday is 0

print(dateTime.date())
print(dateTime.time(), "\n")

moon_landing = "7/20/1969"  # String date conversion
moon_landing = datetime.datetime.strptime(moon_landing, "%m/%d/%Y")
print(moon_landing)
message = "Moon landing happened on {:%A, %B %d, %Y}."  # Formatting Date
print(message.format(moon_landing), "\n")

# Now
print(datetime.datetime.utcnow())
print(datetime.datetime.now())
