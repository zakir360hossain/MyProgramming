import re


def main():
    # 'match' matches the entire string. 'search' look for specific words or character in the string
    line = "I think I know it"
    matchResult = re.match('think ', line, re.M | re.I)
    if matchResult:
        print("Match found" + matchResult.group())
    else:
        print("No match was found")  # => output because the entire string is not just 'think'
    search_result = re.search('think', line, re.M | re.I)
    if search_result:
        print("Match found " + search_result.group())
    else:
        print("Nothing found")


main()
