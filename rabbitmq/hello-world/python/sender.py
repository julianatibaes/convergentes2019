# FONTE https://www.rabbitmq.com/tutorials/tutorial-one-python.html
#!/usr/bin/env python
import pika

# Conectando com o nosso broker, que neste caso está no localhost mesmo
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
channel = connection.channel()

# Criando uma fila na qual a mensagem será entregue, nesse caso, defini a fila como positivo
channel.queue_declare(queue='positivo')

# Pronto. Até aqui, tudo o que precisávamos para estabelecer a conexão e 
# enviar a mensagem já foi feito. 
# Agora iremos preparar a nossa mensagem para ser enviada.

# No RabbitMQ, uma mensagem nunca pode ser enviada diretamente para a fila, 
# ela sempre precisa passar por uma troca (exchange).
# No nosso caso, o exchange está permitindo especificar exatamente para qual fila a mensagem deve ir.
# Esse nome de fila precisa ser especificado no routing_key
channel.basic_publish(exchange='',
                      routing_key='positivo',
                      body='O que você fez para melhorar o  mundo hoje?')
print(" [x] Enviando 'O que você fez para melhorar o  mundo hoje?'")

# Agora vamos garantir que os buffers de rede estejam nivelados e 
# que a nossa mensagem seja entregue ao RabbitMQ. 
# Podemos fazer isso fechando a conexão.
connection.close()