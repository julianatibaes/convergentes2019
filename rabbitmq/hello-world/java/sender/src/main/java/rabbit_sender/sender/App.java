package rabbit_sender.sender;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * Hello world!
 *
 */

public class App 
{
	// nome da fila
	private final static String QUEUE_NAME = "hello";
	
    public static void main( String[] argv ) throws Exception
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
        
        String message = "Se deixar um lobo vivo, as ovelhas nunca estarão seguras.";

        channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
        
        System.out.println(" [x] Sent: '" + message + "'");
        
    }
}
