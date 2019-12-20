import argparse

parser = argparse.ArgumentParser(description='Calculate the volume of a pyramid')
parser.add_argument('length', type=int, help='Length of the pyramid')
parser.add_argument('height', type=int, help='Height of the pyramid')
parser.add_argument('width', type=int, help='Width of the pyramid')

# Telling which way to print the results, with sentence or simply the number
group = parser.add_mutually_exclusive_group()
group.add_argument('-v', '--verbose', action='store_true')
group.add_argument('-q', '--quiet', action='store_true')
group.add_argument()
args = parser.parse_args()


def pyramid_volume(length, height, width):
    volume = (length * height * width) / 3
    return volume


if args.verbose:
    print("The volume of the pyramid", pyramid_volume(args.length, args.height, args.width))
elif args.quiet:
    print(pyramid_volume(args.length, args.height, args.width))
