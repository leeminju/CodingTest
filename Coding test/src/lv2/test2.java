p a c k a g e   l v 2 ;  
  
 i m p o r t   j a v a . u t i l . A r r a y s ;  
  
 p u b l i c   c l a s s   t e s t 2   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 i n t [ ]   c i t a t i o n s   =   {   3 ,   1 0 ,   8 ,   3 ,   3 ,   7 ,   6 ,   1 ,   5   } ;  
 	 	 S o l u t i o n 2   s o l   =   n e w   S o l u t i o n 2 ( ) ;  
 	 	 s o l . s o l u t i o n ( c i t a t i o n s ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 2   {  
 	 p u b l i c   i n t   s o l u t i o n ( i n t [ ]   c i t a t i o n s )   {  
 	 	 i n t   a n s w e r   =   0 ;  
 	 	 i n t   n   =   c i t a t i o n s . l e n g t h ;  
  
 	 	 A r r a y s . s o r t ( c i t a t i o n s ) ;  
  
 	 	 f o r   ( i n t   h   =   n ;   h   > =   0 ;   h - - ) / /   �������0� 
 	 	 {  
  
 	 	 	 i n t   c o u n t   =   0 ;  
  
 	 	 	 f o r   ( i n t   j   =   0 ;   j   <   c i t a t i o n s . l e n g t h ;   j + + )   {  
 	 	 	 	 i f   ( c i t a t i o n s [ j ]   > =   h )   {  
 	 	 	 	 	 c o u n t + + ;  
 	 	 	 	 }  
 	 	 	 }  
  
 	 	 	 i f   ( c o u n t   > =   h   & &   ( n   -   c o u n t )   < =   h )   {  
 	 	 	 	 a n s w e r   =   h ;  
 	 	 	 	 r e t u r n   a n s w e r ;  
 	 	 	 }  
  
 	 	 }  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 