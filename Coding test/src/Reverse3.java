 
 p u b l i c   c l a s s   R e v e r s e 3   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S o l u t i o n   s   =   n e w   S o l u t i o n ( ) ;  
 	 	 s . s o l u t i o n ( 1 2 5 ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n   {  
 	 p u b l i c   i n t   s o l u t i o n ( i n t   n )   {  
 	 	 i n t   a n s w e r   =   0 ;  
 	 	 i n t   e x p   =   0 ;  
  
 	 	 S t r i n g   t h i r d   =   I n t e g e r . t o S t r i n g ( n ,   3 ) ; / / 3 ?ɕ?  ??X? 
 	 	 S t r i n g B u f f e r   s b   =   n e w   S t r i n g B u f f e r ( t h i r d ) ;  
 	 	 S t r i n g   r e v e r s e d   =   s b . r e v e r s e ( ) . t o S t r i n g ( ) ;  
 	 	  
 	 	 f o r ( i n t   i = r e v e r s e d . l e n g t h ( ) - 1 ; i > = 0 ; i - - )  
 	 	 {  
 	 	 	 a n s w e r + = M a t h . p o w ( 3 , e x p ) * I n t e g e r . p a r s e I n t ( S t r i n g . v a l u e O f ( r e v e r s e d . c h a r A t ( i ) ) ) ;  
 	 	 	 e x p + + ;  
 	 	 }  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r ) ;  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 }  
 