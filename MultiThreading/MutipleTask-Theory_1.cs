    MultiTasking:
            Performing multiple task in single time.
                Example:
            -------------------------------------------------
              ||  VLC   ||  MsWord ||  Browser || MusicApp || 
            --------------------------------------------------
                       Operating System ( OS )
            --------------------------------------------------
                 Cental Processing Unit ( CPU )
            --------------------------------------------------

    MultiTasking Uses:
            It increases the Performance of CPU

    MultiTasking Acheive:
            It Acheive by Two ways:
                1. Process Based MultiTasking :---> 
                2. Thread Based MultiTasking ( MultiThreading)*

  ================ Process Based MultiTasking ===============

    MultiPle Processing     
                When One System is connected to multiple processor.
             Example:
            ---------------------------------------------------
              ||  VLC   ||  MsWord ||  Browser || MusicApp || 
            ---------------------------------------------------
                       Operating System ( OS )
            ---------------------------------------------------
                    ↓          ↓         ↓
                  CPU-1 ||   CPU-2 ||  CPU-3
            ---------------------------------------------------
    It's Based suitable at System Level / OS Level.


  ================ Thread Based MultiTasking ===============
    MultiThreading: 
                Executinng multiple thread at single time.
    Process:    VLC RUNNING
    Threads:    Video / Sound / Timer Inc,Dec / ProgressBar ( subProcess, Small Task)

        USES:   SoftWare, Games, Animations, etc...


Why We use MultiThreading:
    In case of VLC PLAYER: if we call method to perform-Operation of Video||Sound||Timer Inc,Dec||ProgressBar
        Then it execute one by one so it won't be best PLAYER. (It's will take time to run whole program).
        To run parallerly all the operation of VLC we introduce MULTI-TASKING in program.
        Now we can watach VIDEO and listen MUSIC parallerly without any sequence.


=================== JAVA PROVIDE PRE-DEFINED API FOR MultiThreading =============
    * Thread
    * Runnable
    * Thread-Group
    * Concurrency
    * Thread-Pool

========================   PROCESS /THREAD  ======================================

## PROCESS:        
Def:                A program which is in executing state.
Weight:             It's a heavy weight 
ContextSwitching:   Takes More time.
Communication:      Take more time.
AddressSpace:       Each process has different address space.
Dependency:         Process are not dependent on each other
Synchronization:    Process doesn't require synchronization
TimeOfCreation:     Take more time to create.
TimeOfTermination:  Take More time to terminate.


## THREAD
Def:                It's a sub-part of process (Small-task).
Weight:             Light-Weight
ContextSwitching:   Takes less time
Communication:      Takes less time
AddressSpace:       Threads share same address space
Dependency:         Threads are dependent on each other.
Synchronization:    Threads may require synchronization.
TimeOfCreation:     Take less time to create.
TimeOfTermination:  Take less time to terminate.



====================================        WAY TO CREATE THREADS   ================================
    1.  By using Thread-Class
    2.  By using Runnable-interface