================================= WAY TO CREATE THREADS   ===============================
    1.  By using Thread-Class
    2.  By using Runnable-interface


    ======== Runnable- interface ==========
        Runnable interface has only one Methods  ( hence it's called functional-interface)
            run()



=============== Thread-Class   =====================
// Constructor
// Methods
    run()      start()
    sleep()    join()
    getName()  setName()
    interupted  priority
    deamon.

 ****************   Life-Cycle of Threads  ***************
  1. Create ( new Thread)
  2. Runnable( about to start by start())
  3. Running ( execute code inside of run())
  4.* non-runnable state ( sleep(), waiting(), suspend());
  5.  dead ( thread complete its execution).


=======================================================================
    Out of 2 ways   
        Runnable is best to makes thread-based class.
    Reasons:
            As we know that Class will definetly extends another class and if we extends Thread Class then we can't extends another class.
            By using runnable-interface we can implements runnable properties and also can inherit existing class prorperties based on requiremnts. 


======================================   OPEARTIONS ================================
 1. Performing Single task from single Threads
 2. Performing multiple task from multiple Threads
 3. Performing multiple task from single Threads [ It's not possible ] ( If we do then it follow same object-method relations: first it execute one Method complely then second-method)
            :Violating MultiThreading concept

 4. Performing multiple task from multiple Threads
        TO perform this 
        we have to create seprate class to perform seprate operation of Process 
            Example VLC MEDIA PLAYER    
                Class Video{ }, Class Audio{ }, Class ProgressBar{ }, Class Lebel{ },
                Then we create Main-Class, insider we create multiple-thread and call class .
                So all the operation run parallely instead of sequentially.
    All thread execute continuosly and we can't judge it is done by JVM internally.
    We can control execution flow by synchronization.** 

==================================================================================
sequence of thread execution is managed by JVM internally
Thread scheduler and Algorithm ( Round-Robin, etc...)
main()- method is also a thread in Java Program which is byDefault call by JVM, without explicit call.
