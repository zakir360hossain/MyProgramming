import socket


def main():
    host = '127.0.0.1'
    port = 5000

    s = socket.socket()
    s.bind((host, port))
    s.listen(1)  # 1 connection at a time

    client, address = s.accept()
    print("Connection from: " +str(address))
    while True:
        data = client.recv(1024).decode('utf-8')  # 1024 bytes at a time
        if not data:
            break
        print("From connected user: "+ data)
        data = data.upper()
        print("Sending: "+data)
        client.send(data.encode('utf-8'))

    client.close()

main()
