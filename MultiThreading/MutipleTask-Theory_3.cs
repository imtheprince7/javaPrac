
  ==============  Thread Class Constructor And methods =======================
    Runnable Interface :

1. Normal:       Thread(),       Thread (Runnable target),       Thread(String Name)
                 Thread(Runnable Target, String Name[name of thread, if want, otherwise JVM provide from 0,..])

2. ThreadGroup:  Thread(ThreadGroup target, Runnable Target),              Thread(ThreadGroup target, String Name)
                 Thread(ThreadGroup target, Runnable Target, String Name)  Thread(ThreadGroup target, Runnable Target, String Name, Long stackSize)

   ===========  Method ==============
BasicMethod:       run(),      start(),    currentThread(),    isAlive()
NamingMethod:      getName(),  setName(String Name)
DeamonThread:      isDaemon(), setDaemon(boolean b)
PriorityBased:     getPriority(), setPriority()
PreventingBased:   sleep(-),     yield(),    join()
interruptingBased: intrupt(),   isInterupted(),  interrupted()


   ============ inter-Thread Communication  ============
    comes under Object-Class
class Object{

    wait()
    notify()
    notifyAll()
}

======================== DAEMON THREAD =========================================
Def:-     Which run in the background of another thread.
Use:-     It provides service to  Threads.
Ex:-      GarbageCollector, Spelling Checker, etc.
Life:-    Life depends on another Thread. If thread dead then DeamonThread also DEAD.
Nature:-  It inherit the nature/propertied from the parent thread.
Role:-    JVM roles in DeamonThread
Prority:  Most of the time priority of DeamonThread is low but we can change priority based on need.   


        METHODS:
    public final void setDaemon(boolean b ){ }
    public final boolean isDaemon(){ } return true-false based on result.


Case1:      we have to create DeamonThread before starting the thread, If we create DeamonThread after starting it,
            It will throw run-time exception. i.e: illegalThreadStateException
Case 2:     We cannot create main Thread as DeamonThread. 