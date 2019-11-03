import socket


def main():
    host = '127.0.0.1'
    port = 5001  # port is different

    server = ('127.0.0.1', 5000)

    s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    s.bind((host, port))

    message = input("=> ")
    while message !='q':
        s.sendto(message.encode('utf-8'), server)
        data, address = s.recvfrom(1024)
        data = data.decode('utf-8')
        print("Received from server: "+data)
        message = input("=> ")
    s.close()

main()
