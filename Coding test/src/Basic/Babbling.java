p a c k a g e   B a s i c ;  
  
 p u b l i c   c l a s s   B a b b l i n g   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S t r i n g [ ]   b a b b l i n g   =   {   " a y a y e " ,   " u u u m a " ,   " y e " ,   " y e m a w o o " ,   " a y a a "   } ;  
  
 	 	 S o l u t i o n 1 0   s o l   =   n e w   S o l u t i o n 1 0 ( ) ;  
 	 	 s o l . s o l u t i o n ( b a b b l i n g ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 1 0   {  
 	 p u b l i c   i n t   s o l u t i o n ( S t r i n g [ ]   b a b b l i n g )   {  
 	 	 i n t   a n s w e r   =   0 ;  
 	 	  
 	 	 S t r i n g [ ]   a r r   =   {   " a y a " ,   " y e " ,   " w o o " ,   " m a "   } ;  
  
 	 	 f o r   ( S t r i n g   b a b   :   b a b b l i n g )   {  
 	 	 	 i n t   s a m e _ l e n g t h   =   0 ;  
 	 	 	  
 	 	 	 f o r   ( i n t   i   =   0 ;   i   <   a r r . l e n g t h ;   i + + )   {  
 	 	 	 	 i f   ( b a b . c o n t a i n s ( a r r [ i ] ) )   {  
 	 	 	 	 	 s a m e _ l e n g t h   + =   a r r [ i ] . l e n g t h ( ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	  
 	 	 	 i f   ( s a m e _ l e n g t h   = =   b a b . l e n g t h ( ) )   {  
 	 	 	 	 a n s w e r + + ;  
 	 	 	 }  
 	 	 }  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 