p a c k a g e   B a s i c ;  
  
 p u b l i c   c l a s s   B a b b l i n g 2   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S t r i n g [ ]   b a b b l i n g   =   {   " a y a y e " ,   " u u u " ,   " y e y e " ,   " y e m a w o o " ,   " a y a a y a a "   } ;  
  
 	 	 S o l u t i o n 1 2   s o l   =   n e w   S o l u t i o n 1 2 ( ) ;  
 	 	 s o l . s o l u t i o n ( b a b b l i n g ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 1 2   {  
 	 p u b l i c   i n t   s o l u t i o n ( S t r i n g [ ]   b a b b l i n g )   {  
 	 	 i n t   a n s w e r   =   0 ;  
  
 	 	 f o r   ( S t r i n g   b a b   :   b a b b l i n g )   {  
  
 	 	 	 i f   ( ! b a b . c o n t a i n s ( " a y a a y a " )   & &   ! b a b . c o n t a i n s ( " y e y e " )  
 	 	 	 	 	 & &   ! b a b . c o n t a i n s ( " w o o w o o " )   & &   ! b a b . c o n t a i n s ( " m a m a " ) )  
 	 	 	 {  
  
 	 	 	 	 b a b   =   b a b . r e p l a c e ( " a y a " ,   "   " ) ;  
 	 	 	 	 b a b   =   b a b . r e p l a c e ( " y e " ,   "   " ) ;  
 	 	 	 	 b a b   =   b a b . r e p l a c e ( " w o o " ,   "   " ) ;  
 	 	 	 	 b a b   =   b a b . r e p l a c e ( " m a " ,   "   " ) ;  
 	 	 	 	 b a b   =   b a b . r e p l a c e ( "   " ,   " " ) ;  
 	 	 	 }  
 	 	 	 i f   ( b a b . e q u a l s ( " " ) )   {  
 	 	 	 	 a n s w e r + + ;  
 	 	 	 }  
  
 	 	 }  
 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r ) ;  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 