 
 p u b l i c   c l a s s   M I N _ A N D _ M A X   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S t r i n g   s   =   " - 1   - 1 " ;  
 	 	 S o l u t i o n 1 4   s o l   =   n e w   S o l u t i o n 1 4 ( ) ;  
 	 	 s o l . s o l u t i o n ( s ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 1 4   {  
 	 p u b l i c   S t r i n g   s o l u t i o n ( S t r i n g   s )   {  
 	 	 S t r i n g   a n s w e r   =   " " ;  
 	 	 S t r i n g [ ]   n u m s = s . s p l i t ( "   " ) ;  
 	 	 i n t   m i n = I n t e g e r . p a r s e I n t ( n u m s [ 0 ] ) ;  
 	 	 i n t   m a x = I n t e g e r . p a r s e I n t ( n u m s [ 0 ] ) ;  
 	 	  
 	 	 f o r ( S t r i n g   n u m   :   n u m s )  
 	 	 {  
 	 	 	 m i n = M a t h . m i n ( I n t e g e r . p a r s e I n t ( n u m ) , m i n ) ;  
 	 	 	 m a x = M a t h . m a x ( I n t e g e r . p a r s e I n t ( n u m ) , m a x ) ;  
 	 	 }  
 	 	  
 	 	 a n s w e r = I n t e g e r . t o S t r i n g ( m i n ) + "   " + I n t e g e r . t o S t r i n g ( m a x ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r ) ;  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 }  
 