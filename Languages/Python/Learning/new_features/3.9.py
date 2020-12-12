"""
Contains the features of python3.9
"""

#Dictionalt merging and updating
cities = {"USA": "New York", "France": "Paris"}
more_cities = {"India": "Bombay", "UK": "London"}

#mergin before
all_cities = {**cities, **more_cities}
#merging now
all_cities = cities | more_cities
print(all_cities)

#updating before
all_cities.update(more_cities)
#updating now
cities |= more_cities
print(all_cities)



#Clean Prefix (same applies to suffix, just change to endswith and rmeovesuffix )
#If such prefix or suffix does not exist in an element, than it returns the original string
names = ["Mr. Roger", "Mr. Rubin", "Mr. Carl"]
for n in names:
    # before
    if n.startswith("Mr."):
        n_replaced = n.replace("Mr.", '')
        print(n_replaced)
    
    #now
    n_removed = n.removeprefix("Mr.")
    print(n_removed)



#New package: zoneinfo, graphlib
import zoneinfo

for tz in zoneinfo.available_timezones():
	print (tz)

print(len(zoneinfo.available_timezones()))

#To find time in a specific time zone
from datetime import datetime
timezone1 = zoneinfo.ZoneInfo('US/Pacific')
print(datetime.now()) #Time where I am 
print(datetime.now(tz=timezone1)) #Time in the specified zone



#Type Hinting Geneerics in Standard Collections -> can use list, dict, etc., types instead of having to import List, Dict, etc.
def greeting_guests(names: list[str]) -> None:
	for name in names: 
		 print("hello", name)

names = ["George", "Joe", "Jamail", "Ivan"]
print(greeting_guests(names))


