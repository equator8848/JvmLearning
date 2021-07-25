# JvmLearning
> Jvm 学习

# JVM参数
- Xms 初始堆大小	
- Xmx 最大堆大小	
- XX:+HeapDumpOnOutOfMemoryError

# 常用配置
- -Xms1m -Xmx1m
- JVM debug
```
jstat -gc `jps | grep XXX_Class | cut -f 1 -d " "` 1000 64
```

