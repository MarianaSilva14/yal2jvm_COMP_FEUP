.class public aval5
.super java/lang/Object

.method public static f(II)I
.limit locals 3
.limit stack 3
iconst_0
istore_1
iconst_0
istore_1
bipush 10
istore_2

iload_0
iload_1
if_icmpne loop0_end

loop0:

iload_0
iload_2
if_icmpge loop0_end

iinc 0 1
goto loop0

loop0_end:

iload_0
iconst_2
istore_1

goto loop1_next
loop1_end:
iload_1
iload_0
iadd
istore_1

loop1_next:
iload_1
ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit locals 1
.limit stack 2
iconst_4
iconst_5
invokestatic aval5/f(II)I

istore_0

iload_0
invokestatic io/println(I)V

iconst_2
iconst_2
invokestatic aval5/f(II)I

istore_0

iload_0
invokestatic io/println(I)V

return
.end method


.method static public <clinit>()V
.limit stack 0
.limit locals 0
return
.end method

