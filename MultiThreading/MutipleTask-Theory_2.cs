====================================        WAY TO CREATE THREADS   ================================
    1.  By using Thread-Class
    2.  By using Runnable-interface


    ======== Runnable- interface ==========
        Runnable interface has only one Methods  ( hence it's called functional-interface)
            run()



    =========== Thread-Class   =================
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
        Runnable is best to makes thread of class.
    Reasons:
            As we know that Class will definetly extends another class and if we extends Thread Class then we can't extends another class.
            By using runnable-interface we can implements runnable properties and also can inherit existing class prorperties based on requiremnts. 
            