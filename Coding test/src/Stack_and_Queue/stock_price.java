p a c k a g e   S t a c k _ a n d _ Q u e u e ;  
  
 i m p o r t   j a v a . u t i l . * ;  
  
 p u b l i c   c l a s s   s t o c k _ p r i c e   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 i n t [ ]   p r i c e s   =   {   1 ,   2 ,   3 ,   2 ,   1 ,   3   } ;  
 	 	 S o l u t i o n 5   s o l   =   n e w   S o l u t i o n 5 ( ) ;  
 	 	 s o l . s o l u t i o n ( p r i c e s ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 5   {  
 	 p u b l i c   i n t [ ]   s o l u t i o n ( i n t [ ]   p r i c e s )   {  
 	 	 i n t [ ]   a n s w e r   =   n e w   i n t [ p r i c e s . l e n g t h ] ;  
  
 	 	 / /   D??????<?\?  xԔ??? 
 	 	 f o r   ( i n t   i   =   0 ;   i   <   p r i c e s . l e n g t h ;   i + + )   {  
 	 	 	 a n s w e r [ i ]   =   0 ;  
  
 	 	 	 f o r   ( i n t   j   =   i   +   1 ;   j   <   p r i c e s . l e n g t h ;   j + + )   {  
 	 	 	 	 a n s w e r [ i ] + + ;  
 	 	 	 	 i f   ( p r i c e s [ i ]   >   p r i c e s [ j ] )   {  
 	 	 	 	 	 b r e a k ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 }  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 