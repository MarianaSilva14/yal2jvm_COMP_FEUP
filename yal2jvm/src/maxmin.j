.class public maxmin
.super java/lang/Object

.method public static maxmin()I
.limit locals 1
.limit stack 2
iconst_0
istore_0
invokestatic io/read()I

istore_0

iload_0
iconst_0
if_icmpge loop0_end

loop1:

iload_0
iconst_0
if_icmpge loop1_end

iinc 0 1
goto loop1

loop1_end:

goto loop0_next
loop0_end:
loop2:

iload_0
iconst_0
if_icmple loop2_end

iload_0
iconst_1
isub
istore_0

goto loop2

loop2_end:

loop0_next:
ldc "a"
iload_0
invokestatic io/println(Ljava/lang/String;I)V
iload_0
ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit locals 1
.limit stack 2
invokestatic maxmin/maxmin()I

istore_0

ldc "a="
iload_0
invokestatic io/println(Ljava/lang/String;I)V
return
.end method


.method static public <clinit>()V
.limit locals 0
.limit stack 1 
return
.end method

