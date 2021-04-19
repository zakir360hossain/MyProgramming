	.text
	.globl	sum
	.type	sum, @function
sum:
	pushl	%ebp
	movl	%esp, %ebp
	subl	$16, %esp
	subl	$24, %esp  # create some space for local variables (you can
                           # (allocate more if you'd like: ex. subl $30, %esp)

        # implement the body of this function here
        # the parameter is allocated on the stack at addresss:  8(%ebp)
        # you can used -4(%ebp) and -8(%ebp) as space for local vars i and res

        
        movl  -4(%ebp), %edx   # i val is stored at %edx
        movl  -8(%ebp), %ebx   # res val is stored at %ebx
        movl   8(%ebp), %ecx   # n val is stored at %ecx


        
        movl $0, %ebx
        movl $1, %edx

        cmpl $0, %ecx  # check if n>0
        jg .loop
.nonpos:
        movl $-1, %ebx
        jmp .done
.loop:
        addl %edx, %ebx
        incl %edx
        cmpl %ecx, %edx
        jle .loop
.done:
        # this function returns 0 right now: change it to return computed sum
	//movl	%ecx, %eax
	movl %ebx, %eax
        leave
	ret
	.size	sum, .-sum
