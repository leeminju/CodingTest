p a c k a g e   B a s i c ;  
  
 p u b l i c   c l a s s   O X q u i z   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )  
 	 {  
 	 	 S t r i n g [ ]   q u i z =   { " 1 9   -   6   =   1 3 " ,   " 5   +   6 6   =   7 1 " ,   " 5   -   1 5   =   6 3 " ,   " 3   -   1   =   2 " } ;  
 	 	 S o l u t i o n 3   s o l = n e w   S o l u t i o n 3 ( ) ;  
 	 	 s o l . s o l u t i o n ( q u i z ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 3   {  
 	 p u b l i c   S t r i n g [ ]   s o l u t i o n ( S t r i n g [ ]   q u i z )   {  
 	 	 S t r i n g [ ]   a n s w e r   =   n e w   S t r i n g [ q u i z . l e n g t h ] ;  
 	 	 i n t   i = 0 ;  
 	 	 c h a r   s ;  
 	 	  
 	 	  
 	 	 f o r ( S t r i n g   q : q u i z )  
 	 	 {  
 	 	 	 S t r i n g   s t r [ ] = q . s p l i t ( "   " ) ;  
 	 	 	 i n t   a = I n t e g e r . p a r s e I n t ( s t r [ 0 ] ) ;  
 	 	 	 i n t   b = I n t e g e r . p a r s e I n t ( s t r [ 2 ] ) ;  
  
 	 	 	 i f ( s t r [ 1 ] . e q u a l s ( " + " ) )  
 	 	 	 {  
 	 	 	 	 i f ( a + b   = =   I n t e g e r . p a r s e I n t ( s t r [ 4 ] ) )  
 	 	 	 	 	 a n s w e r [ i ] = " O " ;  
 	 	 	 	 e l s e  
 	 	 	 	 	 a n s w e r [ i ] = " X " ;  
 	 	 	 } e l s e   i f ( s t r [ 1 ] . e q u a l s ( " - " ) )  
 	 	 	 {  
 	 	 	 	 i f ( a - b   = =   I n t e g e r . p a r s e I n t ( s t r [ 4 ] ) )  
 	 	 	 	 	 a n s w e r [ i ] = " O " ;  
 	 	 	 	 e l s e  
 	 	 	 	 	 a n s w e r [ i ] = " X " ;  
 	 	 	 }  
 	 	 	 i + + ;  
 	 	 }  
 	 	 f o r ( i n t   j = 0 ; j < a n s w e r . l e n g t h ; j + + )  
 	 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r [ j ] ) ;  
 	 	  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 }  
 