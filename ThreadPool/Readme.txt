
This sample creates Fixed ThreadPool with 5 running threads:
    Executors.newFixedThreadPool(5)

Then we creates X (10) threads and wait until they not finish work.
When one thread is finished another take this empty thread cell in the pool and run.

-- --------------------------------------------------------------------------------------------------

RESULT:

08:09:14 PM: Executing task 'SimpleThreadPool.main()'...

> Task :compileJava
> Task :processResources NO-SOURCE
> Task :classes

> Task :SimpleThreadPool.main()
20:09:15.544 [Thread_4] INFO com.abndev.sample.threadpool.WorkerThread - Thread_4 Start. Command = 4
20:09:15.544 [Thread_1] INFO com.abndev.sample.threadpool.WorkerThread - Thread_1 Start. Command = 1
20:09:15.544 [Thread_2] INFO com.abndev.sample.threadpool.WorkerThread - Thread_2 Start. Command = 2
20:09:15.544 [Thread_0] INFO com.abndev.sample.threadpool.WorkerThread - Thread_0 Start. Command = 0
20:09:15.544 [Thread_3] INFO com.abndev.sample.threadpool.WorkerThread - Thread_3 Start. Command = 3
20:09:15.551 [Thread_0] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_0 sleep: 8092
20:09:15.551 [Thread_4] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_4 sleep: 9737
20:09:15.551 [Thread_3] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_3 sleep: 5685
20:09:15.551 [Thread_1] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_1 sleep: 8437
20:09:15.551 [Thread_2] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_2 sleep: 2858
20:09:18.410 [Thread_2] INFO com.abndev.sample.threadpool.WorkerThread - Thread_2 End. Command = 2
20:09:18.410 [Thread_5] INFO com.abndev.sample.threadpool.WorkerThread - Thread_5 Start. Command = 5
20:09:18.410 [Thread_5] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_5 sleep: 3986
20:09:21.237 [Thread_3] INFO com.abndev.sample.threadpool.WorkerThread - Thread_3 End. Command = 3
20:09:21.237 [Thread_6] INFO com.abndev.sample.threadpool.WorkerThread - Thread_6 Start. Command = 6
20:09:21.237 [Thread_6] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_6 sleep: 7743
20:09:22.396 [Thread_5] INFO com.abndev.sample.threadpool.WorkerThread - Thread_5 End. Command = 5
20:09:22.396 [Thread_7] INFO com.abndev.sample.threadpool.WorkerThread - Thread_7 Start. Command = 7
20:09:22.396 [Thread_7] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_7 sleep: 6561
20:09:23.644 [Thread_0] INFO com.abndev.sample.threadpool.WorkerThread - Thread_0 End. Command = 0
20:09:23.644 [Thread_8] INFO com.abndev.sample.threadpool.WorkerThread - Thread_8 Start. Command = 8
20:09:23.644 [Thread_8] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_8 sleep: 3997
20:09:23.988 [Thread_1] INFO com.abndev.sample.threadpool.WorkerThread - Thread_1 End. Command = 1
20:09:23.988 [Thread_9] INFO com.abndev.sample.threadpool.WorkerThread - Thread_9 Start. Command = 9
20:09:23.988 [Thread_9] INFO com.abndev.sample.threadpool.WorkerThread -  > Thread_9 sleep: 8851
20:09:25.288 [Thread_4] INFO com.abndev.sample.threadpool.WorkerThread - Thread_4 End. Command = 4
20:09:27.641 [Thread_8] INFO com.abndev.sample.threadpool.WorkerThread - Thread_8 End. Command = 8
20:09:28.958 [Thread_7] INFO com.abndev.sample.threadpool.WorkerThread - Thread_7 End. Command = 7
20:09:28.980 [Thread_6] INFO com.abndev.sample.threadpool.WorkerThread - Thread_6 End. Command = 6
20:09:32.839 [Thread_9] INFO com.abndev.sample.threadpool.WorkerThread - Thread_9 End. Command = 9
20:09:32.839 [main] INFO com.abndev.sample.threadpool.SimpleThreadPool - Finished ALL Threads.

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 18s
2 actionable tasks: 2 executed
08:09:32 PM: Task execution finished 'SimpleThreadPool.main()'.
