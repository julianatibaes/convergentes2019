# FONTE https://www.rabbitmq.com/tutorials/tutorial-one-python.html

#!/usr/bin/env python
import pika

# Conectando com o nosso broker, que neste caso está no localhost mesmo
connection = pika.BlockingConnection(pika.ConnectionParameters('localhost'))
channel = connection.channel()

# Criando uma fila na qual a mensagem será recebida, nesse caso, defini a fila como positivo
channel.queue_declare(queue='positivo')

# Pronto. Até aqui, tudo o que precisávamos para estabelecer a conexão e receber 
# a mensagem já foi feito. 
# Agora iremos preparar os métodos para receber a mensagem.

# Para receber a mensagem precisamos criar um método que irá servir como uma assinatura de 
# função para retornar a chamada de uma fila. 
# Isso acontece porque sempre que formos receber uma mensagem essa funcão será acionada e 
# retornará a mensagem recebida.
def callback(ch, method, properties, body):
    print(" [x] Recebidinhos %r" % body)

# Note que agora no comando de receber a mensagem, nós acionamos o método anterior no on_message_callback.
# Para esse comando funcionar, precisamos ter certeza de que a fila que estamos chamando existe.
channel.basic_consume(queue='positivo',
                    auto_ack=True,
                    on_message_callback=callback)

print(' [*] Esperando as mensagens. Para desistir de tudo aqui, clique em CTRL+C')

# Esse comando entra num loop eterno, só esperando as mensagens chegarem. 
# Mas você pode parar tudo com o CTRL+C.
channel.start_consuming()