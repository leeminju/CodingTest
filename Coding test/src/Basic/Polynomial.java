p a c k a g e   B a s i c ;  
  
 p u b l i c   c l a s s   P o l y n o m i a l   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S t r i n g   p o l y n o m i a l   =   " 1 1 3 x   +   7   +   4 4 x   +   2 2 " ;  
 	 	 S o l u t i o n 2 4   s o l   =   n e w   S o l u t i o n 2 4 ( ) ;  
 	 	 s o l . s o l u t i o n ( p o l y n o m i a l ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 2 4   {  
 	 p u b l i c   S t r i n g   s o l u t i o n ( S t r i n g   p o l y n o m i a l )   {  
 	 	 S t r i n g   a n s w e r   =   " " ;  
 	 	 S t r i n g [ ]   a r r   =   p o l y n o m i a l . s p l i t ( "   " ) ;  
 	 	 i n t   x _ v a l u e   =   0 ;  
 	 	 i n t   c o n s t a n t   = 0 ;  
  
 	 	 f o r   ( S t r i n g   s   :   a r r )   {  
 	 	 	 i f   ( s . c o n t a i n s ( " x " ) )   {  
 	 	 	 	 i f   ( s . e q u a l s ( " x " ) )   {  
 	 	 	 	 	 x _ v a l u e   + =   1 ;  
 	 	 	 	 }   e l s e   {  
 	 	 	 	 	 x _ v a l u e + = I n t e g e r . p a r s e I n t ( s . s p l i t ( " x " ) [ 0 ] ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 e l s e   i f   ( ! s . c o n t a i n s ( " + " ) )  
 	 	 	 {  
 	 	 	 	 c o n s t a n t   + =   I n t e g e r . p a r s e I n t ( s ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 i f ( x _ v a l u e ! = 1   & &   c o n s t a n t   ! =   0 )  
 	 	 	 a n s w e r   =   I n t e g e r . t o S t r i n g ( x _ v a l u e )   +   " x   +   " + I n t e g e r . t o S t r i n g ( c o n s t a n t ) ;  
 	 	  
 	 	 i f ( x _ v a l u e ! = 1   & &   c o n s t a n t   = =   0 )  
 	 	 	 a n s w e r   =   I n t e g e r . t o S t r i n g ( x _ v a l u e )   +   " x " ;  
 	 	  
 	 	 i f ( x _ v a l u e = = 1   & &   c o n s t a n t   ! =   0 )  
 	 	 	 a n s w e r   =     " x   +   " + I n t e g e r . t o S t r i n g ( c o n s t a n t ) ;  
 	 	  
 	 	 i f ( x _ v a l u e = = 1   & &   c o n s t a n t   = =   0 )  
 	 	 	 a n s w e r   =     " x " ;  
 	 	  
 	 	 i f ( x _ v a l u e = = 0   & &   c o n s t a n t   >   0 )  
 	 	 {  
 	 	 	 a n s w e r   =   I n t e g e r . t o S t r i n g ( c o n s t a n t ) ;  
 	 	 }  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r ) ;  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 }  
 