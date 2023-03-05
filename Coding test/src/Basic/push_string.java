p a c k a g e   B a s i c ;  
  
 p u b l i c   c l a s s   p u s h _ s t r i n g   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S t r i n g   A   =   " h e l l o " ;  
 	 	 S t r i n g   B   =   " l f s a l " ;  
  
 	 	 S o l u t i o n 1 9   s o l   =   n e w   S o l u t i o n 1 9 ( ) ;  
 	 	 s o l . s o l u t i o n ( A ,   B ) ;  
 	 }  
  
 }  
  
 c l a s s   S o l u t i o n 1 9   {  
 	 p u b l i c   i n t   s o l u t i o n ( S t r i n g   A ,   S t r i n g   B )   {  
 	 	 i n t   a n s w e r   =   0 ;  
 	 	 S t r i n g   c h a n g e   =   " " ;  
 	 	 S t r i n g   o r i g i n a l   =   A ;  
  
 	 	 i f   ( A . e q u a l s ( B ) )   {  
 	 	 	 r e t u r n   a n s w e r ;  
 	 	 }  
  
 	 	 w h i l e   ( ! c h a n g e . e q u a l s ( o r i g i n a l ) )   {  
 	 	 	  
 	 	 	 i f   ( c h a n g e . e q u a l s ( o r i g i n a l ) )  
 	 	 	 	 b r e a k ;  
  
 	 	 	 a n s w e r + + ;  
 	 	 	 c h a n g e   =   C h a r a c t e r . t o S t r i n g ( A . c h a r A t ( A . l e n g t h ( )   -   1 ) ) ;  
 	 	 	 c h a n g e   + =   A . s u b s t r i n g ( 0 ,   A . l e n g t h ( )   -   1 ) ;  
  
 	 	 	 i f   ( c h a n g e . e q u a l s ( B ) )   {  
 	 	 	 	 r e t u r n   a n s w e r ;  
 	 	 	 }   e l s e   {  
 	 	 	 	 A   =   c h a n g e ;  
 	 	 	 }  
  
 	 	 }  
 	 	 a n s w e r   =   - 1 ;  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 