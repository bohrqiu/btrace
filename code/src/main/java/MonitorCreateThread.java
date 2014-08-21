/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * qzhanbo@yiji.com 2014-08-21 18:32 创建
 *
 */

import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

/**
 * @author qzhanbo@yiji.com
 */
@BTrace
public class MonitorCreateThread {
	
	public static int count = 0;
	
	@OnMethod(clazz = "java.lang.Thread", method = "start")
	public static void onNewThread() {
		println(strcat("thread: ", str(currentThread())));
		count++;
		println(strcat("thead count:", str(count)));
		jstack();
		println();
		println();
	}
}
