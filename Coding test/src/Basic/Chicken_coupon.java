p a c k a g e   B a s i c ;  
  
 p u b l i c   c l a s s   C h i c k e n _ c o u p o n   {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 S o l u t i o n 9   s o l   =   n e w   S o l u t i o n 9 ( ) ;  
 	 	 s o l . s o l u t i o n ( 1 0 8 1 ) ;  
 	 }  
 }  
  
 c l a s s   S o l u t i o n 9   {  
 	 p u b l i c   i n t   s o l u t i o n ( i n t   c h i c k e n )   {  
 	 	 i n t   a n s w e r   =   0 ;  
 	 	 i n t   s e r v i c e   =   0 ;  
 	 	 i n t   c o u p o n   =   0 ;  
  
 	 	 w h i l e   ( t r u e )   {  
 	 	 	 c o u p o n   + =   c h i c k e n ;  
  
 	 	 	 i f ( c o u p o n / 1 0   = = 0 )  
 	 	 	 	 b r e a k ;  
 	 	 	  
 	 	 	 s e r v i c e   =   c o u p o n   /   1 0 ;  
 	 	 	 c o u p o n   - =   1 0   *   ( s e r v i c e ) ;  
  
 	 	 	 a n s w e r   + =   s e r v i c e ;  
  
 	 	 	 c h i c k e n   =   s e r v i c e ;  
 	  
 	 	 }  
 	 	 S y s t e m . o u t . p r i n t l n ( a n s w e r ) ;  
  
 	 	 r e t u r n   a n s w e r ;  
 	 }  
 } 