.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

 ldc 2
     istore 1

 new List
 dup
 invokespecial List/<init>()V
 astore 2

 aload 2
 ldc 1
 invokevirtual List/append(I)V 

 ldc "Z"
     astore 3

return
.limit locals 4
.limit stack 2
.end method
; symbols: []
; types: []
