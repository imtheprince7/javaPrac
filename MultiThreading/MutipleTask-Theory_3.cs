
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
Def:-    Which run in the background of another thread.
Use:-    It provides service to  Threads.
Exam:-   GarbageCollector, Spelling Checker, etc.

        METHODS:
    public final void setDaemon(boolean b ){ }
    public final boolean isDaemon(){ } return true-false based on result.
