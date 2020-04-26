import socket


def main():
    host = '127.0.0.1'
    port = 5000

    s = socket.socket()
    s.connect((host, port))

    message = input("=> ")
    s.send(message.encode('utf-8'))
    data = s.recv(1024).decode('utf-8')
    print("Received from server: "+data)
    message = input("=> ")

    s.close()

main()