####
# Iremos entregar mensagens para múltiplos consumidores.
# Esse padrão é conhecido como publish/subscribe
#
# Lembre-se:
# Um produtor é um aplicativo de usuário que envia mensagens.
# Uma fila é um buffer que armazena mensagens.
# Um consumidor é um aplicativo de usuário que recebe mensagens.

# Existem alguns tipos de intercâmbio (exchange) disponíveis: 
# direto, tópico, cabeçalhos e fanout.
# Vamos nos concentrar no último - o fanout. 
# Ele transmite todas as mensagens que recebe para todas as filas que conhece. 


#!/usr/bin/env python
import pika
import sys

# Conectando com o RabbitMQ
connection = pika.BlockingConnection(
    pika.ConnectionParameters(host='localhost'))
channel = connection.channel()

# Vamos criar uma troca tipo fanout e chamar de logs
channel.exchange_declare(exchange='logs', exchange_type='fanout')

message = ' '.join(sys.argv[1:]) or "info: Hello World!"
channel.basic_publish(exchange='logs', routing_key='', body=message)
print(" [x] Sent %r" % message)
connection.close()