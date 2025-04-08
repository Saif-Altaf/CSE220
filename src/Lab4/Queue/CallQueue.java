package Lab4.Queue;

//YOU NEED TO RUN THIS CLASS TO TEST OUT THE METHODS
//YOU NEED TO ONLY WRITE THE FOLLOWING METHODS
// enqueueCall()
// dequeueCall()
// displayQueue()
// Inside of these methods you need to utilize the LinkedListQueue class methods
// vipQueue and regularQueue objects are already created for you
class CallQueue {

    private LinkedListQueue vipQueue;
    // VIP queue
    private LinkedListQueue regularQueue;
    // Regular queue

    //DO NOT CHANGE THIS CONSTRUCTOR
    public CallQueue() {
        this.vipQueue = new LinkedListQueue();
        this.regularQueue = new LinkedListQueue();
    }

    //You have to write this method
    public void enqueueCall(int customerId, boolean isVip) {
        if (isVip) {
            vipQueue.enqueue(customerId);
            System.out.println("Customer "+customerId+" added to VIP queue.");
        } else {
            regularQueue.enqueue(customerId);
            System.out.println("Customer "+customerId+" added to Regular queue.");
        }
    }

    //You have to write this method
    public void dequeueCall() {
        if(vipQueue.isEmpty() && regularQueue.isEmpty()){
            System.out.println("No calls in the queue.");
            return;
        }
        if (vipQueue.isEmpty() && !regularQueue.isEmpty()) {
            System.out.println("Processing Regular Customer "+regularQueue.dequeue()+".");

        } else {
            if (!vipQueue.isEmpty()) {
                System.out.println("Processing VIP Customer "+vipQueue.dequeue()+".");
            }
        }
    }

    //You have to write this method
    public void displayQueue() {
        LinkedListQueue tempVip=new LinkedListQueue();
        LinkedListQueue tempRegular=new LinkedListQueue();
        System.out.println("VIP Queue:");
        System.out.print("Queue (front to rear): ");
        while(!vipQueue.isEmpty()){
            int temp=vipQueue.dequeue();
            tempVip.enqueue(temp);
            System.out.print(temp+" -> ");
        }
        while(!tempVip.isEmpty()){
            vipQueue.enqueue(tempVip.dequeue());
        }
        System.out.print("NULL"+"\n");
        System.out.println("Regular Queue:");
        System.out.print("Queue (front to rear): ");
        while (!regularQueue.isEmpty()){
            int temp=regularQueue.dequeue();
            tempRegular.enqueue(temp);
            System.out.print(temp+" -> ");
        }
        while(!tempRegular.isEmpty()){
            regularQueue.enqueue(tempRegular.dequeue());
        }
        System.out.print("NULL"+"\n");
    }

    public static void main(String[] args) {
        //      ::Expected Ouput::
        // Customer 101 added to Regular queue.
        // Customer 201 added to VIP queue.
        // Customer 102 added to Regular queue.
        // Customer 202 added to VIP queue.
        // Customer 103 added to Regular queue.

        // VIP Queue:
        // Queue (front to rear): 201 -> 202 -> NULL
        // Regular Queue:
        // Queue (front to rear): 101 -> 102 -> 103 -> NULL

        // Processing VIP Customer 201.
        // Processing VIP Customer 202.
        // Processing Regular Customer 101.
        // Processing Regular Customer 102.
        // Processing Regular Customer 103.
        // No calls in the queue.

        // VIP Queue:
        // Queue (front to rear): NULL
        // Regular Queue:
        // Queue (front to rear): NULL

        CallQueue callCenter = new CallQueue();
        // Enqueueing customers 
        callCenter.enqueueCall(101, false);
        // Regular customer
        callCenter.enqueueCall(201, true);
        // VIP customer
        callCenter.enqueueCall(102, false);
        // Regular customer
        callCenter.enqueueCall(202, true);
        // VIP customer
        callCenter.enqueueCall(103, false);
        // Regular customer
        callCenter.displayQueue();
        // Processing calls
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        callCenter.dequeueCall();
        // No more calls
        callCenter.displayQueue();
    }
}