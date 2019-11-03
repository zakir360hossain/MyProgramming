import re
import argparse

def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('word', help='specify which word to search for')
    parser.add_argument('file_name', help='specify file to search')
    args = parser.parse_args()

    search_file = open(args.file_name)
    line_number = 0
    for line in search_file.readlines():
        line = line.strip('\n\r')
        line_number+=1
        search_file = re.search(args.word, line, re.M|re.I)
        if search_file:
            print(str(line_number)+': '+line)

if __name__ == '__main__':
    main()
