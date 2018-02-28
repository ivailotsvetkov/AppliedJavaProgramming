package examTasks;

public interface IPort
{
 boolean send(String message);
 // send a message to the port.
 // If the message queue is full, send returns false (the calling thread is not
 // blocked), else the message is queued at the port.
 String receive();
 // receive a message from the port.
 // The calling thread is blocked if there are no messages queued to the port.
}
