.class public max1
.super java/lang/Object

.method public static max()I
.limit locals 6
.limit stack 2
iconst_0
istore 5
invokestatic io/read()I

istore_0

invokestatic io/read()I

istore_1

invokestatic io/read()I

istore_2

invokestatic io/read()I

istore_3

invokestatic io/read()I

istore 4

iload_0
istore 5

iload 5
iload_1
if_icmpge loop0_end

iload_1
istore 5

loop0_end:
iload 5
iload_2
if_icmpge loop1_end

iload_2
istore 5

loop1_end:
iload 5
iload_3
if_icmpge loop2_end

iload_3
istore 5

loop2_end:
iload 5
iload 4
if_icmpge loop3_end

iload 4
istore 5

loop3_end:
ldc "max "
iload 5
invokestatic io/print(Ljava/lang/String;I)V
iload 5
ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit locals 1
.limit stack 1
invokestatic max1/max()I

istore_0
return
.end method


.method static public <clinit>()V
.limit locals 0
.limit stack 1 
return
.end method

