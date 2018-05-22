.class public aval2
.super java/lang/Object

.method public static f(II)I
.limit locals 10
.limit stack 10
istore_0

iload_1
if_icmpne loop0_end

iconst_2
istore_2


loop0_end:
iload_2
ireturn
.end method

.method public static main([Ljava/lang/String;)V
.limit locals 10
.limit stack 10
iconst_2
bipush 12
invokestatic aval2/f(I;I)I

istore_0

iload_0
invokestatic io/println(I)

iconst_4
iconst_2
invokestatic aval2/f(I;I)I

istore_0

iload_0
invokestatic io/println(I)

iconst_3
istore_0

iconst_4
iconst_2
invokestatic aval2/f(I;I)I

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

