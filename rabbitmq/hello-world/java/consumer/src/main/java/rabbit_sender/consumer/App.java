package rabbit_sender.consumer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

/**
 * Hello world!
 *
 */
public class App 
{
	// nome da fila
	private final static String QUEUE_NAME = "hello";
	
    public static void main( String[] args ) throws IOException, TimeoutException
    {
    	ConnectionFactory factory = new ConnectionFactory();
    	
    	// onde que está o broker
        factory.setHost("localhost");
        
        // Abstrai a conexão do soquete, e cuida da negociação e
        // autenticação da versão do protocolo
        Connection connection = factory.newConnection();
       
        Channel channel = connection.createChannel();
        // Declarar a fila, para podermos receber a mensagem nela
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        
        System.out.println(" [*] Waiting for messages.");
        
        Consumer consumer = new DefaultConsumer(channel) {
        	
        	// Classe que implementa a interface do Consumidor que usaremos para
        	// armazenar as mensagens que o servidor nos enviou
        	@Override
        	public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException{
        		String message = new String(body, "UTF-8");
        		System.out.println("[x] Recebido ' " + message + "'");
        	}
        };
        
        channel.basicConsume(QUEUE_NAME, true, consumer);
        
    }
}
