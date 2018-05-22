.class public aval4
.super java/lang/Object

.method public static f(II)I
.limit locals 10
.limit stack 10
loop0:

istore_0

iload_1
if_icmplt loop0_end

invokestatic io/read()I

istore_2

invokestatic io/read()I

istore_0

iload_0
iload_2
iadd
istore_0


goto loop0
loop0_end:
iload_2
ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit locals 10
.limit stack 10
iconst_5
bipush 6
invokestatic aval4/f(I;I)I

istore_0

iload_0
invokestatic io/println(I)

return
.end method


.method static public <clinit>()V
.limit stack 0
.limit locals 0
return
.end method

